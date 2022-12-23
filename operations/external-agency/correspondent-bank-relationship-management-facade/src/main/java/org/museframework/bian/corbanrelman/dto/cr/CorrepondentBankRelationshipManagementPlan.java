/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Correspondent Bank Relationship Management.*/
package org.museframework.bian.corbanrelman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorrepondentBankRelationshipManagementPlan {
    /*The type of Correpondent Bank Relationship Management Plan*/
    @MetaField
    private String correpondentBankRelationshipManagementPlanType;

    /*An unique reference to an item or an occurrence of Correpondent Bank Relationship Management Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan correpondentBankRelationshipManagementPlanReference;

    /*A Classification value that distinguishes between Budgets within Correpondent Bank Relationship Management Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField
    private String correpondentBankRelationshipManagementPlanBudgetType;

    /*Amount of budget which is arranged whitin Correpondent Bank Relationship Management Plan*/
    @MetaField
    private String correpondentBankRelationshipManagementPlanBudget;

    /*The set of management responsibilities defined in Correpondent Bank Relationship Management Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement correpondentBankRelationshipManagementPlanDuty;

    /*Documentation of Correpondent Bank Relationship Management Plan*/
    @MetaField
    private String correpondentBankRelationshipManagementPlanDescription;

    /*Balance of budget which is arranged whitin Correpondent Bank Relationship Management Plan*/
    @MetaField
    private String correpondentBankRelationshipManagementPlanBudgetBalance;

    /*Party who is involved in Correpondent Bank Relationship Management Plan*/
    @MetaField
    private String correpondentBankRelationshipManagementPlanAssociatedParty;

    /*The subject matter of Correpondent Bank Relationship Management Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correpondentBankRelationshipManagementPlanSubjectMatter;

    public void setCorrepondentBankRelationshipManagementPlanType(String correpondentBankRelationshipManagementPlanType) {
        this.correpondentBankRelationshipManagementPlanType = correpondentBankRelationshipManagementPlanType;
    }

    public String getCorrepondentBankRelationshipManagementPlanType() {
        return correpondentBankRelationshipManagementPlanType;
    }

    public void setCorrepondentBankRelationshipManagementPlanReference(org.museframework.bian.classes.Plan correpondentBankRelationshipManagementPlanReference) {
        this.correpondentBankRelationshipManagementPlanReference = correpondentBankRelationshipManagementPlanReference;
    }

    public org.museframework.bian.classes.Plan getCorrepondentBankRelationshipManagementPlanReference() {
        return correpondentBankRelationshipManagementPlanReference;
    }

    public void setCorrepondentBankRelationshipManagementPlanBudgetType(String correpondentBankRelationshipManagementPlanBudgetType) {
        this.correpondentBankRelationshipManagementPlanBudgetType = correpondentBankRelationshipManagementPlanBudgetType;
    }

    public String getCorrepondentBankRelationshipManagementPlanBudgetType() {
        return correpondentBankRelationshipManagementPlanBudgetType;
    }

    public void setCorrepondentBankRelationshipManagementPlanBudget(String correpondentBankRelationshipManagementPlanBudget) {
        this.correpondentBankRelationshipManagementPlanBudget = correpondentBankRelationshipManagementPlanBudget;
    }

    public String getCorrepondentBankRelationshipManagementPlanBudget() {
        return correpondentBankRelationshipManagementPlanBudget;
    }

    public void setCorrepondentBankRelationshipManagementPlanDuty(org.museframework.bian.classes.Arrangement correpondentBankRelationshipManagementPlanDuty) {
        this.correpondentBankRelationshipManagementPlanDuty = correpondentBankRelationshipManagementPlanDuty;
    }

    public org.museframework.bian.classes.Arrangement getCorrepondentBankRelationshipManagementPlanDuty() {
        return correpondentBankRelationshipManagementPlanDuty;
    }

    public void setCorrepondentBankRelationshipManagementPlanDescription(String correpondentBankRelationshipManagementPlanDescription) {
        this.correpondentBankRelationshipManagementPlanDescription = correpondentBankRelationshipManagementPlanDescription;
    }

    public String getCorrepondentBankRelationshipManagementPlanDescription() {
        return correpondentBankRelationshipManagementPlanDescription;
    }

    public void setCorrepondentBankRelationshipManagementPlanBudgetBalance(String correpondentBankRelationshipManagementPlanBudgetBalance) {
        this.correpondentBankRelationshipManagementPlanBudgetBalance = correpondentBankRelationshipManagementPlanBudgetBalance;
    }

    public String getCorrepondentBankRelationshipManagementPlanBudgetBalance() {
        return correpondentBankRelationshipManagementPlanBudgetBalance;
    }

    public void setCorrepondentBankRelationshipManagementPlanAssociatedParty(String correpondentBankRelationshipManagementPlanAssociatedParty) {
        this.correpondentBankRelationshipManagementPlanAssociatedParty = correpondentBankRelationshipManagementPlanAssociatedParty;
    }

    public String getCorrepondentBankRelationshipManagementPlanAssociatedParty() {
        return correpondentBankRelationshipManagementPlanAssociatedParty;
    }

    public void setCorrepondentBankRelationshipManagementPlanSubjectMatter(org.museframework.bian.classes.Object correpondentBankRelationshipManagementPlanSubjectMatter) {
        this.correpondentBankRelationshipManagementPlanSubjectMatter = correpondentBankRelationshipManagementPlanSubjectMatter;
    }

    public org.museframework.bian.classes.Object getCorrepondentBankRelationshipManagementPlanSubjectMatter() {
        return correpondentBankRelationshipManagementPlanSubjectMatter;
    }
}