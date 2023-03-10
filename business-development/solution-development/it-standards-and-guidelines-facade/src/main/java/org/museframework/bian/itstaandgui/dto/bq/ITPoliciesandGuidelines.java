/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.itstaandgui.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ITPoliciesandGuidelines {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField(0)
    private String ITPoliciesandGuidelinesPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField(0)
    private String ITPoliciesandGuidelinesSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField(0)
    private String ITPoliciesandGuidelinesVersionNumber;

    /*The Technology Standards Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService ITPoliciesandGuidelines;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String ITPoliciesandGuidelinesServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String ITPoliciesandGuidelinesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String ITPoliciesandGuidelinesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String ITPoliciesandGuidelinesServiceWorkProduct;

    /**/
    @MetaField(0)
    private String ITPoliciesandGuidelinesServiceName;

    public void setITPoliciesandGuidelinesPreconditions(String ITPoliciesandGuidelinesPreconditions) {
        this.ITPoliciesandGuidelinesPreconditions = ITPoliciesandGuidelinesPreconditions;
    }

    public String getITPoliciesandGuidelinesPreconditions() {
        return ITPoliciesandGuidelinesPreconditions;
    }

    public void setITPoliciesandGuidelinesSpecificationSchedule(String ITPoliciesandGuidelinesSpecificationSchedule) {
        this.ITPoliciesandGuidelinesSpecificationSchedule = ITPoliciesandGuidelinesSpecificationSchedule;
    }

    public String getITPoliciesandGuidelinesSpecificationSchedule() {
        return ITPoliciesandGuidelinesSpecificationSchedule;
    }

    public void setITPoliciesandGuidelinesVersionNumber(String ITPoliciesandGuidelinesVersionNumber) {
        this.ITPoliciesandGuidelinesVersionNumber = ITPoliciesandGuidelinesVersionNumber;
    }

    public String getITPoliciesandGuidelinesVersionNumber() {
        return ITPoliciesandGuidelinesVersionNumber;
    }

    public void setITPoliciesandGuidelines(org.museframework.bian.classes.BusinessService ITPoliciesandGuidelines) {
        this.ITPoliciesandGuidelines = ITPoliciesandGuidelines;
    }

    public org.museframework.bian.classes.BusinessService getITPoliciesandGuidelines() {
        return ITPoliciesandGuidelines;
    }

    public void setITPoliciesandGuidelinesServiceType(String ITPoliciesandGuidelinesServiceType) {
        this.ITPoliciesandGuidelinesServiceType = ITPoliciesandGuidelinesServiceType;
    }

    public String getITPoliciesandGuidelinesServiceType() {
        return ITPoliciesandGuidelinesServiceType;
    }

    public void setITPoliciesandGuidelinesServiceDescription(String ITPoliciesandGuidelinesServiceDescription) {
        this.ITPoliciesandGuidelinesServiceDescription = ITPoliciesandGuidelinesServiceDescription;
    }

    public String getITPoliciesandGuidelinesServiceDescription() {
        return ITPoliciesandGuidelinesServiceDescription;
    }

    public void setITPoliciesandGuidelinesServiceInputsandOuputs(String ITPoliciesandGuidelinesServiceInputsandOuputs) {
        this.ITPoliciesandGuidelinesServiceInputsandOuputs = ITPoliciesandGuidelinesServiceInputsandOuputs;
    }

    public String getITPoliciesandGuidelinesServiceInputsandOuputs() {
        return ITPoliciesandGuidelinesServiceInputsandOuputs;
    }

    public void setITPoliciesandGuidelinesServiceWorkProduct(String ITPoliciesandGuidelinesServiceWorkProduct) {
        this.ITPoliciesandGuidelinesServiceWorkProduct = ITPoliciesandGuidelinesServiceWorkProduct;
    }

    public String getITPoliciesandGuidelinesServiceWorkProduct() {
        return ITPoliciesandGuidelinesServiceWorkProduct;
    }

    public void setITPoliciesandGuidelinesServiceName(String ITPoliciesandGuidelinesServiceName) {
        this.ITPoliciesandGuidelinesServiceName = ITPoliciesandGuidelinesServiceName;
    }

    public String getITPoliciesandGuidelinesServiceName() {
        return ITPoliciesandGuidelinesServiceName;
    }
}