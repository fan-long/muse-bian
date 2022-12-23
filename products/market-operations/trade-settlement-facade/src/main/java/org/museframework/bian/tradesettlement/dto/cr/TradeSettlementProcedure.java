/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Trade Settlement. */
package org.museframework.bian.tradesettlement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradeSettlementProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureParameterType;

    /*A selected optional business service as subject matter of Trade Settlement Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature tradeSettlementProcedureSelectedOption;

    /*Request to process Trade Settlement Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction tradeSettlementProcedureRequest;

    /*Timetable to process Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureSchedule;

    /*The status of Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureStatus;

    /*Reference to the party who is involved in Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Trade Settlement Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility tradeSettlementProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureEmployeeReference;

    /*Reference to the customer who is involved in Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureType;

    /*The schedule according to which the service provider will process the Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Trade Settlement Procedure*/
    @MetaField
    private String tradeSettlementProcedureServiceType;

    /*Reference to the product or service that is related to Trade Settlement Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct tradeSettlementProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Trade Settlement Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction tradeSettlementProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Trade Settlement Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement tradeSettlementProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Trade Settlement Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement tradeSettlementProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Trade Settlement Procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure tradeSettlementProcedureReference;

    public void setTradeSettlementProcedureParameterType(String tradeSettlementProcedureParameterType) {
        this.tradeSettlementProcedureParameterType = tradeSettlementProcedureParameterType;
    }

    public String getTradeSettlementProcedureParameterType() {
        return tradeSettlementProcedureParameterType;
    }

    public void setTradeSettlementProcedureSelectedOption(org.museframework.bian.classes.Feature tradeSettlementProcedureSelectedOption) {
        this.tradeSettlementProcedureSelectedOption = tradeSettlementProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getTradeSettlementProcedureSelectedOption() {
        return tradeSettlementProcedureSelectedOption;
    }

    public void setTradeSettlementProcedureRequest(org.museframework.bian.classes.Instruction tradeSettlementProcedureRequest) {
        this.tradeSettlementProcedureRequest = tradeSettlementProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getTradeSettlementProcedureRequest() {
        return tradeSettlementProcedureRequest;
    }

    public void setTradeSettlementProcedureSchedule(String tradeSettlementProcedureSchedule) {
        this.tradeSettlementProcedureSchedule = tradeSettlementProcedureSchedule;
    }

    public String getTradeSettlementProcedureSchedule() {
        return tradeSettlementProcedureSchedule;
    }

    public void setTradeSettlementProcedureStatus(String tradeSettlementProcedureStatus) {
        this.tradeSettlementProcedureStatus = tradeSettlementProcedureStatus;
    }

    public String getTradeSettlementProcedureStatus() {
        return tradeSettlementProcedureStatus;
    }

    public void setTradeSettlementProcedureAssociatedPartyReference(String tradeSettlementProcedureAssociatedPartyReference) {
        this.tradeSettlementProcedureAssociatedPartyReference = tradeSettlementProcedureAssociatedPartyReference;
    }

    public String getTradeSettlementProcedureAssociatedPartyReference() {
        return tradeSettlementProcedureAssociatedPartyReference;
    }

    public void setTradeSettlementProcedureBusinessUnitReference(String tradeSettlementProcedureBusinessUnitReference) {
        this.tradeSettlementProcedureBusinessUnitReference = tradeSettlementProcedureBusinessUnitReference;
    }

    public String getTradeSettlementProcedureBusinessUnitReference() {
        return tradeSettlementProcedureBusinessUnitReference;
    }

    public void setTradeSettlementProcedureServiceProviderReference(String tradeSettlementProcedureServiceProviderReference) {
        this.tradeSettlementProcedureServiceProviderReference = tradeSettlementProcedureServiceProviderReference;
    }

    public String getTradeSettlementProcedureServiceProviderReference() {
        return tradeSettlementProcedureServiceProviderReference;
    }

    public void setTradeSettlementProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility tradeSettlementProcedureFinancialFacilityReference) {
        this.tradeSettlementProcedureFinancialFacilityReference = tradeSettlementProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getTradeSettlementProcedureFinancialFacilityReference() {
        return tradeSettlementProcedureFinancialFacilityReference;
    }

    public void setTradeSettlementProcedureEmployeeReference(String tradeSettlementProcedureEmployeeReference) {
        this.tradeSettlementProcedureEmployeeReference = tradeSettlementProcedureEmployeeReference;
    }

    public String getTradeSettlementProcedureEmployeeReference() {
        return tradeSettlementProcedureEmployeeReference;
    }

    public void setTradeSettlementProcedureCustomerReference(String tradeSettlementProcedureCustomerReference) {
        this.tradeSettlementProcedureCustomerReference = tradeSettlementProcedureCustomerReference;
    }

    public String getTradeSettlementProcedureCustomerReference() {
        return tradeSettlementProcedureCustomerReference;
    }

    public void setTradeSettlementProcedureType(String tradeSettlementProcedureType) {
        this.tradeSettlementProcedureType = tradeSettlementProcedureType;
    }

    public String getTradeSettlementProcedureType() {
        return tradeSettlementProcedureType;
    }

    public void setTradeSettlementProcedureServiceProviderSchedule(String tradeSettlementProcedureServiceProviderSchedule) {
        this.tradeSettlementProcedureServiceProviderSchedule = tradeSettlementProcedureServiceProviderSchedule;
    }

    public String getTradeSettlementProcedureServiceProviderSchedule() {
        return tradeSettlementProcedureServiceProviderSchedule;
    }

    public void setTradeSettlementProcedureServiceType(String tradeSettlementProcedureServiceType) {
        this.tradeSettlementProcedureServiceType = tradeSettlementProcedureServiceType;
    }

    public String getTradeSettlementProcedureServiceType() {
        return tradeSettlementProcedureServiceType;
    }

    public void setTradeSettlementProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct tradeSettlementProcedureProductandServiceInstance) {
        this.tradeSettlementProcedureProductandServiceInstance = tradeSettlementProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getTradeSettlementProcedureProductandServiceInstance() {
        return tradeSettlementProcedureProductandServiceInstance;
    }

    public void setTradeSettlementProcedureTransaction(org.museframework.bian.classes.Transaction tradeSettlementProcedureTransaction) {
        this.tradeSettlementProcedureTransaction = tradeSettlementProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getTradeSettlementProcedureTransaction() {
        return tradeSettlementProcedureTransaction;
    }

    public void setTradeSettlementProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement tradeSettlementProcedureFinancialTransactionArrangement) {
        this.tradeSettlementProcedureFinancialTransactionArrangement = tradeSettlementProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getTradeSettlementProcedureFinancialTransactionArrangement() {
        return tradeSettlementProcedureFinancialTransactionArrangement;
    }

    public void setTradeSettlementProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement tradeSettlementProcedureCustomerAgreementReference) {
        this.tradeSettlementProcedureCustomerAgreementReference = tradeSettlementProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getTradeSettlementProcedureCustomerAgreementReference() {
        return tradeSettlementProcedureCustomerAgreementReference;
    }

    public void setTradeSettlementProcedureReference(org.museframework.bian.classes.Procedure tradeSettlementProcedureReference) {
        this.tradeSettlementProcedureReference = tradeSettlementProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getTradeSettlementProcedureReference() {
        return tradeSettlementProcedureReference;
    }
}