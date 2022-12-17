/**
 */
package Web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link Web.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Feature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Web._DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Web._DataType
	 * @see #setType(_DataType)
	 * @see Web.WebPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	_DataType getType();

	/**
	 * Sets the value of the '{@link Web.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Web._DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(_DataType value);

	/**
	 * Returns the value of the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary Key</em>' attribute.
	 * @see #setIsPrimaryKey(boolean)
	 * @see Web.WebPackage#getAttribute_IsPrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isIsPrimaryKey();

	/**
	 * Sets the value of the '{@link Web.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary Key</em>' attribute.
	 * @see #isIsPrimaryKey()
	 * @generated
	 */
	void setIsPrimaryKey(boolean value);

} // Attribute
