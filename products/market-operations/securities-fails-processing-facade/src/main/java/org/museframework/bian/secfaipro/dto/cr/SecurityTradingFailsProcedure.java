/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Securities Fails Processing. */
package org.museframework.bian.secfaipro.dto.cr;

public class SecurityTradingFailsProcedure {
    /*A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureParameterType;

    /*A selected optional business service as subject matter of Security Trading Fails Procedure*/
    private org.museframework.bian.classes.Feature securityTradingFailsProcedureSelectedOption;

    /*Request to process Security Trading Fails Procedure*/
    private org.museframework.bian.classes.Instruction securityTradingFailsProcedureRequest;

    /*Timetable to process Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureSchedule;

    /*The status of Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureStatus;

    /*Reference to the party who is involved in Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureAssociatedPartyReference;

    /*Reference to the business unit which is involved in Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureBusinessUnitReference;

    /*Reference to the party who is the service provider of Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureServiceProviderReference;

    /*Reference to the Financial Facility related to Security Trading Fails Procedure*/
    private org.museframework.bian.classes.FinancialFacility securityTradingFailsProcedureFinancialFacilityReference;

    /*Reference to the employee who is involved in Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureEmployeeReference;

    /*Reference to the customer who is involved in Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureCustomerReference;

    /*A Classification value that distinguishes between the type of process undertaken within Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureType;

    /*The schedule according to which the service provider will process the Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services in Security Trading Fails Procedure*/
    private String securityTradingFailsProcedureServiceType;

    /*Reference to the product or service that is related to Security Trading Fails Procedure*/
    private org.museframework.bian.classes.BankingProduct securityTradingFailsProcedureProductandServiceInstance;

    /*Reference to the transaction that is related to Security Trading Fails Procedure*/
    private org.museframework.bian.classes.Transaction securityTradingFailsProcedureTransaction;

    /*Reference to the Financial Transaction Arrangement that is related to Security Trading Fails Procedure*/
    private org.museframework.bian.classes.Arrangement securityTradingFailsProcedureFinancialTransactionArrangement;

    /*Reference to the Customer Agreement that is related to Security Trading Fails Procedure*/
    private org.museframework.bian.classes.Agreement securityTradingFailsProcedureCustomerAgreementReference;

    /*An unique reference to an item or an occurrence of Security Trading Fails Procedure*/
    private org.museframework.bian.classes.Procedure securityTradingFailsProcedureReference;

    public void setSecurityTradingFailsProcedureParameterType(String securityTradingFailsProcedureParameterType) {
        this.securityTradingFailsProcedureParameterType = securityTradingFailsProcedureParameterType;
    }

    public String getSecurityTradingFailsProcedureParameterType() {
        return securityTradingFailsProcedureParameterType;
    }

    public void setSecurityTradingFailsProcedureSelectedOption(org.museframework.bian.classes.Feature securityTradingFailsProcedureSelectedOption) {
        this.securityTradingFailsProcedureSelectedOption = securityTradingFailsProcedureSelectedOption;
    }

    public org.museframework.bian.classes.Feature getSecurityTradingFailsProcedureSelectedOption() {
        return securityTradingFailsProcedureSelectedOption;
    }

    public void setSecurityTradingFailsProcedureRequest(org.museframework.bian.classes.Instruction securityTradingFailsProcedureRequest) {
        this.securityTradingFailsProcedureRequest = securityTradingFailsProcedureRequest;
    }

    public org.museframework.bian.classes.Instruction getSecurityTradingFailsProcedureRequest() {
        return securityTradingFailsProcedureRequest;
    }

    public void setSecurityTradingFailsProcedureSchedule(String securityTradingFailsProcedureSchedule) {
        this.securityTradingFailsProcedureSchedule = securityTradingFailsProcedureSchedule;
    }

    public String getSecurityTradingFailsProcedureSchedule() {
        return securityTradingFailsProcedureSchedule;
    }

    public void setSecurityTradingFailsProcedureStatus(String securityTradingFailsProcedureStatus) {
        this.securityTradingFailsProcedureStatus = securityTradingFailsProcedureStatus;
    }

    public String getSecurityTradingFailsProcedureStatus() {
        return securityTradingFailsProcedureStatus;
    }

    public void setSecurityTradingFailsProcedureAssociatedPartyReference(String securityTradingFailsProcedureAssociatedPartyReference) {
        this.securityTradingFailsProcedureAssociatedPartyReference = securityTradingFailsProcedureAssociatedPartyReference;
    }

    public String getSecurityTradingFailsProcedureAssociatedPartyReference() {
        return securityTradingFailsProcedureAssociatedPartyReference;
    }

    public void setSecurityTradingFailsProcedureBusinessUnitReference(String securityTradingFailsProcedureBusinessUnitReference) {
        this.securityTradingFailsProcedureBusinessUnitReference = securityTradingFailsProcedureBusinessUnitReference;
    }

    public String getSecurityTradingFailsProcedureBusinessUnitReference() {
        return securityTradingFailsProcedureBusinessUnitReference;
    }

    public void setSecurityTradingFailsProcedureServiceProviderReference(String securityTradingFailsProcedureServiceProviderReference) {
        this.securityTradingFailsProcedureServiceProviderReference = securityTradingFailsProcedureServiceProviderReference;
    }

    public String getSecurityTradingFailsProcedureServiceProviderReference() {
        return securityTradingFailsProcedureServiceProviderReference;
    }

    public void setSecurityTradingFailsProcedureFinancialFacilityReference(org.museframework.bian.classes.FinancialFacility securityTradingFailsProcedureFinancialFacilityReference) {
        this.securityTradingFailsProcedureFinancialFacilityReference = securityTradingFailsProcedureFinancialFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getSecurityTradingFailsProcedureFinancialFacilityReference() {
        return securityTradingFailsProcedureFinancialFacilityReference;
    }

    public void setSecurityTradingFailsProcedureEmployeeReference(String securityTradingFailsProcedureEmployeeReference) {
        this.securityTradingFailsProcedureEmployeeReference = securityTradingFailsProcedureEmployeeReference;
    }

    public String getSecurityTradingFailsProcedureEmployeeReference() {
        return securityTradingFailsProcedureEmployeeReference;
    }

    public void setSecurityTradingFailsProcedureCustomerReference(String securityTradingFailsProcedureCustomerReference) {
        this.securityTradingFailsProcedureCustomerReference = securityTradingFailsProcedureCustomerReference;
    }

    public String getSecurityTradingFailsProcedureCustomerReference() {
        return securityTradingFailsProcedureCustomerReference;
    }

    public void setSecurityTradingFailsProcedureType(String securityTradingFailsProcedureType) {
        this.securityTradingFailsProcedureType = securityTradingFailsProcedureType;
    }

    public String getSecurityTradingFailsProcedureType() {
        return securityTradingFailsProcedureType;
    }

    public void setSecurityTradingFailsProcedureServiceProviderSchedule(String securityTradingFailsProcedureServiceProviderSchedule) {
        this.securityTradingFailsProcedureServiceProviderSchedule = securityTradingFailsProcedureServiceProviderSchedule;
    }

    public String getSecurityTradingFailsProcedureServiceProviderSchedule() {
        return securityTradingFailsProcedureServiceProviderSchedule;
    }

    public void setSecurityTradingFailsProcedureServiceType(String securityTradingFailsProcedureServiceType) {
        this.securityTradingFailsProcedureServiceType = securityTradingFailsProcedureServiceType;
    }

    public String getSecurityTradingFailsProcedureServiceType() {
        return securityTradingFailsProcedureServiceType;
    }

    public void setSecurityTradingFailsProcedureProductandServiceInstance(org.museframework.bian.classes.BankingProduct securityTradingFailsProcedureProductandServiceInstance) {
        this.securityTradingFailsProcedureProductandServiceInstance = securityTradingFailsProcedureProductandServiceInstance;
    }

    public org.museframework.bian.classes.BankingProduct getSecurityTradingFailsProcedureProductandServiceInstance() {
        return securityTradingFailsProcedureProductandServiceInstance;
    }

    public void setSecurityTradingFailsProcedureTransaction(org.museframework.bian.classes.Transaction securityTradingFailsProcedureTransaction) {
        this.securityTradingFailsProcedureTransaction = securityTradingFailsProcedureTransaction;
    }

    public org.museframework.bian.classes.Transaction getSecurityTradingFailsProcedureTransaction() {
        return securityTradingFailsProcedureTransaction;
    }

    public void setSecurityTradingFailsProcedureFinancialTransactionArrangement(org.museframework.bian.classes.Arrangement securityTradingFailsProcedureFinancialTransactionArrangement) {
        this.securityTradingFailsProcedureFinancialTransactionArrangement = securityTradingFailsProcedureFinancialTransactionArrangement;
    }

    public org.museframework.bian.classes.Arrangement getSecurityTradingFailsProcedureFinancialTransactionArrangement() {
        return securityTradingFailsProcedureFinancialTransactionArrangement;
    }

    public void setSecurityTradingFailsProcedureCustomerAgreementReference(org.museframework.bian.classes.Agreement securityTradingFailsProcedureCustomerAgreementReference) {
        this.securityTradingFailsProcedureCustomerAgreementReference = securityTradingFailsProcedureCustomerAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getSecurityTradingFailsProcedureCustomerAgreementReference() {
        return securityTradingFailsProcedureCustomerAgreementReference;
    }

    public void setSecurityTradingFailsProcedureReference(org.museframework.bian.classes.Procedure securityTradingFailsProcedureReference) {
        this.securityTradingFailsProcedureReference = securityTradingFailsProcedureReference;
    }

    public org.museframework.bian.classes.Procedure getSecurityTradingFailsProcedureReference() {
        return securityTradingFailsProcedureReference;
    }
}