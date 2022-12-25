/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Market Making. */
package org.museframework.bian.marketmaking.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MarketMakingFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Market Making Facility*/
    @MetaField(0)
    private String marketMakingFacilityParameterType;

    /*A selected optional product feature as subject matter of Market Making Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature marketMakingFacilitySelectedOption;

    /*The status of Market Making Facility*/
    @MetaField(0)
    private String marketMakingFacilityStatus;

    /*Reference to the party who is involved in Market Making Facility*/
    @MetaField(0)
    private String marketMakingFacilityAssociatedParty;

    /*The curreny which is arranged in Market Making Facility*/
    @MetaField(0)
    private String marketMakingFacilityCurrency;

    /*Reference to the regulation which is defined in Market Making Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet marketMakingFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Market Making Facility*/
    @MetaField(0)
    private String marketMakingFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Market Making Facility in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction marketMakingFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Market Making Facility, are entered.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessUnit marketMakingFacilityBookingLocation;

    /*Reference to the account which is linked to Market Making Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account marketMakingFacilityAccountReference;

    /*Reference to the customer who is involved in Market Making Facility*/
    @MetaField(0)
    private String marketMakingFacilityCustomerReference;

    /*The position of Market Making Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Position marketMakingFacilityPosition;

    /*Reference to the product which is linked to Market Making Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct marketMakingFacilityProductReference;

    /*Reference to the limitation related to the position of Market Making Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LimitArrangement marketMakingFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Market Making Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility marketMakingFacilityReference;

    public void setMarketMakingFacilityParameterType(String marketMakingFacilityParameterType) {
        this.marketMakingFacilityParameterType = marketMakingFacilityParameterType;
    }

    public String getMarketMakingFacilityParameterType() {
        return marketMakingFacilityParameterType;
    }

    public void setMarketMakingFacilitySelectedOption(org.museframework.bian.classes.Feature marketMakingFacilitySelectedOption) {
        this.marketMakingFacilitySelectedOption = marketMakingFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getMarketMakingFacilitySelectedOption() {
        return marketMakingFacilitySelectedOption;
    }

    public void setMarketMakingFacilityStatus(String marketMakingFacilityStatus) {
        this.marketMakingFacilityStatus = marketMakingFacilityStatus;
    }

    public String getMarketMakingFacilityStatus() {
        return marketMakingFacilityStatus;
    }

    public void setMarketMakingFacilityAssociatedParty(String marketMakingFacilityAssociatedParty) {
        this.marketMakingFacilityAssociatedParty = marketMakingFacilityAssociatedParty;
    }

    public String getMarketMakingFacilityAssociatedParty() {
        return marketMakingFacilityAssociatedParty;
    }

    public void setMarketMakingFacilityCurrency(String marketMakingFacilityCurrency) {
        this.marketMakingFacilityCurrency = marketMakingFacilityCurrency;
    }

    public String getMarketMakingFacilityCurrency() {
        return marketMakingFacilityCurrency;
    }

    public void setMarketMakingFacilityRegulationReference(org.museframework.bian.classes.RuleSet marketMakingFacilityRegulationReference) {
        this.marketMakingFacilityRegulationReference = marketMakingFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getMarketMakingFacilityRegulationReference() {
        return marketMakingFacilityRegulationReference;
    }

    public void setMarketMakingFacilityRegulationType(String marketMakingFacilityRegulationType) {
        this.marketMakingFacilityRegulationType = marketMakingFacilityRegulationType;
    }

    public String getMarketMakingFacilityRegulationType() {
        return marketMakingFacilityRegulationType;
    }

    public void setMarketMakingFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction marketMakingFacilityJurisdiction) {
        this.marketMakingFacilityJurisdiction = marketMakingFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getMarketMakingFacilityJurisdiction() {
        return marketMakingFacilityJurisdiction;
    }

    public void setMarketMakingFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit marketMakingFacilityBookingLocation) {
        this.marketMakingFacilityBookingLocation = marketMakingFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getMarketMakingFacilityBookingLocation() {
        return marketMakingFacilityBookingLocation;
    }

    public void setMarketMakingFacilityAccountReference(org.museframework.bian.classes.Account marketMakingFacilityAccountReference) {
        this.marketMakingFacilityAccountReference = marketMakingFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getMarketMakingFacilityAccountReference() {
        return marketMakingFacilityAccountReference;
    }

    public void setMarketMakingFacilityCustomerReference(String marketMakingFacilityCustomerReference) {
        this.marketMakingFacilityCustomerReference = marketMakingFacilityCustomerReference;
    }

    public String getMarketMakingFacilityCustomerReference() {
        return marketMakingFacilityCustomerReference;
    }

    public void setMarketMakingFacilityPosition(org.museframework.bian.classes.Position marketMakingFacilityPosition) {
        this.marketMakingFacilityPosition = marketMakingFacilityPosition;
    }

    public org.museframework.bian.classes.Position getMarketMakingFacilityPosition() {
        return marketMakingFacilityPosition;
    }

    public void setMarketMakingFacilityProductReference(org.museframework.bian.classes.BankingProduct marketMakingFacilityProductReference) {
        this.marketMakingFacilityProductReference = marketMakingFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getMarketMakingFacilityProductReference() {
        return marketMakingFacilityProductReference;
    }

    public void setMarketMakingFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement marketMakingFacilityPositionLimit) {
        this.marketMakingFacilityPositionLimit = marketMakingFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getMarketMakingFacilityPositionLimit() {
        return marketMakingFacilityPositionLimit;
    }

    public void setMarketMakingFacilityReference(org.museframework.bian.classes.FinancialFacility marketMakingFacilityReference) {
        this.marketMakingFacilityReference = marketMakingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getMarketMakingFacilityReference() {
        return marketMakingFacilityReference;
    }
}