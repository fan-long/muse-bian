/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.producttraining.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ContentDevelopment {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(0)
    private String contentDevelopmentPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object contentDevelopmentBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String contentDevelopmentWorkSchedule;

    /*The Product Training Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService contentDevelopment;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(0)
    private String contentDevelopmentPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String contentDevelopmentContentDevelopmentServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String contentDevelopmentContentDevelopmentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String contentDevelopmentContentDevelopmentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String contentDevelopmentContentDevelopmentServiceWorkProduct;

    /**/
    @MetaField(0)
    private String contentDevelopmentContentDevelopmentServiceName;

    public void setContentDevelopmentPreconditions(String contentDevelopmentPreconditions) {
        this.contentDevelopmentPreconditions = contentDevelopmentPreconditions;
    }

    public String getContentDevelopmentPreconditions() {
        return contentDevelopmentPreconditions;
    }

    public void setContentDevelopmentBusinessUnitEmployeeReference(org.museframework.bian.classes.Object contentDevelopmentBusinessUnitEmployeeReference) {
        this.contentDevelopmentBusinessUnitEmployeeReference = contentDevelopmentBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getContentDevelopmentBusinessUnitEmployeeReference() {
        return contentDevelopmentBusinessUnitEmployeeReference;
    }

    public void setContentDevelopmentWorkSchedule(String contentDevelopmentWorkSchedule) {
        this.contentDevelopmentWorkSchedule = contentDevelopmentWorkSchedule;
    }

    public String getContentDevelopmentWorkSchedule() {
        return contentDevelopmentWorkSchedule;
    }

    public void setContentDevelopment(org.museframework.bian.classes.BusinessService contentDevelopment) {
        this.contentDevelopment = contentDevelopment;
    }

    public org.museframework.bian.classes.BusinessService getContentDevelopment() {
        return contentDevelopment;
    }

    public void setContentDevelopmentPostconditions(String contentDevelopmentPostconditions) {
        this.contentDevelopmentPostconditions = contentDevelopmentPostconditions;
    }

    public String getContentDevelopmentPostconditions() {
        return contentDevelopmentPostconditions;
    }

    public void setContentDevelopmentContentDevelopmentServiceType(String contentDevelopmentContentDevelopmentServiceType) {
        this.contentDevelopmentContentDevelopmentServiceType = contentDevelopmentContentDevelopmentServiceType;
    }

    public String getContentDevelopmentContentDevelopmentServiceType() {
        return contentDevelopmentContentDevelopmentServiceType;
    }

    public void setContentDevelopmentContentDevelopmentServiceDescription(String contentDevelopmentContentDevelopmentServiceDescription) {
        this.contentDevelopmentContentDevelopmentServiceDescription = contentDevelopmentContentDevelopmentServiceDescription;
    }

    public String getContentDevelopmentContentDevelopmentServiceDescription() {
        return contentDevelopmentContentDevelopmentServiceDescription;
    }

    public void setContentDevelopmentContentDevelopmentServiceInputsandOuputs(String contentDevelopmentContentDevelopmentServiceInputsandOuputs) {
        this.contentDevelopmentContentDevelopmentServiceInputsandOuputs = contentDevelopmentContentDevelopmentServiceInputsandOuputs;
    }

    public String getContentDevelopmentContentDevelopmentServiceInputsandOuputs() {
        return contentDevelopmentContentDevelopmentServiceInputsandOuputs;
    }

    public void setContentDevelopmentContentDevelopmentServiceWorkProduct(String contentDevelopmentContentDevelopmentServiceWorkProduct) {
        this.contentDevelopmentContentDevelopmentServiceWorkProduct = contentDevelopmentContentDevelopmentServiceWorkProduct;
    }

    public String getContentDevelopmentContentDevelopmentServiceWorkProduct() {
        return contentDevelopmentContentDevelopmentServiceWorkProduct;
    }

    public void setContentDevelopmentContentDevelopmentServiceName(String contentDevelopmentContentDevelopmentServiceName) {
        this.contentDevelopmentContentDevelopmentServiceName = contentDevelopmentContentDevelopmentServiceName;
    }

    public String getContentDevelopmentContentDevelopmentServiceName() {
        return contentDevelopmentContentDevelopmentServiceName;
    }
}