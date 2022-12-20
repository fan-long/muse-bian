/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.leasing.dto.cr;

public class LeasingFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Leasing Arrangement*/
    private String leasingFacilityParameterType;

    /*A selected optional business service as subject matter of Leasing Arrangement*/
    private String leasingFacilitySelectedOption;

    /*The type of Leasing Arrangement*/
    private String leasingFacilityType;

    /*Reference to Leasing Arrangement*/
    private org.museframework.bian.classes.Object leasingFacilityReference;

    /*Timetable to fulfill Leasing Arrangement*/
    private String leasingFacilitySchedule;

    /*The status of Leasing Arrangement*/
    private String leasingFacilityStatus;

    /*The curreny which is arranged in Leasing Arrangement*/
    private String leasingFacilityCurrency;

    /*Reference to the regulation which is defined in Leasing Arrangement*/
    private org.museframework.bian.classes.Object leasingFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Leasing Arrangement*/
    private String leasingFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Leasing Arrangement in case of legal dispute.*/
    private String leasingFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Leasing Arrangement, are entered.*/
    private String leasingFacilityBookingLocation;

    /*The type of account which is linked to Leasing Arrangement*/
    private String leasingFacilityAccountType;

    /*Reference to the account which is linked to Leasing Arrangement*/
    private org.museframework.bian.classes.Object leasingFacilityAccountReference;

    public void setLeasingFacilityParameterType(String leasingFacilityParameterType) {
        this.leasingFacilityParameterType = leasingFacilityParameterType;
    }

    public String getLeasingFacilityParameterType() {
        return leasingFacilityParameterType;
    }

    public void setLeasingFacilitySelectedOption(String leasingFacilitySelectedOption) {
        this.leasingFacilitySelectedOption = leasingFacilitySelectedOption;
    }

    public String getLeasingFacilitySelectedOption() {
        return leasingFacilitySelectedOption;
    }

    public void setLeasingFacilityType(String leasingFacilityType) {
        this.leasingFacilityType = leasingFacilityType;
    }

    public String getLeasingFacilityType() {
        return leasingFacilityType;
    }

    public void setLeasingFacilityReference(org.museframework.bian.classes.Object leasingFacilityReference) {
        this.leasingFacilityReference = leasingFacilityReference;
    }

    public org.museframework.bian.classes.Object getLeasingFacilityReference() {
        return leasingFacilityReference;
    }

    public void setLeasingFacilitySchedule(String leasingFacilitySchedule) {
        this.leasingFacilitySchedule = leasingFacilitySchedule;
    }

    public String getLeasingFacilitySchedule() {
        return leasingFacilitySchedule;
    }

    public void setLeasingFacilityStatus(String leasingFacilityStatus) {
        this.leasingFacilityStatus = leasingFacilityStatus;
    }

    public String getLeasingFacilityStatus() {
        return leasingFacilityStatus;
    }

    public void setLeasingFacilityCurrency(String leasingFacilityCurrency) {
        this.leasingFacilityCurrency = leasingFacilityCurrency;
    }

    public String getLeasingFacilityCurrency() {
        return leasingFacilityCurrency;
    }

    public void setLeasingFacilityRegulationReference(org.museframework.bian.classes.Object leasingFacilityRegulationReference) {
        this.leasingFacilityRegulationReference = leasingFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getLeasingFacilityRegulationReference() {
        return leasingFacilityRegulationReference;
    }

    public void setLeasingFacilityRegulationType(String leasingFacilityRegulationType) {
        this.leasingFacilityRegulationType = leasingFacilityRegulationType;
    }

    public String getLeasingFacilityRegulationType() {
        return leasingFacilityRegulationType;
    }

    public void setLeasingFacilityJurisdiction(String leasingFacilityJurisdiction) {
        this.leasingFacilityJurisdiction = leasingFacilityJurisdiction;
    }

    public String getLeasingFacilityJurisdiction() {
        return leasingFacilityJurisdiction;
    }

    public void setLeasingFacilityBookingLocation(String leasingFacilityBookingLocation) {
        this.leasingFacilityBookingLocation = leasingFacilityBookingLocation;
    }

    public String getLeasingFacilityBookingLocation() {
        return leasingFacilityBookingLocation;
    }

    public void setLeasingFacilityAccountType(String leasingFacilityAccountType) {
        this.leasingFacilityAccountType = leasingFacilityAccountType;
    }

    public String getLeasingFacilityAccountType() {
        return leasingFacilityAccountType;
    }

    public void setLeasingFacilityAccountReference(org.museframework.bian.classes.Object leasingFacilityAccountReference) {
        this.leasingFacilityAccountReference = leasingFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getLeasingFacilityAccountReference() {
        return leasingFacilityAccountReference;
    }
}