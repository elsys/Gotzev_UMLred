/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.elsys.sequenceDiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.elsys.sequenceDiagram.Diagram;
import org.elsys.sequenceDiagram.SequenceDiagramFactory;
import org.elsys.sequenceDiagram.SequenceDiagramPackage;

/**
 * This is the item provider adapter for a {@link org.elsys.sequenceDiagram.Diagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramItemProvider
	extends AbstractElementItemProvider
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
	public DiagramItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(SequenceDiagramPackage.Literals.DIAGRAM__LIFELINES);
			childrenFeatures.add(SequenceDiagramPackage.Literals.DIAGRAM__NOTES);
			childrenFeatures.add(SequenceDiagramPackage.Literals.DIAGRAM__COMBINED_FRAGMENTS);
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
	 * This returns Diagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Diagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Diagram_type");
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

		switch (notification.getFeatureID(Diagram.class)) {
			case SequenceDiagramPackage.DIAGRAM__LIFELINES:
			case SequenceDiagramPackage.DIAGRAM__NOTES:
			case SequenceDiagramPackage.DIAGRAM__COMBINED_FRAGMENTS:
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
				(SequenceDiagramPackage.Literals.DIAGRAM__LIFELINES,
				 SequenceDiagramFactory.eINSTANCE.createLifeline()));

		newChildDescriptors.add
			(createChildParameter
				(SequenceDiagramPackage.Literals.DIAGRAM__NOTES,
				 SequenceDiagramFactory.eINSTANCE.createNote()));

		newChildDescriptors.add
			(createChildParameter
				(SequenceDiagramPackage.Literals.DIAGRAM__COMBINED_FRAGMENTS,
				 SequenceDiagramFactory.eINSTANCE.createParallelCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(SequenceDiagramPackage.Literals.DIAGRAM__COMBINED_FRAGMENTS,
				 SequenceDiagramFactory.eINSTANCE.createAlternativeCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(SequenceDiagramPackage.Literals.DIAGRAM__COMBINED_FRAGMENTS,
				 SequenceDiagramFactory.eINSTANCE.createBreakCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(SequenceDiagramPackage.Literals.DIAGRAM__COMBINED_FRAGMENTS,
				 SequenceDiagramFactory.eINSTANCE.createLoopCombinedFragment()));

		newChildDescriptors.add
			(createChildParameter
				(SequenceDiagramPackage.Literals.DIAGRAM__COMBINED_FRAGMENTS,
				 SequenceDiagramFactory.eINSTANCE.createOptionCombinedFragment()));
	}

}
