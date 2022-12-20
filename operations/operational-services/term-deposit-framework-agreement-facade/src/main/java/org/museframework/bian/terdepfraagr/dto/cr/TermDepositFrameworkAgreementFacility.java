/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within <SD>. 
*/
package org.museframework.bian.terdepfraagr.dto.cr;

public class TermDepositFrameworkAgreementFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Term Deposit Framework Agreement Facility*/
    private String termDepositFrameworkAgreementFacilityParameterType;

    /*A selected optional product feature as subject matter of Term Deposit Framework Agreement Facility*/
    private org.museframework.bian.classes.Feature termDepositFrameworkAgreementFacilitySelectedOption;

    /*The status of Term Deposit Framework Agreement Facility*/
    private String termDepositFrameworkAgreementFacilityStatus;

    /*Reference to the party who is involved in Term Deposit Framework Agreement Facility*/
    private String termDepositFrameworkAgreementFacilityAssociatedParty;

    /*The curreny which is arranged in Term Deposit Framework Agreement Facility*/
    private String termDepositFrameworkAgreementFacilityCurrency;

    /*Reference to the regulation which is defined in Term Deposit Framework Agreement Facility*/
    private org.museframework.bian.classes.RuleSet termDepositFrameworkAgreementFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Term Deposit Framework Agreement Facility*/
    private String termDepositFrameworkAgreementFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Term Deposit Framework Agreement Facility in case of legal dispute.*/
    private org.museframework.bian.classes.Jurisdiction termDepositFrameworkAgreementFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Term Deposit Framework Agreement Facility, are entered.*/
    private org.museframework.bian.classes.BusinessUnit termDepositFrameworkAgreementFacilityBookingLocation;

    /*Reference to the account which is linked to Term Deposit Framework Agreement Facility*/
    private org.museframework.bian.classes.Account termDepositFrameworkAgreementFacilityAccountReference;

    /*Reference to the customer who is involved in Term Deposit Framework Agreement Facility*/
    private String termDepositFrameworkAgreementFacilityCustomerReference;

    /*The position of Term Deposit Framework Agreement Facility*/
    private org.museframework.bian.classes.Position termDepositFrameworkAgreementFacilityPosition;

    /*Reference to the product which is linked to Term Deposit Framework Agreement Facility*/
    private org.museframework.bian.classes.BankingProduct termDepositFrameworkAgreementFacilityProductReference;

    /*Reference to the limitation related to the position of Term Deposit Framework Agreement Facility*/
    private org.museframework.bian.classes.LimitArrangement termDepositFrameworkAgreementFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Term Deposit Framework Agreement Facility*/
    private org.museframework.bian.classes.FinancialFacility termDepositFrameworkAgreementFacilityReference;

    public void setTermDepositFrameworkAgreementFacilityParameterType(String termDepositFrameworkAgreementFacilityParameterType) {
        this.termDepositFrameworkAgreementFacilityParameterType = termDepositFrameworkAgreementFacilityParameterType;
    }

    public String getTermDepositFrameworkAgreementFacilityParameterType() {
        return termDepositFrameworkAgreementFacilityParameterType;
    }

    public void setTermDepositFrameworkAgreementFacilitySelectedOption(org.museframework.bian.classes.Feature termDepositFrameworkAgreementFacilitySelectedOption) {
        this.termDepositFrameworkAgreementFacilitySelectedOption = termDepositFrameworkAgreementFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getTermDepositFrameworkAgreementFacilitySelectedOption() {
        return termDepositFrameworkAgreementFacilitySelectedOption;
    }

    public void setTermDepositFrameworkAgreementFacilityStatus(String termDepositFrameworkAgreementFacilityStatus) {
        this.termDepositFrameworkAgreementFacilityStatus = termDepositFrameworkAgreementFacilityStatus;
    }

    public String getTermDepositFrameworkAgreementFacilityStatus() {
        return termDepositFrameworkAgreementFacilityStatus;
    }

    public void setTermDepositFrameworkAgreementFacilityAssociatedParty(String termDepositFrameworkAgreementFacilityAssociatedParty) {
        this.termDepositFrameworkAgreementFacilityAssociatedParty = termDepositFrameworkAgreementFacilityAssociatedParty;
    }

    public String getTermDepositFrameworkAgreementFacilityAssociatedParty() {
        return termDepositFrameworkAgreementFacilityAssociatedParty;
    }

    public void setTermDepositFrameworkAgreementFacilityCurrency(String termDepositFrameworkAgreementFacilityCurrency) {
        this.termDepositFrameworkAgreementFacilityCurrency = termDepositFrameworkAgreementFacilityCurrency;
    }

    public String getTermDepositFrameworkAgreementFacilityCurrency() {
        return termDepositFrameworkAgreementFacilityCurrency;
    }

    public void setTermDepositFrameworkAgreementFacilityRegulationReference(org.museframework.bian.classes.RuleSet termDepositFrameworkAgreementFacilityRegulationReference) {
        this.termDepositFrameworkAgreementFacilityRegulationReference = termDepositFrameworkAgreementFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getTermDepositFrameworkAgreementFacilityRegulationReference() {
        return termDepositFrameworkAgreementFacilityRegulationReference;
    }

    public void setTermDepositFrameworkAgreementFacilityRegulationType(String termDepositFrameworkAgreementFacilityRegulationType) {
        this.termDepositFrameworkAgreementFacilityRegulationType = termDepositFrameworkAgreementFacilityRegulationType;
    }

    public String getTermDepositFrameworkAgreementFacilityRegulationType() {
        return termDepositFrameworkAgreementFacilityRegulationType;
    }

    public void setTermDepositFrameworkAgreementFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction termDepositFrameworkAgreementFacilityJurisdiction) {
        this.termDepositFrameworkAgreementFacilityJurisdiction = termDepositFrameworkAgreementFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getTermDepositFrameworkAgreementFacilityJurisdiction() {
        return termDepositFrameworkAgreementFacilityJurisdiction;
    }

    public void setTermDepositFrameworkAgreementFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit termDepositFrameworkAgreementFacilityBookingLocation) {
        this.termDepositFrameworkAgreementFacilityBookingLocation = termDepositFrameworkAgreementFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getTermDepositFrameworkAgreementFacilityBookingLocation() {
        return termDepositFrameworkAgreementFacilityBookingLocation;
    }

    public void setTermDepositFrameworkAgreementFacilityAccountReference(org.museframework.bian.classes.Account termDepositFrameworkAgreementFacilityAccountReference) {
        this.termDepositFrameworkAgreementFacilityAccountReference = termDepositFrameworkAgreementFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getTermDepositFrameworkAgreementFacilityAccountReference() {
        return termDepositFrameworkAgreementFacilityAccountReference;
    }

    public void setTermDepositFrameworkAgreementFacilityCustomerReference(String termDepositFrameworkAgreementFacilityCustomerReference) {
        this.termDepositFrameworkAgreementFacilityCustomerReference = termDepositFrameworkAgreementFacilityCustomerReference;
    }

    public String getTermDepositFrameworkAgreementFacilityCustomerReference() {
        return termDepositFrameworkAgreementFacilityCustomerReference;
    }

    public void setTermDepositFrameworkAgreementFacilityPosition(org.museframework.bian.classes.Position termDepositFrameworkAgreementFacilityPosition) {
        this.termDepositFrameworkAgreementFacilityPosition = termDepositFrameworkAgreementFacilityPosition;
    }

    public org.museframework.bian.classes.Position getTermDepositFrameworkAgreementFacilityPosition() {
        return termDepositFrameworkAgreementFacilityPosition;
    }

    public void setTermDepositFrameworkAgreementFacilityProductReference(org.museframework.bian.classes.BankingProduct termDepositFrameworkAgreementFacilityProductReference) {
        this.termDepositFrameworkAgreementFacilityProductReference = termDepositFrameworkAgreementFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getTermDepositFrameworkAgreementFacilityProductReference() {
        return termDepositFrameworkAgreementFacilityProductReference;
    }

    public void setTermDepositFrameworkAgreementFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement termDepositFrameworkAgreementFacilityPositionLimit) {
        this.termDepositFrameworkAgreementFacilityPositionLimit = termDepositFrameworkAgreementFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getTermDepositFrameworkAgreementFacilityPositionLimit() {
        return termDepositFrameworkAgreementFacilityPositionLimit;
    }

    public void setTermDepositFrameworkAgreementFacilityReference(org.museframework.bian.classes.FinancialFacility termDepositFrameworkAgreementFacilityReference) {
        this.termDepositFrameworkAgreementFacilityReference = termDepositFrameworkAgreementFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getTermDepositFrameworkAgreementFacilityReference() {
        return termDepositFrameworkAgreementFacilityReference;
    }
}