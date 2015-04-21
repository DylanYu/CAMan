
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
import osmodel.WebWrap;
import java.util.*;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.image.Image;
import org.openstack4j.openstack.OSFactory;
import org.openstack4j.model.compute.ActionResponse;
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
 * An implementation of the model object '<em><b>Web Wrap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link osmodel.impl.WebWrapImpl#getName <em>Name</em>}</li>
 *   <li>{@link osmodel.impl.WebWrapImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link osmodel.impl.WebWrapImpl#getHostOn <em>Host On</em>}</li>
 *   <li>{@link osmodel.impl.WebWrapImpl#getBelongTo <em>Belong To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebWrapImpl extends WrappingEObjectImpl implements WebWrap
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "webapp";

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
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final int STATUS_EDEFAULT = -1;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected int status = STATUS_EDEFAULT;

  /**
   * The cached value of the '{@link #getHostOn() <em>Host On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostOn()
   * @generated
   * @ordered
   */
  protected ServerWrap hostOn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WebWrapImpl()
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
    return OsmodelPackage.Literals.WEB_WRAP;
  }

  
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createCore(){
    System.out.println("just created a web service");
Web web = new Web(name, status);
core = web;
return core;
  }
  

  
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
  
    Web core=(Web)this.getCore();
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
        Web core=(Web)getCore();
        if(core==null) return name;
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
        	
      Web core=(Web)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.WEB_WRAP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStatus()
  {
        Object result=null;
        Web core=(Web)getCore();
        if(core==null) return status;
    return status; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(int newStatus)
  {
    int oldStatus = status;
    status = newStatus;
        	
      Web core=(Web)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.WEB_WRAP__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerWrap getHostOn()
  {
    if (hostOn != null && hostOn.eIsProxy())
    {
      InternalEObject oldHostOn = (InternalEObject)hostOn;
      hostOn = (ServerWrap)eResolveProxy(oldHostOn);
      if (hostOn != oldHostOn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsmodelPackage.WEB_WRAP__HOST_ON, oldHostOn, hostOn));
      }
    }
        Object result=null;
        Web core=(Web)getCore();
        if(core==null) return hostOn;
    return hostOn; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerWrap basicGetHostOn()
  {
    return hostOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostOn(ServerWrap newHostOn)
  {
    ServerWrap oldHostOn = hostOn;
    hostOn = newHostOn;
        	
      Web core=(Web)getCore();
      if(core==null) return;
      	
        Configuration hostConfig = null;
        try {
            hostConfig = new PropertiesConfiguration("config/host.properties");
        } catch (ConfigurationException e2) {
            e2.printStackTrace();
        }
OSClient os = OS.getClient();
if (newHostOn == null || (oldHostOn != null && newHostOn != oldHostOn)) {
  System.out.println("Removing software...");
  Server oldServer = OS.getClient().compute().servers().get(oldHostOn.getServerId()); 
  List<? extends Address> oldAddresses = oldServer.getAddresses().getAddresses("private");
   Address oldServerAddress = null;
        for (Address address : oldAddresses) {
            // Equals, not ==
            if (address.getType().equals("floating")) {// skip fixed address
                oldServerAddress  = address;
                break;
            }
        }
        String command = "apt-get -y remove apache2";
        //System.out.println("command: " + command);
        RemoteExecute.jumpSudoExecute(
                command,
                hostConfig.getString("oshost.ip"), 
                hostConfig.getString("oshost.user"), 
                hostConfig.getString("oshost.pw"), 
                oldServerAddress.getAddr(),
                hostConfig.getString("vm.ubuntu-desktop.user"), 
                hostConfig.getString("vm.ubuntu-desktop.pw"));
        System.out.println("Remove finished");
  status = -1;
}

if (newHostOn == null) return;

//if (newHostOn == null) return;

System.out.println("Trying to deploy software...");
    Server server = OS.getClient().compute().servers().get(newHostOn.getServerId()); 
        

        
        //final Server server = servers[0]; // TODO understand
        // scp necessary files
        while (os.compute().servers().get(server.getId()).getStatus() != Server.Status.ACTIVE) {
            System.out.println(String.format("wait for server %s booting", server.getName()));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("server %s is ready", server.getName()));
        // find address for the server
        Address serverAddress = null;
        List<? extends Address> addresses = server.getAddresses().getAddresses("private");
        for (Address address : addresses) {
            // Equals, not ==
            if (address.getType().equals("floating")) {// skip fixed address
                serverAddress = address;
                break;
            }
        }
        
        // test whether server is reachable
        boolean reachable = Network.remotePingTest(
                hostConfig.getString("oshost.ip"), 
                hostConfig.getString("oshost.user"), 
                hostConfig.getString("oshost.pw"), 
                serverAddress.getAddr());
//        System.out.println("ping test passed? " + reachable);
        
        System.out.println("Transfering necessary files to server...");
        try {
            ScpFile.scp(hostConfig.getString("oshost.ip"), 
                    hostConfig.getString("oshost.user"), 
                    hostConfig.getString("oshost.pw"), 
                    hostConfig.getString("oshost.chef_client.path"), 
                    serverAddress.getAddr(), 
                    hostConfig.getString("vm.ubuntu-desktop.user"), 
                    hostConfig.getString("vm.ubuntu-desktop.pw"), 
                    hostConfig.getString("dst.chef_client.path"));
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        System.out.println("Transfer completed");
        
        System.out.println("Installing Chef-client...");
        String command = String.format("dpkg -i %s/%s", 
                hostConfig.getString("dst.chef_client.path"), 
                hostConfig.getString("file.chef_client.name"));
        RemoteExecute.jumpSudoExecute(
                command,
                hostConfig.getString("oshost.ip"), 
                hostConfig.getString("oshost.user"), 
                hostConfig.getString("oshost.pw"), 
                serverAddress.getAddr(), 
                hostConfig.getString("vm.ubuntu-desktop.user"), 
                hostConfig.getString("vm.ubuntu-desktop.pw"));
        System.out.println("Installation completed");
        
        // delay execute install package & detach floating IP
        System.out.println("Create cookbook directory...");
        command = "mkdir /home/nju/cookbooks";
        RemoteExecute.jumpExecute(
                command,
                hostConfig.getString("oshost.ip"), 
                hostConfig.getString("oshost.user"), 
                hostConfig.getString("oshost.pw"), 
                serverAddress.getAddr(), 
                hostConfig.getString("vm.ubuntu-desktop.user"), 
                hostConfig.getString("vm.ubuntu-desktop.pw"));
        System.out.println("Directory created");
        
        System.out.println("Transfering cookbooks to server...");
        try {
            ScpFile.scp(hostConfig.getString("oshost.ip"), 
                    hostConfig.getString("oshost.user"), 
                    hostConfig.getString("oshost.pw"), 
                    hostConfig.getString("oshost.cookbook.apache2.path"), 
                    serverAddress.getAddr(), 
                    hostConfig.getString("vm.ubuntu-desktop.user"), 
                    hostConfig.getString("vm.ubuntu-desktop.pw"), 
                    hostConfig.getString("vm.cookbook.path"));
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        System.out.println("Transfer completed");
        
        //modifyApt(serverAddress.getAddr());
        System.out.println("Updating repository...");
        try {
            ScpFile.scp(hostConfig.getString("oshost.ip"), 
                    hostConfig.getString("oshost.user"), 
                    hostConfig.getString("oshost.pw"), 
                    hostConfig.getString("oshost.sources_list.path"), 
                    serverAddress.getAddr(), 
                    hostConfig.getString("vm.ubuntu-desktop.user"), 
                    hostConfig.getString("vm.ubuntu-desktop.pw"), 
                    "/home/nju");
            
            //System.out.println("mv file");
            command = String.format("mv %s %s", 
                    "/home/nju/sources.list", 
                    hostConfig.getString("vm.sources_list.dir"));
            //System.out.println("command: " + command);
            RemoteExecute.jumpSudoExecute(
                    command,
                    hostConfig.getString("oshost.ip"), 
                    hostConfig.getString("oshost.user"), 
                    hostConfig.getString("oshost.pw"), 
                    serverAddress.getAddr(), 
                    hostConfig.getString("vm.ubuntu-desktop.user"), 
                    hostConfig.getString("vm.ubuntu-desktop.pw"));
                    
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        System.out.println("Update completed");
        
        System.out.println("Applying cookbooks...");
        command = "chef-client --local-mode --runlist 'recipe[learn_chef_apache2]'";
        RemoteExecute.jumpSudoExecuteDelay(
                command,
                5, // wait for 10 seconds TODO delete
                hostConfig.getString("oshost.ip"), 
                hostConfig.getString("oshost.user"), 
                hostConfig.getString("oshost.pw"), 
                serverAddress.getAddr(), 
                hostConfig.getString("vm.ubuntu-desktop.user"), 
                hostConfig.getString("vm.ubuntu-desktop.pw"));
        System.out.println("Cookbooks applied");
  status = 0;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.WEB_WRAP__HOST_ON, oldHostOn, hostOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClusterWrap getBelongTo()
  {
    if (eContainerFeatureID != OsmodelPackage.WEB_WRAP__BELONG_TO) return null;
    return (ClusterWrap)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBelongTo(ClusterWrap newBelongTo, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newBelongTo, OsmodelPackage.WEB_WRAP__BELONG_TO, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBelongTo(ClusterWrap newBelongTo)
  {
    if (newBelongTo != eInternalContainer() || (eContainerFeatureID != OsmodelPackage.WEB_WRAP__BELONG_TO && newBelongTo != null))
    {
      if (EcoreUtil.isAncestor(this, newBelongTo))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newBelongTo != null)
        msgs = ((InternalEObject)newBelongTo).eInverseAdd(this, OsmodelPackage.CLUSTER_WRAP__SOFTWARES, ClusterWrap.class, msgs);
      msgs = basicSetBelongTo(newBelongTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.WEB_WRAP__BELONG_TO, newBelongTo, newBelongTo));
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
      case OsmodelPackage.WEB_WRAP__BELONG_TO:
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
      case OsmodelPackage.WEB_WRAP__BELONG_TO:
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
      case OsmodelPackage.WEB_WRAP__BELONG_TO:
        return eInternalContainer().eInverseRemove(this, OsmodelPackage.CLUSTER_WRAP__SOFTWARES, ClusterWrap.class, msgs);
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
      case OsmodelPackage.WEB_WRAP__NAME:
        return getName();
      case OsmodelPackage.WEB_WRAP__STATUS:
        return new Integer(getStatus());
      case OsmodelPackage.WEB_WRAP__HOST_ON:
        if (resolve) return getHostOn();
        return basicGetHostOn();
      case OsmodelPackage.WEB_WRAP__BELONG_TO:
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
      case OsmodelPackage.WEB_WRAP__NAME:
        setName((String)newValue);
        return;
      case OsmodelPackage.WEB_WRAP__STATUS:
        setStatus(((Integer)newValue).intValue());
        return;
      case OsmodelPackage.WEB_WRAP__HOST_ON:
        setHostOn((ServerWrap)newValue);
        return;
      case OsmodelPackage.WEB_WRAP__BELONG_TO:
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
      case OsmodelPackage.WEB_WRAP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OsmodelPackage.WEB_WRAP__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case OsmodelPackage.WEB_WRAP__HOST_ON:
        setHostOn((ServerWrap)null);
        return;
      case OsmodelPackage.WEB_WRAP__BELONG_TO:
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
      case OsmodelPackage.WEB_WRAP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OsmodelPackage.WEB_WRAP__STATUS:
        return status != STATUS_EDEFAULT;
      case OsmodelPackage.WEB_WRAP__HOST_ON:
        return hostOn != null;
      case OsmodelPackage.WEB_WRAP__BELONG_TO:
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
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //WebWrapImpl
