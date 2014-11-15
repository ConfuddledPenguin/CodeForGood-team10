/**
 */
package cfg.team10.model;

import cfg.team10.modelInterfaces.*;

import java.util.Date;

/*
 *
 * @generated
 */
public class m_loanImpl implements m_loan {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccount_no() <em>Account no</em>}' attribute.
	 * @see #getAccount_no()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccount_no() <em>Account no</em>}' attribute.
	 * @see #getAccount_no()
	 * @generated
	 * @ordered
	 */
	protected String account_no = ACCOUNT_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternal_id() <em>External id</em>}' attribute.
	 * @see #getExternal_id()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternal_id() <em>External id</em>}' attribute.
	 * @see #getExternal_id()
	 * @generated
	 * @ordered
	 */
	protected String external_id = EXTERNAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClient_id() <em>Client id</em>}' attribute.
	 * @see #getClient_id()
	 * @generated
	 * @ordered
	 */
	protected static final int CLIENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClient_id() <em>Client id</em>}' attribute.
	 * @see #getClient_id()
	 * @generated
	 * @ordered
	 */
	protected int client_id = CLIENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup_id() <em>Group id</em>}' attribute.
	 * @see #getGroup_id()
	 * @generated
	 * @ordered
	 */
	protected static final int GROUP_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGroup_id() <em>Group id</em>}' attribute.
	 * @see #getGroup_id()
	 * @generated
	 * @ordered
	 */
	protected int group_id = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduct_id() <em>Product id</em>}' attribute.
	 * @see #getProduct_id()
	 * @generated
	 * @ordered
	 */
	protected static final int PRODUCT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProduct_id() <em>Product id</em>}' attribute.
	 * @see #getProduct_id()
	 * @generated
	 * @ordered
	 */
	protected int product_id = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFund_id() <em>Fund id</em>}' attribute.
	 * @see #getFund_id()
	 * @generated
	 * @ordered
	 */
	protected static final int FUND_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFund_id() <em>Fund id</em>}' attribute.
	 * @see #getFund_id()
	 * @generated
	 * @ordered
	 */
	protected int fund_id = FUND_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoan_officer_id() <em>Loan officer id</em>}' attribute.
	 * @see #getLoan_officer_id()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAN_OFFICER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoan_officer_id() <em>Loan officer id</em>}' attribute.
	 * @see #getLoan_officer_id()
	 * @generated
	 * @ordered
	 */
	protected int loan_officer_id = LOAN_OFFICER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoanpurpose_cv_id() <em>Loanpurpose cv id</em>}' attribute.
	 * @see #getLoanpurpose_cv_id()
	 * @generated
	 * @ordered
	 */
	protected static final int LOANPURPOSE_CV_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoanpurpose_cv_id() <em>Loanpurpose cv id</em>}' attribute.
	 * @see #getLoanpurpose_cv_id()
	 * @generated
	 * @ordered
	 */
	protected int loanpurpose_cv_id = LOANPURPOSE_CV_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoan_status_id() <em>Loan status id</em>}' attribute.
	 * @see #getLoan_status_id()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAN_STATUS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoan_status_id() <em>Loan status id</em>}' attribute.
	 * @see #getLoan_status_id()
	 * @generated
	 * @ordered
	 */
	protected int loan_status_id = LOAN_STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoan_type_enum() <em>Loan type enum</em>}' attribute.
	 * @see #getLoan_type_enum()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAN_TYPE_ENUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoan_type_enum() <em>Loan type enum</em>}' attribute.
	 * @see #getLoan_type_enum()
	 * @generated
	 * @ordered
	 */
	protected int loan_type_enum = LOAN_TYPE_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency_code() <em>Currency code</em>}' attribute.
	 * @see #getCurrency_code()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency_code() <em>Currency code</em>}' attribute.
	 * @see #getCurrency_code()
	 * @generated
	 * @ordered
	 */
	protected String currency_code = CURRENCY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency_digits() <em>Currency digits</em>}' attribute.
	 * @see #getCurrency_digits()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENCY_DIGITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrency_digits() <em>Currency digits</em>}' attribute.
	 * @see #getCurrency_digits()
	 * @generated
	 * @ordered
	 */
	protected int currency_digits = CURRENCY_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency_multiplesof() <em>Currency multiplesof</em>}' attribute.
	 * @see #getCurrency_multiplesof()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENCY_MULTIPLESOF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrency_multiplesof() <em>Currency multiplesof</em>}' attribute.
	 * @see #getCurrency_multiplesof()
	 * @generated
	 * @ordered
	 */
	protected int currency_multiplesof = CURRENCY_MULTIPLESOF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipal_amount() <em>Principal amount</em>}' attribute.
	 * @see #getPrincipal_amount()
	 * @generated
	 * @ordered
	 */
	protected static final double PRINCIPAL_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrincipal_amount() <em>Principal amount</em>}' attribute.
	 * @see #getPrincipal_amount()
	 * @generated
	 * @ordered
	 */
	protected double principal_amount = PRINCIPAL_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getApproved_principal() <em>Approved principal</em>}' attribute.
	 * @see #getApproved_principal()
	 * @generated
	 * @ordered
	 */
	protected static final double APPROVED_PRINCIPAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApproved_principal() <em>Approved principal</em>}' attribute.
	 * @see #getApproved_principal()
	 * @generated
	 * @ordered
	 */
	protected double approved_principal = APPROVED_PRINCIPAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrearstolerance_amount() <em>Arrearstolerance amount</em>}' attribute.
	 * @see #getArrearstolerance_amount()
	 * @generated
	 * @ordered
	 */
	protected static final double ARREARSTOLERANCE_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArrearstolerance_amount() <em>Arrearstolerance amount</em>}' attribute.
	 * @see #getArrearstolerance_amount()
	 * @generated
	 * @ordered
	 */
	protected double arrearstolerance_amount = ARREARSTOLERANCE_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominal_interest_rate_per_period() <em>Nominal interest rate per period</em>}' attribute.
	 * @see #getNominal_interest_rate_per_period()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_INTEREST_RATE_PER_PERIOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominal_interest_rate_per_period() <em>Nominal interest rate per period</em>}' attribute.
	 * @see #getNominal_interest_rate_per_period()
	 * @generated
	 * @ordered
	 */
	protected double nominal_interest_rate_per_period = NOMINAL_INTEREST_RATE_PER_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest_period_frequency_enum() <em>Interest period frequency enum</em>}' attribute.
	 * @see #getInterest_period_frequency_enum()
	 * @generated
	 * @ordered
	 */
	protected static final int INTEREST_PERIOD_FREQUENCY_ENUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterest_period_frequency_enum() <em>Interest period frequency enum</em>}' attribute.
	 * @see #getInterest_period_frequency_enum()
	 * @generated
	 * @ordered
	 */
	protected int interest_period_frequency_enum = INTEREST_PERIOD_FREQUENCY_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnual_nominal_interest_rate() <em>Annual nominal interest rate</em>}' attribute.
	 * @see #getAnnual_nominal_interest_rate()
	 * @generated
	 * @ordered
	 */
	protected static final double ANNUAL_NOMINAL_INTEREST_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAnnual_nominal_interest_rate() <em>Annual nominal interest rate</em>}' attribute.
	 * @see #getAnnual_nominal_interest_rate()
	 * @generated
	 * @ordered
	 */
	protected double annual_nominal_interest_rate = ANNUAL_NOMINAL_INTEREST_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest_method_enum() <em>Interest method enum</em>}' attribute.
	 * @see #getInterest_method_enum()
	 * @generated
	 * @ordered
	 */
	protected static final int INTEREST_METHOD_ENUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterest_method_enum() <em>Interest method enum</em>}' attribute.
	 * @see #getInterest_method_enum()
	 * @generated
	 * @ordered
	 */
	protected int interest_method_enum = INTEREST_METHOD_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest_calculated_in_period_enum() <em>Interest calculated in period enum</em>}' attribute.
	 * @see #getInterest_calculated_in_period_enum()
	 * @generated
	 * @ordered
	 */
	protected static final int INTEREST_CALCULATED_IN_PERIOD_ENUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterest_calculated_in_period_enum() <em>Interest calculated in period enum</em>}' attribute.
	 * @see #getInterest_calculated_in_period_enum()
	 * @generated
	 * @ordered
	 */
	protected int interest_calculated_in_period_enum = INTEREST_CALCULATED_IN_PERIOD_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerm_frequency() <em>Term frequency</em>}' attribute.
	 * @see #getTerm_frequency()
	 * @generated
	 * @ordered
	 */
	protected static final int TERM_FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTerm_frequency() <em>Term frequency</em>}' attribute.
	 * @see #getTerm_frequency()
	 * @generated
	 * @ordered
	 */
	protected int term_frequency = TERM_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerm_period_frequency_enum() <em>Term period frequency enum</em>}' attribute.
	 * @see #getTerm_period_frequency_enum()
	 * @generated
	 * @ordered
	 */
	protected static final int TERM_PERIOD_FREQUENCY_ENUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTerm_period_frequency_enum() <em>Term period frequency enum</em>}' attribute.
	 * @see #getTerm_period_frequency_enum()
	 * @generated
	 * @ordered
	 */
	protected int term_period_frequency_enum = TERM_PERIOD_FREQUENCY_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepay_every() <em>Repay every</em>}' attribute.
	 * @see #getRepay_every()
	 * @generated
	 * @ordered
	 */
	protected static final int REPAY_EVERY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRepay_every() <em>Repay every</em>}' attribute.
	 * @see #getRepay_every()
	 * @generated
	 * @ordered
	 */
	protected int repay_every = REPAY_EVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepayment_period_frequency_enum() <em>Repayment period frequency enum</em>}' attribute.
	 * @see #getRepayment_period_frequency_enum()
	 * @generated
	 * @ordered
	 */
	protected static final int REPAYMENT_PERIOD_FREQUENCY_ENUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRepayment_period_frequency_enum() <em>Repayment period frequency enum</em>}' attribute.
	 * @see #getRepayment_period_frequency_enum()
	 * @generated
	 * @ordered
	 */
	protected int repayment_period_frequency_enum = REPAYMENT_PERIOD_FREQUENCY_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber_of_repayments() <em>Number of repayments</em>}' attribute.
	 * @see #getNumber_of_repayments()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_REPAYMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber_of_repayments() <em>Number of repayments</em>}' attribute.
	 * @see #getNumber_of_repayments()
	 * @generated
	 * @ordered
	 */
	protected int number_of_repayments = NUMBER_OF_REPAYMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrace_on_principal_periods() <em>Grace on principal periods</em>}' attribute.
	 * @see #getGrace_on_principal_periods()
	 * @generated
	 * @ordered
	 */
	protected static final int GRACE_ON_PRINCIPAL_PERIODS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrace_on_principal_periods() <em>Grace on principal periods</em>}' attribute.
	 * @see #getGrace_on_principal_periods()
	 * @generated
	 * @ordered
	 */
	protected int grace_on_principal_periods = GRACE_ON_PRINCIPAL_PERIODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrace_on_interest_periods() <em>Grace on interest periods</em>}' attribute.
	 * @see #getGrace_on_interest_periods()
	 * @generated
	 * @ordered
	 */
	protected static final int GRACE_ON_INTEREST_PERIODS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrace_on_interest_periods() <em>Grace on interest periods</em>}' attribute.
	 * @see #getGrace_on_interest_periods()
	 * @generated
	 * @ordered
	 */
	protected int grace_on_interest_periods = GRACE_ON_INTEREST_PERIODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrace_interest_free_periods() <em>Grace interest free periods</em>}' attribute.
	 * @see #getGrace_interest_free_periods()
	 * @generated
	 * @ordered
	 */
	protected static final int GRACE_INTEREST_FREE_PERIODS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrace_interest_free_periods() <em>Grace interest free periods</em>}' attribute.
	 * @see #getGrace_interest_free_periods()
	 * @generated
	 * @ordered
	 */
	protected int grace_interest_free_periods = GRACE_INTEREST_FREE_PERIODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmortization_method_enum() <em>Amortization method enum</em>}' attribute.
	 * @see #getAmortization_method_enum()
	 * @generated
	 * @ordered
	 */
	protected static final int AMORTIZATION_METHOD_ENUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmortization_method_enum() <em>Amortization method enum</em>}' attribute.
	 * @see #getAmortization_method_enum()
	 * @generated
	 * @ordered
	 */
	protected int amortization_method_enum = AMORTIZATION_METHOD_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmittedon_date() <em>Submittedon date</em>}' attribute.
	 * @see #getSubmittedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUBMITTEDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmittedon_date() <em>Submittedon date</em>}' attribute.
	 * @see #getSubmittedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date submittedon_date = SUBMITTEDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmittedon_userid() <em>Submittedon userid</em>}' attribute.
	 * @see #getSubmittedon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBMITTEDON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubmittedon_userid() <em>Submittedon userid</em>}' attribute.
	 * @see #getSubmittedon_userid()
	 * @generated
	 * @ordered
	 */
	protected int submittedon_userid = SUBMITTEDON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovedon_date() <em>Approvedon date</em>}' attribute.
	 * @see #getApprovedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date APPROVEDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovedon_date() <em>Approvedon date</em>}' attribute.
	 * @see #getApprovedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date approvedon_date = APPROVEDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovedon_userid() <em>Approvedon userid</em>}' attribute.
	 * @see #getApprovedon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int APPROVEDON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getApprovedon_userid() <em>Approvedon userid</em>}' attribute.
	 * @see #getApprovedon_userid()
	 * @generated
	 * @ordered
	 */
	protected int approvedon_userid = APPROVEDON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpected_disbursedon_date() <em>Expected disbursedon date</em>}' attribute.
	 * @see #getExpected_disbursedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPECTED_DISBURSEDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpected_disbursedon_date() <em>Expected disbursedon date</em>}' attribute.
	 * @see #getExpected_disbursedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date expected_disbursedon_date = EXPECTED_DISBURSEDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpected_firstrepaymenton_date() <em>Expected firstrepaymenton date</em>}' attribute.
	 * @see #getExpected_firstrepaymenton_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPECTED_FIRSTREPAYMENTON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpected_firstrepaymenton_date() <em>Expected firstrepaymenton date</em>}' attribute.
	 * @see #getExpected_firstrepaymenton_date()
	 * @generated
	 * @ordered
	 */
	protected Date expected_firstrepaymenton_date = EXPECTED_FIRSTREPAYMENTON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest_calculated_from_date() <em>Interest calculated from date</em>}' attribute.
	 * @see #getInterest_calculated_from_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date INTEREST_CALCULATED_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterest_calculated_from_date() <em>Interest calculated from date</em>}' attribute.
	 * @see #getInterest_calculated_from_date()
	 * @generated
	 * @ordered
	 */
	protected Date interest_calculated_from_date = INTEREST_CALCULATED_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisbursedon_date() <em>Disbursedon date</em>}' attribute.
	 * @see #getDisbursedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date DISBURSEDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisbursedon_date() <em>Disbursedon date</em>}' attribute.
	 * @see #getDisbursedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date disbursedon_date = DISBURSEDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisbursedon_userid() <em>Disbursedon userid</em>}' attribute.
	 * @see #getDisbursedon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int DISBURSEDON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDisbursedon_userid() <em>Disbursedon userid</em>}' attribute.
	 * @see #getDisbursedon_userid()
	 * @generated
	 * @ordered
	 */
	protected int disbursedon_userid = DISBURSEDON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpected_maturedon_date() <em>Expected maturedon date</em>}' attribute.
	 * @see #getExpected_maturedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPECTED_MATUREDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpected_maturedon_date() <em>Expected maturedon date</em>}' attribute.
	 * @see #getExpected_maturedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date expected_maturedon_date = EXPECTED_MATUREDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaturedon_date() <em>Maturedon date</em>}' attribute.
	 * @see #getMaturedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date MATUREDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaturedon_date() <em>Maturedon date</em>}' attribute.
	 * @see #getMaturedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date maturedon_date = MATUREDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosedon_date() <em>Closedon date</em>}' attribute.
	 * @see #getClosedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSEDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosedon_date() <em>Closedon date</em>}' attribute.
	 * @see #getClosedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date closedon_date = CLOSEDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosedon_userid() <em>Closedon userid</em>}' attribute.
	 * @see #getClosedon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int CLOSEDON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClosedon_userid() <em>Closedon userid</em>}' attribute.
	 * @see #getClosedon_userid()
	 * @generated
	 * @ordered
	 */
	protected int closedon_userid = CLOSEDON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_charges_due_at_disbursement_derived() <em>Total charges due at disbursement derived</em>}' attribute.
	 * @see #getTotal_charges_due_at_disbursement_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_CHARGES_DUE_AT_DISBURSEMENT_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_charges_due_at_disbursement_derived() <em>Total charges due at disbursement derived</em>}' attribute.
	 * @see #getTotal_charges_due_at_disbursement_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_charges_due_at_disbursement_derived = TOTAL_CHARGES_DUE_AT_DISBURSEMENT_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipal_disbursed_derived() <em>Principal disbursed derived</em>}' attribute.
	 * @see #getPrincipal_disbursed_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double PRINCIPAL_DISBURSED_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrincipal_disbursed_derived() <em>Principal disbursed derived</em>}' attribute.
	 * @see #getPrincipal_disbursed_derived()
	 * @generated
	 * @ordered
	 */
	protected double principal_disbursed_derived = PRINCIPAL_DISBURSED_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipal_repaid_derived() <em>Principal repaid derived</em>}' attribute.
	 * @see #getPrincipal_repaid_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double PRINCIPAL_REPAID_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrincipal_repaid_derived() <em>Principal repaid derived</em>}' attribute.
	 * @see #getPrincipal_repaid_derived()
	 * @generated
	 * @ordered
	 */
	protected double principal_repaid_derived = PRINCIPAL_REPAID_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipal_writtenoff_derived() <em>Principal writtenoff derived</em>}' attribute.
	 * @see #getPrincipal_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double PRINCIPAL_WRITTENOFF_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrincipal_writtenoff_derived() <em>Principal writtenoff derived</em>}' attribute.
	 * @see #getPrincipal_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected double principal_writtenoff_derived = PRINCIPAL_WRITTENOFF_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipal_outstanding_derived() <em>Principal outstanding derived</em>}' attribute.
	 * @see #getPrincipal_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double PRINCIPAL_OUTSTANDING_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrincipal_outstanding_derived() <em>Principal outstanding derived</em>}' attribute.
	 * @see #getPrincipal_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected double principal_outstanding_derived = PRINCIPAL_OUTSTANDING_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest_charged_derived() <em>Interest charged derived</em>}' attribute.
	 * @see #getInterest_charged_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double INTEREST_CHARGED_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInterest_charged_derived() <em>Interest charged derived</em>}' attribute.
	 * @see #getInterest_charged_derived()
	 * @generated
	 * @ordered
	 */
	protected double interest_charged_derived = INTEREST_CHARGED_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest_repaid_derived() <em>Interest repaid derived</em>}' attribute.
	 * @see #getInterest_repaid_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double INTEREST_REPAID_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInterest_repaid_derived() <em>Interest repaid derived</em>}' attribute.
	 * @see #getInterest_repaid_derived()
	 * @generated
	 * @ordered
	 */
	protected double interest_repaid_derived = INTEREST_REPAID_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest_waived_derived() <em>Interest waived derived</em>}' attribute.
	 * @see #getInterest_waived_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double INTEREST_WAIVED_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInterest_waived_derived() <em>Interest waived derived</em>}' attribute.
	 * @see #getInterest_waived_derived()
	 * @generated
	 * @ordered
	 */
	protected double interest_waived_derived = INTEREST_WAIVED_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest_writtenoff_derived() <em>Interest writtenoff derived</em>}' attribute.
	 * @see #getInterest_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double INTEREST_WRITTENOFF_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInterest_writtenoff_derived() <em>Interest writtenoff derived</em>}' attribute.
	 * @see #getInterest_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected double interest_writtenoff_derived = INTEREST_WRITTENOFF_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterest_outstanding_derived() <em>Interest outstanding derived</em>}' attribute.
	 * @see #getInterest_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double INTEREST_OUTSTANDING_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInterest_outstanding_derived() <em>Interest outstanding derived</em>}' attribute.
	 * @see #getInterest_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected double interest_outstanding_derived = INTEREST_OUTSTANDING_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFee_charges_charged_derived() <em>Fee charges charged derived</em>}' attribute.
	 * @see #getFee_charges_charged_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double FEE_CHARGES_CHARGED_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFee_charges_charged_derived() <em>Fee charges charged derived</em>}' attribute.
	 * @see #getFee_charges_charged_derived()
	 * @generated
	 * @ordered
	 */
	protected double fee_charges_charged_derived = FEE_CHARGES_CHARGED_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFee_charges_repaid_derived() <em>Fee charges repaid derived</em>}' attribute.
	 * @see #getFee_charges_repaid_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double FEE_CHARGES_REPAID_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFee_charges_repaid_derived() <em>Fee charges repaid derived</em>}' attribute.
	 * @see #getFee_charges_repaid_derived()
	 * @generated
	 * @ordered
	 */
	protected double fee_charges_repaid_derived = FEE_CHARGES_REPAID_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFee_charges_waived_derived() <em>Fee charges waived derived</em>}' attribute.
	 * @see #getFee_charges_waived_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double FEE_CHARGES_WAIVED_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFee_charges_waived_derived() <em>Fee charges waived derived</em>}' attribute.
	 * @see #getFee_charges_waived_derived()
	 * @generated
	 * @ordered
	 */
	protected double fee_charges_waived_derived = FEE_CHARGES_WAIVED_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFee_charges_writtenoff_derived() <em>Fee charges writtenoff derived</em>}' attribute.
	 * @see #getFee_charges_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double FEE_CHARGES_WRITTENOFF_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFee_charges_writtenoff_derived() <em>Fee charges writtenoff derived</em>}' attribute.
	 * @see #getFee_charges_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected double fee_charges_writtenoff_derived = FEE_CHARGES_WRITTENOFF_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFee_charges_outstanding_derived() <em>Fee charges outstanding derived</em>}' attribute.
	 * @see #getFee_charges_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double FEE_CHARGES_OUTSTANDING_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFee_charges_outstanding_derived() <em>Fee charges outstanding derived</em>}' attribute.
	 * @see #getFee_charges_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected double fee_charges_outstanding_derived = FEE_CHARGES_OUTSTANDING_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalty_charges_charged_derived() <em>Penalty charges charged derived</em>}' attribute.
	 * @see #getPenalty_charges_charged_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double PENALTY_CHARGES_CHARGED_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPenalty_charges_charged_derived() <em>Penalty charges charged derived</em>}' attribute.
	 * @see #getPenalty_charges_charged_derived()
	 * @generated
	 * @ordered
	 */
	protected double penalty_charges_charged_derived = PENALTY_CHARGES_CHARGED_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalty_charges_repaid_derived() <em>Penalty charges repaid derived</em>}' attribute.
	 * @see #getPenalty_charges_repaid_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double PENALTY_CHARGES_REPAID_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPenalty_charges_repaid_derived() <em>Penalty charges repaid derived</em>}' attribute.
	 * @see #getPenalty_charges_repaid_derived()
	 * @generated
	 * @ordered
	 */
	protected double penalty_charges_repaid_derived = PENALTY_CHARGES_REPAID_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalty_charges_waived_derived() <em>Penalty charges waived derived</em>}' attribute.
	 * @see #getPenalty_charges_waived_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double PENALTY_CHARGES_WAIVED_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPenalty_charges_waived_derived() <em>Penalty charges waived derived</em>}' attribute.
	 * @see #getPenalty_charges_waived_derived()
	 * @generated
	 * @ordered
	 */
	protected double penalty_charges_waived_derived = PENALTY_CHARGES_WAIVED_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalty_charges_writtenoff_derived() <em>Penalty charges writtenoff derived</em>}' attribute.
	 * @see #getPenalty_charges_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double PENALTY_CHARGES_WRITTENOFF_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPenalty_charges_writtenoff_derived() <em>Penalty charges writtenoff derived</em>}' attribute.
	 * @see #getPenalty_charges_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected double penalty_charges_writtenoff_derived = PENALTY_CHARGES_WRITTENOFF_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalty_charges_outstanding_derived() <em>Penalty charges outstanding derived</em>}' attribute.
	 * @see #getPenalty_charges_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double PENALTY_CHARGES_OUTSTANDING_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPenalty_charges_outstanding_derived() <em>Penalty charges outstanding derived</em>}' attribute.
	 * @see #getPenalty_charges_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected double penalty_charges_outstanding_derived = PENALTY_CHARGES_OUTSTANDING_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_expected_repayment_derived() <em>Total expected repayment derived</em>}' attribute.
	 * @see #getTotal_expected_repayment_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_EXPECTED_REPAYMENT_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_expected_repayment_derived() <em>Total expected repayment derived</em>}' attribute.
	 * @see #getTotal_expected_repayment_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_expected_repayment_derived = TOTAL_EXPECTED_REPAYMENT_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_repayment_derived() <em>Total repayment derived</em>}' attribute.
	 * @see #getTotal_repayment_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_REPAYMENT_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_repayment_derived() <em>Total repayment derived</em>}' attribute.
	 * @see #getTotal_repayment_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_repayment_derived = TOTAL_REPAYMENT_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_expected_costofloan_derived() <em>Total expected costofloan derived</em>}' attribute.
	 * @see #getTotal_expected_costofloan_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_EXPECTED_COSTOFLOAN_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_expected_costofloan_derived() <em>Total expected costofloan derived</em>}' attribute.
	 * @see #getTotal_expected_costofloan_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_expected_costofloan_derived = TOTAL_EXPECTED_COSTOFLOAN_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_costofloan_derived() <em>Total costofloan derived</em>}' attribute.
	 * @see #getTotal_costofloan_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_COSTOFLOAN_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_costofloan_derived() <em>Total costofloan derived</em>}' attribute.
	 * @see #getTotal_costofloan_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_costofloan_derived = TOTAL_COSTOFLOAN_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_waived_derived() <em>Total waived derived</em>}' attribute.
	 * @see #getTotal_waived_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_WAIVED_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_waived_derived() <em>Total waived derived</em>}' attribute.
	 * @see #getTotal_waived_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_waived_derived = TOTAL_WAIVED_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_writtenoff_derived() <em>Total writtenoff derived</em>}' attribute.
	 * @see #getTotal_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_WRITTENOFF_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_writtenoff_derived() <em>Total writtenoff derived</em>}' attribute.
	 * @see #getTotal_writtenoff_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_writtenoff_derived = TOTAL_WRITTENOFF_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_outstanding_derived() <em>Total outstanding derived</em>}' attribute.
	 * @see #getTotal_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_OUTSTANDING_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_outstanding_derived() <em>Total outstanding derived</em>}' attribute.
	 * @see #getTotal_outstanding_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_outstanding_derived = TOTAL_OUTSTANDING_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_overpaid_derived() <em>Total overpaid derived</em>}' attribute.
	 * @see #getTotal_overpaid_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_OVERPAID_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_overpaid_derived() <em>Total overpaid derived</em>}' attribute.
	 * @see #getTotal_overpaid_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_overpaid_derived = TOTAL_OVERPAID_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRejectedon_date() <em>Rejectedon date</em>}' attribute.
	 * @see #getRejectedon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date REJECTEDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRejectedon_date() <em>Rejectedon date</em>}' attribute.
	 * @see #getRejectedon_date()
	 * @generated
	 * @ordered
	 */
	protected Date rejectedon_date = REJECTEDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRejectedon_userid() <em>Rejectedon userid</em>}' attribute.
	 * @see #getRejectedon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int REJECTEDON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRejectedon_userid() <em>Rejectedon userid</em>}' attribute.
	 * @see #getRejectedon_userid()
	 * @generated
	 * @ordered
	 */
	protected int rejectedon_userid = REJECTEDON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRescheduledon_date() <em>Rescheduledon date</em>}' attribute.
	 * @see #getRescheduledon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESCHEDULEDON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRescheduledon_date() <em>Rescheduledon date</em>}' attribute.
	 * @see #getRescheduledon_date()
	 * @generated
	 * @ordered
	 */
	protected Date rescheduledon_date = RESCHEDULEDON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRescheduledon_userid() <em>Rescheduledon userid</em>}' attribute.
	 * @see #getRescheduledon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int RESCHEDULEDON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRescheduledon_userid() <em>Rescheduledon userid</em>}' attribute.
	 * @see #getRescheduledon_userid()
	 * @generated
	 * @ordered
	 */
	protected int rescheduledon_userid = RESCHEDULEDON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWithdrawnon_date() <em>Withdrawnon date</em>}' attribute.
	 * @see #getWithdrawnon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date WITHDRAWNON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithdrawnon_date() <em>Withdrawnon date</em>}' attribute.
	 * @see #getWithdrawnon_date()
	 * @generated
	 * @ordered
	 */
	protected Date withdrawnon_date = WITHDRAWNON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWithdrawnon_userid() <em>Withdrawnon userid</em>}' attribute.
	 * @see #getWithdrawnon_userid()
	 * @generated
	 * @ordered
	 */
	protected static final int WITHDRAWNON_USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWithdrawnon_userid() <em>Withdrawnon userid</em>}' attribute.
	 * @see #getWithdrawnon_userid()
	 * @generated
	 * @ordered
	 */
	protected int withdrawnon_userid = WITHDRAWNON_USERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrittenoffon_date() <em>Writtenoffon date</em>}' attribute.
	 * @see #getWrittenoffon_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date WRITTENOFFON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrittenoffon_date() <em>Writtenoffon date</em>}' attribute.
	 * @see #getWrittenoffon_date()
	 * @generated
	 * @ordered
	 */
	protected Date writtenoffon_date = WRITTENOFFON_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoan_transaction_strategy_id() <em>Loan transaction strategy id</em>}' attribute.
	 * @see #getLoan_transaction_strategy_id()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAN_TRANSACTION_STRATEGY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoan_transaction_strategy_id() <em>Loan transaction strategy id</em>}' attribute.
	 * @see #getLoan_transaction_strategy_id()
	 * @generated
	 * @ordered
	 */
	protected int loan_transaction_strategy_id = LOAN_TRANSACTION_STRATEGY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSync_disbursement_with_meeting() <em>Sync disbursement with meeting</em>}' attribute.
	 * @see #isSync_disbursement_with_meeting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNC_DISBURSEMENT_WITH_MEETING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSync_disbursement_with_meeting() <em>Sync disbursement with meeting</em>}' attribute.
	 * @see #isSync_disbursement_with_meeting()
	 * @generated
	 * @ordered
	 */
	protected boolean sync_disbursement_with_meeting = SYNC_DISBURSEMENT_WITH_MEETING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoan_counter() <em>Loan counter</em>}' attribute.
	 * @see #getLoan_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAN_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoan_counter() <em>Loan counter</em>}' attribute.
	 * @see #getLoan_counter()
	 * @generated
	 * @ordered
	 */
	protected int loan_counter = LOAN_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoan_product_counter() <em>Loan product counter</em>}' attribute.
	 * @see #getLoan_product_counter()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAN_PRODUCT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoan_product_counter() <em>Loan product counter</em>}' attribute.
	 * @see #getLoan_product_counter()
	 * @generated
	 * @ordered
	 */
	protected int loan_product_counter = LOAN_PRODUCT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixed_emi_amount() <em>Fixed emi amount</em>}' attribute.
	 * @see #getFixed_emi_amount()
	 * @generated
	 * @ordered
	 */
	protected static final double FIXED_EMI_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFixed_emi_amount() <em>Fixed emi amount</em>}' attribute.
	 * @see #getFixed_emi_amount()
	 * @generated
	 * @ordered
	 */
	protected double fixed_emi_amount = FIXED_EMI_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_outstanding_loan_balance() <em>Max outstanding loan balance</em>}' attribute.
	 * @see #getMax_outstanding_loan_balance()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_OUTSTANDING_LOAN_BALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax_outstanding_loan_balance() <em>Max outstanding loan balance</em>}' attribute.
	 * @see #getMax_outstanding_loan_balance()
	 * @generated
	 * @ordered
	 */
	protected double max_outstanding_loan_balance = MAX_OUTSTANDING_LOAN_BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrace_on_arrears_ageing() <em>Grace on arrears ageing</em>}' attribute.
	 * @see #getGrace_on_arrears_ageing()
	 * @generated
	 * @ordered
	 */
	protected static final int GRACE_ON_ARREARS_AGEING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrace_on_arrears_ageing() <em>Grace on arrears ageing</em>}' attribute.
	 * @see #getGrace_on_arrears_ageing()
	 * @generated
	 * @ordered
	 */
	protected int grace_on_arrears_ageing = GRACE_ON_ARREARS_AGEING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_npa() <em>Is npa</em>}' attribute.
	 * @see #isIs_npa()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NPA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_npa() <em>Is npa</em>}' attribute.
	 * @see #isIs_npa()
	 * @generated
	 * @ordered
	 */
	protected boolean is_npa = IS_NPA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_recovered_derived() <em>Total recovered derived</em>}' attribute.
	 * @see #getTotal_recovered_derived()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_RECOVERED_DERIVED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotal_recovered_derived() <em>Total recovered derived</em>}' attribute.
	 * @see #getTotal_recovered_derived()
	 * @generated
	 * @ordered
	 */
	protected double total_recovered_derived = TOTAL_RECOVERED_DERIVED_EDEFAULT;

	/**
	 * @generated
	 */
	protected m_loanImpl() {
		super();
	}

	/**
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
	}

	/**
	 * @generated
	 */
	public String getAccount_no() {
		return account_no;
	}

	/**
	 * @generated
	 */
	public void setAccount_no(String newAccount_no) {
		String oldAccount_no = account_no;
		account_no = newAccount_no;
	}

	/**
	 * @generated
	 */
	public String getExternal_id() {
		return external_id;
	}

	/**
	 * @generated
	 */
	public void setExternal_id(String newExternal_id) {
		String oldExternal_id = external_id;
		external_id = newExternal_id;
	}

	/**
	 * @generated
	 */
	public int getClient_id() {
		return client_id;
	}

	/**
	 * @generated
	 */
	public void setClient_id(int newClient_id) {
		int oldClient_id = client_id;
		client_id = newClient_id;
	}

	/**
	 * @generated
	 */
	public int getGroup_id() {
		return group_id;
	}

	/**
	 * @generated
	 */
	public void setGroup_id(int newGroup_id) {
		int oldGroup_id = group_id;
		group_id = newGroup_id;
	}

	/**
	 * @generated
	 */
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * @generated
	 */
	public void setProduct_id(int newProduct_id) {
		int oldProduct_id = product_id;
		product_id = newProduct_id;
	}

	/**
	 * @generated
	 */
	public int getFund_id() {
		return fund_id;
	}

	/**
	 * @generated
	 */
	public void setFund_id(int newFund_id) {
		fund_id = newFund_id;
	}

	/**
	 * @generated
	 */
	public int getLoan_officer_id() {
		return loan_officer_id;
	}

	/**
	 * @generated
	 */
	public void setLoan_officer_id(int newLoan_officer_id) {
		loan_officer_id = newLoan_officer_id;
	}

	/**
	 * @generated
	 */
	public int getLoanpurpose_cv_id() {
		return loanpurpose_cv_id;
	}

	/**
	 * @generated
	 */
	public void setLoanpurpose_cv_id(int newLoanpurpose_cv_id) {
		int oldLoanpurpose_cv_id = loanpurpose_cv_id;
		loanpurpose_cv_id = newLoanpurpose_cv_id;
	}

	/**
	 * @generated
	 */
	public int getLoan_status_id() {
		return loan_status_id;
	}

	/**
	 * @generated
	 */
	public void setLoan_status_id(int newLoan_status_id) {
		int oldLoan_status_id = loan_status_id;
		loan_status_id = newLoan_status_id;
	}

	/**
	 * @generated
	 */
	public int getLoan_type_enum() {
		return loan_type_enum;
	}

	/**
	 * @generated
	 */
	public void setLoan_type_enum(int newLoan_type_enum) {
		int oldLoan_type_enum = loan_type_enum;
		loan_type_enum = newLoan_type_enum;
	}

	/**
	 * @generated
	 */
	public String getCurrency_code() {
		return currency_code;
	}

	/**
	 * @generated
	 */
	public void setCurrency_code(String newCurrency_code) {
		String oldCurrency_code = currency_code;
		currency_code = newCurrency_code;
	}

	/**
	 * @generated
	 */
	public int getCurrency_digits() {
		return currency_digits;
	}

	/**
	 * @generated
	 */
	public void setCurrency_digits(int newCurrency_digits) {
		int oldCurrency_digits = currency_digits;
		currency_digits = newCurrency_digits;
	}

	/**
	 * @generated
	 */
	public int getCurrency_multiplesof() {
		return currency_multiplesof;
	}

	/**
	 * @generated
	 */
	public void setCurrency_multiplesof(int newCurrency_multiplesof) {
		int oldCurrency_multiplesof = currency_multiplesof;
		currency_multiplesof = newCurrency_multiplesof;
	}

	/**
	 * @generated
	 */
	public double getPrincipal_amount() {
		return principal_amount;
	}

	/**
	 * @generated
	 */
	public void setPrincipal_amount(double newPrincipal_amount) {
		double oldPrincipal_amount = principal_amount;
		principal_amount = newPrincipal_amount;
	}

	/**
	 * @generated
	 */
	public double getApproved_principal() {
		return approved_principal;
	}

	/**
	 * @generated
	 */
	public void setApproved_principal(double newApproved_principal) {
		double oldApproved_principal = approved_principal;
		approved_principal = newApproved_principal;
	}

	/**
	 * @generated
	 */
	public double getArrearstolerance_amount() {
		return arrearstolerance_amount;
	}

	/**
	 * @generated
	 */
	public void setArrearstolerance_amount(double newArrearstolerance_amount) {
		double oldArrearstolerance_amount = arrearstolerance_amount;
		arrearstolerance_amount = newArrearstolerance_amount;
	}

	/**
	 * @generated
	 */
	public double getNominal_interest_rate_per_period() {
		return nominal_interest_rate_per_period;
	}

	/**
	 * @generated
	 */
	public void setNominal_interest_rate_per_period(double newNominal_interest_rate_per_period) {
		double oldNominal_interest_rate_per_period = nominal_interest_rate_per_period;
		nominal_interest_rate_per_period = newNominal_interest_rate_per_period;
	}

	/**
	 * @generated
	 */
	public int getInterest_period_frequency_enum() {
		return interest_period_frequency_enum;
	}

	/**
	 * @generated
	 */
	public void setInterest_period_frequency_enum(int newInterest_period_frequency_enum) {
		int oldInterest_period_frequency_enum = interest_period_frequency_enum;
		interest_period_frequency_enum = newInterest_period_frequency_enum;
	}

	/**
	 * @generated
	 */
	public double getAnnual_nominal_interest_rate() {
		return annual_nominal_interest_rate;
	}

	/**
	 * @generated
	 */
	public void setAnnual_nominal_interest_rate(double newAnnual_nominal_interest_rate) {
		double oldAnnual_nominal_interest_rate = annual_nominal_interest_rate;
		annual_nominal_interest_rate = newAnnual_nominal_interest_rate;
	}

	/**
	 * @generated
	 */
	public int getInterest_method_enum() {
		return interest_method_enum;
	}

	/**
	 * @generated
	 */
	public void setInterest_method_enum(int newInterest_method_enum) {
		int oldInterest_method_enum = interest_method_enum;
		interest_method_enum = newInterest_method_enum;
	}

	/**
	 * @generated
	 */
	public int getInterest_calculated_in_period_enum() {
		return interest_calculated_in_period_enum;
	}

	/**
	 * @generated
	 */
	public void setInterest_calculated_in_period_enum(int newInterest_calculated_in_period_enum) {
		int oldInterest_calculated_in_period_enum = interest_calculated_in_period_enum;
		interest_calculated_in_period_enum = newInterest_calculated_in_period_enum;
	}

	/**
	 * @generated
	 */
	public int getTerm_frequency() {
		return term_frequency;
	}

	/**
	 * @generated
	 */
	public void setTerm_frequency(int newTerm_frequency) {
		int oldTerm_frequency = term_frequency;
		term_frequency = newTerm_frequency;
	}

	/**
	 * @generated
	 */
	public int getTerm_period_frequency_enum() {
		return term_period_frequency_enum;
	}

	/**
	 * @generated
	 */
	public void setTerm_period_frequency_enum(int newTerm_period_frequency_enum) {
		int oldTerm_period_frequency_enum = term_period_frequency_enum;
		term_period_frequency_enum = newTerm_period_frequency_enum;
	}

	/**
	 * @generated
	 */
	public int getRepay_every() {
		return repay_every;
	}

	/**
	 * @generated
	 */
	public void setRepay_every(int newRepay_every) {
		int oldRepay_every = repay_every;
		repay_every = newRepay_every;
	}

	/**
	 * @generated
	 */
	public int getRepayment_period_frequency_enum() {
		return repayment_period_frequency_enum;
	}

	/**
	 * @generated
	 */
	public void setRepayment_period_frequency_enum(int newRepayment_period_frequency_enum) {
		int oldRepayment_period_frequency_enum = repayment_period_frequency_enum;
		repayment_period_frequency_enum = newRepayment_period_frequency_enum;
	}

	/**
	 * @generated
	 */
	public int getNumber_of_repayments() {
		return number_of_repayments;
	}

	/**
	 * @generated
	 */
	public void setNumber_of_repayments(int newNumber_of_repayments) {
		int oldNumber_of_repayments = number_of_repayments;
		number_of_repayments = newNumber_of_repayments;
	}

	/**
	 * @generated
	 */
	public int getGrace_on_principal_periods() {
		return grace_on_principal_periods;
	}

	/**
	 * @generated
	 */
	public void setGrace_on_principal_periods(int newGrace_on_principal_periods) {
		int oldGrace_on_principal_periods = grace_on_principal_periods;
		grace_on_principal_periods = newGrace_on_principal_periods;
	}

	/**
	 * @generated
	 */
	public int getGrace_on_interest_periods() {
		return grace_on_interest_periods;
	}

	/**
	 * @generated
	 */
	public void setGrace_on_interest_periods(int newGrace_on_interest_periods) {
		int oldGrace_on_interest_periods = grace_on_interest_periods;
		grace_on_interest_periods = newGrace_on_interest_periods;
	}

	/**
	 * @generated
	 */
	public int getGrace_interest_free_periods() {
		return grace_interest_free_periods;
	}

	/**
	 * @generated
	 */
	public void setGrace_interest_free_periods(int newGrace_interest_free_periods) {
		int oldGrace_interest_free_periods = grace_interest_free_periods;
		grace_interest_free_periods = newGrace_interest_free_periods;
	}

	/**
	 * @generated
	 */
	public int getAmortization_method_enum() {
		return amortization_method_enum;
	}

	/**
	 * @generated
	 */
	public void setAmortization_method_enum(int newAmortization_method_enum) {
		int oldAmortization_method_enum = amortization_method_enum;
		amortization_method_enum = newAmortization_method_enum;
	}

	/**
	 * @generated
	 */
	public Date getSubmittedon_date() {
		return submittedon_date;
	}

	/**
	 * @generated
	 */
	public void setSubmittedon_date(Date newSubmittedon_date) {
		Date oldSubmittedon_date = submittedon_date;
		submittedon_date = newSubmittedon_date;
	}

	/**
	 * @generated
	 */
	public int getSubmittedon_userid() {
		return submittedon_userid;
	}

	/**
	 * @generated
	 */
	public void setSubmittedon_userid(int newSubmittedon_userid) {
		int oldSubmittedon_userid = submittedon_userid;
		submittedon_userid = newSubmittedon_userid;
	}

	/**
	 * @generated
	 */
	public Date getApprovedon_date() {
		return approvedon_date;
	}

	/**
	 * @generated
	 */
	public void setApprovedon_date(Date newApprovedon_date) {
		Date oldApprovedon_date = approvedon_date;
		approvedon_date = newApprovedon_date;
	}

	/**
	 * @generated
	 */
	public int getApprovedon_userid() {
		return approvedon_userid;
	}

	/**
	 * @generated
	 */
	public void setApprovedon_userid(int newApprovedon_userid) {
		int oldApprovedon_userid = approvedon_userid;
		approvedon_userid = newApprovedon_userid;
	}

	/**
	 * @generated
	 */
	public Date getExpected_disbursedon_date() {
		return expected_disbursedon_date;
	}

	/**
	 * @generated
	 */
	public void setExpected_disbursedon_date(Date newExpected_disbursedon_date) {
		Date oldExpected_disbursedon_date = expected_disbursedon_date;
		expected_disbursedon_date = newExpected_disbursedon_date;
	}

	/**
	 * @generated
	 */
	public Date getExpected_firstrepaymenton_date() {
		return expected_firstrepaymenton_date;
	}

	/**
	 * @generated
	 */
	public void setExpected_firstrepaymenton_date(Date newExpected_firstrepaymenton_date) {
		Date oldExpected_firstrepaymenton_date = expected_firstrepaymenton_date;
		expected_firstrepaymenton_date = newExpected_firstrepaymenton_date;
	}

	/**
	 * @generated
	 */
	public Date getInterest_calculated_from_date() {
		return interest_calculated_from_date;
	}

	/**
	 * @generated
	 */
	public void setInterest_calculated_from_date(Date newInterest_calculated_from_date) {
		Date oldInterest_calculated_from_date = interest_calculated_from_date;
		interest_calculated_from_date = newInterest_calculated_from_date;
	}

	/**
	 * @generated
	 */
	public Date getDisbursedon_date() {
		return disbursedon_date;
	}

	/**
	 * @generated
	 */
	public void setDisbursedon_date(Date newDisbursedon_date) {
		Date oldDisbursedon_date = disbursedon_date;
		disbursedon_date = newDisbursedon_date;
	}

	/**
	 * @generated
	 */
	public int getDisbursedon_userid() {
		return disbursedon_userid;
	}

	/**
	 * @generated
	 */
	public void setDisbursedon_userid(int newDisbursedon_userid) {
		int oldDisbursedon_userid = disbursedon_userid;
		disbursedon_userid = newDisbursedon_userid;
	}

	/**
	 * @generated
	 */
	public Date getExpected_maturedon_date() {
		return expected_maturedon_date;
	}

	/**
	 * @generated
	 */
	public void setExpected_maturedon_date(Date newExpected_maturedon_date) {
		Date oldExpected_maturedon_date = expected_maturedon_date;
		expected_maturedon_date = newExpected_maturedon_date;
	}

	/**
	 * @generated
	 */
	public Date getMaturedon_date() {
		return maturedon_date;
	}

	/**
	 * @generated
	 */
	public void setMaturedon_date(Date newMaturedon_date) {
		Date oldMaturedon_date = maturedon_date;
		maturedon_date = newMaturedon_date;
	}

	/**
	 * @generated
	 */
	public Date getClosedon_date() {
		return closedon_date;
	}

	/**
	 * @generated
	 */
	public void setClosedon_date(Date newClosedon_date) {
		Date oldClosedon_date = closedon_date;
		closedon_date = newClosedon_date;
	}

	/**
	 * @generated
	 */
	public int getClosedon_userid() {
		return closedon_userid;
	}

	/**
	 * @generated
	 */
	public void setClosedon_userid(int newClosedon_userid) {
		int oldClosedon_userid = closedon_userid;
		closedon_userid = newClosedon_userid;
	}

	/**
	 * @generated
	 */
	public double getTotal_charges_due_at_disbursement_derived() {
		return total_charges_due_at_disbursement_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_charges_due_at_disbursement_derived(double newTotal_charges_due_at_disbursement_derived) {
		double oldTotal_charges_due_at_disbursement_derived = total_charges_due_at_disbursement_derived;
		total_charges_due_at_disbursement_derived = newTotal_charges_due_at_disbursement_derived;
	}

	/**
	 * @generated
	 */
	public double getPrincipal_disbursed_derived() {
		return principal_disbursed_derived;
	}

	/**
	 * @generated
	 */
	public void setPrincipal_disbursed_derived(double newPrincipal_disbursed_derived) {
		double oldPrincipal_disbursed_derived = principal_disbursed_derived;
		principal_disbursed_derived = newPrincipal_disbursed_derived;
	}

	/**
	 * @generated
	 */
	public double getPrincipal_repaid_derived() {
		return principal_repaid_derived;
	}

	/**
	 * @generated
	 */
	public void setPrincipal_repaid_derived(double newPrincipal_repaid_derived) {
		double oldPrincipal_repaid_derived = principal_repaid_derived;
		principal_repaid_derived = newPrincipal_repaid_derived;
	}

	/**
	 * @generated
	 */
	public double getPrincipal_writtenoff_derived() {
		return principal_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public void setPrincipal_writtenoff_derived(double newPrincipal_writtenoff_derived) {
		double oldPrincipal_writtenoff_derived = principal_writtenoff_derived;
		principal_writtenoff_derived = newPrincipal_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public double getPrincipal_outstanding_derived() {
		return principal_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public void setPrincipal_outstanding_derived(double newPrincipal_outstanding_derived) {
		double oldPrincipal_outstanding_derived = principal_outstanding_derived;
		principal_outstanding_derived = newPrincipal_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public double getInterest_charged_derived() {
		return interest_charged_derived;
	}

	/**
	 * @generated
	 */
	public void setInterest_charged_derived(double newInterest_charged_derived) {
		double oldInterest_charged_derived = interest_charged_derived;
		interest_charged_derived = newInterest_charged_derived;
	}

	/**
	 * @generated
	 */
	public double getInterest_repaid_derived() {
		return interest_repaid_derived;
	}

	/**
	 * @generated
	 */
	public void setInterest_repaid_derived(double newInterest_repaid_derived) {
		double oldInterest_repaid_derived = interest_repaid_derived;
		interest_repaid_derived = newInterest_repaid_derived;
	}

	/**
	 * @generated
	 */
	public double getInterest_waived_derived() {
		return interest_waived_derived;
	}

	/**
	 * @generated
	 */
	public void setInterest_waived_derived(double newInterest_waived_derived) {
		double oldInterest_waived_derived = interest_waived_derived;
		interest_waived_derived = newInterest_waived_derived;
	}

	/**
	 * @generated
	 */
	public double getInterest_writtenoff_derived() {
		return interest_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public void setInterest_writtenoff_derived(double newInterest_writtenoff_derived) {
		double oldInterest_writtenoff_derived = interest_writtenoff_derived;
		interest_writtenoff_derived = newInterest_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public double getInterest_outstanding_derived() {
		return interest_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public void setInterest_outstanding_derived(double newInterest_outstanding_derived) {
		double oldInterest_outstanding_derived = interest_outstanding_derived;
		interest_outstanding_derived = newInterest_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public double getFee_charges_charged_derived() {
		return fee_charges_charged_derived;
	}

	/**
	 * @generated
	 */
	public void setFee_charges_charged_derived(double newFee_charges_charged_derived) {
		double oldFee_charges_charged_derived = fee_charges_charged_derived;
		fee_charges_charged_derived = newFee_charges_charged_derived;
	}

	/**
	 * @generated
	 */
	public double getFee_charges_repaid_derived() {
		return fee_charges_repaid_derived;
	}

	/**
	 * @generated
	 */
	public void setFee_charges_repaid_derived(double newFee_charges_repaid_derived) {
		double oldFee_charges_repaid_derived = fee_charges_repaid_derived;
		fee_charges_repaid_derived = newFee_charges_repaid_derived;
	}

	/**
	 * @generated
	 */
	public double getFee_charges_waived_derived() {
		return fee_charges_waived_derived;
	}

	/**
	 * @generated
	 */
	public void setFee_charges_waived_derived(double newFee_charges_waived_derived) {
		double oldFee_charges_waived_derived = fee_charges_waived_derived;
		fee_charges_waived_derived = newFee_charges_waived_derived;
	}

	/**
	 * @generated
	 */
	public double getFee_charges_writtenoff_derived() {
		return fee_charges_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public void setFee_charges_writtenoff_derived(double newFee_charges_writtenoff_derived) {
		double oldFee_charges_writtenoff_derived = fee_charges_writtenoff_derived;
		fee_charges_writtenoff_derived = newFee_charges_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public double getFee_charges_outstanding_derived() {
		return fee_charges_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public void setFee_charges_outstanding_derived(double newFee_charges_outstanding_derived) {
		double oldFee_charges_outstanding_derived = fee_charges_outstanding_derived;
		fee_charges_outstanding_derived = newFee_charges_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public double getPenalty_charges_charged_derived() {
		return penalty_charges_charged_derived;
	}

	/**
	 * @generated
	 */
	public void setPenalty_charges_charged_derived(double newPenalty_charges_charged_derived) {
		double oldPenalty_charges_charged_derived = penalty_charges_charged_derived;
		penalty_charges_charged_derived = newPenalty_charges_charged_derived;
	}

	/**
	 * @generated
	 */
	public double getPenalty_charges_repaid_derived() {
		return penalty_charges_repaid_derived;
	}

	/**
	 * @generated
	 */
	public void setPenalty_charges_repaid_derived(double newPenalty_charges_repaid_derived) {
		double oldPenalty_charges_repaid_derived = penalty_charges_repaid_derived;
		penalty_charges_repaid_derived = newPenalty_charges_repaid_derived;
	}

	/**
	 * @generated
	 */
	public double getPenalty_charges_waived_derived() {
		return penalty_charges_waived_derived;
	}

	/**
	 * @generated
	 */
	public void setPenalty_charges_waived_derived(double newPenalty_charges_waived_derived) {
		double oldPenalty_charges_waived_derived = penalty_charges_waived_derived;
		penalty_charges_waived_derived = newPenalty_charges_waived_derived;
	}

	/**
	 * @generated
	 */
	public double getPenalty_charges_writtenoff_derived() {
		return penalty_charges_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public void setPenalty_charges_writtenoff_derived(double newPenalty_charges_writtenoff_derived) {
		double oldPenalty_charges_writtenoff_derived = penalty_charges_writtenoff_derived;
		penalty_charges_writtenoff_derived = newPenalty_charges_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public double getPenalty_charges_outstanding_derived() {
		return penalty_charges_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public void setPenalty_charges_outstanding_derived(double newPenalty_charges_outstanding_derived) {
		double oldPenalty_charges_outstanding_derived = penalty_charges_outstanding_derived;
		penalty_charges_outstanding_derived = newPenalty_charges_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public double getTotal_expected_repayment_derived() {
		return total_expected_repayment_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_expected_repayment_derived(double newTotal_expected_repayment_derived) {
		double oldTotal_expected_repayment_derived = total_expected_repayment_derived;
		total_expected_repayment_derived = newTotal_expected_repayment_derived;
	}

	/**
	 * @generated
	 */
	public double getTotal_repayment_derived() {
		return total_repayment_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_repayment_derived(double newTotal_repayment_derived) {
		double oldTotal_repayment_derived = total_repayment_derived;
		total_repayment_derived = newTotal_repayment_derived;
	}

	/**
	 * @generated
	 */
	public double getTotal_expected_costofloan_derived() {
		return total_expected_costofloan_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_expected_costofloan_derived(double newTotal_expected_costofloan_derived) {
		double oldTotal_expected_costofloan_derived = total_expected_costofloan_derived;
		total_expected_costofloan_derived = newTotal_expected_costofloan_derived;
	}

	/**
	 * @generated
	 */
	public double getTotal_costofloan_derived() {
		return total_costofloan_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_costofloan_derived(double newTotal_costofloan_derived) {
		double oldTotal_costofloan_derived = total_costofloan_derived;
		total_costofloan_derived = newTotal_costofloan_derived;
	}

	/**
	 * @generated
	 */
	public double getTotal_waived_derived() {
		return total_waived_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_waived_derived(double newTotal_waived_derived) {
		double oldTotal_waived_derived = total_waived_derived;
		total_waived_derived = newTotal_waived_derived;
	}

	/**
	 * @generated
	 */
	public double getTotal_writtenoff_derived() {
		return total_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_writtenoff_derived(double newTotal_writtenoff_derived) {
		double oldTotal_writtenoff_derived = total_writtenoff_derived;
		total_writtenoff_derived = newTotal_writtenoff_derived;
	}

	/**
	 * @generated
	 */
	public double getTotal_outstanding_derived() {
		return total_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_outstanding_derived(double newTotal_outstanding_derived) {
		double oldTotal_outstanding_derived = total_outstanding_derived;
		total_outstanding_derived = newTotal_outstanding_derived;
	}

	/**
	 * @generated
	 */
	public double getTotal_overpaid_derived() {
		return total_overpaid_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_overpaid_derived(double newTotal_overpaid_derived) {
		double oldTotal_overpaid_derived = total_overpaid_derived;
		total_overpaid_derived = newTotal_overpaid_derived;
	}

	/**
	 * @generated
	 */
	public Date getRejectedon_date() {
		return rejectedon_date;
	}

	/**
	 * @generated
	 */
	public void setRejectedon_date(Date newRejectedon_date) {
		Date oldRejectedon_date = rejectedon_date;
		rejectedon_date = newRejectedon_date;
	}

	/**
	 * @generated
	 */
	public int getRejectedon_userid() {
		return rejectedon_userid;
	}

	/**
	 * @generated
	 */
	public void setRejectedon_userid(int newRejectedon_userid) {
		int oldRejectedon_userid = rejectedon_userid;
		rejectedon_userid = newRejectedon_userid;
	}

	/**
	 * @generated
	 */
	public Date getRescheduledon_date() {
		return rescheduledon_date;
	}

	/**
	 * @generated
	 */
	public void setRescheduledon_date(Date newRescheduledon_date) {
		Date oldRescheduledon_date = rescheduledon_date;
		rescheduledon_date = newRescheduledon_date;
	}

	/**
	 * @generated
	 */
	public int getRescheduledon_userid() {
		return rescheduledon_userid;
	}

	/**
	 * @generated
	 */
	public void setRescheduledon_userid(int newRescheduledon_userid) {
		int oldRescheduledon_userid = rescheduledon_userid;
		rescheduledon_userid = newRescheduledon_userid;
	}

	/**
	 * @generated
	 */
	public Date getWithdrawnon_date() {
		return withdrawnon_date;
	}

	/**
	 * @generated
	 */
	public void setWithdrawnon_date(Date newWithdrawnon_date) {
		Date oldWithdrawnon_date = withdrawnon_date;
		withdrawnon_date = newWithdrawnon_date;
	}

	/**
	 * @generated
	 */
	public int getWithdrawnon_userid() {
		return withdrawnon_userid;
	}

	/**
	 * @generated
	 */
	public void setWithdrawnon_userid(int newWithdrawnon_userid) {
		int oldWithdrawnon_userid = withdrawnon_userid;
		withdrawnon_userid = newWithdrawnon_userid;
	}

	/**
	 * @generated
	 */
	public Date getWrittenoffon_date() {
		return writtenoffon_date;
	}

	/**
	 * @generated
	 */
	public void setWrittenoffon_date(Date newWrittenoffon_date) {
		Date oldWrittenoffon_date = writtenoffon_date;
		writtenoffon_date = newWrittenoffon_date;
	}

	/**
	 * @generated
	 */
	public int getLoan_transaction_strategy_id() {
		return loan_transaction_strategy_id;
	}

	/**
	 * @generated
	 */
	public void setLoan_transaction_strategy_id(int newLoan_transaction_strategy_id) {
		int oldLoan_transaction_strategy_id = loan_transaction_strategy_id;
		loan_transaction_strategy_id = newLoan_transaction_strategy_id;
	}

	/**
	 * @generated
	 */
	public boolean isSync_disbursement_with_meeting() {
		return sync_disbursement_with_meeting;
	}

	/**
	 * @generated
	 */
	public void setSync_disbursement_with_meeting(boolean newSync_disbursement_with_meeting) {
		boolean oldSync_disbursement_with_meeting = sync_disbursement_with_meeting;
		sync_disbursement_with_meeting = newSync_disbursement_with_meeting;
	}

	/**
	 * @generated
	 */
	public int getLoan_counter() {
		return loan_counter;
	}

	/**
	 * @generated
	 */
	public void setLoan_counter(int newLoan_counter) {
		int oldLoan_counter = loan_counter;
		loan_counter = newLoan_counter;
	}

	/**
	 * @generated
	 */
	public int getLoan_product_counter() {
		return loan_product_counter;
	}

	/**
	 * @generated
	 */
	public void setLoan_product_counter(int newLoan_product_counter) {
		int oldLoan_product_counter = loan_product_counter;
		loan_product_counter = newLoan_product_counter;
	}

	/**
	 * @generated
	 */
	public double getFixed_emi_amount() {
		return fixed_emi_amount;
	}

	/**
	 * @generated
	 */
	public void setFixed_emi_amount(double newFixed_emi_amount) {
		double oldFixed_emi_amount = fixed_emi_amount;
		fixed_emi_amount = newFixed_emi_amount;
	}

	/**
	 * @generated
	 */
	public double getMax_outstanding_loan_balance() {
		return max_outstanding_loan_balance;
	}

	/**
	 * @generated
	 */
	public void setMax_outstanding_loan_balance(double newMax_outstanding_loan_balance) {
		double oldMax_outstanding_loan_balance = max_outstanding_loan_balance;
		max_outstanding_loan_balance = newMax_outstanding_loan_balance;
	}

	/**
	 * @generated
	 */
	public int getGrace_on_arrears_ageing() {
		return grace_on_arrears_ageing;
	}

	/**
	 * @generated
	 */
	public void setGrace_on_arrears_ageing(int newGrace_on_arrears_ageing) {
		int oldGrace_on_arrears_ageing = grace_on_arrears_ageing;
		grace_on_arrears_ageing = newGrace_on_arrears_ageing;
	}

	/**
	 * @generated
	 */
	public boolean isIs_npa() {
		return is_npa;
	}

	/**
	 * @generated
	 */
	public void setIs_npa(boolean newIs_npa) {
		boolean oldIs_npa = is_npa;
		is_npa = newIs_npa;
	}

	/**
	 * @generated
	 */
	public double getTotal_recovered_derived() {
		return total_recovered_derived;
	}

	/**
	 * @generated
	 */
	public void setTotal_recovered_derived(double newTotal_recovered_derived) {
		double oldTotal_recovered_derived = total_recovered_derived;
		total_recovered_derived = newTotal_recovered_derived;
	}

	/**
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
		result.append(", client_id: ");
		result.append(client_id);
		result.append(", group_id: ");
		result.append(group_id);
		result.append(", product_id: ");
		result.append(product_id);
		result.append(", fund_id: ");
		result.append(fund_id);
		result.append(", loan_officer_id: ");
		result.append(loan_officer_id);
		result.append(", loanpurpose_cv_id: ");
		result.append(loanpurpose_cv_id);
		result.append(", loan_status_id: ");
		result.append(loan_status_id);
		result.append(", loan_type_enum: ");
		result.append(loan_type_enum);
		result.append(", currency_code: ");
		result.append(currency_code);
		result.append(", currency_digits: ");
		result.append(currency_digits);
		result.append(", currency_multiplesof: ");
		result.append(currency_multiplesof);
		result.append(", principal_amount: ");
		result.append(principal_amount);
		result.append(", approved_principal: ");
		result.append(approved_principal);
		result.append(", arrearstolerance_amount: ");
		result.append(arrearstolerance_amount);
		result.append(", nominal_interest_rate_per_period: ");
		result.append(nominal_interest_rate_per_period);
		result.append(", interest_period_frequency_enum: ");
		result.append(interest_period_frequency_enum);
		result.append(", annual_nominal_interest_rate: ");
		result.append(annual_nominal_interest_rate);
		result.append(", interest_method_enum: ");
		result.append(interest_method_enum);
		result.append(", interest_calculated_in_period_enum: ");
		result.append(interest_calculated_in_period_enum);
		result.append(", term_frequency: ");
		result.append(term_frequency);
		result.append(", term_period_frequency_enum: ");
		result.append(term_period_frequency_enum);
		result.append(", repay_every: ");
		result.append(repay_every);
		result.append(", repayment_period_frequency_enum: ");
		result.append(repayment_period_frequency_enum);
		result.append(", number_of_repayments: ");
		result.append(number_of_repayments);
		result.append(", grace_on_principal_periods: ");
		result.append(grace_on_principal_periods);
		result.append(", grace_on_interest_periods: ");
		result.append(grace_on_interest_periods);
		result.append(", grace_interest_free_periods: ");
		result.append(grace_interest_free_periods);
		result.append(", amortization_method_enum: ");
		result.append(amortization_method_enum);
		result.append(", submittedon_date: ");
		result.append(submittedon_date);
		result.append(", submittedon_userid: ");
		result.append(submittedon_userid);
		result.append(", approvedon_date: ");
		result.append(approvedon_date);
		result.append(", approvedon_userid: ");
		result.append(approvedon_userid);
		result.append(", expected_disbursedon_date: ");
		result.append(expected_disbursedon_date);
		result.append(", expected_firstrepaymenton_date: ");
		result.append(expected_firstrepaymenton_date);
		result.append(", interest_calculated_from_date: ");
		result.append(interest_calculated_from_date);
		result.append(", disbursedon_date: ");
		result.append(disbursedon_date);
		result.append(", disbursedon_userid: ");
		result.append(disbursedon_userid);
		result.append(", expected_maturedon_date: ");
		result.append(expected_maturedon_date);
		result.append(", maturedon_date: ");
		result.append(maturedon_date);
		result.append(", closedon_date: ");
		result.append(closedon_date);
		result.append(", closedon_userid: ");
		result.append(closedon_userid);
		result.append(", total_charges_due_at_disbursement_derived: ");
		result.append(total_charges_due_at_disbursement_derived);
		result.append(", principal_disbursed_derived: ");
		result.append(principal_disbursed_derived);
		result.append(", principal_repaid_derived: ");
		result.append(principal_repaid_derived);
		result.append(", principal_writtenoff_derived: ");
		result.append(principal_writtenoff_derived);
		result.append(", principal_outstanding_derived: ");
		result.append(principal_outstanding_derived);
		result.append(", interest_charged_derived: ");
		result.append(interest_charged_derived);
		result.append(", interest_repaid_derived: ");
		result.append(interest_repaid_derived);
		result.append(", interest_waived_derived: ");
		result.append(interest_waived_derived);
		result.append(", interest_writtenoff_derived: ");
		result.append(interest_writtenoff_derived);
		result.append(", interest_outstanding_derived: ");
		result.append(interest_outstanding_derived);
		result.append(", fee_charges_charged_derived: ");
		result.append(fee_charges_charged_derived);
		result.append(", fee_charges_repaid_derived: ");
		result.append(fee_charges_repaid_derived);
		result.append(", fee_charges_waived_derived: ");
		result.append(fee_charges_waived_derived);
		result.append(", fee_charges_writtenoff_derived: ");
		result.append(fee_charges_writtenoff_derived);
		result.append(", fee_charges_outstanding_derived: ");
		result.append(fee_charges_outstanding_derived);
		result.append(", penalty_charges_charged_derived: ");
		result.append(penalty_charges_charged_derived);
		result.append(", penalty_charges_repaid_derived: ");
		result.append(penalty_charges_repaid_derived);
		result.append(", penalty_charges_waived_derived: ");
		result.append(penalty_charges_waived_derived);
		result.append(", penalty_charges_writtenoff_derived: ");
		result.append(penalty_charges_writtenoff_derived);
		result.append(", penalty_charges_outstanding_derived: ");
		result.append(penalty_charges_outstanding_derived);
		result.append(", total_expected_repayment_derived: ");
		result.append(total_expected_repayment_derived);
		result.append(", total_repayment_derived: ");
		result.append(total_repayment_derived);
		result.append(", total_expected_costofloan_derived: ");
		result.append(total_expected_costofloan_derived);
		result.append(", total_costofloan_derived: ");
		result.append(total_costofloan_derived);
		result.append(", total_waived_derived: ");
		result.append(total_waived_derived);
		result.append(", total_writtenoff_derived: ");
		result.append(total_writtenoff_derived);
		result.append(", total_outstanding_derived: ");
		result.append(total_outstanding_derived);
		result.append(", total_overpaid_derived: ");
		result.append(total_overpaid_derived);
		result.append(", rejectedon_date: ");
		result.append(rejectedon_date);
		result.append(", rejectedon_userid: ");
		result.append(rejectedon_userid);
		result.append(", rescheduledon_date: ");
		result.append(rescheduledon_date);
		result.append(", rescheduledon_userid: ");
		result.append(rescheduledon_userid);
		result.append(", withdrawnon_date: ");
		result.append(withdrawnon_date);
		result.append(", withdrawnon_userid: ");
		result.append(withdrawnon_userid);
		result.append(", writtenoffon_date: ");
		result.append(writtenoffon_date);
		result.append(", loan_transaction_strategy_id: ");
		result.append(loan_transaction_strategy_id);
		result.append(", sync_disbursement_with_meeting: ");
		result.append(sync_disbursement_with_meeting);
		result.append(", loan_counter: ");
		result.append(loan_counter);
		result.append(", loan_product_counter: ");
		result.append(loan_product_counter);
		result.append(", fixed_emi_amount: ");
		result.append(fixed_emi_amount);
		result.append(", max_outstanding_loan_balance: ");
		result.append(max_outstanding_loan_balance);
		result.append(", grace_on_arrears_ageing: ");
		result.append(grace_on_arrears_ageing);
		result.append(", is_npa: ");
		result.append(is_npa);
		result.append(", total_recovered_derived: ");
		result.append(total_recovered_derived);
		result.append(')');
		return result.toString();
	}

} //m_loanImpl
