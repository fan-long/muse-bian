/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Compliance Reporting. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.compliancereporting.dto.bq;

public class ComplianceReportingOutcome {
    /**/
    private String complianceReportingPerformanceAnalysis;

    /**/
    private String complianceReportingActivityAnalysis;

    /**/
    private String complianceReportingAdministrativePlan;

    /**/
    private String complianceReportingAdministrationTask;

    public void setComplianceReportingPerformanceAnalysis(String complianceReportingPerformanceAnalysis) {
        this.complianceReportingPerformanceAnalysis = complianceReportingPerformanceAnalysis;
    }

    public String getComplianceReportingPerformanceAnalysis() {
        return complianceReportingPerformanceAnalysis;
    }

    public void setComplianceReportingActivityAnalysis(String complianceReportingActivityAnalysis) {
        this.complianceReportingActivityAnalysis = complianceReportingActivityAnalysis;
    }

    public String getComplianceReportingActivityAnalysis() {
        return complianceReportingActivityAnalysis;
    }

    public void setComplianceReportingAdministrativePlan(String complianceReportingAdministrativePlan) {
        this.complianceReportingAdministrativePlan = complianceReportingAdministrativePlan;
    }

    public String getComplianceReportingAdministrativePlan() {
        return complianceReportingAdministrativePlan;
    }

    public void setComplianceReportingAdministrationTask(String complianceReportingAdministrationTask) {
        this.complianceReportingAdministrationTask = complianceReportingAdministrationTask;
    }

    public String getComplianceReportingAdministrationTask() {
        return complianceReportingAdministrationTask;
    }
}