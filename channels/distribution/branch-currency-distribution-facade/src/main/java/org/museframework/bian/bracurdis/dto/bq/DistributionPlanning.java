/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.bracurdis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DistributionPlanning {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(0)
    private String distributionPlanningPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object distributionPlanningBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String distributionPlanningWorkSchedule;

    /*The Cash Distribution Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService distributionPlanning;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(0)
    private String distributionPlanningPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String distributionPlanningDistributionPlanningServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String distributionPlanningDistributionPlanningServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String distributionPlanningDistributionPlanningServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String distributionPlanningDistributionPlanningServiceWorkProduct;

    /**/
    @MetaField(0)
    private String distributionPlanningDistributionPlanningServiceName;

    public void setDistributionPlanningPreconditions(String distributionPlanningPreconditions) {
        this.distributionPlanningPreconditions = distributionPlanningPreconditions;
    }

    public String getDistributionPlanningPreconditions() {
        return distributionPlanningPreconditions;
    }

    public void setDistributionPlanningBusinessUnitEmployeeReference(org.museframework.bian.classes.Object distributionPlanningBusinessUnitEmployeeReference) {
        this.distributionPlanningBusinessUnitEmployeeReference = distributionPlanningBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getDistributionPlanningBusinessUnitEmployeeReference() {
        return distributionPlanningBusinessUnitEmployeeReference;
    }

    public void setDistributionPlanningWorkSchedule(String distributionPlanningWorkSchedule) {
        this.distributionPlanningWorkSchedule = distributionPlanningWorkSchedule;
    }

    public String getDistributionPlanningWorkSchedule() {
        return distributionPlanningWorkSchedule;
    }

    public void setDistributionPlanning(org.museframework.bian.classes.BusinessService distributionPlanning) {
        this.distributionPlanning = distributionPlanning;
    }

    public org.museframework.bian.classes.BusinessService getDistributionPlanning() {
        return distributionPlanning;
    }

    public void setDistributionPlanningPostconditions(String distributionPlanningPostconditions) {
        this.distributionPlanningPostconditions = distributionPlanningPostconditions;
    }

    public String getDistributionPlanningPostconditions() {
        return distributionPlanningPostconditions;
    }

    public void setDistributionPlanningDistributionPlanningServiceType(String distributionPlanningDistributionPlanningServiceType) {
        this.distributionPlanningDistributionPlanningServiceType = distributionPlanningDistributionPlanningServiceType;
    }

    public String getDistributionPlanningDistributionPlanningServiceType() {
        return distributionPlanningDistributionPlanningServiceType;
    }

    public void setDistributionPlanningDistributionPlanningServiceDescription(String distributionPlanningDistributionPlanningServiceDescription) {
        this.distributionPlanningDistributionPlanningServiceDescription = distributionPlanningDistributionPlanningServiceDescription;
    }

    public String getDistributionPlanningDistributionPlanningServiceDescription() {
        return distributionPlanningDistributionPlanningServiceDescription;
    }

    public void setDistributionPlanningDistributionPlanningServiceInputsandOuputs(String distributionPlanningDistributionPlanningServiceInputsandOuputs) {
        this.distributionPlanningDistributionPlanningServiceInputsandOuputs = distributionPlanningDistributionPlanningServiceInputsandOuputs;
    }

    public String getDistributionPlanningDistributionPlanningServiceInputsandOuputs() {
        return distributionPlanningDistributionPlanningServiceInputsandOuputs;
    }

    public void setDistributionPlanningDistributionPlanningServiceWorkProduct(String distributionPlanningDistributionPlanningServiceWorkProduct) {
        this.distributionPlanningDistributionPlanningServiceWorkProduct = distributionPlanningDistributionPlanningServiceWorkProduct;
    }

    public String getDistributionPlanningDistributionPlanningServiceWorkProduct() {
        return distributionPlanningDistributionPlanningServiceWorkProduct;
    }

    public void setDistributionPlanningDistributionPlanningServiceName(String distributionPlanningDistributionPlanningServiceName) {
        this.distributionPlanningDistributionPlanningServiceName = distributionPlanningDistributionPlanningServiceName;
    }

    public String getDistributionPlanningDistributionPlanningServiceName() {
        return distributionPlanningDistributionPlanningServiceName;
    }
}