/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Cheque Lock Box. */
package org.museframework.bian.chelocbox.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class LockBoxFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Lock Box Facility*/
    @MetaField(0)
    private String lockBoxFacilityParameterType;

    /*A selected optional product feature as subject matter of Lock Box Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature lockBoxFacilitySelectedOption;

    /*The status of Lock Box Facility*/
    @MetaField(0)
    private String lockBoxFacilityStatus;

    /*Reference to the party who is involved in Lock Box Facility*/
    @MetaField(0)
    private String lockBoxFacilityAssociatedParty;

    /*The curreny which is arranged in Lock Box Facility*/
    @MetaField(0)
    private String lockBoxFacilityCurrency;

    /*Reference to the regulation which is defined in Lock Box Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet lockBoxFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Lock Box Facility*/
    @MetaField(0)
    private String lockBoxFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Lock Box Facility in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction lockBoxFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Lock Box Facility, are entered.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessUnit lockBoxFacilityBookingLocation;

    /*Reference to the account which is linked to Lock Box Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account lockBoxFacilityAccountReference;

    /*Reference to the customer who is involved in Lock Box Facility*/
    @MetaField(0)
    private String lockBoxFacilityCustomerReference;

    /*The position of Lock Box Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Position lockBoxFacilityPosition;

    /*Reference to the product which is linked to Lock Box Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct lockBoxFacilityProductReference;

    /*Reference to the limitation related to the position of Lock Box Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LimitArrangement lockBoxFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Lock Box Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility lockBoxFacilityReference;

    public void setLockBoxFacilityParameterType(String lockBoxFacilityParameterType) {
        this.lockBoxFacilityParameterType = lockBoxFacilityParameterType;
    }

    public String getLockBoxFacilityParameterType() {
        return lockBoxFacilityParameterType;
    }

    public void setLockBoxFacilitySelectedOption(org.museframework.bian.classes.Feature lockBoxFacilitySelectedOption) {
        this.lockBoxFacilitySelectedOption = lockBoxFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getLockBoxFacilitySelectedOption() {
        return lockBoxFacilitySelectedOption;
    }

    public void setLockBoxFacilityStatus(String lockBoxFacilityStatus) {
        this.lockBoxFacilityStatus = lockBoxFacilityStatus;
    }

    public String getLockBoxFacilityStatus() {
        return lockBoxFacilityStatus;
    }

    public void setLockBoxFacilityAssociatedParty(String lockBoxFacilityAssociatedParty) {
        this.lockBoxFacilityAssociatedParty = lockBoxFacilityAssociatedParty;
    }

    public String getLockBoxFacilityAssociatedParty() {
        return lockBoxFacilityAssociatedParty;
    }

    public void setLockBoxFacilityCurrency(String lockBoxFacilityCurrency) {
        this.lockBoxFacilityCurrency = lockBoxFacilityCurrency;
    }

    public String getLockBoxFacilityCurrency() {
        return lockBoxFacilityCurrency;
    }

    public void setLockBoxFacilityRegulationReference(org.museframework.bian.classes.RuleSet lockBoxFacilityRegulationReference) {
        this.lockBoxFacilityRegulationReference = lockBoxFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getLockBoxFacilityRegulationReference() {
        return lockBoxFacilityRegulationReference;
    }

    public void setLockBoxFacilityRegulationType(String lockBoxFacilityRegulationType) {
        this.lockBoxFacilityRegulationType = lockBoxFacilityRegulationType;
    }

    public String getLockBoxFacilityRegulationType() {
        return lockBoxFacilityRegulationType;
    }

    public void setLockBoxFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction lockBoxFacilityJurisdiction) {
        this.lockBoxFacilityJurisdiction = lockBoxFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getLockBoxFacilityJurisdiction() {
        return lockBoxFacilityJurisdiction;
    }

    public void setLockBoxFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit lockBoxFacilityBookingLocation) {
        this.lockBoxFacilityBookingLocation = lockBoxFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getLockBoxFacilityBookingLocation() {
        return lockBoxFacilityBookingLocation;
    }

    public void setLockBoxFacilityAccountReference(org.museframework.bian.classes.Account lockBoxFacilityAccountReference) {
        this.lockBoxFacilityAccountReference = lockBoxFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getLockBoxFacilityAccountReference() {
        return lockBoxFacilityAccountReference;
    }

    public void setLockBoxFacilityCustomerReference(String lockBoxFacilityCustomerReference) {
        this.lockBoxFacilityCustomerReference = lockBoxFacilityCustomerReference;
    }

    public String getLockBoxFacilityCustomerReference() {
        return lockBoxFacilityCustomerReference;
    }

    public void setLockBoxFacilityPosition(org.museframework.bian.classes.Position lockBoxFacilityPosition) {
        this.lockBoxFacilityPosition = lockBoxFacilityPosition;
    }

    public org.museframework.bian.classes.Position getLockBoxFacilityPosition() {
        return lockBoxFacilityPosition;
    }

    public void setLockBoxFacilityProductReference(org.museframework.bian.classes.BankingProduct lockBoxFacilityProductReference) {
        this.lockBoxFacilityProductReference = lockBoxFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getLockBoxFacilityProductReference() {
        return lockBoxFacilityProductReference;
    }

    public void setLockBoxFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement lockBoxFacilityPositionLimit) {
        this.lockBoxFacilityPositionLimit = lockBoxFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getLockBoxFacilityPositionLimit() {
        return lockBoxFacilityPositionLimit;
    }

    public void setLockBoxFacilityReference(org.museframework.bian.classes.FinancialFacility lockBoxFacilityReference) {
        this.lockBoxFacilityReference = lockBoxFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getLockBoxFacilityReference() {
        return lockBoxFacilityReference;
    }
}