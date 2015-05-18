
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package osmodel.impl;

import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import osmodel.ClusterWrap;
import osmodel.OsmodelPackage;
import osmodel.ServerWrap;
import osmodel.Software;
import osmodel.WebWrap;
import java.util.LinkedList;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.compute.Flavor;
import org.openstack4j.model.compute.Server;
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
 * An implementation of the model object '<em><b>Cluster Wrap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link osmodel.impl.ClusterWrapImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link osmodel.impl.ClusterWrapImpl#getSoftwares <em>Softwares</em>}</li>
 *   <li>{@link osmodel.impl.ClusterWrapImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClusterWrapImpl extends EObjectImpl implements ClusterWrap
{
  /**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
  protected EList<ServerWrap> servers;

  /**
	 * The cached value of the '{@link #getSoftwares() <em>Softwares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSoftwares()
	 * @generated
	 * @ordered
	 */
  protected EList<Software> softwares;

  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = "cluster";

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ClusterWrapImpl()
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
		return OsmodelPackage.Literals.CLUSTER_WRAP;
	}

  
  

  
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ServerWrap> getServers()
  {
		if (servers == null) {
			servers = new EObjectContainmentWithInverseEList<ServerWrap>(ServerWrap.class, this, OsmodelPackage.CLUSTER_WRAP__SERVERS, OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO);
		}
		return servers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Software> getSoftwares()
  {
		if (softwares == null) {
			softwares = new EObjectContainmentWithInverseEList<Software>(Software.class, this, OsmodelPackage.CLUSTER_WRAP__SOFTWARES, OsmodelPackage.SOFTWARE__SOFTWARE_BELONG_TO);
		}
		return softwares;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.CLUSTER_WRAP__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case OsmodelPackage.CLUSTER_WRAP__SERVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServers()).basicAdd(otherEnd, msgs);
			case OsmodelPackage.CLUSTER_WRAP__SOFTWARES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSoftwares()).basicAdd(otherEnd, msgs);
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
		switch (featureID) {
			case OsmodelPackage.CLUSTER_WRAP__SERVERS:
				return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
			case OsmodelPackage.CLUSTER_WRAP__SOFTWARES:
				return ((InternalEList<?>)getSoftwares()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case OsmodelPackage.CLUSTER_WRAP__SERVERS:
				return getServers();
			case OsmodelPackage.CLUSTER_WRAP__SOFTWARES:
				return getSoftwares();
			case OsmodelPackage.CLUSTER_WRAP__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case OsmodelPackage.CLUSTER_WRAP__SERVERS:
				getServers().clear();
				getServers().addAll((Collection<? extends ServerWrap>)newValue);
				return;
			case OsmodelPackage.CLUSTER_WRAP__SOFTWARES:
				getSoftwares().clear();
				getSoftwares().addAll((Collection<? extends Software>)newValue);
				return;
			case OsmodelPackage.CLUSTER_WRAP__NAME:
				setName((String)newValue);
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
		switch (featureID) {
			case OsmodelPackage.CLUSTER_WRAP__SERVERS:
				getServers().clear();
				return;
			case OsmodelPackage.CLUSTER_WRAP__SOFTWARES:
				getSoftwares().clear();
				return;
			case OsmodelPackage.CLUSTER_WRAP__NAME:
				setName(NAME_EDEFAULT);
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
		switch (featureID) {
			case OsmodelPackage.CLUSTER_WRAP__SERVERS:
				return servers != null && !servers.isEmpty();
			case OsmodelPackage.CLUSTER_WRAP__SOFTWARES:
				return softwares != null && !softwares.isEmpty();
			case OsmodelPackage.CLUSTER_WRAP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //ClusterWrapImpl
