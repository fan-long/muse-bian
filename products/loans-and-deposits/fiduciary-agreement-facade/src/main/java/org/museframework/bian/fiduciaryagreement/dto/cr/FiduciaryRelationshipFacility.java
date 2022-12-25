/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Fiduciary Agreement. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.fiduciaryagreement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FiduciaryRelationshipFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Fiduciary Relationship Arrangement*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilityParameterType;

    /*A selected optional business service as subject matter of Fiduciary Relationship Arrangement*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilitySelectedOption;

    /*The type of Fiduciary Relationship Arrangement*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilityType;

    /*Reference to Fiduciary Relationship Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fiduciaryRelationshipFacilityReference;

    /*Timetable to fulfill Fiduciary Relationship Arrangement*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilitySchedule;

    /*The status of Fiduciary Relationship Arrangement*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilityStatus;

    /*The curreny which is arranged in Fiduciary Relationship Arrangement*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilityCurrency;

    /*Reference to the regulation which is defined in Fiduciary Relationship Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fiduciaryRelationshipFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Fiduciary Relationship Arrangement*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Fiduciary Relationship Arrangement in case of legal dispute.*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Fiduciary Relationship Arrangement, are entered.*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilityBookingLocation;

    /*The type of account which is linked to Fiduciary Relationship Arrangement*/
    @MetaField(0)
    private String fiduciaryRelationshipFacilityAccountType;

    /*Reference to the account which is linked to Fiduciary Relationship Arrangement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fiduciaryRelationshipFacilityAccountReference;

    public void setFiduciaryRelationshipFacilityParameterType(String fiduciaryRelationshipFacilityParameterType) {
        this.fiduciaryRelationshipFacilityParameterType = fiduciaryRelationshipFacilityParameterType;
    }

    public String getFiduciaryRelationshipFacilityParameterType() {
        return fiduciaryRelationshipFacilityParameterType;
    }

    public void setFiduciaryRelationshipFacilitySelectedOption(String fiduciaryRelationshipFacilitySelectedOption) {
        this.fiduciaryRelationshipFacilitySelectedOption = fiduciaryRelationshipFacilitySelectedOption;
    }

    public String getFiduciaryRelationshipFacilitySelectedOption() {
        return fiduciaryRelationshipFacilitySelectedOption;
    }

    public void setFiduciaryRelationshipFacilityType(String fiduciaryRelationshipFacilityType) {
        this.fiduciaryRelationshipFacilityType = fiduciaryRelationshipFacilityType;
    }

    public String getFiduciaryRelationshipFacilityType() {
        return fiduciaryRelationshipFacilityType;
    }

    public void setFiduciaryRelationshipFacilityReference(org.museframework.bian.classes.Object fiduciaryRelationshipFacilityReference) {
        this.fiduciaryRelationshipFacilityReference = fiduciaryRelationshipFacilityReference;
    }

    public org.museframework.bian.classes.Object getFiduciaryRelationshipFacilityReference() {
        return fiduciaryRelationshipFacilityReference;
    }

    public void setFiduciaryRelationshipFacilitySchedule(String fiduciaryRelationshipFacilitySchedule) {
        this.fiduciaryRelationshipFacilitySchedule = fiduciaryRelationshipFacilitySchedule;
    }

    public String getFiduciaryRelationshipFacilitySchedule() {
        return fiduciaryRelationshipFacilitySchedule;
    }

    public void setFiduciaryRelationshipFacilityStatus(String fiduciaryRelationshipFacilityStatus) {
        this.fiduciaryRelationshipFacilityStatus = fiduciaryRelationshipFacilityStatus;
    }

    public String getFiduciaryRelationshipFacilityStatus() {
        return fiduciaryRelationshipFacilityStatus;
    }

    public void setFiduciaryRelationshipFacilityCurrency(String fiduciaryRelationshipFacilityCurrency) {
        this.fiduciaryRelationshipFacilityCurrency = fiduciaryRelationshipFacilityCurrency;
    }

    public String getFiduciaryRelationshipFacilityCurrency() {
        return fiduciaryRelationshipFacilityCurrency;
    }

    public void setFiduciaryRelationshipFacilityRegulationReference(org.museframework.bian.classes.Object fiduciaryRelationshipFacilityRegulationReference) {
        this.fiduciaryRelationshipFacilityRegulationReference = fiduciaryRelationshipFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getFiduciaryRelationshipFacilityRegulationReference() {
        return fiduciaryRelationshipFacilityRegulationReference;
    }

    public void setFiduciaryRelationshipFacilityRegulationType(String fiduciaryRelationshipFacilityRegulationType) {
        this.fiduciaryRelationshipFacilityRegulationType = fiduciaryRelationshipFacilityRegulationType;
    }

    public String getFiduciaryRelationshipFacilityRegulationType() {
        return fiduciaryRelationshipFacilityRegulationType;
    }

    public void setFiduciaryRelationshipFacilityJurisdiction(String fiduciaryRelationshipFacilityJurisdiction) {
        this.fiduciaryRelationshipFacilityJurisdiction = fiduciaryRelationshipFacilityJurisdiction;
    }

    public String getFiduciaryRelationshipFacilityJurisdiction() {
        return fiduciaryRelationshipFacilityJurisdiction;
    }

    public void setFiduciaryRelationshipFacilityBookingLocation(String fiduciaryRelationshipFacilityBookingLocation) {
        this.fiduciaryRelationshipFacilityBookingLocation = fiduciaryRelationshipFacilityBookingLocation;
    }

    public String getFiduciaryRelationshipFacilityBookingLocation() {
        return fiduciaryRelationshipFacilityBookingLocation;
    }

    public void setFiduciaryRelationshipFacilityAccountType(String fiduciaryRelationshipFacilityAccountType) {
        this.fiduciaryRelationshipFacilityAccountType = fiduciaryRelationshipFacilityAccountType;
    }

    public String getFiduciaryRelationshipFacilityAccountType() {
        return fiduciaryRelationshipFacilityAccountType;
    }

    public void setFiduciaryRelationshipFacilityAccountReference(org.museframework.bian.classes.Object fiduciaryRelationshipFacilityAccountReference) {
        this.fiduciaryRelationshipFacilityAccountReference = fiduciaryRelationshipFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getFiduciaryRelationshipFacilityAccountReference() {
        return fiduciaryRelationshipFacilityAccountReference;
    }
}