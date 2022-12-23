/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Account Reconciliation. */
package org.museframework.bian.accountreconciliation.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccountReconciliationProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureParameterType;

    /*A selected optional business service as subject matter of Account Reconciliation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature accountReconciliationProcedureSelectedOption;

    /*Request to process Account Reconciliation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction accountReconciliationProcedureRequest;

    /*Timetable to process Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureSchedule;

    /*The status of Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureStatus;

    /*Reference to the party who is involved in Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Account Reconciliation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility accountReconciliationProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureEmployeeReference;

    /*Reference to the customer who is involved in Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureType;

    /*The schedule according to which the service provider will process the Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Account Reconciliation Procedure*/
    @MetaField
    private String accountReconciliationProcedureServiceType;

    /*Reference to the product or service that is related to Account Reconciliation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct accountReconciliationProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Account Reconciliation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction accountReconciliationProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Account Reconciliation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement accountReconciliationProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Account Reconciliation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement accountReconciliationProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Account Reconciliation Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure accountReconciliationProcedureReference;

    public void setAccountReconciliationProcedureParameterType(String accountReconciliationProcedureParameterType) {
        this.accountReconciliationProcedureParameterType = accountReconciliationProcedureParameterType;
    }

    public String getAccountReconciliationProcedureParameterType() {
        return accountReconciliationProcedureParameterType;
    }

    public void setAccountReconciliationProcedureSelectedOption(org.museframework.bian.classes.Feature accountReconciliationProcedureSelectedOption) {
        this.accountReconciliationProcedureSelectedOption = accountReconciliationProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getAccountReconciliationProcedureSelectedOption() {
        return accountReconciliationProcedureSelectedOption;
    }

    public void setAccountReconciliationProcedureRequest(org.museframework.bian.classes.Instruction accountReconciliationProcedureRequest) {
        this.accountReconciliationProcedureRequest = accountReconciliationProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getAccountReconciliationProcedureRequest() {
        return accountReconciliationProcedureRequest;
    }

    public void setAccountReconciliationProcedureSchedule(String accountReconciliationProcedureSchedule) {
        this.accountReconciliationProcedureSchedule = accountReconciliationProcedureSchedule;
    }

    public String getAccountReconciliationProcedureSchedule() {
        return accountReconciliationProcedureSchedule;
    }

    public void setAccountReconciliationProcedureStatus(String accountReconciliationProcedureStatus) {
        this.accountReconciliationProcedureStatus = accountReconciliationProcedureStatus;
    }

    public String getAccountReconciliationProcedureStatus() {
        return accountReconciliationProcedureStatus;
    }

    public void setAccountReconciliationProcedureAssociatedPartyReference(String accountReconciliationProcedureAssociatedPartyReference) {
        this.accountReconciliationProcedureAssociatedPartyReference = accountReconciliationProcedureAssociatedPartyReference;
    }

    public String getAccountReconciliationProcedureAssociatedPartyReference() {
        return accountReconciliationProcedureAssociatedPartyReference;
    }

    public void setAccountReconciliationProcedureBusinessUnitReference(String accountReconciliationProcedureBusinessUnitReference) {
        this.accountReconciliationProcedureBusinessUnitReference = accountReconciliationProcedureBusinessUnitReference;
    }

    public String getAccountReconciliationProcedureBusinessUnitReference() {
        return accountReconciliationProcedureBusinessUnitReference;
    }

    public void setAccountReconciliationProcedureServiceProviderReference(String accountReconciliationProcedureServiceProviderReference) {
        this.accountReconciliationProcedureServiceProviderReference = accountReconciliationProcedureServiceProviderReference;
    }

    public String getAccountReconciliationProcedureServiceProviderReference() {
        return accountReconciliationProcedureServiceProviderReference;
    }

    public void setAccountReconciliationProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility accountReconciliationProcedureFinancialFacilityReference) {
        this.accountReconciliationProcedureFinancialFacilityReference = accountReconciliationProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getAccountReconciliationProcedureFinancialFacilityReference() {
        return accountReconciliationProcedureFinancialFacilityReference;
    }

    public void setAccountReconciliationProcedureEmployeeReference(String accountReconciliationProcedureEmployeeReference) {
        this.accountReconciliationProcedureEmployeeReference = accountReconciliationProcedureEmployeeReference;
    }

    public String getAccountReconciliationProcedureEmployeeReference() {
        return accountReconciliationProcedureEmployeeReference;
    }

    public void setAccountReconciliationProcedureCustomerReference(String accountReconciliationProcedureCustomerReference) {
        this.accountReconciliationProcedureCustomerReference = accountReconciliationProcedureCustomerReference;
    }

    public String getAccountReconciliationProcedureCustomerReference() {
        return accountReconciliationProcedureCustomerReference;
    }

    public void setAccountReconciliationProcedureType(String accountReconciliationProcedureType) {
        this.accountReconciliationProcedureType = accountReconciliationProcedureType;
    }

    public String getAccountReconciliationProcedureType() {
        return accountReconciliationProcedureType;
    }

    public void setAccountReconciliationProcedureServiceProviderSchedule(String accountReconciliationProcedureServiceProviderSchedule) {
        this.accountReconciliationProcedureServiceProviderSchedule = accountReconciliationProcedureServiceProviderSchedule;
    }

    public String getAccountReconciliationProcedureServiceProviderSchedule() {
        return accountReconciliationProcedureServiceProviderSchedule;
    }

    public void setAccountReconciliationProcedureServiceType(String accountReconciliationProcedureServiceType) {
        this.accountReconciliationProcedureServiceType = accountReconciliationProcedureServiceType;
    }

    public String getAccountReconciliationProcedureServiceType() {
        return accountReconciliationProcedureServiceType;
    }

    public void setAccountReconciliationProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct accountReconciliationProcedureProductandServiceInstance) {
        this.accountReconciliationProcedureProductandServiceInstance = accountReconciliationProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getAccountReconciliationProcedureProductandServiceInstance() {
        return accountReconciliationProcedureProductandServiceInstance;
    }

    public void setAccountReconciliationProcedureTransaction(org.museframework.bian.classes.Transaction accountReconciliationProcedureTransaction) {
        this.accountReconciliationProcedureTransaction = accountReconciliationProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getAccountReconciliationProcedureTransaction() {
        return accountReconciliationProcedureTransaction;
    }

    public void setAccountReconciliationProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement accountReconciliationProcedureFinancialTransactionArrangement) {
        this.accountReconciliationProcedureFinancialTransactionArrangement = accountReconciliationProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getAccountReconciliationProcedureFinancialTransactionArrangement() {
        return accountReconciliationProcedureFinancialTransactionArrangement;
    }

    public void setAccountReconciliationProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement accountReconciliationProcedureCustomerAgreementReference) {
        this.accountReconciliationProcedureCustomerAgreementReference = accountReconciliationProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getAccountReconciliationProcedureCustomerAgreementReference() {
        return accountReconciliationProcedureCustomerAgreementReference;
    }

    public void setAccountReconciliationProcedureReference(org.museframework.bian.classes.Procedure accountReconciliationProcedureReference) {
        this.accountReconciliationProcedureReference = accountReconciliationProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getAccountReconciliationProcedureReference() {
        return accountReconciliationProcedureReference;
    }
}