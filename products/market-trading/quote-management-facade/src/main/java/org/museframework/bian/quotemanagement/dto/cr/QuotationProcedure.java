/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Quote Management. */
package org.museframework.bian.quotemanagement.dto.cr;

public class QuotationProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Quotation Procedure*/
    private String quotationProcedureParameterType;

    /*A selected optional business service as subject matter of Quotation Procedure*/
    private org.museframework.bian.classes.Feature quotationProcedureSelectedOption;

    /*Request to process Quotation Procedure*/
    private org.museframework.bian.classes.Instruction quotationProcedureRequest;

    /*Timetable to process Quotation Procedure*/
    private String quotationProcedureSchedule;

    /*The status of Quotation Procedure*/
    private String quotationProcedureStatus;

    /*Reference to the party who is involved in Quotation Procedure*/
    private String quotationProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Quotation Procedure*/
    private String quotationProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Quotation Procedure*/
    private String quotationProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Quotation Procedure*/
    private org.museframework.bian.classes.FinancialFacility quotationProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Quotation Procedure*/
    private String quotationProcedureEmployeeReference;

    /*Reference to the customer who is involved in Quotation Procedure*/
    private String quotationProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Quotation Procedure*/
    private String quotationProcedureType;

    /*The schedule according to which the service provider will process the Quotation Procedure*/
    private String quotationProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Quotation Procedure*/
    private String quotationProcedureServiceType;

    /*Reference to the product or service that is related to Quotation Procedure*/
    private org.museframework.bian.classes.BankingProduct quotationProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Quotation Procedure*/
    private org.museframework.bian.classes.Transaction quotationProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Quotation Procedure*/
    private org.museframework.bian.classes.Arrangement quotationProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Quotation Procedure*/
    private org.museframework.bian.classes.Agreement quotationProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Quotation Procedure*/
    private org.museframework.bian.classes.Procedure quotationProcedureReference;

    public void setQuotationProcedureParameterType(String quotationProcedureParameterType) {
        this.quotationProcedureParameterType = quotationProcedureParameterType;
    }

    public String getQuotationProcedureParameterType() {
        return quotationProcedureParameterType;
    }

    public void setQuotationProcedureSelectedOption(org.museframework.bian.classes.Feature quotationProcedureSelectedOption) {
        this.quotationProcedureSelectedOption = quotationProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getQuotationProcedureSelectedOption() {
        return quotationProcedureSelectedOption;
    }

    public void setQuotationProcedureRequest(org.museframework.bian.classes.Instruction quotationProcedureRequest) {
        this.quotationProcedureRequest = quotationProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getQuotationProcedureRequest() {
        return quotationProcedureRequest;
    }

    public void setQuotationProcedureSchedule(String quotationProcedureSchedule) {
        this.quotationProcedureSchedule = quotationProcedureSchedule;
    }

    public String getQuotationProcedureSchedule() {
        return quotationProcedureSchedule;
    }

    public void setQuotationProcedureStatus(String quotationProcedureStatus) {
        this.quotationProcedureStatus = quotationProcedureStatus;
    }

    public String getQuotationProcedureStatus() {
        return quotationProcedureStatus;
    }

    public void setQuotationProcedureAssociatedPartyReference(String quotationProcedureAssociatedPartyReference) {
        this.quotationProcedureAssociatedPartyReference = quotationProcedureAssociatedPartyReference;
    }

    public String getQuotationProcedureAssociatedPartyReference() {
        return quotationProcedureAssociatedPartyReference;
    }

    public void setQuotationProcedureBusinessUnitReference(String quotationProcedureBusinessUnitReference) {
        this.quotationProcedureBusinessUnitReference = quotationProcedureBusinessUnitReference;
    }

    public String getQuotationProcedureBusinessUnitReference() {
        return quotationProcedureBusinessUnitReference;
    }

    public void setQuotationProcedureServiceProviderReference(String quotationProcedureServiceProviderReference) {
        this.quotationProcedureServiceProviderReference = quotationProcedureServiceProviderReference;
    }

    public String getQuotationProcedureServiceProviderReference() {
        return quotationProcedureServiceProviderReference;
    }

    public void setQuotationProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility quotationProcedureFinancialFacilityReference) {
        this.quotationProcedureFinancialFacilityReference = quotationProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getQuotationProcedureFinancialFacilityReference() {
        return quotationProcedureFinancialFacilityReference;
    }

    public void setQuotationProcedureEmployeeReference(String quotationProcedureEmployeeReference) {
        this.quotationProcedureEmployeeReference = quotationProcedureEmployeeReference;
    }

    public String getQuotationProcedureEmployeeReference() {
        return quotationProcedureEmployeeReference;
    }

    public void setQuotationProcedureCustomerReference(String quotationProcedureCustomerReference) {
        this.quotationProcedureCustomerReference = quotationProcedureCustomerReference;
    }

    public String getQuotationProcedureCustomerReference() {
        return quotationProcedureCustomerReference;
    }

    public void setQuotationProcedureType(String quotationProcedureType) {
        this.quotationProcedureType = quotationProcedureType;
    }

    public String getQuotationProcedureType() {
        return quotationProcedureType;
    }

    public void setQuotationProcedureServiceProviderSchedule(String quotationProcedureServiceProviderSchedule) {
        this.quotationProcedureServiceProviderSchedule = quotationProcedureServiceProviderSchedule;
    }

    public String getQuotationProcedureServiceProviderSchedule() {
        return quotationProcedureServiceProviderSchedule;
    }

    public void setQuotationProcedureServiceType(String quotationProcedureServiceType) {
        this.quotationProcedureServiceType = quotationProcedureServiceType;
    }

    public String getQuotationProcedureServiceType() {
        return quotationProcedureServiceType;
    }

    public void setQuotationProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct quotationProcedureProductandServiceInstance) {
        this.quotationProcedureProductandServiceInstance = quotationProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getQuotationProcedureProductandServiceInstance() {
        return quotationProcedureProductandServiceInstance;
    }

    public void setQuotationProcedureTransaction(org.museframework.bian.classes.Transaction quotationProcedureTransaction) {
        this.quotationProcedureTransaction = quotationProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getQuotationProcedureTransaction() {
        return quotationProcedureTransaction;
    }

    public void setQuotationProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement quotationProcedureFinancialTransactionArrangement) {
        this.quotationProcedureFinancialTransactionArrangement = quotationProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getQuotationProcedureFinancialTransactionArrangement() {
        return quotationProcedureFinancialTransactionArrangement;
    }

    public void setQuotationProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement quotationProcedureCustomerAgreementReference) {
        this.quotationProcedureCustomerAgreementReference = quotationProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getQuotationProcedureCustomerAgreementReference() {
        return quotationProcedureCustomerAgreementReference;
    }

    public void setQuotationProcedureReference(org.museframework.bian.classes.Procedure quotationProcedureReference) {
        this.quotationProcedureReference = quotationProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getQuotationProcedureReference() {
        return quotationProcedureReference;
    }
}