/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Hedge Fund Administration. */
package org.museframework.bian.hedfunadm.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.HedgeFundAdministrativePlan
@MetaDto
public class HedgeFundAdministrativePlan {
    /*A Classification value that distinguishes between Budgets within Hedge Fund Administrative Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField(0)
    private String hedgeFundAdministrativePlanBudgetType;

    /*Amount of budget which is arranged whitin Hedge Fund Administrative Plan*/
    @MetaField(0)
    private String hedgeFundAdministrativePlanBudget;

    /*The set of administrative responsibilities defined in Hedge Fund Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement hedgeFundAdministrativePlanDuty;

    /*Party who is involved in Hedge Fund Administrative Plan*/
    @MetaField(0)
    private String hedgeFundAdministrativePlanAssociatedParty;

    /*Balance of budget which is arranged whitin Hedge Fund Administrative Plan*/
    @MetaField(0)
    private String hedgeFundAdministrativePlanBudgetBalance;

    /*The subject matter of Hedge Fund Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object hedgeFundAdministrativePlanSubjectMatter;

    /*The type of Hedge Fund Administrative Plan*/
    @MetaField(0)
    private String hedgeFundAdministrativePlanType;

    /*An unique reference to an item or an occurrence of Hedge Fund Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan hedgeFundAdministrativePlanReference;

    /*Documentation of Hedge Fund Administrative Plan*/
    @MetaField(0)
    private String hedgeFundAdministrativePlanDescription;

    public void setHedgeFundAdministrativePlanBudgetType(String hedgeFundAdministrativePlanBudgetType) {
        this.hedgeFundAdministrativePlanBudgetType = hedgeFundAdministrativePlanBudgetType;
    }

    public String getHedgeFundAdministrativePlanBudgetType() {
        return hedgeFundAdministrativePlanBudgetType;
    }

    public void setHedgeFundAdministrativePlanBudget(String hedgeFundAdministrativePlanBudget) {
        this.hedgeFundAdministrativePlanBudget = hedgeFundAdministrativePlanBudget;
    }

    public String getHedgeFundAdministrativePlanBudget() {
        return hedgeFundAdministrativePlanBudget;
    }

    public void setHedgeFundAdministrativePlanDuty(org.museframework.bian.classes.Arrangement hedgeFundAdministrativePlanDuty) {
        this.hedgeFundAdministrativePlanDuty = hedgeFundAdministrativePlanDuty;
    }

    public org.museframework.bian.classes.Arrangement getHedgeFundAdministrativePlanDuty() {
        return hedgeFundAdministrativePlanDuty;
    }

    public void setHedgeFundAdministrativePlanAssociatedParty(String hedgeFundAdministrativePlanAssociatedParty) {
        this.hedgeFundAdministrativePlanAssociatedParty = hedgeFundAdministrativePlanAssociatedParty;
    }

    public String getHedgeFundAdministrativePlanAssociatedParty() {
        return hedgeFundAdministrativePlanAssociatedParty;
    }

    public void setHedgeFundAdministrativePlanBudgetBalance(String hedgeFundAdministrativePlanBudgetBalance) {
        this.hedgeFundAdministrativePlanBudgetBalance = hedgeFundAdministrativePlanBudgetBalance;
    }

    public String getHedgeFundAdministrativePlanBudgetBalance() {
        return hedgeFundAdministrativePlanBudgetBalance;
    }

    public void setHedgeFundAdministrativePlanSubjectMatter(org.museframework.bian.classes.Object hedgeFundAdministrativePlanSubjectMatter) {
        this.hedgeFundAdministrativePlanSubjectMatter = hedgeFundAdministrativePlanSubjectMatter;
    }

    public org.museframework.bian.classes.Object getHedgeFundAdministrativePlanSubjectMatter() {
        return hedgeFundAdministrativePlanSubjectMatter;
    }

    public void setHedgeFundAdministrativePlanType(String hedgeFundAdministrativePlanType) {
        this.hedgeFundAdministrativePlanType = hedgeFundAdministrativePlanType;
    }

    public String getHedgeFundAdministrativePlanType() {
        return hedgeFundAdministrativePlanType;
    }

    public void setHedgeFundAdministrativePlanReference(org.museframework.bian.classes.Plan hedgeFundAdministrativePlanReference) {
        this.hedgeFundAdministrativePlanReference = hedgeFundAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getHedgeFundAdministrativePlanReference() {
        return hedgeFundAdministrativePlanReference;
    }

    public void setHedgeFundAdministrativePlanDescription(String hedgeFundAdministrativePlanDescription) {
        this.hedgeFundAdministrativePlanDescription = hedgeFundAdministrativePlanDescription;
    }

    public String getHedgeFundAdministrativePlanDescription() {
        return hedgeFundAdministrativePlanDescription;
    }
}