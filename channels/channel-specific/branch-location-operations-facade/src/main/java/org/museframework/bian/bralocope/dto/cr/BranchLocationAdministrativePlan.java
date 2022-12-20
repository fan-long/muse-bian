/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Branch Location Operations. */
package org.museframework.bian.bralocope.dto.cr;

public class BranchLocationAdministrativePlan extends org.museframework.bian.classes.BranchLocationAdministrativePlan {
    /*A Classification value that distinguishes between Budgets within Branch Location Administrative Plan according to the type of resource and/or activity that is budgetted*/
    private String branchLocationAdministrativePlanBudgetType;

    /*Amount of budget which is arranged whitin Branch Location Administrative Plan*/
    private String branchLocationAdministrativePlanBudget;

    /*The set of administrative responsibilities defined in Branch Location Administrative Plan*/
    private org.museframework.bian.classes.Arrangement branchLocationAdministrativePlanDuty;

    /*Party who is involved in Branch Location Administrative Plan*/
    private String branchLocationAdministrativePlanAssociatedParty;

    /*Balance of budget which is arranged whitin Branch Location Administrative Plan*/
    private String branchLocationAdministrativePlanBudgetBalance;

    /*The subject matter of Branch Location Administrative Plan*/
    private org.museframework.bian.classes.Object branchLocationAdministrativePlanSubjectMatter;

    /*The type of Branch Location Administrative Plan*/
    private String branchLocationAdministrativePlanType;

    /*An unique reference to an item or an occurrence of Branch Location Administrative Plan*/
    private org.museframework.bian.classes.Plan branchLocationAdministrativePlanReference;

    /*Documentation of Branch Location Administrative Plan*/
    private String branchLocationAdministrativePlanDescription;

    public void setBranchLocationAdministrativePlanBudgetType(String branchLocationAdministrativePlanBudgetType) {
        this.branchLocationAdministrativePlanBudgetType = branchLocationAdministrativePlanBudgetType;
    }

    public String getBranchLocationAdministrativePlanBudgetType() {
        return branchLocationAdministrativePlanBudgetType;
    }

    public void setBranchLocationAdministrativePlanBudget(String branchLocationAdministrativePlanBudget) {
        this.branchLocationAdministrativePlanBudget = branchLocationAdministrativePlanBudget;
    }

    public String getBranchLocationAdministrativePlanBudget() {
        return branchLocationAdministrativePlanBudget;
    }

    public void setBranchLocationAdministrativePlanDuty(org.museframework.bian.classes.Arrangement branchLocationAdministrativePlanDuty) {
        this.branchLocationAdministrativePlanDuty = branchLocationAdministrativePlanDuty;
    }

    public org.museframework.bian.classes.Arrangement getBranchLocationAdministrativePlanDuty() {
        return branchLocationAdministrativePlanDuty;
    }

    public void setBranchLocationAdministrativePlanAssociatedParty(String branchLocationAdministrativePlanAssociatedParty) {
        this.branchLocationAdministrativePlanAssociatedParty = branchLocationAdministrativePlanAssociatedParty;
    }

    public String getBranchLocationAdministrativePlanAssociatedParty() {
        return branchLocationAdministrativePlanAssociatedParty;
    }

    public void setBranchLocationAdministrativePlanBudgetBalance(String branchLocationAdministrativePlanBudgetBalance) {
        this.branchLocationAdministrativePlanBudgetBalance = branchLocationAdministrativePlanBudgetBalance;
    }

    public String getBranchLocationAdministrativePlanBudgetBalance() {
        return branchLocationAdministrativePlanBudgetBalance;
    }

    public void setBranchLocationAdministrativePlanSubjectMatter(org.museframework.bian.classes.Object branchLocationAdministrativePlanSubjectMatter) {
        this.branchLocationAdministrativePlanSubjectMatter = branchLocationAdministrativePlanSubjectMatter;
    }

    public org.museframework.bian.classes.Object getBranchLocationAdministrativePlanSubjectMatter() {
        return branchLocationAdministrativePlanSubjectMatter;
    }

    public void setBranchLocationAdministrativePlanType(String branchLocationAdministrativePlanType) {
        this.branchLocationAdministrativePlanType = branchLocationAdministrativePlanType;
    }

    public String getBranchLocationAdministrativePlanType() {
        return branchLocationAdministrativePlanType;
    }

    public void setBranchLocationAdministrativePlanReference(org.museframework.bian.classes.Plan branchLocationAdministrativePlanReference) {
        this.branchLocationAdministrativePlanReference = branchLocationAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getBranchLocationAdministrativePlanReference() {
        return branchLocationAdministrativePlanReference;
    }

    public void setBranchLocationAdministrativePlanDescription(String branchLocationAdministrativePlanDescription) {
        this.branchLocationAdministrativePlanDescription = branchLocationAdministrativePlanDescription;
    }

    public String getBranchLocationAdministrativePlanDescription() {
        return branchLocationAdministrativePlanDescription;
    }
}