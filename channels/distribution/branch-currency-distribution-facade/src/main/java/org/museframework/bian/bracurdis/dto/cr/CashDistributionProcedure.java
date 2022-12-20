/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Branch Currency Distribution. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.bracurdis.dto.cr;

public class CashDistributionProcedure extends org.museframework.bian.classes.CashDistributionProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Cash Distribution Procedure*/
    private String cashDistributionProcedureParameterType;

    /*A selected optional business service as subject matter of Cash Distribution Procedure*/
    private String cashDistributionProcedureSelectedOption;

    /*Request to process CashDistribution*/
    private String cashDistributionProcedureRequest;

    /*Timetable to process CashDistribution*/
    private String cashDistributionProcedureSchedule;

    /*The status of Cash Distribution Procedure*/
    private String cashDistributionProcedureStatus;

    /*Reference to the party who is involved in Cash Distribution Procedure*/
    private org.museframework.bian.classes.Object cashDistributionProcedureReference;

    /*Reference to the business unit which is involved in Cash Distribution Procedure*/
    private org.museframework.bian.classes.Object cashDistributionProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Cash Distribution Procedure*/
    private org.museframework.bian.classes.Object cashDistributionProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to  Cash Distribution Procedure */
    private org.museframework.bian.classes.Object cashDistributionProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Cash Distribution Procedure*/
    private org.museframework.bian.classes.Object cashDistributionProcedureEmployeeReference;

    /*Reference to the customer who is involved in Cash Distribution Procedure*/
    private org.museframework.bian.classes.Object cashDistributionProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Cash Distribution Procedure*/
    private String cashDistributionProcedureType;

    /*The schedule according to which the service provider will process the Cash Distribution Procedure*/
    private String cashDistributionProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Cash Distribution Procedure */
    private String cashDistributionProcedureServiceType;

    /*A Classification value that distinguishes between the type of products/services related to Cash Distribution Procedure */
    private String cashDistributionProcedureProductandServiceType;

    /*Reference to the product or service that is related to  Cash Distribution Procedure*/
    private String cashDistributionProcedureProductandServiceInstance;

    /*A Classification value that distinguishes between the type of transactions in Cash Distribution Procedure */
    private String cashDistributionProcedureTransactionType;

    /*Reference to the transaction that is related to  Cash Distribution Procedure */
    private String cashDistributionProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to  Cash Distribution Procedure */
    private String cashDistributionProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to  Cash Distribution Procedure */
    private org.museframework.bian.classes.Object cashDistributionProcedureCustomerAgreementReference;

    public void setCashDistributionProcedureParameterType(String cashDistributionProcedureParameterType) {
        this.cashDistributionProcedureParameterType = cashDistributionProcedureParameterType;
    }

    public String getCashDistributionProcedureParameterType() {
        return cashDistributionProcedureParameterType;
    }

    public void setCashDistributionProcedureSelectedOption(String cashDistributionProcedureSelectedOption) {
        this.cashDistributionProcedureSelectedOption = cashDistributionProcedureSelectedOption;
    }

    public String getCashDistributionProcedureSelectedOption() {
        return cashDistributionProcedureSelectedOption;
    }

    public void setCashDistributionProcedureRequest(String cashDistributionProcedureRequest) {
        this.cashDistributionProcedureRequest = cashDistributionProcedureRequest;
    }

    public String getCashDistributionProcedureRequest() {
        return cashDistributionProcedureRequest;
    }

    public void setCashDistributionProcedureSchedule(String cashDistributionProcedureSchedule) {
        this.cashDistributionProcedureSchedule = cashDistributionProcedureSchedule;
    }

    public String getCashDistributionProcedureSchedule() {
        return cashDistributionProcedureSchedule;
    }

    public void setCashDistributionProcedureStatus(String cashDistributionProcedureStatus) {
        this.cashDistributionProcedureStatus = cashDistributionProcedureStatus;
    }

    public String getCashDistributionProcedureStatus() {
        return cashDistributionProcedureStatus;
    }

    public void setCashDistributionProcedureReference(org.museframework.bian.classes.Object cashDistributionProcedureReference) {
        this.cashDistributionProcedureReference = cashDistributionProcedureReference;
    }

    public org.museframework.bian.classes.Object getCashDistributionProcedureReference() {
        return cashDistributionProcedureReference;
    }

    public void setCashDistributionProcedureBusinessUnitReference(org.museframework.bian.classes.Object cashDistributionProcedureBusinessUnitReference) {
        this.cashDistributionProcedureBusinessUnitReference = cashDistributionProcedureBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getCashDistributionProcedureBusinessUnitReference() {
        return cashDistributionProcedureBusinessUnitReference;
    }

    public void setCashDistributionProcedureServiceProviderReference(org.museframework.bian.classes.Object cashDistributionProcedureServiceProviderReference) {
        this.cashDistributionProcedureServiceProviderReference = cashDistributionProcedureServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getCashDistributionProcedureServiceProviderReference() {
        return cashDistributionProcedureServiceProviderReference;
    }

    public void setCashDistributionProcedureFinancialFacilityReference(org.museframework.bian.classes.Object cashDistributionProcedureFinancialFacilityReference) {
        this.cashDistributionProcedureFinancialFacilityReference = cashDistributionProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.Object getCashDistributionProcedureFinancialFacilityReference() {
        return cashDistributionProcedureFinancialFacilityReference;
    }

    public void setCashDistributionProcedureEmployeeReference(org.museframework.bian.classes.Object cashDistributionProcedureEmployeeReference) {
        this.cashDistributionProcedureEmployeeReference = cashDistributionProcedureEmployeeReference;
    }

    public org.museframework.bian.classes.Object getCashDistributionProcedureEmployeeReference() {
        return cashDistributionProcedureEmployeeReference;
    }

    public void setCashDistributionProcedureCustomerReference(org.museframework.bian.classes.Object cashDistributionProcedureCustomerReference) {
        this.cashDistributionProcedureCustomerReference = cashDistributionProcedureCustomerReference;
    }

    public org.museframework.bian.classes.Object getCashDistributionProcedureCustomerReference() {
        return cashDistributionProcedureCustomerReference;
    }

    public void setCashDistributionProcedureType(String cashDistributionProcedureType) {
        this.cashDistributionProcedureType = cashDistributionProcedureType;
    }

    public String getCashDistributionProcedureType() {
        return cashDistributionProcedureType;
    }

    public void setCashDistributionProcedureServiceProviderSchedule(String cashDistributionProcedureServiceProviderSchedule) {
        this.cashDistributionProcedureServiceProviderSchedule = cashDistributionProcedureServiceProviderSchedule;
    }

    public String getCashDistributionProcedureServiceProviderSchedule() {
        return cashDistributionProcedureServiceProviderSchedule;
    }

    public void setCashDistributionProcedureServiceType(String cashDistributionProcedureServiceType) {
        this.cashDistributionProcedureServiceType = cashDistributionProcedureServiceType;
    }

    public String getCashDistributionProcedureServiceType() {
        return cashDistributionProcedureServiceType;
    }

    public void setCashDistributionProcedureProductandServiceType(String cashDistributionProcedureProductandServiceType) {
        this.cashDistributionProcedureProductandServiceType = cashDistributionProcedureProductandServiceType;
    }

    public String getCashDistributionProcedureProductandServiceType() {
        return cashDistributionProcedureProductandServiceType;
    }

    public void setCashDistributionProcedureProductandServiceInstance(String cashDistributionProcedureProductandServiceInstance) {
        this.cashDistributionProcedureProductandServiceInstance = cashDistributionProcedureProductandServiceInstance;
    }

    public String getCashDistributionProcedureProductandServiceInstance() {
        return cashDistributionProcedureProductandServiceInstance;
    }

    public void setCashDistributionProcedureTransactionType(String cashDistributionProcedureTransactionType) {
        this.cashDistributionProcedureTransactionType = cashDistributionProcedureTransactionType;
    }

    public String getCashDistributionProcedureTransactionType() {
        return cashDistributionProcedureTransactionType;
    }

    public void setCashDistributionProcedureTransaction(String cashDistributionProcedureTransaction) {
        this.cashDistributionProcedureTransaction = cashDistributionProcedureTransaction;
    }

    public String getCashDistributionProcedureTransaction() {
        return cashDistributionProcedureTransaction;
    }

    public void setCashDistributionProcedureFinancialTransactionArrangement(String cashDistributionProcedureFinancialTransactionArrangement) {
        this.cashDistributionProcedureFinancialTransactionArrangement = cashDistributionProcedureFinancialTransactionArrangement;
    }

    public String getCashDistributionProcedureFinancialTransactionArrangement() {
        return cashDistributionProcedureFinancialTransactionArrangement;
    }

    public void setCashDistributionProcedureCustomerAgreementReference(org.museframework.bian.classes.Object cashDistributionProcedureCustomerAgreementReference) {
        this.cashDistributionProcedureCustomerAgreementReference = cashDistributionProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Object getCashDistributionProcedureCustomerAgreementReference() {
        return cashDistributionProcedureCustomerAgreementReference;
    }
}