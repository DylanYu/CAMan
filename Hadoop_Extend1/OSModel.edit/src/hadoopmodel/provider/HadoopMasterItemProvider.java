/**
 */
package hadoopmodel.provider;


import hadoopmodel.HadoopMaster;
import hadoopmodel.HadoopmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hadoopmodel.HadoopMaster} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HadoopMasterItemProvider extends JavaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopMasterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHdfsnamenode_data_dirPropertyDescriptor(object);
			addHdfsnamenode_hostOnPropertyDescriptor(object);
			addJobtracker_data_dirPropertyDescriptor(object);
			addJobtracker_dependOnPropertyDescriptor(object);
			addJobtracker_hostOnPropertyDescriptor(object);
			addHadoopmaster_hostOnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hdfsnamenode data dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdfsnamenode_data_dirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HDFSNameNode_hdfsnamenode_data_dir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HDFSNameNode_hdfsnamenode_data_dir_feature", "_UI_HDFSNameNode_type"),
				 HadoopmodelPackage.Literals.HDFS_NAME_NODE__HDFSNAMENODE_DATA_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdfsnamenode host On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdfsnamenode_hostOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HDFSNameNode_hdfsnamenode_hostOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HDFSNameNode_hdfsnamenode_hostOn_feature", "_UI_HDFSNameNode_type"),
				 HadoopmodelPackage.Literals.HDFS_NAME_NODE__HDFSNAMENODE_HOST_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jobtracker data dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobtracker_data_dirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobTracker_jobtracker_data_dir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobTracker_jobtracker_data_dir_feature", "_UI_JobTracker_type"),
				 HadoopmodelPackage.Literals.JOB_TRACKER__JOBTRACKER_DATA_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jobtracker depend On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobtracker_dependOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobTracker_jobtracker_dependOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobTracker_jobtracker_dependOn_feature", "_UI_JobTracker_type"),
				 HadoopmodelPackage.Literals.JOB_TRACKER__JOBTRACKER_DEPEND_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jobtracker host On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobtracker_hostOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JobTracker_jobtracker_hostOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JobTracker_jobtracker_hostOn_feature", "_UI_JobTracker_type"),
				 HadoopmodelPackage.Literals.JOB_TRACKER__JOBTRACKER_HOST_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hadoopmaster host On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHadoopmaster_hostOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HadoopMaster_hadoopmaster_hostOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HadoopMaster_hadoopmaster_hostOn_feature", "_UI_HadoopMaster_type"),
				 HadoopmodelPackage.Literals.HADOOP_MASTER__HADOOPMASTER_HOST_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns HadoopMaster.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HadoopMaster"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HadoopMaster)object).getHdfsnamenode_data_dir();
		return label == null || label.length() == 0 ?
			getString("_UI_HadoopMaster_type") :
			getString("_UI_HadoopMaster_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HadoopMaster.class)) {
			case HadoopmodelPackage.HADOOP_MASTER__HDFSNAMENODE_DATA_DIR:
			case HadoopmodelPackage.HADOOP_MASTER__JOBTRACKER_DATA_DIR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
