
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
import osmodel.MySQLWrap;
import osmodel.OsmodelPackage;
import osmodel.PHPWrap;
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
 *   <li>{@link osmodel.impl.WebWrapImpl#getWeb_dependOn <em>Web depend On</em>}</li>
 *   <li>{@link osmodel.impl.WebWrapImpl#getWeb_connectTo <em>Web connect To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebWrapImpl extends SoftwareImpl implements WebWrap
{
  /**
	 * The cached value of the '{@link #getWeb_dependOn() <em>Web depend On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb_dependOn()
	 * @generated
	 * @ordered
	 */
	protected PHPWrap web_dependOn;

	/**
	 * The cached value of the '{@link #getWeb_connectTo() <em>Web connect To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb_connectTo()
	 * @generated
	 * @ordered
	 */
	protected MySQLWrap web_connectTo;

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
	public PHPWrap getWeb_dependOn() {
		if (web_dependOn != null && web_dependOn.eIsProxy()) {
			InternalEObject oldWeb_dependOn = (InternalEObject)web_dependOn;
			web_dependOn = (PHPWrap)eResolveProxy(oldWeb_dependOn);
			if (web_dependOn != oldWeb_dependOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsmodelPackage.WEB_WRAP__WEB_DEPEND_ON, oldWeb_dependOn, web_dependOn));
			}
		}
		return web_dependOn;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHPWrap basicGetWeb_dependOn() {
		return web_dependOn;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeb_dependOn(PHPWrap newWeb_dependOn) {
		PHPWrap oldWeb_dependOn = web_dependOn;
		web_dependOn = newWeb_dependOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.WEB_WRAP__WEB_DEPEND_ON, oldWeb_dependOn, web_dependOn));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MySQLWrap getWeb_connectTo() {
		if (web_connectTo != null && web_connectTo.eIsProxy()) {
			InternalEObject oldWeb_connectTo = (InternalEObject)web_connectTo;
			web_connectTo = (MySQLWrap)eResolveProxy(oldWeb_connectTo);
			if (web_connectTo != oldWeb_connectTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsmodelPackage.WEB_WRAP__WEB_CONNECT_TO, oldWeb_connectTo, web_connectTo));
			}
		}
		return web_connectTo;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MySQLWrap basicGetWeb_connectTo() {
		return web_connectTo;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeb_connectTo(MySQLWrap newWeb_connectTo) {
		MySQLWrap oldWeb_connectTo = web_connectTo;
		web_connectTo = newWeb_connectTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmodelPackage.WEB_WRAP__WEB_CONNECT_TO, oldWeb_connectTo, web_connectTo));
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
			case OsmodelPackage.WEB_WRAP__WEB_DEPEND_ON:
				if (resolve) return getWeb_dependOn();
				return basicGetWeb_dependOn();
			case OsmodelPackage.WEB_WRAP__WEB_CONNECT_TO:
				if (resolve) return getWeb_connectTo();
				return basicGetWeb_connectTo();
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
			case OsmodelPackage.WEB_WRAP__WEB_DEPEND_ON:
				setWeb_dependOn((PHPWrap)newValue);
				return;
			case OsmodelPackage.WEB_WRAP__WEB_CONNECT_TO:
				setWeb_connectTo((MySQLWrap)newValue);
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
			case OsmodelPackage.WEB_WRAP__WEB_DEPEND_ON:
				setWeb_dependOn((PHPWrap)null);
				return;
			case OsmodelPackage.WEB_WRAP__WEB_CONNECT_TO:
				setWeb_connectTo((MySQLWrap)null);
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
			case OsmodelPackage.WEB_WRAP__WEB_DEPEND_ON:
				return web_dependOn != null;
			case OsmodelPackage.WEB_WRAP__WEB_CONNECT_TO:
				return web_connectTo != null;
		}
		return super.eIsSet(featureID);
	}

} //WebWrapImpl
