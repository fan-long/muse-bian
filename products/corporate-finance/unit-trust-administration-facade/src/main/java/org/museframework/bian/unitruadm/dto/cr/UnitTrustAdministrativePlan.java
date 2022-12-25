/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Unit Trust Administration. */
package org.museframework.bian.unitruadm.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.UnitTrustAdministrativePlan
@MetaDto
public class UnitTrustAdministrativePlan {
    /*A Classification value that distinguishes between Budgets within Unit Trust Administrative Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField(0)
    private String unitTrustAdministrativePlanBudgetType;

    /*Amount of budget which is arranged whitin Unit Trust Administrative Plan*/
    @MetaField(0)
    private String unitTrustAdministrativePlanBudget;

    /*The set of administrative responsibilities defined in Unit Trust Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement unitTrustAdministrativePlanDuty;

    /*Party who is involved in Unit Trust Administrative Plan*/
    @MetaField(0)
    private String unitTrustAdministrativePlanAssociatedParty;

    /*Balance of budget which is arranged whitin Unit Trust Administrative Plan*/
    @MetaField(0)
    private String unitTrustAdministrativePlanBudgetBalance;

    /*The subject matter of Unit Trust Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object unitTrustAdministrativePlanSubjectMatter;

    /*The type of Unit Trust Administrative Plan*/
    @MetaField(0)
    private String unitTrustAdministrativePlanType;

    /*An unique reference to an item or an occurrence of Unit Trust Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan unitTrustAdministrativePlanReference;

    /*Documentation of Unit Trust Administrative Plan*/
    @MetaField(0)
    private String unitTrustAdministrativePlanDescription;

    public void setUnitTrustAdministrativePlanBudgetType(String unitTrustAdministrativePlanBudgetType) {
        this.unitTrustAdministrativePlanBudgetType = unitTrustAdministrativePlanBudgetType;
    }

    public String getUnitTrustAdministrativePlanBudgetType() {
        return unitTrustAdministrativePlanBudgetType;
    }

    public void setUnitTrustAdministrativePlanBudget(String unitTrustAdministrativePlanBudget) {
        this.unitTrustAdministrativePlanBudget = unitTrustAdministrativePlanBudget;
    }

    public String getUnitTrustAdministrativePlanBudget() {
        return unitTrustAdministrativePlanBudget;
    }

    public void setUnitTrustAdministrativePlanDuty(org.museframework.bian.classes.Arrangement unitTrustAdministrativePlanDuty) {
        this.unitTrustAdministrativePlanDuty = unitTrustAdministrativePlanDuty;
    }

    public org.museframework.bian.classes.Arrangement getUnitTrustAdministrativePlanDuty() {
        return unitTrustAdministrativePlanDuty;
    }

    public void setUnitTrustAdministrativePlanAssociatedParty(String unitTrustAdministrativePlanAssociatedParty) {
        this.unitTrustAdministrativePlanAssociatedParty = unitTrustAdministrativePlanAssociatedParty;
    }

    public String getUnitTrustAdministrativePlanAssociatedParty() {
        return unitTrustAdministrativePlanAssociatedParty;
    }

    public void setUnitTrustAdministrativePlanBudgetBalance(String unitTrustAdministrativePlanBudgetBalance) {
        this.unitTrustAdministrativePlanBudgetBalance = unitTrustAdministrativePlanBudgetBalance;
    }

    public String getUnitTrustAdministrativePlanBudgetBalance() {
        return unitTrustAdministrativePlanBudgetBalance;
    }

    public void setUnitTrustAdministrativePlanSubjectMatter(org.museframework.bian.classes.Object unitTrustAdministrativePlanSubjectMatter) {
        this.unitTrustAdministrativePlanSubjectMatter = unitTrustAdministrativePlanSubjectMatter;
    }

    public org.museframework.bian.classes.Object getUnitTrustAdministrativePlanSubjectMatter() {
        return unitTrustAdministrativePlanSubjectMatter;
    }

    public void setUnitTrustAdministrativePlanType(String unitTrustAdministrativePlanType) {
        this.unitTrustAdministrativePlanType = unitTrustAdministrativePlanType;
    }

    public String getUnitTrustAdministrativePlanType() {
        return unitTrustAdministrativePlanType;
    }

    public void setUnitTrustAdministrativePlanReference(org.museframework.bian.classes.Plan unitTrustAdministrativePlanReference) {
        this.unitTrustAdministrativePlanReference = unitTrustAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getUnitTrustAdministrativePlanReference() {
        return unitTrustAdministrativePlanReference;
    }

    public void setUnitTrustAdministrativePlanDescription(String unitTrustAdministrativePlanDescription) {
        this.unitTrustAdministrativePlanDescription = unitTrustAdministrativePlanDescription;
    }

    public String getUnitTrustAdministrativePlanDescription() {
        return unitTrustAdministrativePlanDescription;
    }
}