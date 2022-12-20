/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Processing Order.*/
package org.museframework.bian.processingorder.dto.cr;

public class ProcessingOrderProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Processing Order Procedure.*/
    private String processingOrderProcedureParameterType;

    /*A selected optional business service as subject matter of Processing Order Procedure.*/
    private org.museframework.bian.classes.Feature processingOrderProcedureSelectedOption;

    /*Request to process the Processing Order Procedure.*/
    private org.museframework.bian.classes.Instruction processingOrderProcedureRequest;

    /*Timetable to process the Processing Order Procedure.*/
    private String processingOrderProcedureSchedule;

    /*The status of Processing Order Procedure.*/
    private String processingOrderProcedureStatus;

    /*Reference to the party who is involved in Processing Order Procedure.*/
    private String processingOrderProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Processing Order Procedure.*/
    private String processingOrderProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Processing Order Procedure.*/
    private String processingOrderProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Processing Order Procedure.*/
    private org.museframework.bian.classes.FinancialFacility processingOrderProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Processing Order Procedure.*/
    private String processingOrderProcedureEmployeeReference;

    /*Reference to the customer who is involved in Processing Order Procedure.*/
    private String processingOrderProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Processing Order Procedure.*/
    private String processingOrderProcedureType;

    /*The schedule according to which the service provider will process the Processing Order Procedure.*/
    private String processingOrderProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Processing Order Procedure.*/
    private String processingOrderProcedureServiceType;

    /*Reference to the product or service that is related to Processing Order Procedure.*/
    private org.museframework.bian.classes.BankingProduct processingOrderProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Processing Order Procedure.*/
    private org.museframework.bian.classes.Transaction processingOrderProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Processing Order Procedure.*/
    private org.museframework.bian.classes.Arrangement processingOrderProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Processing Order Procedure.*/
    private org.museframework.bian.classes.Agreement processingOrderProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Processing Order Procedure. */
    private org.museframework.bian.classes.Procedure processingOrderProcedureReference;

    public void setProcessingOrderProcedureParameterType(String processingOrderProcedureParameterType) {
        this.processingOrderProcedureParameterType = processingOrderProcedureParameterType;
    }

    public String getProcessingOrderProcedureParameterType() {
        return processingOrderProcedureParameterType;
    }

    public void setProcessingOrderProcedureSelectedOption(org.museframework.bian.classes.Feature processingOrderProcedureSelectedOption) {
        this.processingOrderProcedureSelectedOption = processingOrderProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getProcessingOrderProcedureSelectedOption() {
        return processingOrderProcedureSelectedOption;
    }

    public void setProcessingOrderProcedureRequest(org.museframework.bian.classes.Instruction processingOrderProcedureRequest) {
        this.processingOrderProcedureRequest = processingOrderProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getProcessingOrderProcedureRequest() {
        return processingOrderProcedureRequest;
    }

    public void setProcessingOrderProcedureSchedule(String processingOrderProcedureSchedule) {
        this.processingOrderProcedureSchedule = processingOrderProcedureSchedule;
    }

    public String getProcessingOrderProcedureSchedule() {
        return processingOrderProcedureSchedule;
    }

    public void setProcessingOrderProcedureStatus(String processingOrderProcedureStatus) {
        this.processingOrderProcedureStatus = processingOrderProcedureStatus;
    }

    public String getProcessingOrderProcedureStatus() {
        return processingOrderProcedureStatus;
    }

    public void setProcessingOrderProcedureAssociatedPartyReference(String processingOrderProcedureAssociatedPartyReference) {
        this.processingOrderProcedureAssociatedPartyReference = processingOrderProcedureAssociatedPartyReference;
    }

    public String getProcessingOrderProcedureAssociatedPartyReference() {
        return processingOrderProcedureAssociatedPartyReference;
    }

    public void setProcessingOrderProcedureBusinessUnitReference(String processingOrderProcedureBusinessUnitReference) {
        this.processingOrderProcedureBusinessUnitReference = processingOrderProcedureBusinessUnitReference;
    }

    public String getProcessingOrderProcedureBusinessUnitReference() {
        return processingOrderProcedureBusinessUnitReference;
    }

    public void setProcessingOrderProcedureServiceProviderReference(String processingOrderProcedureServiceProviderReference) {
        this.processingOrderProcedureServiceProviderReference = processingOrderProcedureServiceProviderReference;
    }

    public String getProcessingOrderProcedureServiceProviderReference() {
        return processingOrderProcedureServiceProviderReference;
    }

    public void setProcessingOrderProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility processingOrderProcedureFinancialFacilityReference) {
        this.processingOrderProcedureFinancialFacilityReference = processingOrderProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getProcessingOrderProcedureFinancialFacilityReference() {
        return processingOrderProcedureFinancialFacilityReference;
    }

    public void setProcessingOrderProcedureEmployeeReference(String processingOrderProcedureEmployeeReference) {
        this.processingOrderProcedureEmployeeReference = processingOrderProcedureEmployeeReference;
    }

    public String getProcessingOrderProcedureEmployeeReference() {
        return processingOrderProcedureEmployeeReference;
    }

    public void setProcessingOrderProcedureCustomerReference(String processingOrderProcedureCustomerReference) {
        this.processingOrderProcedureCustomerReference = processingOrderProcedureCustomerReference;
    }

    public String getProcessingOrderProcedureCustomerReference() {
        return processingOrderProcedureCustomerReference;
    }

    public void setProcessingOrderProcedureType(String processingOrderProcedureType) {
        this.processingOrderProcedureType = processingOrderProcedureType;
    }

    public String getProcessingOrderProcedureType() {
        return processingOrderProcedureType;
    }

    public void setProcessingOrderProcedureServiceProviderSchedule(String processingOrderProcedureServiceProviderSchedule) {
        this.processingOrderProcedureServiceProviderSchedule = processingOrderProcedureServiceProviderSchedule;
    }

    public String getProcessingOrderProcedureServiceProviderSchedule() {
        return processingOrderProcedureServiceProviderSchedule;
    }

    public void setProcessingOrderProcedureServiceType(String processingOrderProcedureServiceType) {
        this.processingOrderProcedureServiceType = processingOrderProcedureServiceType;
    }

    public String getProcessingOrderProcedureServiceType() {
        return processingOrderProcedureServiceType;
    }

    public void setProcessingOrderProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct processingOrderProcedureProductandServiceInstance) {
        this.processingOrderProcedureProductandServiceInstance = processingOrderProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getProcessingOrderProcedureProductandServiceInstance() {
        return processingOrderProcedureProductandServiceInstance;
    }

    public void setProcessingOrderProcedureTransaction(org.museframework.bian.classes.Transaction processingOrderProcedureTransaction) {
        this.processingOrderProcedureTransaction = processingOrderProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getProcessingOrderProcedureTransaction() {
        return processingOrderProcedureTransaction;
    }

    public void setProcessingOrderProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement processingOrderProcedureFinancialTransactionArrangement) {
        this.processingOrderProcedureFinancialTransactionArrangement = processingOrderProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getProcessingOrderProcedureFinancialTransactionArrangement() {
        return processingOrderProcedureFinancialTransactionArrangement;
    }

    public void setProcessingOrderProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement processingOrderProcedureCustomerAgreementReference) {
        this.processingOrderProcedureCustomerAgreementReference = processingOrderProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getProcessingOrderProcedureCustomerAgreementReference() {
        return processingOrderProcedureCustomerAgreementReference;
    }

    public void setProcessingOrderProcedureReference(org.museframework.bian.classes.Procedure processingOrderProcedureReference) {
        this.processingOrderProcedureReference = processingOrderProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getProcessingOrderProcedureReference() {
        return processingOrderProcedureReference;
    }
}