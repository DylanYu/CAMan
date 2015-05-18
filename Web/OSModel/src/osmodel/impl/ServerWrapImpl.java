
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
 *   <li>{@link osmodel.impl.ServerWrapImpl#getServer_name <em>Server name</em>}</li>
 *   <li>{@link osmodel.impl.ServerWrapImpl#getServer_serverId <em>Server server Id</em>}</li>
 *   <li>{@link osmodel.impl.ServerWrapImpl#getServer_belongTo <em>Server belong To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerWrapImpl extends EObjectImpl implements ServerWrap
{
  /**
	 * The default value of the '{@link #getServer_name() <em>Server name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_NAME_EDEFAULT = "vm";

	/**
	 * The cached value of the '{@link #getServer_name() <em>Server name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_name()
	 * @generated
	 * @ordered
	 */
	protected String server_name = SERVER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer_serverId() <em>Server server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_serverId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_SERVER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServer_serverId() <em>Server server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_serverId()
	 * @generated
	 * @ordered
	 */
	protected String server_serverId = SERVER_SERVER_ID_EDEFAULT;

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
	public String getServer_name() {
		return server_name;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_name(String newServer_name) {
		String oldServer_name = server_name;
		server_name = newServer_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SERVER_WRAP__SERVER_NAME, oldServer_name, server_name));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServer_serverId() {
		return server_serverId;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_serverId(String newServer_serverId) {
		String oldServer_serverId = server_serverId;
		server_serverId = newServer_serverId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SERVER_WRAP__SERVER_SERVER_ID, oldServer_serverId, server_serverId));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterWrap getServer_belongTo() {
		if (eContainerFeatureID() != OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO) return null;
		return (ClusterWrap)eInternalContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer_belongTo(ClusterWrap newServer_belongTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServer_belongTo, OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer_belongTo(ClusterWrap newServer_belongTo) {
		if (newServer_belongTo != eInternalContainer() || (eContainerFeatureID() != OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO && newServer_belongTo != null)) {
			if (EcoreUtil.isAncestor(this, newServer_belongTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServer_belongTo != null)
				msgs = ((InternalEObject)newServer_belongTo).eInverseAdd(this, OsmodelPackage.CLUSTER_WRAP__SERVERS, ClusterWrap.class, msgs);
			msgs = basicSetServer_belongTo(newServer_belongTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO, newServer_belongTo, newServer_belongTo));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServer_belongTo((ClusterWrap)otherEnd, msgs);
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
			case OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO:
				return basicSetServer_belongTo(null, msgs);
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
		switch (eContainerFeatureID()) {
			case OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO:
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
		switch (featureID) {
			case OsmodelPackage.SERVER_WRAP__SERVER_NAME:
				return getServer_name();
			case OsmodelPackage.SERVER_WRAP__SERVER_SERVER_ID:
				return getServer_serverId();
			case OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO:
				return getServer_belongTo();
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
		switch (featureID) {
			case OsmodelPackage.SERVER_WRAP__SERVER_NAME:
				setServer_name((String)newValue);
				return;
			case OsmodelPackage.SERVER_WRAP__SERVER_SERVER_ID:
				setServer_serverId((String)newValue);
				return;
			case OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO:
				setServer_belongTo((ClusterWrap)newValue);
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
			case OsmodelPackage.SERVER_WRAP__SERVER_NAME:
				setServer_name(SERVER_NAME_EDEFAULT);
				return;
			case OsmodelPackage.SERVER_WRAP__SERVER_SERVER_ID:
				setServer_serverId(SERVER_SERVER_ID_EDEFAULT);
				return;
			case OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO:
				setServer_belongTo((ClusterWrap)null);
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
			case OsmodelPackage.SERVER_WRAP__SERVER_NAME:
				return SERVER_NAME_EDEFAULT == null ? server_name != null : !SERVER_NAME_EDEFAULT.equals(server_name);
			case OsmodelPackage.SERVER_WRAP__SERVER_SERVER_ID:
				return SERVER_SERVER_ID_EDEFAULT == null ? server_serverId != null : !SERVER_SERVER_ID_EDEFAULT.equals(server_serverId);
			case OsmodelPackage.SERVER_WRAP__SERVER_BELONG_TO:
				return getServer_belongTo() != null;
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
		result.append(" (server_name: ");
		result.append(server_name);
		result.append(", server_serverId: ");
		result.append(server_serverId);
		result.append(')');
		return result.toString();
	}

} //ServerWrapImpl
