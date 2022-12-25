/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Virtual Account. */
package org.museframework.bian.virtualaccount.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class VirtualAccountFacility {
    /**/
    @MetaField(0)
    private String virtualAccountFacilityParameterType;

    /**/
    @MetaField(0)
    private String virtualAccountFacilitySelectedOption;

    /**/
    @MetaField(0)
    private String virtualAccountFacilityType;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object virtualAccountFacilityReference;

    /**/
    @MetaField(0)
    private String virtualAccountFacilitySchedule;

    /**/
    @MetaField(0)
    private String virtualAccountFacilityStatus;

    /**/
    @MetaField(0)
    private String virtualAccountFacilityCurrency;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object virtualAccountFacilityRegulationReference;

    /**/
    @MetaField(0)
    private String virtualAccountFacilityRegulationType;

    /**/
    @MetaField(0)
    private String virtualAccountFacilityJurisdiction;

    /**/
    @MetaField(0)
    private String virtualAccountFacilityBookingLocation;

    /**/
    @MetaField(0)
    private String virtualAccountFacilityAccountType;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object virtualAccountFacilityAccountReference;

    public void setVirtualAccountFacilityParameterType(String virtualAccountFacilityParameterType) {
        this.virtualAccountFacilityParameterType = virtualAccountFacilityParameterType;
    }

    public String getVirtualAccountFacilityParameterType() {
        return virtualAccountFacilityParameterType;
    }

    public void setVirtualAccountFacilitySelectedOption(String virtualAccountFacilitySelectedOption) {
        this.virtualAccountFacilitySelectedOption = virtualAccountFacilitySelectedOption;
    }

    public String getVirtualAccountFacilitySelectedOption() {
        return virtualAccountFacilitySelectedOption;
    }

    public void setVirtualAccountFacilityType(String virtualAccountFacilityType) {
        this.virtualAccountFacilityType = virtualAccountFacilityType;
    }

    public String getVirtualAccountFacilityType() {
        return virtualAccountFacilityType;
    }

    public void setVirtualAccountFacilityReference(org.museframework.bian.classes.Object virtualAccountFacilityReference) {
        this.virtualAccountFacilityReference = virtualAccountFacilityReference;
    }

    public org.museframework.bian.classes.Object getVirtualAccountFacilityReference() {
        return virtualAccountFacilityReference;
    }

    public void setVirtualAccountFacilitySchedule(String virtualAccountFacilitySchedule) {
        this.virtualAccountFacilitySchedule = virtualAccountFacilitySchedule;
    }

    public String getVirtualAccountFacilitySchedule() {
        return virtualAccountFacilitySchedule;
    }

    public void setVirtualAccountFacilityStatus(String virtualAccountFacilityStatus) {
        this.virtualAccountFacilityStatus = virtualAccountFacilityStatus;
    }

    public String getVirtualAccountFacilityStatus() {
        return virtualAccountFacilityStatus;
    }

    public void setVirtualAccountFacilityCurrency(String virtualAccountFacilityCurrency) {
        this.virtualAccountFacilityCurrency = virtualAccountFacilityCurrency;
    }

    public String getVirtualAccountFacilityCurrency() {
        return virtualAccountFacilityCurrency;
    }

    public void setVirtualAccountFacilityRegulationReference(org.museframework.bian.classes.Object virtualAccountFacilityRegulationReference) {
        this.virtualAccountFacilityRegulationReference = virtualAccountFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getVirtualAccountFacilityRegulationReference() {
        return virtualAccountFacilityRegulationReference;
    }

    public void setVirtualAccountFacilityRegulationType(String virtualAccountFacilityRegulationType) {
        this.virtualAccountFacilityRegulationType = virtualAccountFacilityRegulationType;
    }

    public String getVirtualAccountFacilityRegulationType() {
        return virtualAccountFacilityRegulationType;
    }

    public void setVirtualAccountFacilityJurisdiction(String virtualAccountFacilityJurisdiction) {
        this.virtualAccountFacilityJurisdiction = virtualAccountFacilityJurisdiction;
    }

    public String getVirtualAccountFacilityJurisdiction() {
        return virtualAccountFacilityJurisdiction;
    }

    public void setVirtualAccountFacilityBookingLocation(String virtualAccountFacilityBookingLocation) {
        this.virtualAccountFacilityBookingLocation = virtualAccountFacilityBookingLocation;
    }

    public String getVirtualAccountFacilityBookingLocation() {
        return virtualAccountFacilityBookingLocation;
    }

    public void setVirtualAccountFacilityAccountType(String virtualAccountFacilityAccountType) {
        this.virtualAccountFacilityAccountType = virtualAccountFacilityAccountType;
    }

    public String getVirtualAccountFacilityAccountType() {
        return virtualAccountFacilityAccountType;
    }

    public void setVirtualAccountFacilityAccountReference(org.museframework.bian.classes.Object virtualAccountFacilityAccountReference) {
        this.virtualAccountFacilityAccountReference = virtualAccountFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getVirtualAccountFacilityAccountReference() {
        return virtualAccountFacilityAccountReference;
    }
}