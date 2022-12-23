/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Trade Clearing. */
package org.museframework.bian.tradeclearing.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradeClearingProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureParameterType;

    /*A selected optional business service as subject matter of Trade Clearing Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature tradeClearingProcedureSelectedOption;

    /*Request to process Trade Clearing Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction tradeClearingProcedureRequest;

    /*Timetable to process Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureSchedule;

    /*The status of Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureStatus;

    /*Reference to the party who is involved in Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Trade Clearing Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility tradeClearingProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureEmployeeReference;

    /*Reference to the customer who is involved in Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureType;

    /*The schedule according to which the service provider will process the Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Trade Clearing Procedure*/
    @MetaField
    private String tradeClearingProcedureServiceType;

    /*Reference to the product or service that is related to Trade Clearing Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct tradeClearingProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Trade Clearing Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction tradeClearingProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Trade Clearing Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement tradeClearingProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Trade Clearing Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement tradeClearingProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Trade Clearing Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure tradeClearingProcedureReference;

    public void setTradeClearingProcedureParameterType(String tradeClearingProcedureParameterType) {
        this.tradeClearingProcedureParameterType = tradeClearingProcedureParameterType;
    }

    public String getTradeClearingProcedureParameterType() {
        return tradeClearingProcedureParameterType;
    }

    public void setTradeClearingProcedureSelectedOption(org.museframework.bian.classes.Feature tradeClearingProcedureSelectedOption) {
        this.tradeClearingProcedureSelectedOption = tradeClearingProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getTradeClearingProcedureSelectedOption() {
        return tradeClearingProcedureSelectedOption;
    }

    public void setTradeClearingProcedureRequest(org.museframework.bian.classes.Instruction tradeClearingProcedureRequest) {
        this.tradeClearingProcedureRequest = tradeClearingProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getTradeClearingProcedureRequest() {
        return tradeClearingProcedureRequest;
    }

    public void setTradeClearingProcedureSchedule(String tradeClearingProcedureSchedule) {
        this.tradeClearingProcedureSchedule = tradeClearingProcedureSchedule;
    }

    public String getTradeClearingProcedureSchedule() {
        return tradeClearingProcedureSchedule;
    }

    public void setTradeClearingProcedureStatus(String tradeClearingProcedureStatus) {
        this.tradeClearingProcedureStatus = tradeClearingProcedureStatus;
    }

    public String getTradeClearingProcedureStatus() {
        return tradeClearingProcedureStatus;
    }

    public void setTradeClearingProcedureAssociatedPartyReference(String tradeClearingProcedureAssociatedPartyReference) {
        this.tradeClearingProcedureAssociatedPartyReference = tradeClearingProcedureAssociatedPartyReference;
    }

    public String getTradeClearingProcedureAssociatedPartyReference() {
        return tradeClearingProcedureAssociatedPartyReference;
    }

    public void setTradeClearingProcedureBusinessUnitReference(String tradeClearingProcedureBusinessUnitReference) {
        this.tradeClearingProcedureBusinessUnitReference = tradeClearingProcedureBusinessUnitReference;
    }

    public String getTradeClearingProcedureBusinessUnitReference() {
        return tradeClearingProcedureBusinessUnitReference;
    }

    public void setTradeClearingProcedureServiceProviderReference(String tradeClearingProcedureServiceProviderReference) {
        this.tradeClearingProcedureServiceProviderReference = tradeClearingProcedureServiceProviderReference;
    }

    public String getTradeClearingProcedureServiceProviderReference() {
        return tradeClearingProcedureServiceProviderReference;
    }

    public void setTradeClearingProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility tradeClearingProcedureFinancialFacilityReference) {
        this.tradeClearingProcedureFinancialFacilityReference = tradeClearingProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getTradeClearingProcedureFinancialFacilityReference() {
        return tradeClearingProcedureFinancialFacilityReference;
    }

    public void setTradeClearingProcedureEmployeeReference(String tradeClearingProcedureEmployeeReference) {
        this.tradeClearingProcedureEmployeeReference = tradeClearingProcedureEmployeeReference;
    }

    public String getTradeClearingProcedureEmployeeReference() {
        return tradeClearingProcedureEmployeeReference;
    }

    public void setTradeClearingProcedureCustomerReference(String tradeClearingProcedureCustomerReference) {
        this.tradeClearingProcedureCustomerReference = tradeClearingProcedureCustomerReference;
    }

    public String getTradeClearingProcedureCustomerReference() {
        return tradeClearingProcedureCustomerReference;
    }

    public void setTradeClearingProcedureType(String tradeClearingProcedureType) {
        this.tradeClearingProcedureType = tradeClearingProcedureType;
    }

    public String getTradeClearingProcedureType() {
        return tradeClearingProcedureType;
    }

    public void setTradeClearingProcedureServiceProviderSchedule(String tradeClearingProcedureServiceProviderSchedule) {
        this.tradeClearingProcedureServiceProviderSchedule = tradeClearingProcedureServiceProviderSchedule;
    }

    public String getTradeClearingProcedureServiceProviderSchedule() {
        return tradeClearingProcedureServiceProviderSchedule;
    }

    public void setTradeClearingProcedureServiceType(String tradeClearingProcedureServiceType) {
        this.tradeClearingProcedureServiceType = tradeClearingProcedureServiceType;
    }

    public String getTradeClearingProcedureServiceType() {
        return tradeClearingProcedureServiceType;
    }

    public void setTradeClearingProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct tradeClearingProcedureProductandServiceInstance) {
        this.tradeClearingProcedureProductandServiceInstance = tradeClearingProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getTradeClearingProcedureProductandServiceInstance() {
        return tradeClearingProcedureProductandServiceInstance;
    }

    public void setTradeClearingProcedureTransaction(org.museframework.bian.classes.Transaction tradeClearingProcedureTransaction) {
        this.tradeClearingProcedureTransaction = tradeClearingProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getTradeClearingProcedureTransaction() {
        return tradeClearingProcedureTransaction;
    }

    public void setTradeClearingProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement tradeClearingProcedureFinancialTransactionArrangement) {
        this.tradeClearingProcedureFinancialTransactionArrangement = tradeClearingProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getTradeClearingProcedureFinancialTransactionArrangement() {
        return tradeClearingProcedureFinancialTransactionArrangement;
    }

    public void setTradeClearingProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement tradeClearingProcedureCustomerAgreementReference) {
        this.tradeClearingProcedureCustomerAgreementReference = tradeClearingProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getTradeClearingProcedureCustomerAgreementReference() {
        return tradeClearingProcedureCustomerAgreementReference;
    }

    public void setTradeClearingProcedureReference(org.museframework.bian.classes.Procedure tradeClearingProcedureReference) {
        this.tradeClearingProcedureReference = tradeClearingProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getTradeClearingProcedureReference() {
        return tradeClearingProcedureReference;
    }
}