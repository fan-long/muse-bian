/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Legal Advisory. 
*/
package org.museframework.bian.legaladvisory.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class LegalAdviceFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Legal Advice Facility.*/
    @MetaField
    private String legalAdviceFacilityParameterType;

    /*A selected optional product feature as subject matter of Legal Advice Facility.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature legalAdviceFacilitySelectedOption;

    /*The status of Legal Advice Facility.*/
    @MetaField
    private String legalAdviceFacilityStatus;

    /*Reference to the party who is involved in Legal Advice Facility.*/
    @MetaField
    private String legalAdviceFacilityAssociatedParty;

    /*The curreny which is arranged in Legal Advice Facility.*/
    @MetaField
    private String legalAdviceFacilityCurrency;

    /*Reference to the regulation which is defined in Legal Advice Facility.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet legalAdviceFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Legal Advice Facility.*/
    @MetaField
    private String legalAdviceFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Legal Advice Facility in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction legalAdviceFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Legal Advice Facility, are entered.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessUnit legalAdviceFacilityBookingLocation;

    /*Reference to the account which is linked to Legal Advice Facility.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account legalAdviceFacilityAccountReference;

    /*Reference to the customer who is involved in Legal Advice Facility.*/
    @MetaField
    private String legalAdviceFacilityCustomerReference;

    /*The position of Legal Advice Facility.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Position legalAdviceFacilityPosition;

    /*Reference to the product which is linked to Legal Advice Facility.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct legalAdviceFacilityProductReference;

    /*Reference to the limitation related to the position of Legal Advice Facility.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LimitArrangement legalAdviceFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Legal Advice Facility.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility legalAdviceFacilityReference;

    public void setLegalAdviceFacilityParameterType(String legalAdviceFacilityParameterType) {
        this.legalAdviceFacilityParameterType = legalAdviceFacilityParameterType;
    }

    public String getLegalAdviceFacilityParameterType() {
        return legalAdviceFacilityParameterType;
    }

    public void setLegalAdviceFacilitySelectedOption(org.museframework.bian.classes.Feature legalAdviceFacilitySelectedOption) {
        this.legalAdviceFacilitySelectedOption = legalAdviceFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getLegalAdviceFacilitySelectedOption() {
        return legalAdviceFacilitySelectedOption;
    }

    public void setLegalAdviceFacilityStatus(String legalAdviceFacilityStatus) {
        this.legalAdviceFacilityStatus = legalAdviceFacilityStatus;
    }

    public String getLegalAdviceFacilityStatus() {
        return legalAdviceFacilityStatus;
    }

    public void setLegalAdviceFacilityAssociatedParty(String legalAdviceFacilityAssociatedParty) {
        this.legalAdviceFacilityAssociatedParty = legalAdviceFacilityAssociatedParty;
    }

    public String getLegalAdviceFacilityAssociatedParty() {
        return legalAdviceFacilityAssociatedParty;
    }

    public void setLegalAdviceFacilityCurrency(String legalAdviceFacilityCurrency) {
        this.legalAdviceFacilityCurrency = legalAdviceFacilityCurrency;
    }

    public String getLegalAdviceFacilityCurrency() {
        return legalAdviceFacilityCurrency;
    }

    public void setLegalAdviceFacilityRegulationReference(org.museframework.bian.classes.RuleSet legalAdviceFacilityRegulationReference) {
        this.legalAdviceFacilityRegulationReference = legalAdviceFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getLegalAdviceFacilityRegulationReference() {
        return legalAdviceFacilityRegulationReference;
    }

    public void setLegalAdviceFacilityRegulationType(String legalAdviceFacilityRegulationType) {
        this.legalAdviceFacilityRegulationType = legalAdviceFacilityRegulationType;
    }

    public String getLegalAdviceFacilityRegulationType() {
        return legalAdviceFacilityRegulationType;
    }

    public void setLegalAdviceFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction legalAdviceFacilityJurisdiction) {
        this.legalAdviceFacilityJurisdiction = legalAdviceFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getLegalAdviceFacilityJurisdiction() {
        return legalAdviceFacilityJurisdiction;
    }

    public void setLegalAdviceFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit legalAdviceFacilityBookingLocation) {
        this.legalAdviceFacilityBookingLocation = legalAdviceFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getLegalAdviceFacilityBookingLocation() {
        return legalAdviceFacilityBookingLocation;
    }

    public void setLegalAdviceFacilityAccountReference(org.museframework.bian.classes.Account legalAdviceFacilityAccountReference) {
        this.legalAdviceFacilityAccountReference = legalAdviceFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getLegalAdviceFacilityAccountReference() {
        return legalAdviceFacilityAccountReference;
    }

    public void setLegalAdviceFacilityCustomerReference(String legalAdviceFacilityCustomerReference) {
        this.legalAdviceFacilityCustomerReference = legalAdviceFacilityCustomerReference;
    }

    public String getLegalAdviceFacilityCustomerReference() {
        return legalAdviceFacilityCustomerReference;
    }

    public void setLegalAdviceFacilityPosition(org.museframework.bian.classes.Position legalAdviceFacilityPosition) {
        this.legalAdviceFacilityPosition = legalAdviceFacilityPosition;
    }

    public org.museframework.bian.classes.Position getLegalAdviceFacilityPosition() {
        return legalAdviceFacilityPosition;
    }

    public void setLegalAdviceFacilityProductReference(org.museframework.bian.classes.BankingProduct legalAdviceFacilityProductReference) {
        this.legalAdviceFacilityProductReference = legalAdviceFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getLegalAdviceFacilityProductReference() {
        return legalAdviceFacilityProductReference;
    }

    public void setLegalAdviceFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement legalAdviceFacilityPositionLimit) {
        this.legalAdviceFacilityPositionLimit = legalAdviceFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getLegalAdviceFacilityPositionLimit() {
        return legalAdviceFacilityPositionLimit;
    }

    public void setLegalAdviceFacilityReference(org.museframework.bian.classes.FinancialFacility legalAdviceFacilityReference) {
        this.legalAdviceFacilityReference = legalAdviceFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getLegalAdviceFacilityReference() {
        return legalAdviceFacilityReference;
    }
}