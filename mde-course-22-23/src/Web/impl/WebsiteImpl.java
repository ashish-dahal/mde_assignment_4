/**
 */
package Web.impl;

import Web.Entity;
import Web.Form;
import Web.Page;
import Web.WebPackage;
import Web.Website;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Website</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Web.impl.WebsiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link Web.impl.WebsiteImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Web.impl.WebsiteImpl#getSubversion <em>Subversion</em>}</li>
 *   <li>{@link Web.impl.WebsiteImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link Web.impl.WebsiteImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link Web.impl.WebsiteImpl#getForms <em>Forms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebsiteImpl extends MinimalEObjectImpl.Container implements Website {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubversion() <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubversion()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBVERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubversion() <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubversion()
	 * @generated
	 * @ordered
	 */
	protected int subversion = SUBVERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebsiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.WEBSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.WEBSITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.WEBSITE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubversion() {
		return subversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubversion(int newSubversion) {
		int oldSubversion = subversion;
		subversion = newSubversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.WEBSITE__SUBVERSION, oldSubversion, subversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, WebPackage.WEBSITE__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, WebPackage.WEBSITE__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, WebPackage.WEBSITE__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebPackage.WEBSITE__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case WebPackage.WEBSITE__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case WebPackage.WEBSITE__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
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
			case WebPackage.WEBSITE__NAME:
				return getName();
			case WebPackage.WEBSITE__VERSION:
				return getVersion();
			case WebPackage.WEBSITE__SUBVERSION:
				return getSubversion();
			case WebPackage.WEBSITE__PAGES:
				return getPages();
			case WebPackage.WEBSITE__ENTITIES:
				return getEntities();
			case WebPackage.WEBSITE__FORMS:
				return getForms();
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
			case WebPackage.WEBSITE__NAME:
				setName((String)newValue);
				return;
			case WebPackage.WEBSITE__VERSION:
				setVersion((Integer)newValue);
				return;
			case WebPackage.WEBSITE__SUBVERSION:
				setSubversion((Integer)newValue);
				return;
			case WebPackage.WEBSITE__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case WebPackage.WEBSITE__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case WebPackage.WEBSITE__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
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
			case WebPackage.WEBSITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebPackage.WEBSITE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case WebPackage.WEBSITE__SUBVERSION:
				setSubversion(SUBVERSION_EDEFAULT);
				return;
			case WebPackage.WEBSITE__PAGES:
				getPages().clear();
				return;
			case WebPackage.WEBSITE__ENTITIES:
				getEntities().clear();
				return;
			case WebPackage.WEBSITE__FORMS:
				getForms().clear();
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
			case WebPackage.WEBSITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebPackage.WEBSITE__VERSION:
				return version != VERSION_EDEFAULT;
			case WebPackage.WEBSITE__SUBVERSION:
				return subversion != SUBVERSION_EDEFAULT;
			case WebPackage.WEBSITE__PAGES:
				return pages != null && !pages.isEmpty();
			case WebPackage.WEBSITE__ENTITIES:
				return entities != null && !entities.isEmpty();
			case WebPackage.WEBSITE__FORMS:
				return forms != null && !forms.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", subversion: ");
		result.append(subversion);
		result.append(')');
		return result.toString();
	}

} //WebsiteImpl
