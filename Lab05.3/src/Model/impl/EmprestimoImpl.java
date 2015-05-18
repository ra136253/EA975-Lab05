/**
 */
package Model.impl;

import Model.Emprestimo;
import Model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.EmprestimoImpl#getDataEmprestimo <em>Data Emprestimo</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getDataDevolucao <em>Data Devolucao</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#isReserva <em>Reserva</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmprestimoImpl extends MinimalEObjectImpl.Container implements Emprestimo {
	/**
	 * The default value of the '{@link #getDataEmprestimo() <em>Data Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_EMPRESTIMO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataEmprestimo() <em>Data Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected Date dataEmprestimo = DATA_EMPRESTIMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataDevolucao() <em>Data Devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDevolucao()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_DEVOLUCAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDevolucao() <em>Data Devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDevolucao()
	 * @generated
	 * @ordered
	 */
	protected Date dataDevolucao = DATA_DEVOLUCAO_EDEFAULT;

	/**
	 * The default value of the '{@link #isReserva() <em>Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserva()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESERVA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReserva() <em>Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserva()
	 * @generated
	 * @ordered
	 */
	protected boolean reserva = RESERVA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmprestimoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMPRESTIMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEmprestimo(Date newDataEmprestimo) {
		Date oldDataEmprestimo = dataEmprestimo;
		dataEmprestimo = newDataEmprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO, oldDataEmprestimo, dataEmprestimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDevolucao(Date newDataDevolucao) {
		Date oldDataDevolucao = dataDevolucao;
		dataDevolucao = newDataDevolucao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO, oldDataDevolucao, dataDevolucao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReserva() {
		return reserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserva(boolean newReserva) {
		boolean oldReserva = reserva;
		reserva = newReserva;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__RESERVA, oldReserva, reserva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void gerarMulta() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void DevolverExemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO:
				return getDataEmprestimo();
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				return getDataDevolucao();
			case ModelPackage.EMPRESTIMO__RESERVA:
				return isReserva();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO:
				setDataEmprestimo((Date)newValue);
				return;
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				setDataDevolucao((Date)newValue);
				return;
			case ModelPackage.EMPRESTIMO__RESERVA:
				setReserva((Boolean)newValue);
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
			case ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO:
				setDataEmprestimo(DATA_EMPRESTIMO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				setDataDevolucao(DATA_DEVOLUCAO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__RESERVA:
				setReserva(RESERVA_EDEFAULT);
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
			case ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO:
				return DATA_EMPRESTIMO_EDEFAULT == null ? dataEmprestimo != null : !DATA_EMPRESTIMO_EDEFAULT.equals(dataEmprestimo);
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				return DATA_DEVOLUCAO_EDEFAULT == null ? dataDevolucao != null : !DATA_DEVOLUCAO_EDEFAULT.equals(dataDevolucao);
			case ModelPackage.EMPRESTIMO__RESERVA:
				return reserva != RESERVA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EMPRESTIMO___GERAR_MULTA:
				gerarMulta();
				return null;
			case ModelPackage.EMPRESTIMO___DEVOLVER_EXEMPLAR:
				DevolverExemplar();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DataEmprestimo: ");
		result.append(dataEmprestimo);
		result.append(", DataDevolucao: ");
		result.append(dataDevolucao);
		result.append(", Reserva: ");
		result.append(reserva);
		result.append(')');
		return result.toString();
	}

} //EmprestimoImpl
