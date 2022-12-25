/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Corporate Lease. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.corporatelease.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorporateLeaseFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Corporate Lease Arrangement*/
    @MetaField(0)
    private String corporateLeaseFacilityParameterType;

    /*A selected optional business service as subject matter of Corporate Lease Arrangement*/
    @MetaField(0)
    private String corporateLeaseFacilitySelectedOption;

    /*The type of Corporate Lease Arrangement*/
    @MetaField(0)
    private String corporateLeaseFacilityType;

    /*Timetable to fulfill Corporate Lease Arrangement*/
    @MetaField(0)
    private String corporateLeaseFacilitySchedule;

    /*The status of Corporate Lease Arrangement*/
    @MetaField(0)
    private String corporateLeaseFacilityStatus;

    /*Reference to the party who is involved in Corporate Lease Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporateLeaseFacilityReference;

    /*The curreny which is arranged in Corporate Lease Arrangement*/
    @MetaField(0)
    private String corporateLeaseFacilityCurrency;

    /*Reference to the regulation which is defined in Corporate Lease Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporateLeaseFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Corporate Lease Arrangement*/
    @MetaField(0)
    private String corporateLeaseFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Corporate Lease Arrangement in case of legal dispute.*/
    @MetaField(0)
    private String corporateLeaseFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Corporate Lease Arrangement, are entered.*/
    @MetaField(0)
    private String corporateLeaseFacilityBookingLocation;

    /*The type of account which is linked to Corporate Lease Arrangement*/
    @MetaField(0)
    private String corporateLeaseFacilityAccountType;

    /*Reference to the account which is linked to Corporate Lease Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporateLeaseFacilityAccountReference;

    public void setCorporateLeaseFacilityParameterType(String corporateLeaseFacilityParameterType) {
        this.corporateLeaseFacilityParameterType = corporateLeaseFacilityParameterType;
    }

    public String getCorporateLeaseFacilityParameterType() {
        return corporateLeaseFacilityParameterType;
    }

    public void setCorporateLeaseFacilitySelectedOption(String corporateLeaseFacilitySelectedOption) {
        this.corporateLeaseFacilitySelectedOption = corporateLeaseFacilitySelectedOption;
    }

    public String getCorporateLeaseFacilitySelectedOption() {
        return corporateLeaseFacilitySelectedOption;
    }

    public void setCorporateLeaseFacilityType(String corporateLeaseFacilityType) {
        this.corporateLeaseFacilityType = corporateLeaseFacilityType;
    }

    public String getCorporateLeaseFacilityType() {
        return corporateLeaseFacilityType;
    }

    public void setCorporateLeaseFacilitySchedule(String corporateLeaseFacilitySchedule) {
        this.corporateLeaseFacilitySchedule = corporateLeaseFacilitySchedule;
    }

    public String getCorporateLeaseFacilitySchedule() {
        return corporateLeaseFacilitySchedule;
    }

    public void setCorporateLeaseFacilityStatus(String corporateLeaseFacilityStatus) {
        this.corporateLeaseFacilityStatus = corporateLeaseFacilityStatus;
    }

    public String getCorporateLeaseFacilityStatus() {
        return corporateLeaseFacilityStatus;
    }

    public void setCorporateLeaseFacilityReference(org.museframework.bian.classes.Object corporateLeaseFacilityReference) {
        this.corporateLeaseFacilityReference = corporateLeaseFacilityReference;
    }

    public org.museframework.bian.classes.Object getCorporateLeaseFacilityReference() {
        return corporateLeaseFacilityReference;
    }

    public void setCorporateLeaseFacilityCurrency(String corporateLeaseFacilityCurrency) {
        this.corporateLeaseFacilityCurrency = corporateLeaseFacilityCurrency;
    }

    public String getCorporateLeaseFacilityCurrency() {
        return corporateLeaseFacilityCurrency;
    }

    public void setCorporateLeaseFacilityRegulationReference(org.museframework.bian.classes.Object corporateLeaseFacilityRegulationReference) {
        this.corporateLeaseFacilityRegulationReference = corporateLeaseFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getCorporateLeaseFacilityRegulationReference() {
        return corporateLeaseFacilityRegulationReference;
    }

    public void setCorporateLeaseFacilityRegulationType(String corporateLeaseFacilityRegulationType) {
        this.corporateLeaseFacilityRegulationType = corporateLeaseFacilityRegulationType;
    }

    public String getCorporateLeaseFacilityRegulationType() {
        return corporateLeaseFacilityRegulationType;
    }

    public void setCorporateLeaseFacilityJurisdiction(String corporateLeaseFacilityJurisdiction) {
        this.corporateLeaseFacilityJurisdiction = corporateLeaseFacilityJurisdiction;
    }

    public String getCorporateLeaseFacilityJurisdiction() {
        return corporateLeaseFacilityJurisdiction;
    }

    public void setCorporateLeaseFacilityBookingLocation(String corporateLeaseFacilityBookingLocation) {
        this.corporateLeaseFacilityBookingLocation = corporateLeaseFacilityBookingLocation;
    }

    public String getCorporateLeaseFacilityBookingLocation() {
        return corporateLeaseFacilityBookingLocation;
    }

    public void setCorporateLeaseFacilityAccountType(String corporateLeaseFacilityAccountType) {
        this.corporateLeaseFacilityAccountType = corporateLeaseFacilityAccountType;
    }

    public String getCorporateLeaseFacilityAccountType() {
        return corporateLeaseFacilityAccountType;
    }

    public void setCorporateLeaseFacilityAccountReference(org.museframework.bian.classes.Object corporateLeaseFacilityAccountReference) {
        this.corporateLeaseFacilityAccountReference = corporateLeaseFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getCorporateLeaseFacilityAccountReference() {
        return corporateLeaseFacilityAccountReference;
    }
}