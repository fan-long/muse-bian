/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Merchandising Loan. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.merchandisingloan.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MerchandisingLoanFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Merchandising Loan Arrangement*/
    @MetaField
    private String merchandisingLoanFacilityParameterType;

    /*A selected optional business service as subject matter of Merchandising Loan Arrangement*/
    @MetaField
    private String merchandisingLoanFacilitySelectedOption;

    /*The type of Merchandising Loan Arrangement*/
    @MetaField
    private String merchandisingLoanFacilityType;

    /*Reference to Merchandising Loan Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object merchandisingLoanFacilityReference;

    /*Timetable to fulfill Merchandising Loan Arrangement*/
    @MetaField
    private String merchandisingLoanFacilitySchedule;

    /*The status of Merchandising Loan Arrangement*/
    @MetaField
    private String merchandisingLoanFacilityStatus;

    /*Reference to the party who is involved in Merchandising Loan Arrangement*/
    @MetaField
    private String merchandisingLoanFacilityAssociatedParty;

    /*The curreny which is arranged in Merchandising Loan Arrangement*/
    @MetaField
    private String merchandisingLoanFacilityCurrency;

    /*Reference to the regulation which is defined in Merchandising Loan Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object merchandisingLoanFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Merchandising Loan Arrangement*/
    @MetaField
    private String merchandisingLoanFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Merchandising Loan Arrangement in case of legal dispute.*/
    @MetaField
    private String merchandisingLoanFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Merchandising Loan Arrangement, are entered.*/
    @MetaField
    private String merchandisingLoanFacilityBookingLocation;

    /*The type of account which is linked to Merchandising Loan Arrangement*/
    @MetaField
    private String merchandisingLoanFacilityAccountType;

    /*Reference to the account which is linked to Merchandising Loan Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object merchandisingLoanFacilityAccountReference;

    public void setMerchandisingLoanFacilityParameterType(String merchandisingLoanFacilityParameterType) {
        this.merchandisingLoanFacilityParameterType = merchandisingLoanFacilityParameterType;
    }

    public String getMerchandisingLoanFacilityParameterType() {
        return merchandisingLoanFacilityParameterType;
    }

    public void setMerchandisingLoanFacilitySelectedOption(String merchandisingLoanFacilitySelectedOption) {
        this.merchandisingLoanFacilitySelectedOption = merchandisingLoanFacilitySelectedOption;
    }

    public String getMerchandisingLoanFacilitySelectedOption() {
        return merchandisingLoanFacilitySelectedOption;
    }

    public void setMerchandisingLoanFacilityType(String merchandisingLoanFacilityType) {
        this.merchandisingLoanFacilityType = merchandisingLoanFacilityType;
    }

    public String getMerchandisingLoanFacilityType() {
        return merchandisingLoanFacilityType;
    }

    public void setMerchandisingLoanFacilityReference(org.museframework.bian.classes.Object merchandisingLoanFacilityReference) {
        this.merchandisingLoanFacilityReference = merchandisingLoanFacilityReference;
    }

    public org.museframework.bian.classes.Object getMerchandisingLoanFacilityReference() {
        return merchandisingLoanFacilityReference;
    }

    public void setMerchandisingLoanFacilitySchedule(String merchandisingLoanFacilitySchedule) {
        this.merchandisingLoanFacilitySchedule = merchandisingLoanFacilitySchedule;
    }

    public String getMerchandisingLoanFacilitySchedule() {
        return merchandisingLoanFacilitySchedule;
    }

    public void setMerchandisingLoanFacilityStatus(String merchandisingLoanFacilityStatus) {
        this.merchandisingLoanFacilityStatus = merchandisingLoanFacilityStatus;
    }

    public String getMerchandisingLoanFacilityStatus() {
        return merchandisingLoanFacilityStatus;
    }

    public void setMerchandisingLoanFacilityAssociatedParty(String merchandisingLoanFacilityAssociatedParty) {
        this.merchandisingLoanFacilityAssociatedParty = merchandisingLoanFacilityAssociatedParty;
    }

    public String getMerchandisingLoanFacilityAssociatedParty() {
        return merchandisingLoanFacilityAssociatedParty;
    }

    public void setMerchandisingLoanFacilityCurrency(String merchandisingLoanFacilityCurrency) {
        this.merchandisingLoanFacilityCurrency = merchandisingLoanFacilityCurrency;
    }

    public String getMerchandisingLoanFacilityCurrency() {
        return merchandisingLoanFacilityCurrency;
    }

    public void setMerchandisingLoanFacilityRegulationReference(org.museframework.bian.classes.Object merchandisingLoanFacilityRegulationReference) {
        this.merchandisingLoanFacilityRegulationReference = merchandisingLoanFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getMerchandisingLoanFacilityRegulationReference() {
        return merchandisingLoanFacilityRegulationReference;
    }

    public void setMerchandisingLoanFacilityRegulationType(String merchandisingLoanFacilityRegulationType) {
        this.merchandisingLoanFacilityRegulationType = merchandisingLoanFacilityRegulationType;
    }

    public String getMerchandisingLoanFacilityRegulationType() {
        return merchandisingLoanFacilityRegulationType;
    }

    public void setMerchandisingLoanFacilityJurisdiction(String merchandisingLoanFacilityJurisdiction) {
        this.merchandisingLoanFacilityJurisdiction = merchandisingLoanFacilityJurisdiction;
    }

    public String getMerchandisingLoanFacilityJurisdiction() {
        return merchandisingLoanFacilityJurisdiction;
    }

    public void setMerchandisingLoanFacilityBookingLocation(String merchandisingLoanFacilityBookingLocation) {
        this.merchandisingLoanFacilityBookingLocation = merchandisingLoanFacilityBookingLocation;
    }

    public String getMerchandisingLoanFacilityBookingLocation() {
        return merchandisingLoanFacilityBookingLocation;
    }

    public void setMerchandisingLoanFacilityAccountType(String merchandisingLoanFacilityAccountType) {
        this.merchandisingLoanFacilityAccountType = merchandisingLoanFacilityAccountType;
    }

    public String getMerchandisingLoanFacilityAccountType() {
        return merchandisingLoanFacilityAccountType;
    }

    public void setMerchandisingLoanFacilityAccountReference(org.museframework.bian.classes.Object merchandisingLoanFacilityAccountReference) {
        this.merchandisingLoanFacilityAccountReference = merchandisingLoanFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getMerchandisingLoanFacilityAccountReference() {
        return merchandisingLoanFacilityAccountReference;
    }
}