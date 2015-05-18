/**
 */
package hadoopmodel.provider;


import hadoopmodel.Cloud;
import hadoopmodel.HadoopmodelFactory;
import hadoopmodel.HadoopmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hadoopmodel.Cloud} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudItemProvider(AdapterFactory adapterFactory) {
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

			addCloud_namePropertyDescriptor(object);
			addCloud_ownerPropertyDescriptor(object);
			addCloud_descriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cloud name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloud_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloud_cloud_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloud_cloud_name_feature", "_UI_Cloud_type"),
				 HadoopmodelPackage.Literals.CLOUD__CLOUD_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloud owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloud_ownerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloud_cloud_owner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloud_cloud_owner_feature", "_UI_Cloud_type"),
				 HadoopmodelPackage.Literals.CLOUD__CLOUD_OWNER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloud description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloud_descriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloud_cloud_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloud_cloud_description_feature", "_UI_Cloud_type"),
				 HadoopmodelPackage.Literals.CLOUD__CLOUD_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(HadoopmodelPackage.Literals.CLOUD__SERVER);
			childrenFeatures.add(HadoopmodelPackage.Literals.CLOUD__JAVA);
			childrenFeatures.add(HadoopmodelPackage.Literals.CLOUD__JOBTRACKER);
			childrenFeatures.add(HadoopmodelPackage.Literals.CLOUD__TASKTRACKER);
			childrenFeatures.add(HadoopmodelPackage.Literals.CLOUD__HDFSNAMENODE);
			childrenFeatures.add(HadoopmodelPackage.Literals.CLOUD__HDFSDATANODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Cloud.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Cloud"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Cloud)object).getCloud_name();
		return label == null || label.length() == 0 ?
			getString("_UI_Cloud_type") :
			getString("_UI_Cloud_type") + " " + label;
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

		switch (notification.getFeatureID(Cloud.class)) {
			case HadoopmodelPackage.CLOUD__CLOUD_NAME:
			case HadoopmodelPackage.CLOUD__CLOUD_OWNER:
			case HadoopmodelPackage.CLOUD__CLOUD_DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HadoopmodelPackage.CLOUD__SERVER:
			case HadoopmodelPackage.CLOUD__JAVA:
			case HadoopmodelPackage.CLOUD__JOBTRACKER:
			case HadoopmodelPackage.CLOUD__TASKTRACKER:
			case HadoopmodelPackage.CLOUD__HDFSNAMENODE:
			case HadoopmodelPackage.CLOUD__HDFSDATANODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(HadoopmodelPackage.Literals.CLOUD__SERVER,
				 HadoopmodelFactory.eINSTANCE.createServer()));

		newChildDescriptors.add
			(createChildParameter
				(HadoopmodelPackage.Literals.CLOUD__JAVA,
				 HadoopmodelFactory.eINSTANCE.createJava()));

		newChildDescriptors.add
			(createChildParameter
				(HadoopmodelPackage.Literals.CLOUD__JOBTRACKER,
				 HadoopmodelFactory.eINSTANCE.createJobTracker()));

		newChildDescriptors.add
			(createChildParameter
				(HadoopmodelPackage.Literals.CLOUD__TASKTRACKER,
				 HadoopmodelFactory.eINSTANCE.createTaskTracker()));

		newChildDescriptors.add
			(createChildParameter
				(HadoopmodelPackage.Literals.CLOUD__HDFSNAMENODE,
				 HadoopmodelFactory.eINSTANCE.createHDFSNameNode()));

		newChildDescriptors.add
			(createChildParameter
				(HadoopmodelPackage.Literals.CLOUD__HDFSDATANODE,
				 HadoopmodelFactory.eINSTANCE.createHDFSDataNode()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HadoopStackEditPlugin.INSTANCE;
	}

}
