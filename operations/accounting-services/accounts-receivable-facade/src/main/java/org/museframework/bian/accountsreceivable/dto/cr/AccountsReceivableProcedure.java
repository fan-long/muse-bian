/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.accountsreceivable.dto.cr;

public class AccountsReceivableProcedure extends org.museframework.bian.classes.AccountsReceivableProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Accounts Receivable Procedure*/
    private String accountsReceivableProcedureParameterType;

    /*A selected optional business service as subject matter of Accounts Receivable Procedure*/
    private String accountsReceivableProcedureSelectedOption;

    /*Request to process AccountsReceivable*/
    private String accountsReceivableProcedureRequest;

    /*Timetable to process AccountsReceivable*/
    private String accountsReceivableProcedureSchedule;

    /*The status of Accounts Receivable Procedure*/
    private String accountsReceivableProcedureStatus;

    /*Reference to the party who is involved in Accounts Receivable Procedure*/
    private org.museframework.bian.classes.Object accountsReceivableProcedureReference;

    /*Reference to the business unit which is involved in Accounts Receivable Procedure*/
    private org.museframework.bian.classes.Object accountsReceivableProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Accounts Receivable Procedure*/
    private org.museframework.bian.classes.Object accountsReceivableProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to  Accounts Receivable Procedure */
    private org.museframework.bian.classes.Object accountsReceivableProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Accounts Receivable Procedure*/
    private org.museframework.bian.classes.Object accountsReceivableProcedureEmployeeReference;

    /*Reference to the customer who is involved in Accounts Receivable Procedure*/
    private org.museframework.bian.classes.Object accountsReceivableProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Accounts Receivable Procedure*/
    private String accountsReceivableProcedureType;

    /*The schedule according to which the service provider will process the Accounts Receivable Procedure*/
    private String accountsReceivableProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Accounts Receivable Procedure */
    private String accountsReceivableProcedureServiceType;

    /*A Classification value that distinguishes between the type of products/services related to Accounts Receivable Procedure */
    private String accountsReceivableProcedureProductandServiceType;

    /*Reference to the product or service that is related to  Accounts Receivable Procedure*/
    private String accountsReceivableProcedureProductandServiceInstance;

    /*A Classification value that distinguishes between the type of transactions in Accounts Receivable Procedure */
    private String accountsReceivableProcedureTransactionType;

    /*Reference to the transaction that is related to  Accounts Receivable Procedure */
    private String accountsReceivableProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to  Accounts Receivable Procedure */
    private String accountsReceivableProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to  Accounts Receivable Procedure */
    private org.museframework.bian.classes.Object accountsReceivableProcedureCustomerAgreementReference;

    public void setAccountsReceivableProcedureParameterType(String accountsReceivableProcedureParameterType) {
        this.accountsReceivableProcedureParameterType = accountsReceivableProcedureParameterType;
    }

    public String getAccountsReceivableProcedureParameterType() {
        return accountsReceivableProcedureParameterType;
    }

    public void setAccountsReceivableProcedureSelectedOption(String accountsReceivableProcedureSelectedOption) {
        this.accountsReceivableProcedureSelectedOption = accountsReceivableProcedureSelectedOption;
    }

    public String getAccountsReceivableProcedureSelectedOption() {
        return accountsReceivableProcedureSelectedOption;
    }

    public void setAccountsReceivableProcedureRequest(String accountsReceivableProcedureRequest) {
        this.accountsReceivableProcedureRequest = accountsReceivableProcedureRequest;
    }

    public String getAccountsReceivableProcedureRequest() {
        return accountsReceivableProcedureRequest;
    }

    public void setAccountsReceivableProcedureSchedule(String accountsReceivableProcedureSchedule) {
        this.accountsReceivableProcedureSchedule = accountsReceivableProcedureSchedule;
    }

    public String getAccountsReceivableProcedureSchedule() {
        return accountsReceivableProcedureSchedule;
    }

    public void setAccountsReceivableProcedureStatus(String accountsReceivableProcedureStatus) {
        this.accountsReceivableProcedureStatus = accountsReceivableProcedureStatus;
    }

    public String getAccountsReceivableProcedureStatus() {
        return accountsReceivableProcedureStatus;
    }

    public void setAccountsReceivableProcedureReference(org.museframework.bian.classes.Object accountsReceivableProcedureReference) {
        this.accountsReceivableProcedureReference = accountsReceivableProcedureReference;
    }

    public org.museframework.bian.classes.Object getAccountsReceivableProcedureReference() {
        return accountsReceivableProcedureReference;
    }

    public void setAccountsReceivableProcedureBusinessUnitReference(org.museframework.bian.classes.Object accountsReceivableProcedureBusinessUnitReference) {
        this.accountsReceivableProcedureBusinessUnitReference = accountsReceivableProcedureBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getAccountsReceivableProcedureBusinessUnitReference() {
        return accountsReceivableProcedureBusinessUnitReference;
    }

    public void setAccountsReceivableProcedureServiceProviderReference(org.museframework.bian.classes.Object accountsReceivableProcedureServiceProviderReference) {
        this.accountsReceivableProcedureServiceProviderReference = accountsReceivableProcedureServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getAccountsReceivableProcedureServiceProviderReference() {
        return accountsReceivableProcedureServiceProviderReference;
    }

    public void setAccountsReceivableProcedureFinancialFacilityReference(org.museframework.bian.classes.Object accountsReceivableProcedureFinancialFacilityReference) {
        this.accountsReceivableProcedureFinancialFacilityReference = accountsReceivableProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.Object getAccountsReceivableProcedureFinancialFacilityReference() {
        return accountsReceivableProcedureFinancialFacilityReference;
    }

    public void setAccountsReceivableProcedureEmployeeReference(org.museframework.bian.classes.Object accountsReceivableProcedureEmployeeReference) {
        this.accountsReceivableProcedureEmployeeReference = accountsReceivableProcedureEmployeeReference;
    }

    public org.museframework.bian.classes.Object getAccountsReceivableProcedureEmployeeReference() {
        return accountsReceivableProcedureEmployeeReference;
    }

    public void setAccountsReceivableProcedureCustomerReference(org.museframework.bian.classes.Object accountsReceivableProcedureCustomerReference) {
        this.accountsReceivableProcedureCustomerReference = accountsReceivableProcedureCustomerReference;
    }

    public org.museframework.bian.classes.Object getAccountsReceivableProcedureCustomerReference() {
        return accountsReceivableProcedureCustomerReference;
    }

    public void setAccountsReceivableProcedureType(String accountsReceivableProcedureType) {
        this.accountsReceivableProcedureType = accountsReceivableProcedureType;
    }

    public String getAccountsReceivableProcedureType() {
        return accountsReceivableProcedureType;
    }

    public void setAccountsReceivableProcedureServiceProviderSchedule(String accountsReceivableProcedureServiceProviderSchedule) {
        this.accountsReceivableProcedureServiceProviderSchedule = accountsReceivableProcedureServiceProviderSchedule;
    }

    public String getAccountsReceivableProcedureServiceProviderSchedule() {
        return accountsReceivableProcedureServiceProviderSchedule;
    }

    public void setAccountsReceivableProcedureServiceType(String accountsReceivableProcedureServiceType) {
        this.accountsReceivableProcedureServiceType = accountsReceivableProcedureServiceType;
    }

    public String getAccountsReceivableProcedureServiceType() {
        return accountsReceivableProcedureServiceType;
    }

    public void setAccountsReceivableProcedureProductandServiceType(String accountsReceivableProcedureProductandServiceType) {
        this.accountsReceivableProcedureProductandServiceType = accountsReceivableProcedureProductandServiceType;
    }

    public String getAccountsReceivableProcedureProductandServiceType() {
        return accountsReceivableProcedureProductandServiceType;
    }

    public void setAccountsReceivableProcedureProductandServiceInstance(String accountsReceivableProcedureProductandServiceInstance) {
        this.accountsReceivableProcedureProductandServiceInstance = accountsReceivableProcedureProductandServiceInstance;
    }

    public String getAccountsReceivableProcedureProductandServiceInstance() {
        return accountsReceivableProcedureProductandServiceInstance;
    }

    public void setAccountsReceivableProcedureTransactionType(String accountsReceivableProcedureTransactionType) {
        this.accountsReceivableProcedureTransactionType = accountsReceivableProcedureTransactionType;
    }

    public String getAccountsReceivableProcedureTransactionType() {
        return accountsReceivableProcedureTransactionType;
    }

    public void setAccountsReceivableProcedureTransaction(String accountsReceivableProcedureTransaction) {
        this.accountsReceivableProcedureTransaction = accountsReceivableProcedureTransaction;
    }

    public String getAccountsReceivableProcedureTransaction() {
        return accountsReceivableProcedureTransaction;
    }

    public void setAccountsReceivableProcedureFinancialTransactionArrangement(String accountsReceivableProcedureFinancialTransactionArrangement) {
        this.accountsReceivableProcedureFinancialTransactionArrangement = accountsReceivableProcedureFinancialTransactionArrangement;
    }

    public String getAccountsReceivableProcedureFinancialTransactionArrangement() {
        return accountsReceivableProcedureFinancialTransactionArrangement;
    }

    public void setAccountsReceivableProcedureCustomerAgreementReference(org.museframework.bian.classes.Object accountsReceivableProcedureCustomerAgreementReference) {
        this.accountsReceivableProcedureCustomerAgreementReference = accountsReceivableProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Object getAccountsReceivableProcedureCustomerAgreementReference() {
        return accountsReceivableProcedureCustomerAgreementReference;
    }
}