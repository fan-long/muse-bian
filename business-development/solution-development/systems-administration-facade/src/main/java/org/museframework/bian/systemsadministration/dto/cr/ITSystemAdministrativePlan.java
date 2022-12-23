/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.systemsadministration.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ITSystemAdministrativePlan extends org.museframework.bian.classes.ITSystemAdministrativePlan {
    /*A Classification value that distinguishes between Budgets within ITSystem Administrative Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField
    private String ITSystemAdministrativePlanBudgetType;

    /*An estimate of costs, revenues, and resources  over a specified period which is defined for ITSystem Administrative Plan*/
    @MetaField
    private String ITSystemAdministrativePlanBudget;

    /*The allocation of someone or something which is specified for ITSystem Administrative Plan*/
    @MetaField
    private String ITSystemAdministrativePlanAssignment;

    /*A plan that defines clerical support for ITSystem*/
    @MetaField
    private String ITSystemAdministrativePlanPlan;

    /*Party who is involved in  ITSystem Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object ITSystemAdministrativePlanReference;

    public void setITSystemAdministrativePlanBudgetType(String ITSystemAdministrativePlanBudgetType) {
        this.ITSystemAdministrativePlanBudgetType = ITSystemAdministrativePlanBudgetType;
    }

    public String getITSystemAdministrativePlanBudgetType() {
        return ITSystemAdministrativePlanBudgetType;
    }

    public void setITSystemAdministrativePlanBudget(String ITSystemAdministrativePlanBudget) {
        this.ITSystemAdministrativePlanBudget = ITSystemAdministrativePlanBudget;
    }

    public String getITSystemAdministrativePlanBudget() {
        return ITSystemAdministrativePlanBudget;
    }

    public void setITSystemAdministrativePlanAssignment(String ITSystemAdministrativePlanAssignment) {
        this.ITSystemAdministrativePlanAssignment = ITSystemAdministrativePlanAssignment;
    }

    public String getITSystemAdministrativePlanAssignment() {
        return ITSystemAdministrativePlanAssignment;
    }

    public void setITSystemAdministrativePlanPlan(String ITSystemAdministrativePlanPlan) {
        this.ITSystemAdministrativePlanPlan = ITSystemAdministrativePlanPlan;
    }

    public String getITSystemAdministrativePlanPlan() {
        return ITSystemAdministrativePlanPlan;
    }

    public void setITSystemAdministrativePlanReference(org.museframework.bian.classes.Object ITSystemAdministrativePlanReference) {
        this.ITSystemAdministrativePlanReference = ITSystemAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Object getITSystemAdministrativePlanReference() {
        return ITSystemAdministrativePlanReference;
    }
}