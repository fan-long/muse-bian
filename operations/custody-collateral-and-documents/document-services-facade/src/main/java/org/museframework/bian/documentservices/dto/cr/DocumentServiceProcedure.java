/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Document Services. */
package org.museframework.bian.documentservices.dto.cr;

public class DocumentServiceProcedure extends org.museframework.bian.classes.DocumentServiceProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Document Service Procedure*/
    private String documentServiceProcedureParameterType;

    /*A selected optional business service as subject matter of Document Service Procedure*/
    private org.museframework.bian.classes.Feature documentServiceProcedureSelectedOption;

    /*Request to process Document Service Procedure*/
    private org.museframework.bian.classes.Instruction documentServiceProcedureRequest;

    /*Timetable to process Document Service Procedure*/
    private String documentServiceProcedureSchedule;

    /*The status of Document Service Procedure*/
    private String documentServiceProcedureStatus;

    /*Reference to the party who is involved in Document Service Procedure*/
    private String documentServiceProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Document Service Procedure*/
    private String documentServiceProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Document Service Procedure*/
    private String documentServiceProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Document Service Procedure*/
    private org.museframework.bian.classes.FinancialFacility documentServiceProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Document Service Procedure*/
    private String documentServiceProcedureEmployeeReference;

    /*Reference to the customer who is involved in Document Service Procedure*/
    private String documentServiceProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Document Service Procedure*/
    private String documentServiceProcedureType;

    /*The schedule according to which the service provider will process the Document Service Procedure*/
    private String documentServiceProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Document Service Procedure*/
    private String documentServiceProcedureServiceType;

    /*Reference to the product or service that is related to Document Service Procedure*/
    private org.museframework.bian.classes.BankingProduct documentServiceProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Document Service Procedure*/
    private org.museframework.bian.classes.Transaction documentServiceProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Document Service Procedure*/
    private org.museframework.bian.classes.Arrangement documentServiceProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Document Service Procedure*/
    private org.museframework.bian.classes.Agreement documentServiceProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Document Service Procedure*/
    private org.museframework.bian.classes.Procedure documentServiceProcedureReference;

    public void setDocumentServiceProcedureParameterType(String documentServiceProcedureParameterType) {
        this.documentServiceProcedureParameterType = documentServiceProcedureParameterType;
    }

    public String getDocumentServiceProcedureParameterType() {
        return documentServiceProcedureParameterType;
    }

    public void setDocumentServiceProcedureSelectedOption(org.museframework.bian.classes.Feature documentServiceProcedureSelectedOption) {
        this.documentServiceProcedureSelectedOption = documentServiceProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getDocumentServiceProcedureSelectedOption() {
        return documentServiceProcedureSelectedOption;
    }

    public void setDocumentServiceProcedureRequest(org.museframework.bian.classes.Instruction documentServiceProcedureRequest) {
        this.documentServiceProcedureRequest = documentServiceProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getDocumentServiceProcedureRequest() {
        return documentServiceProcedureRequest;
    }

    public void setDocumentServiceProcedureSchedule(String documentServiceProcedureSchedule) {
        this.documentServiceProcedureSchedule = documentServiceProcedureSchedule;
    }

    public String getDocumentServiceProcedureSchedule() {
        return documentServiceProcedureSchedule;
    }

    public void setDocumentServiceProcedureStatus(String documentServiceProcedureStatus) {
        this.documentServiceProcedureStatus = documentServiceProcedureStatus;
    }

    public String getDocumentServiceProcedureStatus() {
        return documentServiceProcedureStatus;
    }

    public void setDocumentServiceProcedureAssociatedPartyReference(String documentServiceProcedureAssociatedPartyReference) {
        this.documentServiceProcedureAssociatedPartyReference = documentServiceProcedureAssociatedPartyReference;
    }

    public String getDocumentServiceProcedureAssociatedPartyReference() {
        return documentServiceProcedureAssociatedPartyReference;
    }

    public void setDocumentServiceProcedureBusinessUnitReference(String documentServiceProcedureBusinessUnitReference) {
        this.documentServiceProcedureBusinessUnitReference = documentServiceProcedureBusinessUnitReference;
    }

    public String getDocumentServiceProcedureBusinessUnitReference() {
        return documentServiceProcedureBusinessUnitReference;
    }

    public void setDocumentServiceProcedureServiceProviderReference(String documentServiceProcedureServiceProviderReference) {
        this.documentServiceProcedureServiceProviderReference = documentServiceProcedureServiceProviderReference;
    }

    public String getDocumentServiceProcedureServiceProviderReference() {
        return documentServiceProcedureServiceProviderReference;
    }

    public void setDocumentServiceProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility documentServiceProcedureFinancialFacilityReference) {
        this.documentServiceProcedureFinancialFacilityReference = documentServiceProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getDocumentServiceProcedureFinancialFacilityReference() {
        return documentServiceProcedureFinancialFacilityReference;
    }

    public void setDocumentServiceProcedureEmployeeReference(String documentServiceProcedureEmployeeReference) {
        this.documentServiceProcedureEmployeeReference = documentServiceProcedureEmployeeReference;
    }

    public String getDocumentServiceProcedureEmployeeReference() {
        return documentServiceProcedureEmployeeReference;
    }

    public void setDocumentServiceProcedureCustomerReference(String documentServiceProcedureCustomerReference) {
        this.documentServiceProcedureCustomerReference = documentServiceProcedureCustomerReference;
    }

    public String getDocumentServiceProcedureCustomerReference() {
        return documentServiceProcedureCustomerReference;
    }

    public void setDocumentServiceProcedureType(String documentServiceProcedureType) {
        this.documentServiceProcedureType = documentServiceProcedureType;
    }

    public String getDocumentServiceProcedureType() {
        return documentServiceProcedureType;
    }

    public void setDocumentServiceProcedureServiceProviderSchedule(String documentServiceProcedureServiceProviderSchedule) {
        this.documentServiceProcedureServiceProviderSchedule = documentServiceProcedureServiceProviderSchedule;
    }

    public String getDocumentServiceProcedureServiceProviderSchedule() {
        return documentServiceProcedureServiceProviderSchedule;
    }

    public void setDocumentServiceProcedureServiceType(String documentServiceProcedureServiceType) {
        this.documentServiceProcedureServiceType = documentServiceProcedureServiceType;
    }

    public String getDocumentServiceProcedureServiceType() {
        return documentServiceProcedureServiceType;
    }

    public void setDocumentServiceProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct documentServiceProcedureProductandServiceInstance) {
        this.documentServiceProcedureProductandServiceInstance = documentServiceProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getDocumentServiceProcedureProductandServiceInstance() {
        return documentServiceProcedureProductandServiceInstance;
    }

    public void setDocumentServiceProcedureTransaction(org.museframework.bian.classes.Transaction documentServiceProcedureTransaction) {
        this.documentServiceProcedureTransaction = documentServiceProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getDocumentServiceProcedureTransaction() {
        return documentServiceProcedureTransaction;
    }

    public void setDocumentServiceProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement documentServiceProcedureFinancialTransactionArrangement) {
        this.documentServiceProcedureFinancialTransactionArrangement = documentServiceProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getDocumentServiceProcedureFinancialTransactionArrangement() {
        return documentServiceProcedureFinancialTransactionArrangement;
    }

    public void setDocumentServiceProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement documentServiceProcedureCustomerAgreementReference) {
        this.documentServiceProcedureCustomerAgreementReference = documentServiceProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getDocumentServiceProcedureCustomerAgreementReference() {
        return documentServiceProcedureCustomerAgreementReference;
    }

    public void setDocumentServiceProcedureReference(org.museframework.bian.classes.Procedure documentServiceProcedureReference) {
        this.documentServiceProcedureReference = documentServiceProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getDocumentServiceProcedureReference() {
        return documentServiceProcedureReference;
    }
}