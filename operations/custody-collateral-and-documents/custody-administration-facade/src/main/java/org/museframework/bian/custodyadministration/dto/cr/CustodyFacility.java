/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.custodyadministration.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustodyFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Custody Arrangement*/
    @MetaField(0)
    private String custodyFacilityParameterType;

    /*A selected optional business service as subject matter of Custody Arrangement*/
    @MetaField(0)
    private String custodyFacilitySelectedOption;

    /*The type of Custody Arrangement*/
    @MetaField(0)
    private String custodyFacilityType;

    /*Reference to Custody Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object custodyFacilityReference;

    /*Timetable to fulfill Custody Arrangement*/
    @MetaField(0)
    private String custodyFacilitySchedule;

    /*The status of Custody Arrangement*/
    @MetaField(0)
    private String custodyFacilityStatus;

    /*The curreny which is arranged in Custody Arrangement*/
    @MetaField(0)
    private String custodyFacilityCurrency;

    /*Reference to the regulation which is defined in Custody Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object custodyFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Custody Arrangement*/
    @MetaField(0)
    private String custodyFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Custody Arrangement in case of legal dispute.*/
    @MetaField(0)
    private String custodyFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Custody Arrangement, are entered.*/
    @MetaField(0)
    private String custodyFacilityBookingLocation;

    /*The type of account which is linked to Custody Arrangement*/
    @MetaField(0)
    private String custodyFacilityAccountType;

    /*Reference to the account which is linked to Custody Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object custodyFacilityAccountReference;

    public void setCustodyFacilityParameterType(String custodyFacilityParameterType) {
        this.custodyFacilityParameterType = custodyFacilityParameterType;
    }

    public String getCustodyFacilityParameterType() {
        return custodyFacilityParameterType;
    }

    public void setCustodyFacilitySelectedOption(String custodyFacilitySelectedOption) {
        this.custodyFacilitySelectedOption = custodyFacilitySelectedOption;
    }

    public String getCustodyFacilitySelectedOption() {
        return custodyFacilitySelectedOption;
    }

    public void setCustodyFacilityType(String custodyFacilityType) {
        this.custodyFacilityType = custodyFacilityType;
    }

    public String getCustodyFacilityType() {
        return custodyFacilityType;
    }

    public void setCustodyFacilityReference(org.museframework.bian.classes.Object custodyFacilityReference) {
        this.custodyFacilityReference = custodyFacilityReference;
    }

    public org.museframework.bian.classes.Object getCustodyFacilityReference() {
        return custodyFacilityReference;
    }

    public void setCustodyFacilitySchedule(String custodyFacilitySchedule) {
        this.custodyFacilitySchedule = custodyFacilitySchedule;
    }

    public String getCustodyFacilitySchedule() {
        return custodyFacilitySchedule;
    }

    public void setCustodyFacilityStatus(String custodyFacilityStatus) {
        this.custodyFacilityStatus = custodyFacilityStatus;
    }

    public String getCustodyFacilityStatus() {
        return custodyFacilityStatus;
    }

    public void setCustodyFacilityCurrency(String custodyFacilityCurrency) {
        this.custodyFacilityCurrency = custodyFacilityCurrency;
    }

    public String getCustodyFacilityCurrency() {
        return custodyFacilityCurrency;
    }

    public void setCustodyFacilityRegulationReference(org.museframework.bian.classes.Object custodyFacilityRegulationReference) {
        this.custodyFacilityRegulationReference = custodyFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getCustodyFacilityRegulationReference() {
        return custodyFacilityRegulationReference;
    }

    public void setCustodyFacilityRegulationType(String custodyFacilityRegulationType) {
        this.custodyFacilityRegulationType = custodyFacilityRegulationType;
    }

    public String getCustodyFacilityRegulationType() {
        return custodyFacilityRegulationType;
    }

    public void setCustodyFacilityJurisdiction(String custodyFacilityJurisdiction) {
        this.custodyFacilityJurisdiction = custodyFacilityJurisdiction;
    }

    public String getCustodyFacilityJurisdiction() {
        return custodyFacilityJurisdiction;
    }

    public void setCustodyFacilityBookingLocation(String custodyFacilityBookingLocation) {
        this.custodyFacilityBookingLocation = custodyFacilityBookingLocation;
    }

    public String getCustodyFacilityBookingLocation() {
        return custodyFacilityBookingLocation;
    }

    public void setCustodyFacilityAccountType(String custodyFacilityAccountType) {
        this.custodyFacilityAccountType = custodyFacilityAccountType;
    }

    public String getCustodyFacilityAccountType() {
        return custodyFacilityAccountType;
    }

    public void setCustodyFacilityAccountReference(org.museframework.bian.classes.Object custodyFacilityAccountReference) {
        this.custodyFacilityAccountReference = custodyFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getCustodyFacilityAccountReference() {
        return custodyFacilityAccountReference;
    }
}