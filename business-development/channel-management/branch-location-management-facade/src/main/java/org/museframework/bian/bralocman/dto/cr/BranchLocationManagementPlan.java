/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.bralocman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.BranchLocationManagementPlan
@MetaDto
public class BranchLocationManagementPlan {
    /*The type of Branch Location Management Plan*/
    @MetaField(0)
    private String branchLocationManagementPlanType;

    /*Reference to Branch Location Management Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object branchLocationManagementPlanReference;

    /*A Classification value that distinguishes between Budgets within Branch Location Management Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField(0)
    private String branchLocationManagementPlanBudgetType;

    /*An estimate of costs, revenues, and resources  over a specified period which is defined for Branch Location Management Plan*/
    @MetaField(0)
    private String branchLocationManagementPlanBudget;

    /*The allocation of someone or something which is specified for Branch Location Management Plan*/
    @MetaField(0)
    private String branchLocationManagementPlanAssignment;

    /*Reference to  Branch Location Management Plan */
    @MetaField(0)
    private String branchLocationManagementPlanPlan;

    /*Documentation of Branch Location Management Plan*/
    @MetaField(0)
    private String branchLocationManagementPlanDescription;

    public void setBranchLocationManagementPlanType(String branchLocationManagementPlanType) {
        this.branchLocationManagementPlanType = branchLocationManagementPlanType;
    }

    public String getBranchLocationManagementPlanType() {
        return branchLocationManagementPlanType;
    }

    public void setBranchLocationManagementPlanReference(org.museframework.bian.classes.Object branchLocationManagementPlanReference) {
        this.branchLocationManagementPlanReference = branchLocationManagementPlanReference;
    }

    public org.museframework.bian.classes.Object getBranchLocationManagementPlanReference() {
        return branchLocationManagementPlanReference;
    }

    public void setBranchLocationManagementPlanBudgetType(String branchLocationManagementPlanBudgetType) {
        this.branchLocationManagementPlanBudgetType = branchLocationManagementPlanBudgetType;
    }

    public String getBranchLocationManagementPlanBudgetType() {
        return branchLocationManagementPlanBudgetType;
    }

    public void setBranchLocationManagementPlanBudget(String branchLocationManagementPlanBudget) {
        this.branchLocationManagementPlanBudget = branchLocationManagementPlanBudget;
    }

    public String getBranchLocationManagementPlanBudget() {
        return branchLocationManagementPlanBudget;
    }

    public void setBranchLocationManagementPlanAssignment(String branchLocationManagementPlanAssignment) {
        this.branchLocationManagementPlanAssignment = branchLocationManagementPlanAssignment;
    }

    public String getBranchLocationManagementPlanAssignment() {
        return branchLocationManagementPlanAssignment;
    }

    public void setBranchLocationManagementPlanPlan(String branchLocationManagementPlanPlan) {
        this.branchLocationManagementPlanPlan = branchLocationManagementPlanPlan;
    }

    public String getBranchLocationManagementPlanPlan() {
        return branchLocationManagementPlanPlan;
    }

    public void setBranchLocationManagementPlanDescription(String branchLocationManagementPlanDescription) {
        this.branchLocationManagementPlanDescription = branchLocationManagementPlanDescription;
    }

    public String getBranchLocationManagementPlanDescription() {
        return branchLocationManagementPlanDescription;
    }
}