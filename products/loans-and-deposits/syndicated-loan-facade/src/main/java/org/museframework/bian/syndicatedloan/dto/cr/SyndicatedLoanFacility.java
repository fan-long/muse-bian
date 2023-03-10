/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.syndicatedloan.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SyndicatedLoanFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Syndicated Loan Arrangement*/
    @MetaField(0)
    private String syndicatedLoanFacilityParameterType;

    /*A selected optional business service as subject matter of Syndicated Loan Arrangement*/
    @MetaField(0)
    private String syndicatedLoanFacilitySelectedOption;

    /*The type of Syndicated Loan Arrangement*/
    @MetaField(0)
    private String syndicatedLoanFacilityType;

    /*Reference to Syndicated Loan Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object syndicatedLoanFacilityReference;

    /*Timetable to fulfill Syndicated Loan Arrangement*/
    @MetaField(0)
    private String syndicatedLoanFacilitySchedule;

    /*The status of Syndicated Loan Arrangement*/
    @MetaField(0)
    private String syndicatedLoanFacilityStatus;

    /*The curreny which is arranged in Syndicated Loan Arrangement*/
    @MetaField(0)
    private String syndicatedLoanFacilityCurrency;

    /*Reference to the regulation which is defined in Syndicated Loan Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object syndicatedLoanFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Syndicated Loan Arrangement*/
    @MetaField(0)
    private String syndicatedLoanFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Syndicated Loan Arrangement in case of legal dispute.*/
    @MetaField(0)
    private String syndicatedLoanFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Syndicated Loan Arrangement, are entered.*/
    @MetaField(0)
    private String syndicatedLoanFacilityBookingLocation;

    /*The type of account which is linked to Syndicated Loan Arrangement*/
    @MetaField(0)
    private String syndicatedLoanFacilityAccountType;

    /*Reference to the account which is linked to Syndicated Loan Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object syndicatedLoanFacilityAccountReference;

    public void setSyndicatedLoanFacilityParameterType(String syndicatedLoanFacilityParameterType) {
        this.syndicatedLoanFacilityParameterType = syndicatedLoanFacilityParameterType;
    }

    public String getSyndicatedLoanFacilityParameterType() {
        return syndicatedLoanFacilityParameterType;
    }

    public void setSyndicatedLoanFacilitySelectedOption(String syndicatedLoanFacilitySelectedOption) {
        this.syndicatedLoanFacilitySelectedOption = syndicatedLoanFacilitySelectedOption;
    }

    public String getSyndicatedLoanFacilitySelectedOption() {
        return syndicatedLoanFacilitySelectedOption;
    }

    public void setSyndicatedLoanFacilityType(String syndicatedLoanFacilityType) {
        this.syndicatedLoanFacilityType = syndicatedLoanFacilityType;
    }

    public String getSyndicatedLoanFacilityType() {
        return syndicatedLoanFacilityType;
    }

    public void setSyndicatedLoanFacilityReference(org.museframework.bian.classes.Object syndicatedLoanFacilityReference) {
        this.syndicatedLoanFacilityReference = syndicatedLoanFacilityReference;
    }

    public org.museframework.bian.classes.Object getSyndicatedLoanFacilityReference() {
        return syndicatedLoanFacilityReference;
    }

    public void setSyndicatedLoanFacilitySchedule(String syndicatedLoanFacilitySchedule) {
        this.syndicatedLoanFacilitySchedule = syndicatedLoanFacilitySchedule;
    }

    public String getSyndicatedLoanFacilitySchedule() {
        return syndicatedLoanFacilitySchedule;
    }

    public void setSyndicatedLoanFacilityStatus(String syndicatedLoanFacilityStatus) {
        this.syndicatedLoanFacilityStatus = syndicatedLoanFacilityStatus;
    }

    public String getSyndicatedLoanFacilityStatus() {
        return syndicatedLoanFacilityStatus;
    }

    public void setSyndicatedLoanFacilityCurrency(String syndicatedLoanFacilityCurrency) {
        this.syndicatedLoanFacilityCurrency = syndicatedLoanFacilityCurrency;
    }

    public String getSyndicatedLoanFacilityCurrency() {
        return syndicatedLoanFacilityCurrency;
    }

    public void setSyndicatedLoanFacilityRegulationReference(org.museframework.bian.classes.Object syndicatedLoanFacilityRegulationReference) {
        this.syndicatedLoanFacilityRegulationReference = syndicatedLoanFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getSyndicatedLoanFacilityRegulationReference() {
        return syndicatedLoanFacilityRegulationReference;
    }

    public void setSyndicatedLoanFacilityRegulationType(String syndicatedLoanFacilityRegulationType) {
        this.syndicatedLoanFacilityRegulationType = syndicatedLoanFacilityRegulationType;
    }

    public String getSyndicatedLoanFacilityRegulationType() {
        return syndicatedLoanFacilityRegulationType;
    }

    public void setSyndicatedLoanFacilityJurisdiction(String syndicatedLoanFacilityJurisdiction) {
        this.syndicatedLoanFacilityJurisdiction = syndicatedLoanFacilityJurisdiction;
    }

    public String getSyndicatedLoanFacilityJurisdiction() {
        return syndicatedLoanFacilityJurisdiction;
    }

    public void setSyndicatedLoanFacilityBookingLocation(String syndicatedLoanFacilityBookingLocation) {
        this.syndicatedLoanFacilityBookingLocation = syndicatedLoanFacilityBookingLocation;
    }

    public String getSyndicatedLoanFacilityBookingLocation() {
        return syndicatedLoanFacilityBookingLocation;
    }

    public void setSyndicatedLoanFacilityAccountType(String syndicatedLoanFacilityAccountType) {
        this.syndicatedLoanFacilityAccountType = syndicatedLoanFacilityAccountType;
    }

    public String getSyndicatedLoanFacilityAccountType() {
        return syndicatedLoanFacilityAccountType;
    }

    public void setSyndicatedLoanFacilityAccountReference(org.museframework.bian.classes.Object syndicatedLoanFacilityAccountReference) {
        this.syndicatedLoanFacilityAccountReference = syndicatedLoanFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getSyndicatedLoanFacilityAccountReference() {
        return syndicatedLoanFacilityAccountReference;
    }
}