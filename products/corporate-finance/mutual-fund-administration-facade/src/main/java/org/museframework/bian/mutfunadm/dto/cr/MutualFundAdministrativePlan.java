/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Mutual Fund Administration. */
package org.museframework.bian.mutfunadm.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MutualFundAdministrativePlan extends org.museframework.bian.classes.MutualFundAdministrativePlan {
    /*A Classification value that distinguishes between Budgets within Mutual Fund Administrative Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField
    private String mutualFundAdministrativePlanBudgetType;

    /*Amount of budget which is arranged whitin Mutual Fund Administrative Plan*/
    @MetaField
    private String mutualFundAdministrativePlanBudget;

    /*The set of administrative responsibilities defined in Mutual Fund Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement mutualFundAdministrativePlanDuty;

    /*Party who is involved in Mutual Fund Administrative Plan*/
    @MetaField
    private String mutualFundAdministrativePlanAssociatedParty;

    /*Balance of budget which is arranged whitin Mutual Fund Administrative Plan*/
    @MetaField
    private String mutualFundAdministrativePlanBudgetBalance;

    /*The subject matter of Mutual Fund Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object mutualFundAdministrativePlanSubjectMatter;

    /*The type of Mutual Fund Administrative Plan*/
    @MetaField
    private String mutualFundAdministrativePlanType;

    /*An unique reference to an item or an occurrence of Mutual Fund Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan mutualFundAdministrativePlanReference;

    /*Documentation of Mutual Fund Administrative Plan*/
    @MetaField
    private String mutualFundAdministrativePlanDescription;

    public void setMutualFundAdministrativePlanBudgetType(String mutualFundAdministrativePlanBudgetType) {
        this.mutualFundAdministrativePlanBudgetType = mutualFundAdministrativePlanBudgetType;
    }

    public String getMutualFundAdministrativePlanBudgetType() {
        return mutualFundAdministrativePlanBudgetType;
    }

    public void setMutualFundAdministrativePlanBudget(String mutualFundAdministrativePlanBudget) {
        this.mutualFundAdministrativePlanBudget = mutualFundAdministrativePlanBudget;
    }

    public String getMutualFundAdministrativePlanBudget() {
        return mutualFundAdministrativePlanBudget;
    }

    public void setMutualFundAdministrativePlanDuty(org.museframework.bian.classes.Arrangement mutualFundAdministrativePlanDuty) {
        this.mutualFundAdministrativePlanDuty = mutualFundAdministrativePlanDuty;
    }

    public org.museframework.bian.classes.Arrangement getMutualFundAdministrativePlanDuty() {
        return mutualFundAdministrativePlanDuty;
    }

    public void setMutualFundAdministrativePlanAssociatedParty(String mutualFundAdministrativePlanAssociatedParty) {
        this.mutualFundAdministrativePlanAssociatedParty = mutualFundAdministrativePlanAssociatedParty;
    }

    public String getMutualFundAdministrativePlanAssociatedParty() {
        return mutualFundAdministrativePlanAssociatedParty;
    }

    public void setMutualFundAdministrativePlanBudgetBalance(String mutualFundAdministrativePlanBudgetBalance) {
        this.mutualFundAdministrativePlanBudgetBalance = mutualFundAdministrativePlanBudgetBalance;
    }

    public String getMutualFundAdministrativePlanBudgetBalance() {
        return mutualFundAdministrativePlanBudgetBalance;
    }

    public void setMutualFundAdministrativePlanSubjectMatter(org.museframework.bian.classes.Object mutualFundAdministrativePlanSubjectMatter) {
        this.mutualFundAdministrativePlanSubjectMatter = mutualFundAdministrativePlanSubjectMatter;
    }

    public org.museframework.bian.classes.Object getMutualFundAdministrativePlanSubjectMatter() {
        return mutualFundAdministrativePlanSubjectMatter;
    }

    public void setMutualFundAdministrativePlanType(String mutualFundAdministrativePlanType) {
        this.mutualFundAdministrativePlanType = mutualFundAdministrativePlanType;
    }

    public String getMutualFundAdministrativePlanType() {
        return mutualFundAdministrativePlanType;
    }

    public void setMutualFundAdministrativePlanReference(org.museframework.bian.classes.Plan mutualFundAdministrativePlanReference) {
        this.mutualFundAdministrativePlanReference = mutualFundAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getMutualFundAdministrativePlanReference() {
        return mutualFundAdministrativePlanReference;
    }

    public void setMutualFundAdministrativePlanDescription(String mutualFundAdministrativePlanDescription) {
        this.mutualFundAdministrativePlanDescription = mutualFundAdministrativePlanDescription;
    }

    public String getMutualFundAdministrativePlanDescription() {
        return mutualFundAdministrativePlanDescription;
    }
}