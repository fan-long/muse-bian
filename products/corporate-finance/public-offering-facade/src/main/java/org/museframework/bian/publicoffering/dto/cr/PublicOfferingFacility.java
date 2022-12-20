/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Public Offering. */
package org.museframework.bian.publicoffering.dto.cr;

public class PublicOfferingFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Public Offering Facility*/
    private String publicOfferingFacilityParameterType;

    /*A selected optional product feature as subject matter of Public Offering Facility*/
    private org.museframework.bian.classes.Feature publicOfferingFacilitySelectedOption;

    /*The status of Public Offering Facility*/
    private String publicOfferingFacilityStatus;

    /*Reference to the party who is involved in Public Offering Facility*/
    private String publicOfferingFacilityAssociatedParty;

    /*The curreny which is arranged in Public Offering Facility*/
    private String publicOfferingFacilityCurrency;

    /*Reference to the regulation which is defined in Public Offering Facility*/
    private org.museframework.bian.classes.RuleSet publicOfferingFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Public Offering Facility*/
    private String publicOfferingFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Public Offering Facility in case of legal dispute.*/
    private org.museframework.bian.classes.Jurisdiction publicOfferingFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Public Offering Facility, are entered.*/
    private org.museframework.bian.classes.BusinessUnit publicOfferingFacilityBookingLocation;

    /*Reference to the account which is linked to Public Offering Facility*/
    private org.museframework.bian.classes.Account publicOfferingFacilityAccountReference;

    /*Reference to the customer who is involved in Public Offering Facility*/
    private String publicOfferingFacilityCustomerReference;

    /*The position of Public Offering Facility*/
    private org.museframework.bian.classes.Position publicOfferingFacilityPosition;

    /*Reference to the product which is linked to Public Offering Facility*/
    private org.museframework.bian.classes.BankingProduct publicOfferingFacilityProductReference;

    /*Reference to the limitation related to the position of Public Offering Facility*/
    private org.museframework.bian.classes.LimitArrangement publicOfferingFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Public Offering Facility*/
    private org.museframework.bian.classes.FinancialFacility publicOfferingFacilityReference;

    public void setPublicOfferingFacilityParameterType(String publicOfferingFacilityParameterType) {
        this.publicOfferingFacilityParameterType = publicOfferingFacilityParameterType;
    }

    public String getPublicOfferingFacilityParameterType() {
        return publicOfferingFacilityParameterType;
    }

    public void setPublicOfferingFacilitySelectedOption(org.museframework.bian.classes.Feature publicOfferingFacilitySelectedOption) {
        this.publicOfferingFacilitySelectedOption = publicOfferingFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getPublicOfferingFacilitySelectedOption() {
        return publicOfferingFacilitySelectedOption;
    }

    public void setPublicOfferingFacilityStatus(String publicOfferingFacilityStatus) {
        this.publicOfferingFacilityStatus = publicOfferingFacilityStatus;
    }

    public String getPublicOfferingFacilityStatus() {
        return publicOfferingFacilityStatus;
    }

    public void setPublicOfferingFacilityAssociatedParty(String publicOfferingFacilityAssociatedParty) {
        this.publicOfferingFacilityAssociatedParty = publicOfferingFacilityAssociatedParty;
    }

    public String getPublicOfferingFacilityAssociatedParty() {
        return publicOfferingFacilityAssociatedParty;
    }

    public void setPublicOfferingFacilityCurrency(String publicOfferingFacilityCurrency) {
        this.publicOfferingFacilityCurrency = publicOfferingFacilityCurrency;
    }

    public String getPublicOfferingFacilityCurrency() {
        return publicOfferingFacilityCurrency;
    }

    public void setPublicOfferingFacilityRegulationReference(org.museframework.bian.classes.RuleSet publicOfferingFacilityRegulationReference) {
        this.publicOfferingFacilityRegulationReference = publicOfferingFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getPublicOfferingFacilityRegulationReference() {
        return publicOfferingFacilityRegulationReference;
    }

    public void setPublicOfferingFacilityRegulationType(String publicOfferingFacilityRegulationType) {
        this.publicOfferingFacilityRegulationType = publicOfferingFacilityRegulationType;
    }

    public String getPublicOfferingFacilityRegulationType() {
        return publicOfferingFacilityRegulationType;
    }

    public void setPublicOfferingFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction publicOfferingFacilityJurisdiction) {
        this.publicOfferingFacilityJurisdiction = publicOfferingFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getPublicOfferingFacilityJurisdiction() {
        return publicOfferingFacilityJurisdiction;
    }

    public void setPublicOfferingFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit publicOfferingFacilityBookingLocation) {
        this.publicOfferingFacilityBookingLocation = publicOfferingFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getPublicOfferingFacilityBookingLocation() {
        return publicOfferingFacilityBookingLocation;
    }

    public void setPublicOfferingFacilityAccountReference(org.museframework.bian.classes.Account publicOfferingFacilityAccountReference) {
        this.publicOfferingFacilityAccountReference = publicOfferingFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getPublicOfferingFacilityAccountReference() {
        return publicOfferingFacilityAccountReference;
    }

    public void setPublicOfferingFacilityCustomerReference(String publicOfferingFacilityCustomerReference) {
        this.publicOfferingFacilityCustomerReference = publicOfferingFacilityCustomerReference;
    }

    public String getPublicOfferingFacilityCustomerReference() {
        return publicOfferingFacilityCustomerReference;
    }

    public void setPublicOfferingFacilityPosition(org.museframework.bian.classes.Position publicOfferingFacilityPosition) {
        this.publicOfferingFacilityPosition = publicOfferingFacilityPosition;
    }

    public org.museframework.bian.classes.Position getPublicOfferingFacilityPosition() {
        return publicOfferingFacilityPosition;
    }

    public void setPublicOfferingFacilityProductReference(org.museframework.bian.classes.BankingProduct publicOfferingFacilityProductReference) {
        this.publicOfferingFacilityProductReference = publicOfferingFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getPublicOfferingFacilityProductReference() {
        return publicOfferingFacilityProductReference;
    }

    public void setPublicOfferingFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement publicOfferingFacilityPositionLimit) {
        this.publicOfferingFacilityPositionLimit = publicOfferingFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getPublicOfferingFacilityPositionLimit() {
        return publicOfferingFacilityPositionLimit;
    }

    public void setPublicOfferingFacilityReference(org.museframework.bian.classes.FinancialFacility publicOfferingFacilityReference) {
        this.publicOfferingFacilityReference = publicOfferingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getPublicOfferingFacilityReference() {
        return publicOfferingFacilityReference;
    }
}