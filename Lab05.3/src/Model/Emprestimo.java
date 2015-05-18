/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Emprestimo#getDataEmprestimo <em>Data Emprestimo</em>}</li>
 *   <li>{@link Model.Emprestimo#getDataDevolucao <em>Data Devolucao</em>}</li>
 *   <li>{@link Model.Emprestimo#isReserva <em>Reserva</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getEmprestimo()
 * @model
 * @generated
 */
public interface Emprestimo extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Emprestimo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Emprestimo</em>' attribute.
	 * @see #setDataEmprestimo(Date)
	 * @see Model.ModelPackage#getEmprestimo_DataEmprestimo()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getDataEmprestimo();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getDataEmprestimo <em>Data Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Emprestimo</em>' attribute.
	 * @see #getDataEmprestimo()
	 * @generated
	 */
	void setDataEmprestimo(Date value);

	/**
	 * Returns the value of the '<em><b>Data Devolucao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Devolucao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Devolucao</em>' attribute.
	 * @see #setDataDevolucao(Date)
	 * @see Model.ModelPackage#getEmprestimo_DataDevolucao()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getDataDevolucao();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getDataDevolucao <em>Data Devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Devolucao</em>' attribute.
	 * @see #getDataDevolucao()
	 * @generated
	 */
	void setDataDevolucao(Date value);

	/**
	 * Returns the value of the '<em><b>Reserva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserva</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserva</em>' attribute.
	 * @see #setReserva(boolean)
	 * @see Model.ModelPackage#getEmprestimo_Reserva()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isReserva();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#isReserva <em>Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserva</em>' attribute.
	 * @see #isReserva()
	 * @generated
	 */
	void setReserva(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void gerarMulta();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void DevolverExemplar();

} // Emprestimo
