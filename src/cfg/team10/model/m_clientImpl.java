/**
 */
package cfg.team10.model;

import cfg.team10.modelInterfaces.m_client;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>mclient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getId <em>Id</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getAccount_no <em>Account no</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getExternal_id <em>External id</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getStatus_enum <em>Status enum</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getActivation_date <em>Activation date</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getOffice_joining_date <em>Office joining date</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getOffice_id <em>Office id</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getTransfer_to_office_id <em>Transfer to office id</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getStaff_id <em>Staff id</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getMiddlename <em>Middlename</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getFullname <em>Fullname</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getDisplay_name <em>Display name</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getMobile_no <em>Mobile no</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getGender_cv_id <em>Gender cv id</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getDate_of_birth <em>Date of birth</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getImage_id <em>Image id</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getClosure_reason_cv_id <em>Closure reason cv id</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getClosedon_date <em>Closedon date</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getSubmittedon_date <em>Submittedon date</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getSubmittedon_userid <em>Submittedon userid</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getActivatedon_userid <em>Activatedon userid</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getClosedon_userid <em>Closedon userid</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getDefault_savings_product <em>Default savings product</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getDefault_savings_account <em>Default savings account</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getClient_type_cv_id <em>Client type cv id</em>}</li>
 *   <li>{@link cfg.team10.datamodel.DataModel.impl.m_clientImpl#getClient_classification_cv_id <em>Client classification cv id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class m_clientImpl implements m_client {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccount_no() <em>Account no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount_no()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccount_no() <em>Account no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount_no()
	 * @generated
	 * @ordered
	 */
	protected String account_no = ACCOUNT_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternal_id() <em>External id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal_id()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternal_id() <em>External id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal_id()
	 * @generated
	 * @ordered
	 */
	protected String external_id = EXTERNAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus_enum() <em>Status enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_enum()
	 * @generated
	 * @ordered
	 */
	protected static final int STATUS_ENUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatus_enum() <em>Status enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus_enum()
	 * @generated
	 * @ordered
	 */
	protected int status_enum = STATUS_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivation_date() <em>Activation date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTIVATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivation_date() <em>Activation date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation_date()
	 * @generated
	 * @ordered
	 */
	protected Date activation_date = ACTIVATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffice_joining_date() <em>Office joining date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice_joining_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date OFFICE_JOINING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffice_joining_date() <em>Office joining date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice_joining_date()
	 * @generated
	 * @ordered
	 */
	protected Date office_joining_date = OFFICE_JOINING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffice_id() <em>Office id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice_id()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFICE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffice_id() <em>Office id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice_id()
	 * @generated
	 * @ordered
	 */
	protected int office_id = OFFICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransfer_to_office_id() <em>Transfer to office id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfer_to_office_id()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSFER_TO_OFFICE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransfer_to_office_id() <em>Transfer to office id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfer_to_office_id()
	 * @generated
	 * @ordered
	 */
	protected int transfer_to_office_id = TRANSFER_TO_OFFICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaff_id() <em>Staff id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff_id()
	 * @generated
	 * @ordered
	 */
	protected static final int STAFF_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStaff_id() <em>Staff id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff_id()
	 * @generated
	 * @ordered
	 */
	protected int staff_id = STAFF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiddlename() <em>Middlename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddlename()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiddlename() <em>Middlename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddlename()
	 * @generated
	 * @ordered
	 */
	protected String middlename = MIDDLENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullname()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullname()
	 * @generated
	 * @ordered
	 */
	protected String fullname = FULLNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay_name() <em>Display name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay_name()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay_name() <em>Display name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay_name()
	 * @generated
	 * @ordered
	 */
	protected String display_name = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMobile_no() <em>Mobile no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile_no()
	 * @generated
	 * @ordered
	 */
	protected static final String MOBILE_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMobile_no() <em>Mobile no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile_no()
	 * @generated
	 * @ordered
	 */
	protected String mobile_no = MOBILE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender_cv_id() <em>Gender cv id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender_cv_id()
	 * @generated
	 * @ordered
	 */
	protected static final int GENDER_CV_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGender_cv_id() <em>Gender cv id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender_cv_id()
	 * @generated
	 * @ordered
	 */
	protected int gender_cv_id = GENDER_CV_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_of_birth() <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_birth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_of_birth() <em>Date of birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_of_birth()
	 * @generated
	 * @ordered
	 */
	protected Date date_of_birth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_id() <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_id()
	 * @generated
	 * @ordered
	 */
	protected static final int IMAGE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getImage_id() <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_id()
	 * @generated
	 * @ordered
	 */
	protected int image_id = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosure_reason_cv_id() <em>Closure reason cv id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosure_reason_cv_id()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOSURE_REASON_CV_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClosure_reason_cv_id() <em>Closure reason cv id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosure_reason_cv_id()
	 * @generated
	 * @ordered
	 */
	protected int closure_reason_cv_id = CLOSURE_REASON_CV_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosedon_date() <em>Closedon date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSEDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosedon_date() <em>Closedon date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date closedon_date = CLOSEDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmittedon_date() <em>Submittedon date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUBMITTEDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmittedon_date() <em>Submittedon date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date submittedon_date = SUBMITTEDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmittedon_userid() <em>Submittedon userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBMITTEDON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubmittedon_userid() <em>Submittedon userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedon_userid()
	 * @generated
	 * @ordered
	 */
	protected int submittedon_userid = SUBMITTEDON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivatedon_userid() <em>Activatedon userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatedon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVATEDON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActivatedon_userid() <em>Activatedon userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatedon_userid()
	 * @generated
	 * @ordered
	 */
	protected int activatedon_userid = ACTIVATEDON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosedon_userid() <em>Closedon userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOSEDON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClosedon_userid() <em>Closedon userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedon_userid()
	 * @generated
	 * @ordered
	 */
	protected int closedon_userid = CLOSEDON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault_savings_product() <em>Default savings product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_savings_product()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_SAVINGS_PRODUCT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefault_savings_product() <em>Default savings product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_savings_product()
	 * @generated
	 * @ordered
	 */
	protected int default_savings_product = DEFAULT_SAVINGS_PRODUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault_savings_account() <em>Default savings account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_savings_account()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_SAVINGS_ACCOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefault_savings_account() <em>Default savings account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_savings_account()
	 * @generated
	 * @ordered
	 */
	protected int default_savings_account = DEFAULT_SAVINGS_ACCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClient_type_cv_id() <em>Client type cv id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_type_cv_id()
	 * @generated
	 * @ordered
	 */
	protected static final int CLIENT_TYPE_CV_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClient_type_cv_id() <em>Client type cv id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_type_cv_id()
	 * @generated
	 * @ordered
	 */
	protected int client_type_cv_id = CLIENT_TYPE_CV_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClient_classification_cv_id() <em>Client classification cv id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_classification_cv_id()
	 * @generated
	 * @ordered
	 */
	protected static final int CLIENT_CLASSIFICATION_CV_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClient_classification_cv_id() <em>Client classification cv id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_classification_cv_id()
	 * @generated
	 * @ordered
	 */
	protected int client_classification_cv_id = CLIENT_CLASSIFICATION_CV_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected m_clientImpl() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccount_no() {
		return account_no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount_no(String newAccount_no) {
		String oldAccount_no = account_no;
		account_no = newAccount_no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternal_id() {
		return external_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal_id(String newExternal_id) {
		String oldExternal_id = external_id;
		external_id = newExternal_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStatus_enum() {
		return status_enum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus_enum(int newStatus_enum) {
		int oldStatus_enum = status_enum;
		status_enum = newStatus_enum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getActivation_date() {
		return activation_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation_date(Date newActivation_date) {
		Date oldActivation_date = activation_date;
		activation_date = newActivation_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOffice_joining_date() {
		return office_joining_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffice_joining_date(Date newOffice_joining_date) {
		Date oldOffice_joining_date = office_joining_date;
		office_joining_date = newOffice_joining_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffice_id() {
		return office_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffice_id(int newOffice_id) {
		int oldOffice_id = office_id;
		office_id = newOffice_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransfer_to_office_id() {
		return transfer_to_office_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfer_to_office_id(int newTransfer_to_office_id) {
		int oldTransfer_to_office_id = transfer_to_office_id;
		transfer_to_office_id = newTransfer_to_office_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStaff_id() {
		return staff_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaff_id(int newStaff_id) {
		int oldStaff_id = staff_id;
		staff_id = newStaff_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiddlename() {
		return middlename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiddlename(String newMiddlename) {
		String oldMiddlename = middlename;
		middlename = newMiddlename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullname(String newFullname) {
		String oldFullname = fullname;
		fullname = newFullname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay_name() {
		return display_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay_name(String newDisplay_name) {
		String oldDisplay_name = display_name;
		display_name = newDisplay_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMobile_no() {
		return mobile_no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobile_no(String newMobile_no) {
		String oldMobile_no = mobile_no;
		mobile_no = newMobile_no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGender_cv_id() {
		return gender_cv_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender_cv_id(int newGender_cv_id) {
		int oldGender_cv_id = gender_cv_id;
		gender_cv_id = newGender_cv_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_of_birth() {
		return date_of_birth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_of_birth(Date newDate_of_birth) {
		Date oldDate_of_birth = date_of_birth;
		date_of_birth = newDate_of_birth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getImage_id() {
		return image_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_id(int newImage_id) {
		int oldImage_id = image_id;
		image_id = newImage_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClosure_reason_cv_id() {
		return closure_reason_cv_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosure_reason_cv_id(int newClosure_reason_cv_id) {
		int oldClosure_reason_cv_id = closure_reason_cv_id;
		closure_reason_cv_id = newClosure_reason_cv_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getClosedon_date() {
		return closedon_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedon_date(Date newClosedon_date) {
		Date oldClosedon_date = closedon_date;
		closedon_date = newClosedon_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSubmittedon_date() {
		return submittedon_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmittedon_date(Date newSubmittedon_date) {
		Date oldSubmittedon_date = submittedon_date;
		submittedon_date = newSubmittedon_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubmittedon_userid() {
		return submittedon_userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmittedon_userid(int newSubmittedon_userid) {
		int oldSubmittedon_userid = submittedon_userid;
		submittedon_userid = newSubmittedon_userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActivatedon_userid() {
		return activatedon_userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivatedon_userid(int newActivatedon_userid) {
		int oldActivatedon_userid = activatedon_userid;
		activatedon_userid = newActivatedon_userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClosedon_userid() {
		return closedon_userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedon_userid(int newClosedon_userid) {
		int oldClosedon_userid = closedon_userid;
		closedon_userid = newClosedon_userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefault_savings_product() {
		return default_savings_product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_savings_product(int newDefault_savings_product) {
		int oldDefault_savings_product = default_savings_product;
		default_savings_product = newDefault_savings_product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefault_savings_account() {
		return default_savings_account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_savings_account(int newDefault_savings_account) {
		int oldDefault_savings_account = default_savings_account;
		default_savings_account = newDefault_savings_account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClient_type_cv_id() {
		return client_type_cv_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_type_cv_id(int newClient_type_cv_id) {
		int oldClient_type_cv_id = client_type_cv_id;
		client_type_cv_id = newClient_type_cv_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClient_classification_cv_id() {
		return client_classification_cv_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient_classification_cv_id(int newClient_classification_cv_id) {
		int oldClient_classification_cv_id = client_classification_cv_id;
		client_classification_cv_id = newClient_classification_cv_id;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", account_no: ");
		result.append(account_no);
		result.append(", external_id: ");
		result.append(external_id);
		result.append(", status_enum: ");
		result.append(status_enum);
		result.append(", activation_date: ");
		result.append(activation_date);
		result.append(", office_joining_date: ");
		result.append(office_joining_date);
		result.append(", office_id: ");
		result.append(office_id);
		result.append(", transfer_to_office_id: ");
		result.append(transfer_to_office_id);
		result.append(", staff_id: ");
		result.append(staff_id);
		result.append(", firstname: ");
		result.append(firstname);
		result.append(", middlename: ");
		result.append(middlename);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", fullname: ");
		result.append(fullname);
		result.append(", display_name: ");
		result.append(display_name);
		result.append(", mobile_no: ");
		result.append(mobile_no);
		result.append(", gender_cv_id: ");
		result.append(gender_cv_id);
		result.append(", date_of_birth: ");
		result.append(date_of_birth);
		result.append(", image_id: ");
		result.append(image_id);
		result.append(", closure_reason_cv_id: ");
		result.append(closure_reason_cv_id);
		result.append(", closedon_date: ");
		result.append(closedon_date);
		result.append(", submittedon_date: ");
		result.append(submittedon_date);
		result.append(", submittedon_userid: ");
		result.append(submittedon_userid);
		result.append(", activatedon_userid: ");
		result.append(activatedon_userid);
		result.append(", closedon_userid: ");
		result.append(closedon_userid);
		result.append(", default_savings_product: ");
		result.append(default_savings_product);
		result.append(", default_savings_account: ");
		result.append(default_savings_account);
		result.append(", client_type_cv_id: ");
		result.append(client_type_cv_id);
		result.append(", client_classification_cv_id: ");
		result.append(client_classification_cv_id);
		result.append(')');
		return result.toString();
	}

} //m_clientImpl
