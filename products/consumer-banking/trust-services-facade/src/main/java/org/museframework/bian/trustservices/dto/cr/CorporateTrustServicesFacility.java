/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Trust Services. */
package org.museframework.bian.trustservices.dto.cr;

public class CorporateTrustServicesFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Corporate Trust Services Facility*/
    private String corporateTrustServicesFacilityParameterType;

    /*A selected optional product feature as subject matter of Corporate Trust Services Facility*/
    private org.museframework.bian.classes.Feature corporateTrustServicesFacilitySelectedOption;

    /*The status of Corporate Trust Services Facility*/
    private String corporateTrustServicesFacilityStatus;

    /*Reference to the party who is involved in Corporate Trust Services Facility*/
    private String corporateTrustServicesFacilityAssociatedParty;

    /*The curreny which is arranged in Corporate Trust Services Facility*/
    private String corporateTrustServicesFacilityCurrency;

    /*Reference to the regulation which is defined in Corporate Trust Services Facility*/
    private org.museframework.bian.classes.RuleSet corporateTrustServicesFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Corporate Trust Services Facility*/
    private String corporateTrustServicesFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Corporate Trust Services Facility in case of legal dispute.*/
    private org.museframework.bian.classes.Jurisdiction corporateTrustServicesFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Corporate Trust Services Facility, are entered.*/
    private org.museframework.bian.classes.BusinessUnit corporateTrustServicesFacilityBookingLocation;

    /*Reference to the account which is linked to Corporate Trust Services Facility*/
    private org.museframework.bian.classes.Account corporateTrustServicesFacilityAccountReference;

    /*Reference to the customer who is involved in Corporate Trust Services Facility*/
    private String corporateTrustServicesFacilityCustomerReference;

    /*The position of Corporate Trust Services Facility*/
    private org.museframework.bian.classes.Position corporateTrustServicesFacilityPosition;

    /*Reference to the product which is linked to Corporate Trust Services Facility*/
    private org.museframework.bian.classes.BankingProduct corporateTrustServicesFacilityProductReference;

    /*Reference to the limitation related to the position of Corporate Trust Services Facility*/
    private org.museframework.bian.classes.LimitArrangement corporateTrustServicesFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Corporate Trust Services Facility*/
    private org.museframework.bian.classes.FinancialFacility corporateTrustServicesFacilityReference;

    public void setCorporateTrustServicesFacilityParameterType(String corporateTrustServicesFacilityParameterType) {
        this.corporateTrustServicesFacilityParameterType = corporateTrustServicesFacilityParameterType;
    }

    public String getCorporateTrustServicesFacilityParameterType() {
        return corporateTrustServicesFacilityParameterType;
    }

    public void setCorporateTrustServicesFacilitySelectedOption(org.museframework.bian.classes.Feature corporateTrustServicesFacilitySelectedOption) {
        this.corporateTrustServicesFacilitySelectedOption = corporateTrustServicesFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getCorporateTrustServicesFacilitySelectedOption() {
        return corporateTrustServicesFacilitySelectedOption;
    }

    public void setCorporateTrustServicesFacilityStatus(String corporateTrustServicesFacilityStatus) {
        this.corporateTrustServicesFacilityStatus = corporateTrustServicesFacilityStatus;
    }

    public String getCorporateTrustServicesFacilityStatus() {
        return corporateTrustServicesFacilityStatus;
    }

    public void setCorporateTrustServicesFacilityAssociatedParty(String corporateTrustServicesFacilityAssociatedParty) {
        this.corporateTrustServicesFacilityAssociatedParty = corporateTrustServicesFacilityAssociatedParty;
    }

    public String getCorporateTrustServicesFacilityAssociatedParty() {
        return corporateTrustServicesFacilityAssociatedParty;
    }

    public void setCorporateTrustServicesFacilityCurrency(String corporateTrustServicesFacilityCurrency) {
        this.corporateTrustServicesFacilityCurrency = corporateTrustServicesFacilityCurrency;
    }

    public String getCorporateTrustServicesFacilityCurrency() {
        return corporateTrustServicesFacilityCurrency;
    }

    public void setCorporateTrustServicesFacilityRegulationReference(org.museframework.bian.classes.RuleSet corporateTrustServicesFacilityRegulationReference) {
        this.corporateTrustServicesFacilityRegulationReference = corporateTrustServicesFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getCorporateTrustServicesFacilityRegulationReference() {
        return corporateTrustServicesFacilityRegulationReference;
    }

    public void setCorporateTrustServicesFacilityRegulationType(String corporateTrustServicesFacilityRegulationType) {
        this.corporateTrustServicesFacilityRegulationType = corporateTrustServicesFacilityRegulationType;
    }

    public String getCorporateTrustServicesFacilityRegulationType() {
        return corporateTrustServicesFacilityRegulationType;
    }

    public void setCorporateTrustServicesFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction corporateTrustServicesFacilityJurisdiction) {
        this.corporateTrustServicesFacilityJurisdiction = corporateTrustServicesFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getCorporateTrustServicesFacilityJurisdiction() {
        return corporateTrustServicesFacilityJurisdiction;
    }

    public void setCorporateTrustServicesFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit corporateTrustServicesFacilityBookingLocation) {
        this.corporateTrustServicesFacilityBookingLocation = corporateTrustServicesFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getCorporateTrustServicesFacilityBookingLocation() {
        return corporateTrustServicesFacilityBookingLocation;
    }

    public void setCorporateTrustServicesFacilityAccountReference(org.museframework.bian.classes.Account corporateTrustServicesFacilityAccountReference) {
        this.corporateTrustServicesFacilityAccountReference = corporateTrustServicesFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getCorporateTrustServicesFacilityAccountReference() {
        return corporateTrustServicesFacilityAccountReference;
    }

    public void setCorporateTrustServicesFacilityCustomerReference(String corporateTrustServicesFacilityCustomerReference) {
        this.corporateTrustServicesFacilityCustomerReference = corporateTrustServicesFacilityCustomerReference;
    }

    public String getCorporateTrustServicesFacilityCustomerReference() {
        return corporateTrustServicesFacilityCustomerReference;
    }

    public void setCorporateTrustServicesFacilityPosition(org.museframework.bian.classes.Position corporateTrustServicesFacilityPosition) {
        this.corporateTrustServicesFacilityPosition = corporateTrustServicesFacilityPosition;
    }

    public org.museframework.bian.classes.Position getCorporateTrustServicesFacilityPosition() {
        return corporateTrustServicesFacilityPosition;
    }

    public void setCorporateTrustServicesFacilityProductReference(org.museframework.bian.classes.BankingProduct corporateTrustServicesFacilityProductReference) {
        this.corporateTrustServicesFacilityProductReference = corporateTrustServicesFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getCorporateTrustServicesFacilityProductReference() {
        return corporateTrustServicesFacilityProductReference;
    }

    public void setCorporateTrustServicesFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement corporateTrustServicesFacilityPositionLimit) {
        this.corporateTrustServicesFacilityPositionLimit = corporateTrustServicesFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getCorporateTrustServicesFacilityPositionLimit() {
        return corporateTrustServicesFacilityPositionLimit;
    }

    public void setCorporateTrustServicesFacilityReference(org.museframework.bian.classes.FinancialFacility corporateTrustServicesFacilityReference) {
        this.corporateTrustServicesFacilityReference = corporateTrustServicesFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getCorporateTrustServicesFacilityReference() {
        return corporateTrustServicesFacilityReference;
    }
}