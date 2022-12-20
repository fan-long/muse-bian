/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Factoring. */
package org.museframework.bian.factoring.dto.cr;

public class FactoringFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Factoring Facility*/
    private String factoringFacilityParameterType;

    /*A selected optional product feature as subject matter of Factoring Facility*/
    private org.museframework.bian.classes.Feature factoringFacilitySelectedOption;

    /*The status of Factoring Facility*/
    private String factoringFacilityStatus;

    /*Reference to the party who is involved in Factoring Facility*/
    private String factoringFacilityAssociatedParty;

    /*The curreny which is arranged in Factoring Facility*/
    private String factoringFacilityCurrency;

    /*Reference to the regulation which is defined in Factoring Facility*/
    private org.museframework.bian.classes.RuleSet factoringFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Factoring Facility*/
    private String factoringFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Factoring Facility in case of legal dispute.*/
    private org.museframework.bian.classes.Jurisdiction factoringFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Factoring Facility, are entered.*/
    private org.museframework.bian.classes.BusinessUnit factoringFacilityBookingLocation;

    /*Reference to the account which is linked to Factoring Facility*/
    private org.museframework.bian.classes.Account factoringFacilityAccountReference;

    /*Reference to the customer who is involved in Factoring Facility*/
    private String factoringFacilityCustomerReference;

    /*The position of Factoring Facility*/
    private org.museframework.bian.classes.Position factoringFacilityPosition;

    /*Reference to the product which is linked to Factoring Facility*/
    private org.museframework.bian.classes.BankingProduct factoringFacilityProductReference;

    /*Reference to the limitation related to the position of Factoring Facility*/
    private org.museframework.bian.classes.LimitArrangement factoringFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Factoring Facility*/
    private org.museframework.bian.classes.FinancialFacility factoringFacilityReference;

    public void setFactoringFacilityParameterType(String factoringFacilityParameterType) {
        this.factoringFacilityParameterType = factoringFacilityParameterType;
    }

    public String getFactoringFacilityParameterType() {
        return factoringFacilityParameterType;
    }

    public void setFactoringFacilitySelectedOption(org.museframework.bian.classes.Feature factoringFacilitySelectedOption) {
        this.factoringFacilitySelectedOption = factoringFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getFactoringFacilitySelectedOption() {
        return factoringFacilitySelectedOption;
    }

    public void setFactoringFacilityStatus(String factoringFacilityStatus) {
        this.factoringFacilityStatus = factoringFacilityStatus;
    }

    public String getFactoringFacilityStatus() {
        return factoringFacilityStatus;
    }

    public void setFactoringFacilityAssociatedParty(String factoringFacilityAssociatedParty) {
        this.factoringFacilityAssociatedParty = factoringFacilityAssociatedParty;
    }

    public String getFactoringFacilityAssociatedParty() {
        return factoringFacilityAssociatedParty;
    }

    public void setFactoringFacilityCurrency(String factoringFacilityCurrency) {
        this.factoringFacilityCurrency = factoringFacilityCurrency;
    }

    public String getFactoringFacilityCurrency() {
        return factoringFacilityCurrency;
    }

    public void setFactoringFacilityRegulationReference(org.museframework.bian.classes.RuleSet factoringFacilityRegulationReference) {
        this.factoringFacilityRegulationReference = factoringFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getFactoringFacilityRegulationReference() {
        return factoringFacilityRegulationReference;
    }

    public void setFactoringFacilityRegulationType(String factoringFacilityRegulationType) {
        this.factoringFacilityRegulationType = factoringFacilityRegulationType;
    }

    public String getFactoringFacilityRegulationType() {
        return factoringFacilityRegulationType;
    }

    public void setFactoringFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction factoringFacilityJurisdiction) {
        this.factoringFacilityJurisdiction = factoringFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getFactoringFacilityJurisdiction() {
        return factoringFacilityJurisdiction;
    }

    public void setFactoringFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit factoringFacilityBookingLocation) {
        this.factoringFacilityBookingLocation = factoringFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getFactoringFacilityBookingLocation() {
        return factoringFacilityBookingLocation;
    }

    public void setFactoringFacilityAccountReference(org.museframework.bian.classes.Account factoringFacilityAccountReference) {
        this.factoringFacilityAccountReference = factoringFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getFactoringFacilityAccountReference() {
        return factoringFacilityAccountReference;
    }

    public void setFactoringFacilityCustomerReference(String factoringFacilityCustomerReference) {
        this.factoringFacilityCustomerReference = factoringFacilityCustomerReference;
    }

    public String getFactoringFacilityCustomerReference() {
        return factoringFacilityCustomerReference;
    }

    public void setFactoringFacilityPosition(org.museframework.bian.classes.Position factoringFacilityPosition) {
        this.factoringFacilityPosition = factoringFacilityPosition;
    }

    public org.museframework.bian.classes.Position getFactoringFacilityPosition() {
        return factoringFacilityPosition;
    }

    public void setFactoringFacilityProductReference(org.museframework.bian.classes.BankingProduct factoringFacilityProductReference) {
        this.factoringFacilityProductReference = factoringFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getFactoringFacilityProductReference() {
        return factoringFacilityProductReference;
    }

    public void setFactoringFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement factoringFacilityPositionLimit) {
        this.factoringFacilityPositionLimit = factoringFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getFactoringFacilityPositionLimit() {
        return factoringFacilityPositionLimit;
    }

    public void setFactoringFacilityReference(org.museframework.bian.classes.FinancialFacility factoringFacilityReference) {
        this.factoringFacilityReference = factoringFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getFactoringFacilityReference() {
        return factoringFacilityReference;
    }
}