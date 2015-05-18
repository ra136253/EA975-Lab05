/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Usuario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.UsuarioImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getNumRegistro <em>Num Registro</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getInstituto <em>Instituto</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#isAtivo <em>Ativo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumRegistro() <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRegistro()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_REGISTRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumRegistro() <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRegistro()
	 * @generated
	 * @ordered
	 */
	protected int numRegistro = NUM_REGISTRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected String instituto = INSTITUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #isAtivo() <em>Ativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtivo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATIVO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtivo() <em>Ativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtivo()
	 * @generated
	 * @ordered
	 */
	protected boolean ativo = ATIVO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumRegistro() {
		return numRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumRegistro(int newNumRegistro) {
		int oldNumRegistro = numRegistro;
		numRegistro = newNumRegistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NUM_REGISTRO, oldNumRegistro, numRegistro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstituto() {
		return instituto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstituto(String newInstituto) {
		String oldInstituto = instituto;
		instituto = newInstituto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__INSTITUTO, oldInstituto, instituto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAtivo() {
		return ativo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtivo(boolean newAtivo) {
		boolean oldAtivo = ativo;
		ativo = newAtivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ATIVO, oldAtivo, ativo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.USUARIO__NOME:
				return getNome();
			case ModelPackage.USUARIO__NUM_REGISTRO:
				return getNumRegistro();
			case ModelPackage.USUARIO__INSTITUTO:
				return getInstituto();
			case ModelPackage.USUARIO__ATIVO:
				return isAtivo();
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
			case ModelPackage.USUARIO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.USUARIO__NUM_REGISTRO:
				setNumRegistro((Integer)newValue);
				return;
			case ModelPackage.USUARIO__INSTITUTO:
				setInstituto((String)newValue);
				return;
			case ModelPackage.USUARIO__ATIVO:
				setAtivo((Boolean)newValue);
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
			case ModelPackage.USUARIO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__NUM_REGISTRO:
				setNumRegistro(NUM_REGISTRO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__INSTITUTO:
				setInstituto(INSTITUTO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ATIVO:
				setAtivo(ATIVO_EDEFAULT);
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
			case ModelPackage.USUARIO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.USUARIO__NUM_REGISTRO:
				return numRegistro != NUM_REGISTRO_EDEFAULT;
			case ModelPackage.USUARIO__INSTITUTO:
				return INSTITUTO_EDEFAULT == null ? instituto != null : !INSTITUTO_EDEFAULT.equals(instituto);
			case ModelPackage.USUARIO__ATIVO:
				return ativo != ATIVO_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Nome: ");
		result.append(nome);
		result.append(", numRegistro: ");
		result.append(numRegistro);
		result.append(", Instituto: ");
		result.append(instituto);
		result.append(", Ativo: ");
		result.append(ativo);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
