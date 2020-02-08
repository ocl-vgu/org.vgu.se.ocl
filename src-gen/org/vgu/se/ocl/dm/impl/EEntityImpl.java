/**
 */
package org.vgu.se.ocl.dm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.vgu.se.ocl.dm.DMPackage;
import org.vgu.se.ocl.dm.EAssociationEnd;
import org.vgu.se.ocl.dm.EAttribute;
import org.vgu.se.ocl.dm.EEntity;

import org.vgu.se.ocl.type.impl.EClassifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEntity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EEntityImpl#getEnds <em>Ends</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.impl.EEntityImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEntityImpl extends EClassifierImpl implements EEntity {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

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
     * The cached value of the '{@link #getEnds() <em>Ends</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnds()
     * @generated
     * @ordered
     */
    protected EList<EAssociationEnd> ends;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<EAttribute> attributes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EEntityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DMPackage.Literals.EENTITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                DMPackage.EENTITY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EAssociationEnd> getEnds() {
        if (ends == null) {
            ends = new EObjectContainmentEList<EAssociationEnd>(
                EAssociationEnd.class, this, DMPackage.EENTITY__ENDS);
        }
        return ends;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<EAttribute>(
                EAttribute.class, this, DMPackage.EENTITY__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DMPackage.EENTITY__ENDS:
            return ((InternalEList<?>) getEnds()).basicRemove(otherEnd, msgs);
        case DMPackage.EENTITY__ATTRIBUTES:
            return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd,
                msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DMPackage.EENTITY__NAME:
            return getName();
        case DMPackage.EENTITY__ENDS:
            return getEnds();
        case DMPackage.EENTITY__ATTRIBUTES:
            return getAttributes();
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
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DMPackage.EENTITY__NAME:
            setName((String) newValue);
            return;
        case DMPackage.EENTITY__ENDS:
            getEnds().clear();
            getEnds().addAll((Collection<? extends EAssociationEnd>) newValue);
            return;
        case DMPackage.EENTITY__ATTRIBUTES:
            getAttributes().clear();
            getAttributes().addAll((Collection<? extends EAttribute>) newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
        case DMPackage.EENTITY__NAME:
            setName(NAME_EDEFAULT);
            return;
        case DMPackage.EENTITY__ENDS:
            getEnds().clear();
            return;
        case DMPackage.EENTITY__ATTRIBUTES:
            getAttributes().clear();
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DMPackage.EENTITY__NAME:
            return NAME_EDEFAULT == null ? name != null
                : !NAME_EDEFAULT.equals(name);
        case DMPackage.EENTITY__ENDS:
            return ends != null && !ends.isEmpty();
        case DMPackage.EENTITY__ATTRIBUTES:
            return attributes != null && !attributes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //EEntityImpl
