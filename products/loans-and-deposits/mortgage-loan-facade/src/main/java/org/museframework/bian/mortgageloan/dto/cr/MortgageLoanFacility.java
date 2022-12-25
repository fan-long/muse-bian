/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Mortgage Loan. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.mortgageloan.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MortgageLoanFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Mortgage Loan Arrangement*/
    @MetaField(0)
    private String mortgageLoanFacilityParameterType;

    /*A selected optional business service as subject matter of Mortgage Loan Arrangement*/
    @MetaField(0)
    private String mortgageLoanFacilitySelectedOption;

    /*The type of Mortgage Loan Arrangement*/
    @MetaField(0)
    private String mortgageLoanFacilityType;

    /*Reference to Mortgage Loan Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object mortgageLoanFacilityReference;

    /*Timetable to fulfill Mortgage Loan Arrangement*/
    @MetaField(0)
    private String mortgageLoanFacilitySchedule;

    /*The status of Mortgage Loan Arrangement*/
    @MetaField(0)
    private String mortgageLoanFacilityStatus;

    /*The curreny which is arranged in Mortgage Loan Arrangement*/
    @MetaField(0)
    private String mortgageLoanFacilityCurrency;

    /*Reference to the regulation which is defined in Mortgage Loan Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object mortgageLoanFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Mortgage Loan Arrangement*/
    @MetaField(0)
    private String mortgageLoanFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Mortgage Loan Arrangement in case of legal dispute.*/
    @MetaField(0)
    private String mortgageLoanFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Mortgage Loan Arrangement, are entered.*/
    @MetaField(0)
    private String mortgageLoanFacilityBookingLocation;

    /*The type of account which is linked to Mortgage Loan Arrangement*/
    @MetaField(0)
    private String mortgageLoanFacilityAccountType;

    /*Reference to the account which is linked to Mortgage Loan Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object mortgageLoanFacilityAccountReference;

    public void setMortgageLoanFacilityParameterType(String mortgageLoanFacilityParameterType) {
        this.mortgageLoanFacilityParameterType = mortgageLoanFacilityParameterType;
    }

    public String getMortgageLoanFacilityParameterType() {
        return mortgageLoanFacilityParameterType;
    }

    public void setMortgageLoanFacilitySelectedOption(String mortgageLoanFacilitySelectedOption) {
        this.mortgageLoanFacilitySelectedOption = mortgageLoanFacilitySelectedOption;
    }

    public String getMortgageLoanFacilitySelectedOption() {
        return mortgageLoanFacilitySelectedOption;
    }

    public void setMortgageLoanFacilityType(String mortgageLoanFacilityType) {
        this.mortgageLoanFacilityType = mortgageLoanFacilityType;
    }

    public String getMortgageLoanFacilityType() {
        return mortgageLoanFacilityType;
    }

    public void setMortgageLoanFacilityReference(org.museframework.bian.classes.Object mortgageLoanFacilityReference) {
        this.mortgageLoanFacilityReference = mortgageLoanFacilityReference;
    }

    public org.museframework.bian.classes.Object getMortgageLoanFacilityReference() {
        return mortgageLoanFacilityReference;
    }

    public void setMortgageLoanFacilitySchedule(String mortgageLoanFacilitySchedule) {
        this.mortgageLoanFacilitySchedule = mortgageLoanFacilitySchedule;
    }

    public String getMortgageLoanFacilitySchedule() {
        return mortgageLoanFacilitySchedule;
    }

    public void setMortgageLoanFacilityStatus(String mortgageLoanFacilityStatus) {
        this.mortgageLoanFacilityStatus = mortgageLoanFacilityStatus;
    }

    public String getMortgageLoanFacilityStatus() {
        return mortgageLoanFacilityStatus;
    }

    public void setMortgageLoanFacilityCurrency(String mortgageLoanFacilityCurrency) {
        this.mortgageLoanFacilityCurrency = mortgageLoanFacilityCurrency;
    }

    public String getMortgageLoanFacilityCurrency() {
        return mortgageLoanFacilityCurrency;
    }

    public void setMortgageLoanFacilityRegulationReference(org.museframework.bian.classes.Object mortgageLoanFacilityRegulationReference) {
        this.mortgageLoanFacilityRegulationReference = mortgageLoanFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getMortgageLoanFacilityRegulationReference() {
        return mortgageLoanFacilityRegulationReference;
    }

    public void setMortgageLoanFacilityRegulationType(String mortgageLoanFacilityRegulationType) {
        this.mortgageLoanFacilityRegulationType = mortgageLoanFacilityRegulationType;
    }

    public String getMortgageLoanFacilityRegulationType() {
        return mortgageLoanFacilityRegulationType;
    }

    public void setMortgageLoanFacilityJurisdiction(String mortgageLoanFacilityJurisdiction) {
        this.mortgageLoanFacilityJurisdiction = mortgageLoanFacilityJurisdiction;
    }

    public String getMortgageLoanFacilityJurisdiction() {
        return mortgageLoanFacilityJurisdiction;
    }

    public void setMortgageLoanFacilityBookingLocation(String mortgageLoanFacilityBookingLocation) {
        this.mortgageLoanFacilityBookingLocation = mortgageLoanFacilityBookingLocation;
    }

    public String getMortgageLoanFacilityBookingLocation() {
        return mortgageLoanFacilityBookingLocation;
    }

    public void setMortgageLoanFacilityAccountType(String mortgageLoanFacilityAccountType) {
        this.mortgageLoanFacilityAccountType = mortgageLoanFacilityAccountType;
    }

    public String getMortgageLoanFacilityAccountType() {
        return mortgageLoanFacilityAccountType;
    }

    public void setMortgageLoanFacilityAccountReference(org.museframework.bian.classes.Object mortgageLoanFacilityAccountReference) {
        this.mortgageLoanFacilityAccountReference = mortgageLoanFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getMortgageLoanFacilityAccountReference() {
        return mortgageLoanFacilityAccountReference;
    }
}