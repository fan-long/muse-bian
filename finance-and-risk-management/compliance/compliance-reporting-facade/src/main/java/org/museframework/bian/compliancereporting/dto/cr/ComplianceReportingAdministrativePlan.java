/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Compliance Reporting. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.compliancereporting.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ComplianceReportingAdministrativePlan
@MetaDto
public class ComplianceReportingAdministrativePlan {
    /*A Classification value that distinguishes between Budgets within Compliance Reporting Administrative Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField
    private String complianceReportingAdministrativePlanBudgetType;

    /*An estimate of costs, revenues, and resources  over a specified period which is defined for Compliance Reporting Administrative Plan*/
    @MetaField
    private String complianceReportingAdministrativePlanBudget;

    /*The allocation of someone or something which is specified for Compliance Reporting Administrative Plan*/
    @MetaField
    private String complianceReportingAdministrativePlanAssignment;

    /*A plan that defines clerical support for ComplianceReporting*/
    @MetaField
    private String complianceReportingAdministrativePlanPlan;

    /*Party who is involved in  Compliance Reporting Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object complianceReportingAdministrativePlanReference;

    public void setComplianceReportingAdministrativePlanBudgetType(String complianceReportingAdministrativePlanBudgetType) {
        this.complianceReportingAdministrativePlanBudgetType = complianceReportingAdministrativePlanBudgetType;
    }

    public String getComplianceReportingAdministrativePlanBudgetType() {
        return complianceReportingAdministrativePlanBudgetType;
    }

    public void setComplianceReportingAdministrativePlanBudget(String complianceReportingAdministrativePlanBudget) {
        this.complianceReportingAdministrativePlanBudget = complianceReportingAdministrativePlanBudget;
    }

    public String getComplianceReportingAdministrativePlanBudget() {
        return complianceReportingAdministrativePlanBudget;
    }

    public void setComplianceReportingAdministrativePlanAssignment(String complianceReportingAdministrativePlanAssignment) {
        this.complianceReportingAdministrativePlanAssignment = complianceReportingAdministrativePlanAssignment;
    }

    public String getComplianceReportingAdministrativePlanAssignment() {
        return complianceReportingAdministrativePlanAssignment;
    }

    public void setComplianceReportingAdministrativePlanPlan(String complianceReportingAdministrativePlanPlan) {
        this.complianceReportingAdministrativePlanPlan = complianceReportingAdministrativePlanPlan;
    }

    public String getComplianceReportingAdministrativePlanPlan() {
        return complianceReportingAdministrativePlanPlan;
    }

    public void setComplianceReportingAdministrativePlanReference(org.museframework.bian.classes.Object complianceReportingAdministrativePlanReference) {
        this.complianceReportingAdministrativePlanReference = complianceReportingAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Object getComplianceReportingAdministrativePlanReference() {
        return complianceReportingAdministrativePlanReference;
    }
}