/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Brokered Product.*/
package org.museframework.bian.brokeredproduct.dto.cr;

public class BrokeredProductManagementPlan extends org.museframework.bian.classes.BrokeredProductManagementPlan {
    /*The type of Brokered Product Management Plan*/
    private String brokeredProductManagementPlanType;

    /*An unique reference to an item or an occurrence of Brokered Product Management Plan*/
    private org.museframework.bian.classes.Plan brokeredProductManagementPlanReference;

    /*A Classification value that distinguishes between Budgets within Brokered Product Management Plan according to the type of resource and/or activity that is budgetted*/
    private String brokeredProductManagementPlanBudgetType;

    /*Amount of budget which is arranged whitin Brokered Product Management Plan*/
    private String brokeredProductManagementPlanBudget;

    /*The set of management responsibilities defined in Brokered Product Management Plan*/
    private org.museframework.bian.classes.Arrangement brokeredProductManagementPlanDuty;

    /*Documentation of Brokered Product Management Plan*/
    private String brokeredProductManagementPlanDescription;

    /*Balance of budget which is arranged whitin Brokered Product Management Plan*/
    private String brokeredProductManagementPlanBudgetBalance;

    /*Party who is involved in Brokered Product Management Plan*/
    private String brokeredProductManagementPlanAssociatedParty;

    /*The subject matter of Brokered Product Management Plan*/
    private org.museframework.bian.classes.Object brokeredProductManagementPlanSubjectMatter;

    public void setBrokeredProductManagementPlanType(String brokeredProductManagementPlanType) {
        this.brokeredProductManagementPlanType = brokeredProductManagementPlanType;
    }

    public String getBrokeredProductManagementPlanType() {
        return brokeredProductManagementPlanType;
    }

    public void setBrokeredProductManagementPlanReference(org.museframework.bian.classes.Plan brokeredProductManagementPlanReference) {
        this.brokeredProductManagementPlanReference = brokeredProductManagementPlanReference;
    }

    public org.museframework.bian.classes.Plan getBrokeredProductManagementPlanReference() {
        return brokeredProductManagementPlanReference;
    }

    public void setBrokeredProductManagementPlanBudgetType(String brokeredProductManagementPlanBudgetType) {
        this.brokeredProductManagementPlanBudgetType = brokeredProductManagementPlanBudgetType;
    }

    public String getBrokeredProductManagementPlanBudgetType() {
        return brokeredProductManagementPlanBudgetType;
    }

    public void setBrokeredProductManagementPlanBudget(String brokeredProductManagementPlanBudget) {
        this.brokeredProductManagementPlanBudget = brokeredProductManagementPlanBudget;
    }

    public String getBrokeredProductManagementPlanBudget() {
        return brokeredProductManagementPlanBudget;
    }

    public void setBrokeredProductManagementPlanDuty(org.museframework.bian.classes.Arrangement brokeredProductManagementPlanDuty) {
        this.brokeredProductManagementPlanDuty = brokeredProductManagementPlanDuty;
    }

    public org.museframework.bian.classes.Arrangement getBrokeredProductManagementPlanDuty() {
        return brokeredProductManagementPlanDuty;
    }

    public void setBrokeredProductManagementPlanDescription(String brokeredProductManagementPlanDescription) {
        this.brokeredProductManagementPlanDescription = brokeredProductManagementPlanDescription;
    }

    public String getBrokeredProductManagementPlanDescription() {
        return brokeredProductManagementPlanDescription;
    }

    public void setBrokeredProductManagementPlanBudgetBalance(String brokeredProductManagementPlanBudgetBalance) {
        this.brokeredProductManagementPlanBudgetBalance = brokeredProductManagementPlanBudgetBalance;
    }

    public String getBrokeredProductManagementPlanBudgetBalance() {
        return brokeredProductManagementPlanBudgetBalance;
    }

    public void setBrokeredProductManagementPlanAssociatedParty(String brokeredProductManagementPlanAssociatedParty) {
        this.brokeredProductManagementPlanAssociatedParty = brokeredProductManagementPlanAssociatedParty;
    }

    public String getBrokeredProductManagementPlanAssociatedParty() {
        return brokeredProductManagementPlanAssociatedParty;
    }

    public void setBrokeredProductManagementPlanSubjectMatter(org.museframework.bian.classes.Object brokeredProductManagementPlanSubjectMatter) {
        this.brokeredProductManagementPlanSubjectMatter = brokeredProductManagementPlanSubjectMatter;
    }

    public org.museframework.bian.classes.Object getBrokeredProductManagementPlanSubjectMatter() {
        return brokeredProductManagementPlanSubjectMatter;
    }
}