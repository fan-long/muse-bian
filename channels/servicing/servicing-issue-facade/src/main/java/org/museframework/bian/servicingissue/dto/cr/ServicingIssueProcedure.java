/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Servicing Issue. */
package org.museframework.bian.servicingissue.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ServicingIssueProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureParameterType;

    /*A selected optional business service as subject matter of Servicing Issue Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature servicingIssueProcedureSelectedOption;

    /*Request to process Servicing Issue Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction servicingIssueProcedureRequest;

    /*Timetable to process Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureSchedule;

    /*The status of Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureStatus;

    /*Reference to the party who is involved in Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Servicing Issue Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility servicingIssueProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureEmployeeReference;

    /*Reference to the customer who is involved in Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureType;

    /*The schedule according to which the service provider will process the Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Servicing Issue Procedure*/
    @MetaField
    private String servicingIssueProcedureServiceType;

    /*Reference to the product or service that is related to Servicing Issue Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct servicingIssueProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Servicing Issue Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction servicingIssueProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Servicing Issue Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement servicingIssueProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Servicing Issue Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement servicingIssueProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Servicing Issue Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure servicingIssueProcedureReference;

    public void setServicingIssueProcedureParameterType(String servicingIssueProcedureParameterType) {
        this.servicingIssueProcedureParameterType = servicingIssueProcedureParameterType;
    }

    public String getServicingIssueProcedureParameterType() {
        return servicingIssueProcedureParameterType;
    }

    public void setServicingIssueProcedureSelectedOption(org.museframework.bian.classes.Feature servicingIssueProcedureSelectedOption) {
        this.servicingIssueProcedureSelectedOption = servicingIssueProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getServicingIssueProcedureSelectedOption() {
        return servicingIssueProcedureSelectedOption;
    }

    public void setServicingIssueProcedureRequest(org.museframework.bian.classes.Instruction servicingIssueProcedureRequest) {
        this.servicingIssueProcedureRequest = servicingIssueProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getServicingIssueProcedureRequest() {
        return servicingIssueProcedureRequest;
    }

    public void setServicingIssueProcedureSchedule(String servicingIssueProcedureSchedule) {
        this.servicingIssueProcedureSchedule = servicingIssueProcedureSchedule;
    }

    public String getServicingIssueProcedureSchedule() {
        return servicingIssueProcedureSchedule;
    }

    public void setServicingIssueProcedureStatus(String servicingIssueProcedureStatus) {
        this.servicingIssueProcedureStatus = servicingIssueProcedureStatus;
    }

    public String getServicingIssueProcedureStatus() {
        return servicingIssueProcedureStatus;
    }

    public void setServicingIssueProcedureAssociatedPartyReference(String servicingIssueProcedureAssociatedPartyReference) {
        this.servicingIssueProcedureAssociatedPartyReference = servicingIssueProcedureAssociatedPartyReference;
    }

    public String getServicingIssueProcedureAssociatedPartyReference() {
        return servicingIssueProcedureAssociatedPartyReference;
    }

    public void setServicingIssueProcedureBusinessUnitReference(String servicingIssueProcedureBusinessUnitReference) {
        this.servicingIssueProcedureBusinessUnitReference = servicingIssueProcedureBusinessUnitReference;
    }

    public String getServicingIssueProcedureBusinessUnitReference() {
        return servicingIssueProcedureBusinessUnitReference;
    }

    public void setServicingIssueProcedureServiceProviderReference(String servicingIssueProcedureServiceProviderReference) {
        this.servicingIssueProcedureServiceProviderReference = servicingIssueProcedureServiceProviderReference;
    }

    public String getServicingIssueProcedureServiceProviderReference() {
        return servicingIssueProcedureServiceProviderReference;
    }

    public void setServicingIssueProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility servicingIssueProcedureFinancialFacilityReference) {
        this.servicingIssueProcedureFinancialFacilityReference = servicingIssueProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getServicingIssueProcedureFinancialFacilityReference() {
        return servicingIssueProcedureFinancialFacilityReference;
    }

    public void setServicingIssueProcedureEmployeeReference(String servicingIssueProcedureEmployeeReference) {
        this.servicingIssueProcedureEmployeeReference = servicingIssueProcedureEmployeeReference;
    }

    public String getServicingIssueProcedureEmployeeReference() {
        return servicingIssueProcedureEmployeeReference;
    }

    public void setServicingIssueProcedureCustomerReference(String servicingIssueProcedureCustomerReference) {
        this.servicingIssueProcedureCustomerReference = servicingIssueProcedureCustomerReference;
    }

    public String getServicingIssueProcedureCustomerReference() {
        return servicingIssueProcedureCustomerReference;
    }

    public void setServicingIssueProcedureType(String servicingIssueProcedureType) {
        this.servicingIssueProcedureType = servicingIssueProcedureType;
    }

    public String getServicingIssueProcedureType() {
        return servicingIssueProcedureType;
    }

    public void setServicingIssueProcedureServiceProviderSchedule(String servicingIssueProcedureServiceProviderSchedule) {
        this.servicingIssueProcedureServiceProviderSchedule = servicingIssueProcedureServiceProviderSchedule;
    }

    public String getServicingIssueProcedureServiceProviderSchedule() {
        return servicingIssueProcedureServiceProviderSchedule;
    }

    public void setServicingIssueProcedureServiceType(String servicingIssueProcedureServiceType) {
        this.servicingIssueProcedureServiceType = servicingIssueProcedureServiceType;
    }

    public String getServicingIssueProcedureServiceType() {
        return servicingIssueProcedureServiceType;
    }

    public void setServicingIssueProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct servicingIssueProcedureProductandServiceInstance) {
        this.servicingIssueProcedureProductandServiceInstance = servicingIssueProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getServicingIssueProcedureProductandServiceInstance() {
        return servicingIssueProcedureProductandServiceInstance;
    }

    public void setServicingIssueProcedureTransaction(org.museframework.bian.classes.Transaction servicingIssueProcedureTransaction) {
        this.servicingIssueProcedureTransaction = servicingIssueProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getServicingIssueProcedureTransaction() {
        return servicingIssueProcedureTransaction;
    }

    public void setServicingIssueProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement servicingIssueProcedureFinancialTransactionArrangement) {
        this.servicingIssueProcedureFinancialTransactionArrangement = servicingIssueProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getServicingIssueProcedureFinancialTransactionArrangement() {
        return servicingIssueProcedureFinancialTransactionArrangement;
    }

    public void setServicingIssueProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement servicingIssueProcedureCustomerAgreementReference) {
        this.servicingIssueProcedureCustomerAgreementReference = servicingIssueProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getServicingIssueProcedureCustomerAgreementReference() {
        return servicingIssueProcedureCustomerAgreementReference;
    }

    public void setServicingIssueProcedureReference(org.museframework.bian.classes.Procedure servicingIssueProcedureReference) {
        this.servicingIssueProcedureReference = servicingIssueProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getServicingIssueProcedureReference() {
        return servicingIssueProcedureReference;
    }
}