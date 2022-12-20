/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Notional Pooling. */
package org.museframework.bian.notionalpooling.dto.cr;

public class NotionalPoolingFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Notional Pooling Facility*/
    private String notionalPoolingFacilityParameterType;

    /*A selected optional product feature as subject matter of Notional Pooling Facility*/
    private org.museframework.bian.classes.Feature notionalPoolingFacilitySelectedOption;

    /*The status of Notional Pooling Facility*/
    private String notionalPoolingFacilityStatus;

    /*Reference to the party who is involved in Notional Pooling Facility*/
    private String notionalPoolingFacilityAssociatedParty;

    /*The curreny which is arranged in Notional Pooling Facility*/
    private String notionalPoolingFacilityCurrency;

    /*Reference to the regulation which is defined in Notional Pooling Facility*/
    private org.museframework.bian.classes.RuleSet notionalPoolingFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Notional Pooling Facility*/
    private String notionalPoolingFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Notional Pooling Facility in case of legal dispute.*/
    private org.museframework.bian.classes.Jurisdiction notionalPoolingFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Notional Pooling Facility, are entered.*/
    private org.museframework.bian.classes.BusinessUnit notionalPoolingFacilityBookingLocation;

    /*Reference to the account which is linked to Notional Pooling Facility*/
    private org.museframework.bian.classes.Account notionalPoolingFacilityAccountReference;

    /*Reference to the customer who is involved in Notional Pooling Facility*/
    private String notionalPoolingFacilityCustomerReference;

    /*The position of Notional Pooling Facility*/
    private org.museframework.bian.classes.Position notionalPoolingFacilityPosition;

    /*Reference to the product which is linked to Notional Pooling Facility*/
    private org.museframework.bian.classes.BankingProduct notionalPoolingFacilityProductReference;

    /*Reference to the limitation related to the position of Notional Pooling Facility*/
    private org.museframework.bian.classes.LimitArrangement notionalPoolingFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Notional Pooling Facility*/
    private org.museframework.bian.classes.FinancialFacility notionalPoolingFacilityReference;

    public void setNotionalPoolingFacilityParameterType(String notionalPoolingFacilityParameterType) {
        this.notionalPoolingFacilityParameterType = notionalPoolingFacilityParameterType;
    }

    public String getNotionalPoolingFacilityParameterType() {
        return notionalPoolingFacilityParameterType;
    }

    public void setNotionalPoolingFacilitySelectedOption(org.museframework.bian.classes.Feature notionalPoolingFacilitySelectedOption) {
        this.notionalPoolingFacilitySelectedOption = notionalPoolingFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getNotionalPoolingFacilitySelectedOption() {
        return notionalPoolingFacilitySelectedOption;
    }

    public void setNotionalPoolingFacilityStatus(String notionalPoolingFacilityStatus) {
        this.notionalPoolingFacilityStatus = notionalPoolingFacilityStatus;
    }

    public String getNotionalPoolingFacilityStatus() {
        return notionalPoolingFacilityStatus;
    }

    public void setNotionalPoolingFacilityAssociatedParty(String notionalPoolingFacilityAssociatedParty) {
        this.notionalPoolingFacilityAssociatedParty = notionalPoolingFacilityAssociatedParty;
    }

    public String getNotionalPoolingFacilityAssociatedParty() {
        return notionalPoolingFacilityAssociatedParty;
    }

    public void setNotionalPoolingFacilityCurrency(String notionalPoolingFacilityCurrency) {
        this.notionalPoolingFacilityCurrency = notionalPoolingFacilityCurrency;
    }

    public String getNotionalPoolingFacilityCurrency() {
        return notionalPoolingFacilityCurrency;
    }

    public void setNotionalPoolingFacilityRegulationReference(org.museframework.bian.classes.RuleSet notionalPoolingFacilityRegulationReference) {
        this.notionalPoolingFacilityRegulationReference = notionalPoolingFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getNotionalPoolingFacilityRegulationReference() {
        return notionalPoolingFacilityRegulationReference;
    }

    public void setNotionalPoolingFacilityRegulationType(String notionalPoolingFacilityRegulationType) {
        this.notionalPoolingFacilityRegulationType = notionalPoolingFacilityRegulationType;
    }

    public String getNotionalPoolingFacilityRegulationType() {
        return notionalPoolingFacilityRegulationType;
    }

    public void setNotionalPoolingFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction notionalPoolingFacilityJurisdiction) {
        this.notionalPoolingFacilityJurisdiction = notionalPoolingFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getNotionalPoolingFacilityJurisdiction() {
        return notionalPoolingFacilityJurisdiction;
    }

    public void setNotionalPoolingFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit notionalPoolingFacilityBookingLocation) {
        this.notionalPoolingFacilityBookingLocation = notionalPoolingFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getNotionalPoolingFacilityBookingLocation() {
        return notionalPoolingFacilityBookingLocation;
    }

    public void setNotionalPoolingFacilityAccountReference(org.museframework.bian.classes.Account notionalPoolingFacilityAccountReference) {
        this.notionalPoolingFacilityAccountReference = notionalPoolingFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getNotionalPoolingFacilityAccountReference() {
        return notionalPoolingFacilityAccountReference;
    }

    public void setNotionalPoolingFacilityCustomerReference(String notionalPoolingFacilityCustomerReference) {
        this.notionalPoolingFacilityCustomerReference = notionalPoolingFacilityCustomerReference;
    }

    public String getNotionalPoolingFacilityCustomerReference() {
        return notionalPoolingFacilityCustomerReference;
    }

    public void setNotionalPoolingFacilityPosition(org.museframework.bian.classes.Position notionalPoolingFacilityPosition) {
        this.notionalPoolingFacilityPosition = notionalPoolingFacilityPosition;
    }

    public org.museframework.bian.classes.Position getNotionalPoolingFacilityPosition() {
        return notionalPoolingFacilityPosition;
    }

    public void setNotionalPoolingFacilityProductReference(org.museframework.bian.classes.BankingProduct notionalPoolingFacilityProductReference) {
        this.notionalPoolingFacilityProductReference = notionalPoolingFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getNotionalPoolingFacilityProductReference() {
        return notionalPoolingFacilityProductReference;
    }

    public void setNotionalPoolingFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement notionalPoolingFacilityPositionLimit) {
        this.notionalPoolingFacilityPositionLimit = notionalPoolingFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getNotionalPoolingFacilityPositionLimit() {
        return notionalPoolingFacilityPositionLimit;
    }

    public void setNotionalPoolingFacilityReference(org.museframework.bian.classes.FinancialFacility notionalPoolingFacilityReference) {
        this.notionalPoolingFacilityReference = notionalPoolingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getNotionalPoolingFacilityReference() {
        return notionalPoolingFacilityReference;
    }
}