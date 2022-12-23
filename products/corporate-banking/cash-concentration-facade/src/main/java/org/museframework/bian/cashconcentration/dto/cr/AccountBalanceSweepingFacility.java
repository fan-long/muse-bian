/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Cash Concentration. */
package org.museframework.bian.cashconcentration.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccountBalanceSweepingFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Account Balance Sweeping Facility*/
    @MetaField
    private String accountBalanceSweepingFacilityParameterType;

    /*A selected optional product feature as subject matter of Account Balance Sweeping Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature accountBalanceSweepingFacilitySelectedOption;

    /*The status of Account Balance Sweeping Facility*/
    @MetaField
    private String accountBalanceSweepingFacilityStatus;

    /*Reference to the party who is involved in Account Balance Sweeping Facility*/
    @MetaField
    private String accountBalanceSweepingFacilityAssociatedParty;

    /*The curreny which is arranged in Account Balance Sweeping Facility*/
    @MetaField
    private String accountBalanceSweepingFacilityCurrency;

    /*Reference to the regulation which is defined in Account Balance Sweeping Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet accountBalanceSweepingFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Account Balance Sweeping Facility*/
    @MetaField
    private String accountBalanceSweepingFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Account Balance Sweeping Facility in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction accountBalanceSweepingFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Account Balance Sweeping Facility, are entered.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessUnit accountBalanceSweepingFacilityBookingLocation;

    /*Reference to the account which is linked to Account Balance Sweeping Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account accountBalanceSweepingFacilityAccountReference;

    /*Reference to the customer who is involved in Account Balance Sweeping Facility*/
    @MetaField
    private String accountBalanceSweepingFacilityCustomerReference;

    /*The position of Account Balance Sweeping Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Position accountBalanceSweepingFacilityPosition;

    /*Reference to the product which is linked to Account Balance Sweeping Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct accountBalanceSweepingFacilityProductReference;

    /*Reference to the limitation related to the position of Account Balance Sweeping Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LimitArrangement accountBalanceSweepingFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Account Balance Sweeping Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility accountBalanceSweepingFacilityReference;

    public void setAccountBalanceSweepingFacilityParameterType(String accountBalanceSweepingFacilityParameterType) {
        this.accountBalanceSweepingFacilityParameterType = accountBalanceSweepingFacilityParameterType;
    }

    public String getAccountBalanceSweepingFacilityParameterType() {
        return accountBalanceSweepingFacilityParameterType;
    }

    public void setAccountBalanceSweepingFacilitySelectedOption(org.museframework.bian.classes.Feature accountBalanceSweepingFacilitySelectedOption) {
        this.accountBalanceSweepingFacilitySelectedOption = accountBalanceSweepingFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getAccountBalanceSweepingFacilitySelectedOption() {
        return accountBalanceSweepingFacilitySelectedOption;
    }

    public void setAccountBalanceSweepingFacilityStatus(String accountBalanceSweepingFacilityStatus) {
        this.accountBalanceSweepingFacilityStatus = accountBalanceSweepingFacilityStatus;
    }

    public String getAccountBalanceSweepingFacilityStatus() {
        return accountBalanceSweepingFacilityStatus;
    }

    public void setAccountBalanceSweepingFacilityAssociatedParty(String accountBalanceSweepingFacilityAssociatedParty) {
        this.accountBalanceSweepingFacilityAssociatedParty = accountBalanceSweepingFacilityAssociatedParty;
    }

    public String getAccountBalanceSweepingFacilityAssociatedParty() {
        return accountBalanceSweepingFacilityAssociatedParty;
    }

    public void setAccountBalanceSweepingFacilityCurrency(String accountBalanceSweepingFacilityCurrency) {
        this.accountBalanceSweepingFacilityCurrency = accountBalanceSweepingFacilityCurrency;
    }

    public String getAccountBalanceSweepingFacilityCurrency() {
        return accountBalanceSweepingFacilityCurrency;
    }

    public void setAccountBalanceSweepingFacilityRegulationReference(org.museframework.bian.classes.RuleSet accountBalanceSweepingFacilityRegulationReference) {
        this.accountBalanceSweepingFacilityRegulationReference = accountBalanceSweepingFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getAccountBalanceSweepingFacilityRegulationReference() {
        return accountBalanceSweepingFacilityRegulationReference;
    }

    public void setAccountBalanceSweepingFacilityRegulationType(String accountBalanceSweepingFacilityRegulationType) {
        this.accountBalanceSweepingFacilityRegulationType = accountBalanceSweepingFacilityRegulationType;
    }

    public String getAccountBalanceSweepingFacilityRegulationType() {
        return accountBalanceSweepingFacilityRegulationType;
    }

    public void setAccountBalanceSweepingFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction accountBalanceSweepingFacilityJurisdiction) {
        this.accountBalanceSweepingFacilityJurisdiction = accountBalanceSweepingFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getAccountBalanceSweepingFacilityJurisdiction() {
        return accountBalanceSweepingFacilityJurisdiction;
    }

    public void setAccountBalanceSweepingFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit accountBalanceSweepingFacilityBookingLocation) {
        this.accountBalanceSweepingFacilityBookingLocation = accountBalanceSweepingFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getAccountBalanceSweepingFacilityBookingLocation() {
        return accountBalanceSweepingFacilityBookingLocation;
    }

    public void setAccountBalanceSweepingFacilityAccountReference(org.museframework.bian.classes.Account accountBalanceSweepingFacilityAccountReference) {
        this.accountBalanceSweepingFacilityAccountReference = accountBalanceSweepingFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getAccountBalanceSweepingFacilityAccountReference() {
        return accountBalanceSweepingFacilityAccountReference;
    }

    public void setAccountBalanceSweepingFacilityCustomerReference(String accountBalanceSweepingFacilityCustomerReference) {
        this.accountBalanceSweepingFacilityCustomerReference = accountBalanceSweepingFacilityCustomerReference;
    }

    public String getAccountBalanceSweepingFacilityCustomerReference() {
        return accountBalanceSweepingFacilityCustomerReference;
    }

    public void setAccountBalanceSweepingFacilityPosition(org.museframework.bian.classes.Position accountBalanceSweepingFacilityPosition) {
        this.accountBalanceSweepingFacilityPosition = accountBalanceSweepingFacilityPosition;
    }

    public org.museframework.bian.classes.Position getAccountBalanceSweepingFacilityPosition() {
        return accountBalanceSweepingFacilityPosition;
    }

    public void setAccountBalanceSweepingFacilityProductReference(org.museframework.bian.classes.BankingProduct accountBalanceSweepingFacilityProductReference) {
        this.accountBalanceSweepingFacilityProductReference = accountBalanceSweepingFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getAccountBalanceSweepingFacilityProductReference() {
        return accountBalanceSweepingFacilityProductReference;
    }

    public void setAccountBalanceSweepingFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement accountBalanceSweepingFacilityPositionLimit) {
        this.accountBalanceSweepingFacilityPositionLimit = accountBalanceSweepingFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getAccountBalanceSweepingFacilityPositionLimit() {
        return accountBalanceSweepingFacilityPositionLimit;
    }

    public void setAccountBalanceSweepingFacilityReference(org.museframework.bian.classes.FinancialFacility accountBalanceSweepingFacilityReference) {
        this.accountBalanceSweepingFacilityReference = accountBalanceSweepingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getAccountBalanceSweepingFacilityReference() {
        return accountBalanceSweepingFacilityReference;
    }
}