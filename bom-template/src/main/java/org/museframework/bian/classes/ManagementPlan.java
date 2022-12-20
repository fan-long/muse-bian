/*The course of action to realize goals (of an operational unit of an enterprise).

The management and oversight while running an operational unit of an enterprise. (Generic Artifact)


*/
package org.museframework.bian.classes;

public class ManagementPlan {
    /*The time period addressed by the management plan.*/
    private String managementPlanPeriod;

    /**/
    private Goal managementPlanGoal;

    /**/
    private String managementPlanType;

    /**/
    private String managementPlanDescription;

    public void setManagementPlanPeriod(String managementPlanPeriod) {
        this.managementPlanPeriod = managementPlanPeriod;
    }

    public String getManagementPlanPeriod() {
        return managementPlanPeriod;
    }

    public void setManagementPlanGoal(Goal managementPlanGoal) {
        this.managementPlanGoal = managementPlanGoal;
    }

    public Goal getManagementPlanGoal() {
        return managementPlanGoal;
    }

    public void setManagementPlanType(String managementPlanType) {
        this.managementPlanType = managementPlanType;
    }

    public String getManagementPlanType() {
        return managementPlanType;
    }

    public void setManagementPlanDescription(String managementPlanDescription) {
        this.managementPlanDescription = managementPlanDescription;
    }

    public String getManagementPlanDescription() {
        return managementPlanDescription;
    }
}