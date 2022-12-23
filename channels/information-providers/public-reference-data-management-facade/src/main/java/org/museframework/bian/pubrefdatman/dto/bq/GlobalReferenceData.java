/*Create and maintain a design for a procedure, product/service model or other such entity  within Public Reference Data Management. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.pubrefdatman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class GlobalReferenceData {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object globalReferenceDataPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object globalReferenceDataSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object globalReferenceDataVersionNumber;

    /*The Global Standard Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService externalReferenceData;

    /*Reference to the specific business service type*/
    @MetaField
    private String externalReferenceDataServiceType;

    /*Description of the performed business service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object externalReferenceDataServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object externalReferenceDataServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object externalReferenceDataServiceWorkProduct;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object externalReferenceDataServiceName;

    public void setGlobalReferenceDataPreconditions(org.museframework.bian.classes.Object globalReferenceDataPreconditions) {
        this.globalReferenceDataPreconditions = globalReferenceDataPreconditions;
    }

    public org.museframework.bian.classes.Object getGlobalReferenceDataPreconditions() {
        return globalReferenceDataPreconditions;
    }

    public void setGlobalReferenceDataSpecificationSchedule(org.museframework.bian.classes.Object globalReferenceDataSpecificationSchedule) {
        this.globalReferenceDataSpecificationSchedule = globalReferenceDataSpecificationSchedule;
    }

    public org.museframework.bian.classes.Object getGlobalReferenceDataSpecificationSchedule() {
        return globalReferenceDataSpecificationSchedule;
    }

    public void setGlobalReferenceDataVersionNumber(org.museframework.bian.classes.Object globalReferenceDataVersionNumber) {
        this.globalReferenceDataVersionNumber = globalReferenceDataVersionNumber;
    }

    public org.museframework.bian.classes.Object getGlobalReferenceDataVersionNumber() {
        return globalReferenceDataVersionNumber;
    }

    public void setExternalReferenceData(org.museframework.bian.classes.BusinessService externalReferenceData) {
        this.externalReferenceData = externalReferenceData;
    }

    public org.museframework.bian.classes.BusinessService getExternalReferenceData() {
        return externalReferenceData;
    }

    public void setExternalReferenceDataServiceType(String externalReferenceDataServiceType) {
        this.externalReferenceDataServiceType = externalReferenceDataServiceType;
    }

    public String getExternalReferenceDataServiceType() {
        return externalReferenceDataServiceType;
    }

    public void setExternalReferenceDataServiceDescription(org.museframework.bian.classes.Object externalReferenceDataServiceDescription) {
        this.externalReferenceDataServiceDescription = externalReferenceDataServiceDescription;
    }

    public org.museframework.bian.classes.Object getExternalReferenceDataServiceDescription() {
        return externalReferenceDataServiceDescription;
    }

    public void setExternalReferenceDataServiceInputsandOuputs(org.museframework.bian.classes.Object externalReferenceDataServiceInputsandOuputs) {
        this.externalReferenceDataServiceInputsandOuputs = externalReferenceDataServiceInputsandOuputs;
    }

    public org.museframework.bian.classes.Object getExternalReferenceDataServiceInputsandOuputs() {
        return externalReferenceDataServiceInputsandOuputs;
    }

    public void setExternalReferenceDataServiceWorkProduct(org.museframework.bian.classes.Object externalReferenceDataServiceWorkProduct) {
        this.externalReferenceDataServiceWorkProduct = externalReferenceDataServiceWorkProduct;
    }

    public org.museframework.bian.classes.Object getExternalReferenceDataServiceWorkProduct() {
        return externalReferenceDataServiceWorkProduct;
    }

    public void setExternalReferenceDataServiceName(org.museframework.bian.classes.Object externalReferenceDataServiceName) {
        this.externalReferenceDataServiceName = externalReferenceDataServiceName;
    }

    public org.museframework.bian.classes.Object getExternalReferenceDataServiceName() {
        return externalReferenceDataServiceName;
    }
}