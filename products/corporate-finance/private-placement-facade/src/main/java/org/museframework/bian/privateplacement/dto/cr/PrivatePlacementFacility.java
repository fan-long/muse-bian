/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Private Placement. */
package org.museframework.bian.privateplacement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PrivatePlacementFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Private Placement Facility*/
    @MetaField(0)
    private String privatePlacementFacilityParameterType;

    /*A selected optional product feature as subject matter of Private Placement Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature privatePlacementFacilitySelectedOption;

    /*The status of Private Placement Facility*/
    @MetaField(0)
    private String privatePlacementFacilityStatus;

    /*Reference to the party who is involved in Private Placement Facility*/
    @MetaField(0)
    private String privatePlacementFacilityAssociatedParty;

    /*The curreny which is arranged in Private Placement Facility*/
    @MetaField(0)
    private String privatePlacementFacilityCurrency;

    /*Reference to the regulation which is defined in Private Placement Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet privatePlacementFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Private Placement Facility*/
    @MetaField(0)
    private String privatePlacementFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Private Placement Facility in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction privatePlacementFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Private Placement Facility, are entered.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessUnit privatePlacementFacilityBookingLocation;

    /*Reference to the account which is linked to Private Placement Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account privatePlacementFacilityAccountReference;

    /*Reference to the customer who is involved in Private Placement Facility*/
    @MetaField(0)
    private String privatePlacementFacilityCustomerReference;

    /*The position of Private Placement Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Position privatePlacementFacilityPosition;

    /*Reference to the product which is linked to Private Placement Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct privatePlacementFacilityProductReference;

    /*Reference to the limitation related to the position of Private Placement Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LimitArrangement privatePlacementFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Private Placement Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility privatePlacementFacilityReference;

    public void setPrivatePlacementFacilityParameterType(String privatePlacementFacilityParameterType) {
        this.privatePlacementFacilityParameterType = privatePlacementFacilityParameterType;
    }

    public String getPrivatePlacementFacilityParameterType() {
        return privatePlacementFacilityParameterType;
    }

    public void setPrivatePlacementFacilitySelectedOption(org.museframework.bian.classes.Feature privatePlacementFacilitySelectedOption) {
        this.privatePlacementFacilitySelectedOption = privatePlacementFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getPrivatePlacementFacilitySelectedOption() {
        return privatePlacementFacilitySelectedOption;
    }

    public void setPrivatePlacementFacilityStatus(String privatePlacementFacilityStatus) {
        this.privatePlacementFacilityStatus = privatePlacementFacilityStatus;
    }

    public String getPrivatePlacementFacilityStatus() {
        return privatePlacementFacilityStatus;
    }

    public void setPrivatePlacementFacilityAssociatedParty(String privatePlacementFacilityAssociatedParty) {
        this.privatePlacementFacilityAssociatedParty = privatePlacementFacilityAssociatedParty;
    }

    public String getPrivatePlacementFacilityAssociatedParty() {
        return privatePlacementFacilityAssociatedParty;
    }

    public void setPrivatePlacementFacilityCurrency(String privatePlacementFacilityCurrency) {
        this.privatePlacementFacilityCurrency = privatePlacementFacilityCurrency;
    }

    public String getPrivatePlacementFacilityCurrency() {
        return privatePlacementFacilityCurrency;
    }

    public void setPrivatePlacementFacilityRegulationReference(org.museframework.bian.classes.RuleSet privatePlacementFacilityRegulationReference) {
        this.privatePlacementFacilityRegulationReference = privatePlacementFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getPrivatePlacementFacilityRegulationReference() {
        return privatePlacementFacilityRegulationReference;
    }

    public void setPrivatePlacementFacilityRegulationType(String privatePlacementFacilityRegulationType) {
        this.privatePlacementFacilityRegulationType = privatePlacementFacilityRegulationType;
    }

    public String getPrivatePlacementFacilityRegulationType() {
        return privatePlacementFacilityRegulationType;
    }

    public void setPrivatePlacementFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction privatePlacementFacilityJurisdiction) {
        this.privatePlacementFacilityJurisdiction = privatePlacementFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getPrivatePlacementFacilityJurisdiction() {
        return privatePlacementFacilityJurisdiction;
    }

    public void setPrivatePlacementFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit privatePlacementFacilityBookingLocation) {
        this.privatePlacementFacilityBookingLocation = privatePlacementFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getPrivatePlacementFacilityBookingLocation() {
        return privatePlacementFacilityBookingLocation;
    }

    public void setPrivatePlacementFacilityAccountReference(org.museframework.bian.classes.Account privatePlacementFacilityAccountReference) {
        this.privatePlacementFacilityAccountReference = privatePlacementFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getPrivatePlacementFacilityAccountReference() {
        return privatePlacementFacilityAccountReference;
    }

    public void setPrivatePlacementFacilityCustomerReference(String privatePlacementFacilityCustomerReference) {
        this.privatePlacementFacilityCustomerReference = privatePlacementFacilityCustomerReference;
    }

    public String getPrivatePlacementFacilityCustomerReference() {
        return privatePlacementFacilityCustomerReference;
    }

    public void setPrivatePlacementFacilityPosition(org.museframework.bian.classes.Position privatePlacementFacilityPosition) {
        this.privatePlacementFacilityPosition = privatePlacementFacilityPosition;
    }

    public org.museframework.bian.classes.Position getPrivatePlacementFacilityPosition() {
        return privatePlacementFacilityPosition;
    }

    public void setPrivatePlacementFacilityProductReference(org.museframework.bian.classes.BankingProduct privatePlacementFacilityProductReference) {
        this.privatePlacementFacilityProductReference = privatePlacementFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getPrivatePlacementFacilityProductReference() {
        return privatePlacementFacilityProductReference;
    }

    public void setPrivatePlacementFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement privatePlacementFacilityPositionLimit) {
        this.privatePlacementFacilityPositionLimit = privatePlacementFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getPrivatePlacementFacilityPositionLimit() {
        return privatePlacementFacilityPositionLimit;
    }

    public void setPrivatePlacementFacilityReference(org.museframework.bian.classes.FinancialFacility privatePlacementFacilityReference) {
        this.privatePlacementFacilityReference = privatePlacementFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getPrivatePlacementFacilityReference() {
        return privatePlacementFacilityReference;
    }
}