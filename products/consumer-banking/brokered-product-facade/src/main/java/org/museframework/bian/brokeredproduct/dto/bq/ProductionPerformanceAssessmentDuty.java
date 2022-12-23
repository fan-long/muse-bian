/*The Production Performance Assessment Duty is a specific role or responsibility that is one aspect of Production Performance Assessment Duty*/
package org.museframework.bian.brokeredproduct.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductionPerformanceAssessmentDuty {
    /*The required status/situation before the duty/obligation can be met*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    @MetaField
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    @MetaField
    private String schedule;

    /*The Production Performance Assessment Duty specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Production Performance Assessment Duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan brokeredProductManagementPlanReference;

    /*Reference to Production Performance Assessment Duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction productionPerformanceAssessmentDutyReference;

    /*The type of Production Performance Assessment Duty*/
    @MetaField
    private String productionPerformanceAssessmentDutyType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setBrokeredProductManagementPlanReference(org.museframework.bian.classes.Plan brokeredProductManagementPlanReference) {
        this.brokeredProductManagementPlanReference = brokeredProductManagementPlanReference;
    }

    public org.museframework.bian.classes.Plan getBrokeredProductManagementPlanReference() {
        return brokeredProductManagementPlanReference;
    }

    public void setProductionPerformanceAssessmentDutyReference(org.museframework.bian.classes.PlannedAction productionPerformanceAssessmentDutyReference) {
        this.productionPerformanceAssessmentDutyReference = productionPerformanceAssessmentDutyReference;
    }

    public org.museframework.bian.classes.PlannedAction getProductionPerformanceAssessmentDutyReference() {
        return productionPerformanceAssessmentDutyReference;
    }

    public void setProductionPerformanceAssessmentDutyType(String productionPerformanceAssessmentDutyType) {
        this.productionPerformanceAssessmentDutyType = productionPerformanceAssessmentDutyType;
    }

    public String getProductionPerformanceAssessmentDutyType() {
        return productionPerformanceAssessmentDutyType;
    }
}