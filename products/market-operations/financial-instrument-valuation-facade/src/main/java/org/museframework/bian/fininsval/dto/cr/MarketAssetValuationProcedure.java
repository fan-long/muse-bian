/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Financial Instrument Valuation. */
package org.museframework.bian.fininsval.dto.cr;

public class MarketAssetValuationProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureParameterType;

    /*A selected optional business service as subject matter of Market Asset Valuation Procedure*/
    private org.museframework.bian.classes.Feature marketAssetValuationProcedureSelectedOption;

    /*Request to process Market Asset Valuation Procedure*/
    private org.museframework.bian.classes.Instruction marketAssetValuationProcedureRequest;

    /*Timetable to process Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureSchedule;

    /*The status of Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureStatus;

    /*Reference to the party who is involved in Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Market Asset Valuation Procedure*/
    private org.museframework.bian.classes.FinancialFacility marketAssetValuationProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureEmployeeReference;

    /*Reference to the customer who is involved in Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureType;

    /*The schedule according to which the service provider will process the Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Market Asset Valuation Procedure*/
    private String marketAssetValuationProcedureServiceType;

    /*Reference to the product or service that is related to Market Asset Valuation Procedure*/
    private org.museframework.bian.classes.BankingProduct marketAssetValuationProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Market Asset Valuation Procedure*/
    private org.museframework.bian.classes.Transaction marketAssetValuationProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Market Asset Valuation Procedure*/
    private org.museframework.bian.classes.Arrangement marketAssetValuationProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Market Asset Valuation Procedure*/
    private org.museframework.bian.classes.Agreement marketAssetValuationProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Market Asset Valuation Procedure*/
    private org.museframework.bian.classes.Procedure marketAssetValuationProcedureReference;

    public void setMarketAssetValuationProcedureParameterType(String marketAssetValuationProcedureParameterType) {
        this.marketAssetValuationProcedureParameterType = marketAssetValuationProcedureParameterType;
    }

    public String getMarketAssetValuationProcedureParameterType() {
        return marketAssetValuationProcedureParameterType;
    }

    public void setMarketAssetValuationProcedureSelectedOption(org.museframework.bian.classes.Feature marketAssetValuationProcedureSelectedOption) {
        this.marketAssetValuationProcedureSelectedOption = marketAssetValuationProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getMarketAssetValuationProcedureSelectedOption() {
        return marketAssetValuationProcedureSelectedOption;
    }

    public void setMarketAssetValuationProcedureRequest(org.museframework.bian.classes.Instruction marketAssetValuationProcedureRequest) {
        this.marketAssetValuationProcedureRequest = marketAssetValuationProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getMarketAssetValuationProcedureRequest() {
        return marketAssetValuationProcedureRequest;
    }

    public void setMarketAssetValuationProcedureSchedule(String marketAssetValuationProcedureSchedule) {
        this.marketAssetValuationProcedureSchedule = marketAssetValuationProcedureSchedule;
    }

    public String getMarketAssetValuationProcedureSchedule() {
        return marketAssetValuationProcedureSchedule;
    }

    public void setMarketAssetValuationProcedureStatus(String marketAssetValuationProcedureStatus) {
        this.marketAssetValuationProcedureStatus = marketAssetValuationProcedureStatus;
    }

    public String getMarketAssetValuationProcedureStatus() {
        return marketAssetValuationProcedureStatus;
    }

    public void setMarketAssetValuationProcedureAssociatedPartyReference(String marketAssetValuationProcedureAssociatedPartyReference) {
        this.marketAssetValuationProcedureAssociatedPartyReference = marketAssetValuationProcedureAssociatedPartyReference;
    }

    public String getMarketAssetValuationProcedureAssociatedPartyReference() {
        return marketAssetValuationProcedureAssociatedPartyReference;
    }

    public void setMarketAssetValuationProcedureBusinessUnitReference(String marketAssetValuationProcedureBusinessUnitReference) {
        this.marketAssetValuationProcedureBusinessUnitReference = marketAssetValuationProcedureBusinessUnitReference;
    }

    public String getMarketAssetValuationProcedureBusinessUnitReference() {
        return marketAssetValuationProcedureBusinessUnitReference;
    }

    public void setMarketAssetValuationProcedureServiceProviderReference(String marketAssetValuationProcedureServiceProviderReference) {
        this.marketAssetValuationProcedureServiceProviderReference = marketAssetValuationProcedureServiceProviderReference;
    }

    public String getMarketAssetValuationProcedureServiceProviderReference() {
        return marketAssetValuationProcedureServiceProviderReference;
    }

    public void setMarketAssetValuationProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility marketAssetValuationProcedureFinancialFacilityReference) {
        this.marketAssetValuationProcedureFinancialFacilityReference = marketAssetValuationProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getMarketAssetValuationProcedureFinancialFacilityReference() {
        return marketAssetValuationProcedureFinancialFacilityReference;
    }

    public void setMarketAssetValuationProcedureEmployeeReference(String marketAssetValuationProcedureEmployeeReference) {
        this.marketAssetValuationProcedureEmployeeReference = marketAssetValuationProcedureEmployeeReference;
    }

    public String getMarketAssetValuationProcedureEmployeeReference() {
        return marketAssetValuationProcedureEmployeeReference;
    }

    public void setMarketAssetValuationProcedureCustomerReference(String marketAssetValuationProcedureCustomerReference) {
        this.marketAssetValuationProcedureCustomerReference = marketAssetValuationProcedureCustomerReference;
    }

    public String getMarketAssetValuationProcedureCustomerReference() {
        return marketAssetValuationProcedureCustomerReference;
    }

    public void setMarketAssetValuationProcedureType(String marketAssetValuationProcedureType) {
        this.marketAssetValuationProcedureType = marketAssetValuationProcedureType;
    }

    public String getMarketAssetValuationProcedureType() {
        return marketAssetValuationProcedureType;
    }

    public void setMarketAssetValuationProcedureServiceProviderSchedule(String marketAssetValuationProcedureServiceProviderSchedule) {
        this.marketAssetValuationProcedureServiceProviderSchedule = marketAssetValuationProcedureServiceProviderSchedule;
    }

    public String getMarketAssetValuationProcedureServiceProviderSchedule() {
        return marketAssetValuationProcedureServiceProviderSchedule;
    }

    public void setMarketAssetValuationProcedureServiceType(String marketAssetValuationProcedureServiceType) {
        this.marketAssetValuationProcedureServiceType = marketAssetValuationProcedureServiceType;
    }

    public String getMarketAssetValuationProcedureServiceType() {
        return marketAssetValuationProcedureServiceType;
    }

    public void setMarketAssetValuationProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct marketAssetValuationProcedureProductandServiceInstance) {
        this.marketAssetValuationProcedureProductandServiceInstance = marketAssetValuationProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getMarketAssetValuationProcedureProductandServiceInstance() {
        return marketAssetValuationProcedureProductandServiceInstance;
    }

    public void setMarketAssetValuationProcedureTransaction(org.museframework.bian.classes.Transaction marketAssetValuationProcedureTransaction) {
        this.marketAssetValuationProcedureTransaction = marketAssetValuationProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getMarketAssetValuationProcedureTransaction() {
        return marketAssetValuationProcedureTransaction;
    }

    public void setMarketAssetValuationProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement marketAssetValuationProcedureFinancialTransactionArrangement) {
        this.marketAssetValuationProcedureFinancialTransactionArrangement = marketAssetValuationProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getMarketAssetValuationProcedureFinancialTransactionArrangement() {
        return marketAssetValuationProcedureFinancialTransactionArrangement;
    }

    public void setMarketAssetValuationProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement marketAssetValuationProcedureCustomerAgreementReference) {
        this.marketAssetValuationProcedureCustomerAgreementReference = marketAssetValuationProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getMarketAssetValuationProcedureCustomerAgreementReference() {
        return marketAssetValuationProcedureCustomerAgreementReference;
    }

    public void setMarketAssetValuationProcedureReference(org.museframework.bian.classes.Procedure marketAssetValuationProcedureReference) {
        this.marketAssetValuationProcedureReference = marketAssetValuationProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getMarketAssetValuationProcedureReference() {
        return marketAssetValuationProcedureReference;
    }
}