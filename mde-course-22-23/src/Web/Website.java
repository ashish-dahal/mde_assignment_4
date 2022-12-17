/**
 */
package Web;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Website</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Website#getVersion <em>Version</em>}</li>
 *   <li>{@link Web.Website#getSubversion <em>Subversion</em>}</li>
 *   <li>{@link Web.Website#getPages <em>Pages</em>}</li>
 *   <li>{@link Web.Website#getEntities <em>Entities</em>}</li>
 *   <li>{@link Web.Website#getForms <em>Forms</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getWebsite()
 * @model
 * @generated
 */
public interface Website extends NamedClass {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see Web.WebPackage#getWebsite_Version()
	 * @model
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link Web.Website#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Subversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subversion</em>' attribute.
	 * @see #setSubversion(int)
	 * @see Web.WebPackage#getWebsite_Subversion()
	 * @model
	 * @generated
	 */
	int getSubversion();

	/**
	 * Sets the value of the '{@link Web.Website#getSubversion <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subversion</em>' attribute.
	 * @see #getSubversion()
	 * @generated
	 */
	void setSubversion(int value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see Web.WebPackage#getWebsite_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see Web.WebPackage#getWebsite_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see Web.WebPackage#getWebsite_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

} // Website
