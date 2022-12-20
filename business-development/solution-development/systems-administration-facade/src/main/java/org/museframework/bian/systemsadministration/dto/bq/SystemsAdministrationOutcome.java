/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.systemsadministration.dto.bq;

public class SystemsAdministrationOutcome {
    /**/
    private String systemsAdministrationPerformanceAnalysis;

    /**/
    private String systemsAdministrationActivityAnalysis;

    /**/
    private String systemsAdministrationAdministrativePlan;

    /**/
    private String systemsAdministrationAdministrationTask;

    public void setSystemsAdministrationPerformanceAnalysis(String systemsAdministrationPerformanceAnalysis) {
        this.systemsAdministrationPerformanceAnalysis = systemsAdministrationPerformanceAnalysis;
    }

    public String getSystemsAdministrationPerformanceAnalysis() {
        return systemsAdministrationPerformanceAnalysis;
    }

    public void setSystemsAdministrationActivityAnalysis(String systemsAdministrationActivityAnalysis) {
        this.systemsAdministrationActivityAnalysis = systemsAdministrationActivityAnalysis;
    }

    public String getSystemsAdministrationActivityAnalysis() {
        return systemsAdministrationActivityAnalysis;
    }

    public void setSystemsAdministrationAdministrativePlan(String systemsAdministrationAdministrativePlan) {
        this.systemsAdministrationAdministrativePlan = systemsAdministrationAdministrativePlan;
    }

    public String getSystemsAdministrationAdministrativePlan() {
        return systemsAdministrationAdministrativePlan;
    }

    public void setSystemsAdministrationAdministrationTask(String systemsAdministrationAdministrationTask) {
        this.systemsAdministrationAdministrationTask = systemsAdministrationAdministrationTask;
    }

    public String getSystemsAdministrationAdministrationTask() {
        return systemsAdministrationAdministrationTask;
    }
}