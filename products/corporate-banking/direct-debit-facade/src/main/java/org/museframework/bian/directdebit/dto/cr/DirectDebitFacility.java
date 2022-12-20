/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Direct Debit. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.directdebit.dto.cr;

public class DirectDebitFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Direct Debit Arrangement*/
    private String directDebitFacilityParameterType;

    /*A selected optional business service as subject matter of Direct Debit Arrangement*/
    private String directDebitFacilitySelectedOption;

    /*The type of Direct Debit Arrangement*/
    private String directDebitFacilityType;

    /*Reference to Direct Debit Arrangement*/
    private org.museframework.bian.classes.Object directDebitFacilityReference;

    /*Timetable to fulfill Direct Debit Arrangement*/
    private String directDebitFacilitySchedule;

    /*The status of Direct Debit Arrangement*/
    private String directDebitFacilityStatus;

    /*The curreny which is arranged in Direct Debit Arrangement*/
    private String directDebitFacilityCurrency;

    /*Reference to the regulation which is defined in Direct Debit Arrangement*/
    private org.museframework.bian.classes.Object directDebitFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Direct Debit Arrangement*/
    private String directDebitFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Direct Debit Arrangement in case of legal dispute.*/
    private String directDebitFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Direct Debit Arrangement, are entered.*/
    private String directDebitFacilityBookingLocation;

    /*The type of account which is linked to Direct Debit Arrangement*/
    private String directDebitFacilityAccountType;

    /*Reference to the account which is linked to Direct Debit Arrangement*/
    private org.museframework.bian.classes.Object directDebitFacilityAccountReference;

    public void setDirectDebitFacilityParameterType(String directDebitFacilityParameterType) {
        this.directDebitFacilityParameterType = directDebitFacilityParameterType;
    }

    public String getDirectDebitFacilityParameterType() {
        return directDebitFacilityParameterType;
    }

    public void setDirectDebitFacilitySelectedOption(String directDebitFacilitySelectedOption) {
        this.directDebitFacilitySelectedOption = directDebitFacilitySelectedOption;
    }

    public String getDirectDebitFacilitySelectedOption() {
        return directDebitFacilitySelectedOption;
    }

    public void setDirectDebitFacilityType(String directDebitFacilityType) {
        this.directDebitFacilityType = directDebitFacilityType;
    }

    public String getDirectDebitFacilityType() {
        return directDebitFacilityType;
    }

    public void setDirectDebitFacilityReference(org.museframework.bian.classes.Object directDebitFacilityReference) {
        this.directDebitFacilityReference = directDebitFacilityReference;
    }

    public org.museframework.bian.classes.Object getDirectDebitFacilityReference() {
        return directDebitFacilityReference;
    }

    public void setDirectDebitFacilitySchedule(String directDebitFacilitySchedule) {
        this.directDebitFacilitySchedule = directDebitFacilitySchedule;
    }

    public String getDirectDebitFacilitySchedule() {
        return directDebitFacilitySchedule;
    }

    public void setDirectDebitFacilityStatus(String directDebitFacilityStatus) {
        this.directDebitFacilityStatus = directDebitFacilityStatus;
    }

    public String getDirectDebitFacilityStatus() {
        return directDebitFacilityStatus;
    }

    public void setDirectDebitFacilityCurrency(String directDebitFacilityCurrency) {
        this.directDebitFacilityCurrency = directDebitFacilityCurrency;
    }

    public String getDirectDebitFacilityCurrency() {
        return directDebitFacilityCurrency;
    }

    public void setDirectDebitFacilityRegulationReference(org.museframework.bian.classes.Object directDebitFacilityRegulationReference) {
        this.directDebitFacilityRegulationReference = directDebitFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getDirectDebitFacilityRegulationReference() {
        return directDebitFacilityRegulationReference;
    }

    public void setDirectDebitFacilityRegulationType(String directDebitFacilityRegulationType) {
        this.directDebitFacilityRegulationType = directDebitFacilityRegulationType;
    }

    public String getDirectDebitFacilityRegulationType() {
        return directDebitFacilityRegulationType;
    }

    public void setDirectDebitFacilityJurisdiction(String directDebitFacilityJurisdiction) {
        this.directDebitFacilityJurisdiction = directDebitFacilityJurisdiction;
    }

    public String getDirectDebitFacilityJurisdiction() {
        return directDebitFacilityJurisdiction;
    }

    public void setDirectDebitFacilityBookingLocation(String directDebitFacilityBookingLocation) {
        this.directDebitFacilityBookingLocation = directDebitFacilityBookingLocation;
    }

    public String getDirectDebitFacilityBookingLocation() {
        return directDebitFacilityBookingLocation;
    }

    public void setDirectDebitFacilityAccountType(String directDebitFacilityAccountType) {
        this.directDebitFacilityAccountType = directDebitFacilityAccountType;
    }

    public String getDirectDebitFacilityAccountType() {
        return directDebitFacilityAccountType;
    }

    public void setDirectDebitFacilityAccountReference(org.museframework.bian.classes.Object directDebitFacilityAccountReference) {
        this.directDebitFacilityAccountReference = directDebitFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getDirectDebitFacilityAccountReference() {
        return directDebitFacilityAccountReference;
    }
}