/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Regulatory & Legal Authority.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.regandlegaut.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class RegulatoryAndLegalAuthorityRelationshipManagementPlan {
    /*The type of Regulatory&Legal Authority Relationship ManagementPlan*/
    @MetaField
    private String regulatoryAndLegalAuthorityRelationshipManagementPlanType;

    /*Reference to Regulatory&Legal Authority Relationship ManagementPlan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object regulatoryAndLegalAuthorityRelationshipManagementPlanReference;

    /*A Classification value that distinguishes between Budgets within Regulatory&Legal Authority Relationship ManagementPlan according to the type of resource and/or activity that is budgetted*/
    @MetaField
    private String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType;

    /*An estimate of costs, revenues, and resources  over a specified period which is defined for Regulatory&Legal Authority Relationship ManagementPlan*/
    @MetaField
    private String regulatoryAndLegalAuthorityRelationshipManagementPlanBudget;

    /*The allocation of someone or something which is specified for Regulatory&Legal Authority Relationship ManagementPlan*/
    @MetaField
    private String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment;

    /*Reference to  Regulatory&Legal Authority Relationship ManagementPlan */
    @MetaField
    private String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan;

    /*Documentation of Regulatory&Legal Authority Relationship ManagementPlan*/
    @MetaField
    private String regulatoryAndLegalAuthorityRelationshipManagementPlanDescription;

    public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanType(String regulatoryAndLegalAuthorityRelationshipManagementPlanType) {
        this.regulatoryAndLegalAuthorityRelationshipManagementPlanType = regulatoryAndLegalAuthorityRelationshipManagementPlanType;
    }

    public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanType() {
        return regulatoryAndLegalAuthorityRelationshipManagementPlanType;
    }

    public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanReference(org.museframework.bian.classes.Object regulatoryAndLegalAuthorityRelationshipManagementPlanReference) {
        this.regulatoryAndLegalAuthorityRelationshipManagementPlanReference = regulatoryAndLegalAuthorityRelationshipManagementPlanReference;
    }

    public org.museframework.bian.classes.Object getRegulatoryAndLegalAuthorityRelationshipManagementPlanReference() {
        return regulatoryAndLegalAuthorityRelationshipManagementPlanReference;
    }

    public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType(String regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType) {
        this.regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType = regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType;
    }

    public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType() {
        return regulatoryAndLegalAuthorityRelationshipManagementPlanBudgetType;
    }

    public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanBudget(String regulatoryAndLegalAuthorityRelationshipManagementPlanBudget) {
        this.regulatoryAndLegalAuthorityRelationshipManagementPlanBudget = regulatoryAndLegalAuthorityRelationshipManagementPlanBudget;
    }

    public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanBudget() {
        return regulatoryAndLegalAuthorityRelationshipManagementPlanBudget;
    }

    public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanAssignment(String regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment) {
        this.regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment = regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment;
    }

    public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanAssignment() {
        return regulatoryAndLegalAuthorityRelationshipManagementPlanAssignment;
    }

    public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanPlan(String regulatoryAndLegalAuthorityRelationshipManagementPlanPlan) {
        this.regulatoryAndLegalAuthorityRelationshipManagementPlanPlan = regulatoryAndLegalAuthorityRelationshipManagementPlanPlan;
    }

    public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanPlan() {
        return regulatoryAndLegalAuthorityRelationshipManagementPlanPlan;
    }

    public void setRegulatoryAndLegalAuthorityRelationshipManagementPlanDescription(String regulatoryAndLegalAuthorityRelationshipManagementPlanDescription) {
        this.regulatoryAndLegalAuthorityRelationshipManagementPlanDescription = regulatoryAndLegalAuthorityRelationshipManagementPlanDescription;
    }

    public String getRegulatoryAndLegalAuthorityRelationshipManagementPlanDescription() {
        return regulatoryAndLegalAuthorityRelationshipManagementPlanDescription;
    }
}