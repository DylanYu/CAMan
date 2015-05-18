/**
 */
package hadoopmodel.provider;


import hadoopmodel.HadoopSlave;
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
 * This is the item provider adapter for a {@link hadoopmodel.HadoopSlave} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HadoopSlaveItemProvider extends JavaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopSlaveItemProvider(AdapterFactory adapterFactory) {
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

			addHdfsdatanode_data_dirPropertyDescriptor(object);
			addHdfsdatanode_connectToPropertyDescriptor(object);
			addHdfsdatanode_hostOnPropertyDescriptor(object);
			addTasktracker_data_dirPropertyDescriptor(object);
			addTasktracker_connectToPropertyDescriptor(object);
			addTasktracker_hostOnPropertyDescriptor(object);
			addHadoopslave_connectToPropertyDescriptor(object);
			addHadoopslave_hostOnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hdfsdatanode data dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdfsdatanode_data_dirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HDFSDataNode_hdfsdatanode_data_dir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HDFSDataNode_hdfsdatanode_data_dir_feature", "_UI_HDFSDataNode_type"),
				 HadoopmodelPackage.Literals.HDFS_DATA_NODE__HDFSDATANODE_DATA_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdfsdatanode connect To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdfsdatanode_connectToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HDFSDataNode_hdfsdatanode_connectTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HDFSDataNode_hdfsdatanode_connectTo_feature", "_UI_HDFSDataNode_type"),
				 HadoopmodelPackage.Literals.HDFS_DATA_NODE__HDFSDATANODE_CONNECT_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdfsdatanode host On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdfsdatanode_hostOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HDFSDataNode_hdfsdatanode_hostOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HDFSDataNode_hdfsdatanode_hostOn_feature", "_UI_HDFSDataNode_type"),
				 HadoopmodelPackage.Literals.HDFS_DATA_NODE__HDFSDATANODE_HOST_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tasktracker data dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTasktracker_data_dirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskTracker_tasktracker_data_dir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskTracker_tasktracker_data_dir_feature", "_UI_TaskTracker_type"),
				 HadoopmodelPackage.Literals.TASK_TRACKER__TASKTRACKER_DATA_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tasktracker connect To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTasktracker_connectToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskTracker_tasktracker_connectTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskTracker_tasktracker_connectTo_feature", "_UI_TaskTracker_type"),
				 HadoopmodelPackage.Literals.TASK_TRACKER__TASKTRACKER_CONNECT_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tasktracker host On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTasktracker_hostOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskTracker_tasktracker_hostOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskTracker_tasktracker_hostOn_feature", "_UI_TaskTracker_type"),
				 HadoopmodelPackage.Literals.TASK_TRACKER__TASKTRACKER_HOST_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hadoopslave connect To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHadoopslave_connectToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HadoopSlave_hadoopslave_connectTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HadoopSlave_hadoopslave_connectTo_feature", "_UI_HadoopSlave_type"),
				 HadoopmodelPackage.Literals.HADOOP_SLAVE__HADOOPSLAVE_CONNECT_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hadoopslave host On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHadoopslave_hostOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HadoopSlave_hadoopslave_hostOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HadoopSlave_hadoopslave_hostOn_feature", "_UI_HadoopSlave_type"),
				 HadoopmodelPackage.Literals.HADOOP_SLAVE__HADOOPSLAVE_HOST_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns HadoopSlave.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HadoopSlave"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HadoopSlave)object).getJava_jdk_version();
		return label == null || label.length() == 0 ?
			getString("_UI_HadoopSlave_type") :
			getString("_UI_HadoopSlave_type") + " " + label;
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

		switch (notification.getFeatureID(HadoopSlave.class)) {
			case HadoopmodelPackage.HADOOP_SLAVE__HDFSDATANODE_DATA_DIR:
			case HadoopmodelPackage.HADOOP_SLAVE__TASKTRACKER_DATA_DIR:
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
