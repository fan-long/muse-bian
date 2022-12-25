/*The Production Performance Assessment Duty is a specific role or responsibility that is one aspect of Production Performance Assessment Duty*/
package org.museframework.bian.brokeredproduct.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductionTroubleshootingDuty {
    /*The required status/situation before the duty/obligation can be met*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    @MetaField(0)
    private String schedule;

    /*The Production Troubleshooting Duty specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Production Troubleshooting Duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan brokeredProductManagementPlanReference;

    /*Reference to Production Troubleshooting Duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction productionTroubleshootingDutyReference;

    /*The type of Production Troubleshooting Duty*/
    @MetaField(0)
    private String productionTroubleshootingDutyType;

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

    public void setProductionTroubleshootingDutyReference(org.museframework.bian.classes.PlannedAction productionTroubleshootingDutyReference) {
        this.productionTroubleshootingDutyReference = productionTroubleshootingDutyReference;
    }

    public org.museframework.bian.classes.PlannedAction getProductionTroubleshootingDutyReference() {
        return productionTroubleshootingDutyReference;
    }

    public void setProductionTroubleshootingDutyType(String productionTroubleshootingDutyType) {
        this.productionTroubleshootingDutyType = productionTroubleshootingDutyType;
    }

    public String getProductionTroubleshootingDutyType() {
        return productionTroubleshootingDutyType;
    }
}