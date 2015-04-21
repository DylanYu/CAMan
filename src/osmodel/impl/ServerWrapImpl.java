
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import osmodel.ClusterWrap;
import osmodel.OsmodelPackage;
import osmodel.ServerWrap;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.image.Image;
import org.openstack4j.openstack.OSFactory;
import org.openstack4j.model.compute.ActionResponse;
import os.OS;
import java.util.*;
import org.openstack4j.model.compute.actions.*;
import org.openstack4j.model.compute.*;
import org.openstack4j.model.image.*;
import os.*;
import web.*;
import util.*;
import org.apache.commons.configuration.*;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.ImagePool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Wrap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link osmodel.impl.ServerWrapImpl#getName <em>Name</em>}</li>
 *   <li>{@link osmodel.impl.ServerWrapImpl#getServerId <em>Server Id</em>}</li>
 *   <li>{@link osmodel.impl.ServerWrapImpl#getBelongTo <em>Belong To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerWrapImpl extends WrappingEObjectImpl implements ServerWrap
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "vm";

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerId()
   * @generated
   * @ordered
   */
  protected static final String SERVER_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerId()
   * @generated
   * @ordered
   */
  protected String serverId = SERVER_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServerWrapImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OsmodelPackage.Literals.SERVER_WRAP;
  }

  
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createCore(){
    System.out.println("Creating server...");

List<String> nets = new LinkedList<String>();
        nets.add("2b2e0dfe-2d38-49c2-ad11-338618503f63");
        Flavor flavor = OS.getClient().compute().flavors().get("2");
        Image image = OS.getClient().images().get("7c28d5a1-551e-4416-879e-d1e61b4c62f9");
        Server server = OS.getClient().compute().servers().boot(Builders.server()
                .name(name)
                .flavor(flavor.getId())
                .image(image.getId())
                .networks(nets)
                .build());

// Assign floating IP
  System.out.println("Assign floating IP...");
        try { // MUST wait for Nova, otherwise may fail in assigning floating IP 
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean hasAvailableFloatingIP = false;
        List<? extends FloatingIP> floatingIPs = OS.getClient().compute().floatingIps().list();
        for (FloatingIP ip : floatingIPs) {
            if (ip.getFixedIpAddress() == null) {
                hasAvailableFloatingIP = true;
                break;
            }
        }
        if (!hasAvailableFloatingIP) {
            String poolName = OS.getClient().compute().floatingIps().getPoolNames().get(0);
            System.out.println(String.format("Allocate floating IP in pool %s", poolName));
            OS.getClient().compute().floatingIps().allocateIP(poolName);
        }
        
        List<? extends FloatingIP> allFloatingIPs = OS.getClient().compute().floatingIps().list();
        List<FloatingIP> availableFloatingIPs = new LinkedList<FloatingIP>();
        for (FloatingIP ip : allFloatingIPs) {
            if (ip.getFixedIpAddress() == null)
                availableFloatingIPs.add(ip);
        }
        if (availableFloatingIPs.size() == 0) {
            System.out.println("error: no available floating ip");
            return server;
        }
        FloatingIP ip = availableFloatingIPs.get(0);
        ActionResponse r = OS.getClient().compute().floatingIps().addFloatingIP(
                server, 
                ip.getFloatingIpAddress()); //
        System.out.println(
                String.format("associate floating IP %s success? %b, fault msg: %s", 
                        ip.getFloatingIpAddress(), 
                        r.isSuccess(),
                        r.getFault()));
        String id = server.getId();
        server = OS.getClient().compute().servers().get(id); // MUST update model
        List<? extends Address> addresses = server.getAddresses().getAddresses("private");

  serverId = server.getId();
  //name = name;
  core  = server; // necessary
System.out.println("Create server completed!");
  return core;
  }
  

  
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public void destroyCore(){
   	if(core==null){
      this.newborn=false;
      return;
    }
    System.out.println("Deleting server [" + name + "] ...");
ActionResponse rs = OS.getClient().compute().servers().delete(serverId);
        if (rs.isSuccess()) System.out.println("Delete server completed!");
        else System.out.println("Delete server FAILED: " + rs.toString());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
  
    Server core=(Server)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
  
  
  
  }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public EClass getChildClassMap(Object object){
    OsmodelPackage pack=OsmodelPackage.eINSTANCE;	
  
  
  
    return null;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
        Object result=null;
        Server core=(Server)getCore();
        if(core==null) return name;	
        System.out.println("Get server name");
    return name; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
        	
      Server core=(Server)getCore();
      if(core==null) return;
      	
        System.out.println("Setting server name...");
Server server = OS.getClient().compute().servers().update(
                serverId, ServerUpdateOptions.create().name(newName));
        if (server.getName().equals(newName)) System.out.println("Set server name completed!");
        else System.out.println("Set server name FAILED");
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SERVER_WRAP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServerId()
  {
        Object result=null;
        Server core=(Server)getCore();
        if(core==null) return serverId;
    return serverId; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServerId(String newServerId)
  {
    String oldServerId = serverId;
    serverId = newServerId;
        	
      Server core=(Server)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SERVER_WRAP__SERVER_ID, oldServerId, serverId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClusterWrap getBelongTo()
  {
    if (eContainerFeatureID != OsmodelPackage.SERVER_WRAP__BELONG_TO) return null;
    return (ClusterWrap)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBelongTo(ClusterWrap newBelongTo, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newBelongTo, OsmodelPackage.SERVER_WRAP__BELONG_TO, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBelongTo(ClusterWrap newBelongTo)
  {
    if (newBelongTo != eInternalContainer() || (eContainerFeatureID != OsmodelPackage.SERVER_WRAP__BELONG_TO && newBelongTo != null))
    {
      if (EcoreUtil.isAncestor(this, newBelongTo))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newBelongTo != null)
        msgs = ((InternalEObject)newBelongTo).eInverseAdd(this, OsmodelPackage.CLUSTER_WRAP__SERVERS, ClusterWrap.class, msgs);
      msgs = basicSetBelongTo(newBelongTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SERVER_WRAP__BELONG_TO, newBelongTo, newBelongTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OsmodelPackage.SERVER_WRAP__BELONG_TO:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetBelongTo((ClusterWrap)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OsmodelPackage.SERVER_WRAP__BELONG_TO:
        return basicSetBelongTo(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
      case OsmodelPackage.SERVER_WRAP__BELONG_TO:
        return eInternalContainer().eInverseRemove(this, OsmodelPackage.CLUSTER_WRAP__SERVERS, ClusterWrap.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OsmodelPackage.SERVER_WRAP__NAME:
        return getName();
      case OsmodelPackage.SERVER_WRAP__SERVER_ID:
        return getServerId();
      case OsmodelPackage.SERVER_WRAP__BELONG_TO:
        return getBelongTo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OsmodelPackage.SERVER_WRAP__NAME:
        setName((String)newValue);
        return;
      case OsmodelPackage.SERVER_WRAP__SERVER_ID:
        setServerId((String)newValue);
        return;
      case OsmodelPackage.SERVER_WRAP__BELONG_TO:
        setBelongTo((ClusterWrap)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OsmodelPackage.SERVER_WRAP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OsmodelPackage.SERVER_WRAP__SERVER_ID:
        setServerId(SERVER_ID_EDEFAULT);
        return;
      case OsmodelPackage.SERVER_WRAP__BELONG_TO:
        setBelongTo((ClusterWrap)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OsmodelPackage.SERVER_WRAP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OsmodelPackage.SERVER_WRAP__SERVER_ID:
        return SERVER_ID_EDEFAULT == null ? serverId != null : !SERVER_ID_EDEFAULT.equals(serverId);
      case OsmodelPackage.SERVER_WRAP__BELONG_TO:
        return getBelongTo() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", serverId: ");
    result.append(serverId);
    result.append(')');
    return result.toString();
  }

} //ServerWrapImpl
