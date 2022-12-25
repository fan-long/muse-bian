/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.collections.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CollectionsAssessment {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(0)
    private String collectionsAssessmentPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collectionsAssessmentBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String collectionsAssessmentWorkSchedule;

    /*The Collateral Asset Liquidation Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService collectionsAssessment;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(0)
    private String collectionsAssessmentPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String collectionsAssessmentCollectionsAssessmentServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String collectionsAssessmentCollectionsAssessmentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String collectionsAssessmentCollectionsAssessmentServiceWorkProduct;

    /**/
    @MetaField(0)
    private String collectionsAssessmentCollectionsAssessmentServiceName;

    public void setCollectionsAssessmentPreconditions(String collectionsAssessmentPreconditions) {
        this.collectionsAssessmentPreconditions = collectionsAssessmentPreconditions;
    }

    public String getCollectionsAssessmentPreconditions() {
        return collectionsAssessmentPreconditions;
    }

    public void setCollectionsAssessmentBusinessUnitEmployeeReference(org.museframework.bian.classes.Object collectionsAssessmentBusinessUnitEmployeeReference) {
        this.collectionsAssessmentBusinessUnitEmployeeReference = collectionsAssessmentBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getCollectionsAssessmentBusinessUnitEmployeeReference() {
        return collectionsAssessmentBusinessUnitEmployeeReference;
    }

    public void setCollectionsAssessmentWorkSchedule(String collectionsAssessmentWorkSchedule) {
        this.collectionsAssessmentWorkSchedule = collectionsAssessmentWorkSchedule;
    }

    public String getCollectionsAssessmentWorkSchedule() {
        return collectionsAssessmentWorkSchedule;
    }

    public void setCollectionsAssessment(org.museframework.bian.classes.BusinessService collectionsAssessment) {
        this.collectionsAssessment = collectionsAssessment;
    }

    public org.museframework.bian.classes.BusinessService getCollectionsAssessment() {
        return collectionsAssessment;
    }

    public void setCollectionsAssessmentPostconditions(String collectionsAssessmentPostconditions) {
        this.collectionsAssessmentPostconditions = collectionsAssessmentPostconditions;
    }

    public String getCollectionsAssessmentPostconditions() {
        return collectionsAssessmentPostconditions;
    }

    public void setCollectionsAssessmentCollectionsAssessmentServiceType(String collectionsAssessmentCollectionsAssessmentServiceType) {
        this.collectionsAssessmentCollectionsAssessmentServiceType = collectionsAssessmentCollectionsAssessmentServiceType;
    }

    public String getCollectionsAssessmentCollectionsAssessmentServiceType() {
        return collectionsAssessmentCollectionsAssessmentServiceType;
    }

    public void setCollectionsAssessmentCollectionsAssessmentServiceDescription(String collectionsAssessmentCollectionsAssessmentServiceDescription) {
        this.collectionsAssessmentCollectionsAssessmentServiceDescription = collectionsAssessmentCollectionsAssessmentServiceDescription;
    }

    public String getCollectionsAssessmentCollectionsAssessmentServiceDescription() {
        return collectionsAssessmentCollectionsAssessmentServiceDescription;
    }

    public void setCollectionsAssessmentCollectionsAssessmentServiceInputsandOuputs(String collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs) {
        this.collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs = collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs;
    }

    public String getCollectionsAssessmentCollectionsAssessmentServiceInputsandOuputs() {
        return collectionsAssessmentCollectionsAssessmentServiceInputsandOuputs;
    }

    public void setCollectionsAssessmentCollectionsAssessmentServiceWorkProduct(String collectionsAssessmentCollectionsAssessmentServiceWorkProduct) {
        this.collectionsAssessmentCollectionsAssessmentServiceWorkProduct = collectionsAssessmentCollectionsAssessmentServiceWorkProduct;
    }

    public String getCollectionsAssessmentCollectionsAssessmentServiceWorkProduct() {
        return collectionsAssessmentCollectionsAssessmentServiceWorkProduct;
    }

    public void setCollectionsAssessmentCollectionsAssessmentServiceName(String collectionsAssessmentCollectionsAssessmentServiceName) {
        this.collectionsAssessmentCollectionsAssessmentServiceName = collectionsAssessmentCollectionsAssessmentServiceName;
    }

    public String getCollectionsAssessmentCollectionsAssessmentServiceName() {
        return collectionsAssessmentCollectionsAssessmentServiceName;
    }
}