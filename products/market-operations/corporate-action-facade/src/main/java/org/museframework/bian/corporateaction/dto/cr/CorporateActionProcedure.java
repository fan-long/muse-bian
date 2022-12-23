/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Corporate Action. */
package org.museframework.bian.corporateaction.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorporateActionProcedure extends org.museframework.bian.classes.CorporateActionProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureParameterType;

    /*A selected optional business service as subject matter of Corporate Action Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature corporateActionProcedureSelectedOption;

    /*Request to process Corporate Action Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction corporateActionProcedureRequest;

    /*Timetable to process Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureSchedule;

    /*The status of Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureStatus;

    /*Reference to the party who is involved in Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Corporate Action Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility corporateActionProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureEmployeeReference;

    /*Reference to the customer who is involved in Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureType;

    /*The schedule according to which the service provider will process the Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Corporate Action Procedure*/
    @MetaField
    private String corporateActionProcedureServiceType;

    /*Reference to the product or service that is related to Corporate Action Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct corporateActionProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Corporate Action Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction corporateActionProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Corporate Action Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement corporateActionProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Corporate Action Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement corporateActionProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Corporate Action Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure corporateActionProcedureReference;

    public void setCorporateActionProcedureParameterType(String corporateActionProcedureParameterType) {
        this.corporateActionProcedureParameterType = corporateActionProcedureParameterType;
    }

    public String getCorporateActionProcedureParameterType() {
        return corporateActionProcedureParameterType;
    }

    public void setCorporateActionProcedureSelectedOption(org.museframework.bian.classes.Feature corporateActionProcedureSelectedOption) {
        this.corporateActionProcedureSelectedOption = corporateActionProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getCorporateActionProcedureSelectedOption() {
        return corporateActionProcedureSelectedOption;
    }

    public void setCorporateActionProcedureRequest(org.museframework.bian.classes.Instruction corporateActionProcedureRequest) {
        this.corporateActionProcedureRequest = corporateActionProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getCorporateActionProcedureRequest() {
        return corporateActionProcedureRequest;
    }

    public void setCorporateActionProcedureSchedule(String corporateActionProcedureSchedule) {
        this.corporateActionProcedureSchedule = corporateActionProcedureSchedule;
    }

    public String getCorporateActionProcedureSchedule() {
        return corporateActionProcedureSchedule;
    }

    public void setCorporateActionProcedureStatus(String corporateActionProcedureStatus) {
        this.corporateActionProcedureStatus = corporateActionProcedureStatus;
    }

    public String getCorporateActionProcedureStatus() {
        return corporateActionProcedureStatus;
    }

    public void setCorporateActionProcedureAssociatedPartyReference(String corporateActionProcedureAssociatedPartyReference) {
        this.corporateActionProcedureAssociatedPartyReference = corporateActionProcedureAssociatedPartyReference;
    }

    public String getCorporateActionProcedureAssociatedPartyReference() {
        return corporateActionProcedureAssociatedPartyReference;
    }

    public void setCorporateActionProcedureBusinessUnitReference(String corporateActionProcedureBusinessUnitReference) {
        this.corporateActionProcedureBusinessUnitReference = corporateActionProcedureBusinessUnitReference;
    }

    public String getCorporateActionProcedureBusinessUnitReference() {
        return corporateActionProcedureBusinessUnitReference;
    }

    public void setCorporateActionProcedureServiceProviderReference(String corporateActionProcedureServiceProviderReference) {
        this.corporateActionProcedureServiceProviderReference = corporateActionProcedureServiceProviderReference;
    }

    public String getCorporateActionProcedureServiceProviderReference() {
        return corporateActionProcedureServiceProviderReference;
    }

    public void setCorporateActionProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility corporateActionProcedureFinancialFacilityReference) {
        this.corporateActionProcedureFinancialFacilityReference = corporateActionProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getCorporateActionProcedureFinancialFacilityReference() {
        return corporateActionProcedureFinancialFacilityReference;
    }

    public void setCorporateActionProcedureEmployeeReference(String corporateActionProcedureEmployeeReference) {
        this.corporateActionProcedureEmployeeReference = corporateActionProcedureEmployeeReference;
    }

    public String getCorporateActionProcedureEmployeeReference() {
        return corporateActionProcedureEmployeeReference;
    }

    public void setCorporateActionProcedureCustomerReference(String corporateActionProcedureCustomerReference) {
        this.corporateActionProcedureCustomerReference = corporateActionProcedureCustomerReference;
    }

    public String getCorporateActionProcedureCustomerReference() {
        return corporateActionProcedureCustomerReference;
    }

    public void setCorporateActionProcedureType(String corporateActionProcedureType) {
        this.corporateActionProcedureType = corporateActionProcedureType;
    }

    public String getCorporateActionProcedureType() {
        return corporateActionProcedureType;
    }

    public void setCorporateActionProcedureServiceProviderSchedule(String corporateActionProcedureServiceProviderSchedule) {
        this.corporateActionProcedureServiceProviderSchedule = corporateActionProcedureServiceProviderSchedule;
    }

    public String getCorporateActionProcedureServiceProviderSchedule() {
        return corporateActionProcedureServiceProviderSchedule;
    }

    public void setCorporateActionProcedureServiceType(String corporateActionProcedureServiceType) {
        this.corporateActionProcedureServiceType = corporateActionProcedureServiceType;
    }

    public String getCorporateActionProcedureServiceType() {
        return corporateActionProcedureServiceType;
    }

    public void setCorporateActionProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct corporateActionProcedureProductandServiceInstance) {
        this.corporateActionProcedureProductandServiceInstance = corporateActionProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getCorporateActionProcedureProductandServiceInstance() {
        return corporateActionProcedureProductandServiceInstance;
    }

    public void setCorporateActionProcedureTransaction(org.museframework.bian.classes.Transaction corporateActionProcedureTransaction) {
        this.corporateActionProcedureTransaction = corporateActionProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getCorporateActionProcedureTransaction() {
        return corporateActionProcedureTransaction;
    }

    public void setCorporateActionProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement corporateActionProcedureFinancialTransactionArrangement) {
        this.corporateActionProcedureFinancialTransactionArrangement = corporateActionProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getCorporateActionProcedureFinancialTransactionArrangement() {
        return corporateActionProcedureFinancialTransactionArrangement;
    }

    public void setCorporateActionProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement corporateActionProcedureCustomerAgreementReference) {
        this.corporateActionProcedureCustomerAgreementReference = corporateActionProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getCorporateActionProcedureCustomerAgreementReference() {
        return corporateActionProcedureCustomerAgreementReference;
    }

    public void setCorporateActionProcedureReference(org.museframework.bian.classes.Procedure corporateActionProcedureReference) {
        this.corporateActionProcedureReference = corporateActionProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getCorporateActionProcedureReference() {
        return corporateActionProcedureReference;
    }
}