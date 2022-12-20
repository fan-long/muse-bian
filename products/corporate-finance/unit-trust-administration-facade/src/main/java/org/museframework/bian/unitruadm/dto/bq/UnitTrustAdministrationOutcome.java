/*The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine*/
package org.museframework.bian.unitruadm.dto.bq;

public class UnitTrustAdministrationOutcome {
    /**/
    private org.museframework.bian.classes.Analysis unitTrustAdministrationPerformanceAnalysis;

    /**/
    private org.museframework.bian.classes.Analysis unitTrustAdministrationActivityAnalysis;

    /**/
    private org.museframework.bian.classes.Plan unitTrustAdministrationAdministrativePlan;

    /**/
    private org.museframework.bian.classes.Arrangement unitTrustAdministrationAdministrationTask;

    public void setUnitTrustAdministrationPerformanceAnalysis(org.museframework.bian.classes.Analysis unitTrustAdministrationPerformanceAnalysis) {
        this.unitTrustAdministrationPerformanceAnalysis = unitTrustAdministrationPerformanceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getUnitTrustAdministrationPerformanceAnalysis() {
        return unitTrustAdministrationPerformanceAnalysis;
    }

    public void setUnitTrustAdministrationActivityAnalysis(org.museframework.bian.classes.Analysis unitTrustAdministrationActivityAnalysis) {
        this.unitTrustAdministrationActivityAnalysis = unitTrustAdministrationActivityAnalysis;
    }

    public org.museframework.bian.classes.Analysis getUnitTrustAdministrationActivityAnalysis() {
        return unitTrustAdministrationActivityAnalysis;
    }

    public void setUnitTrustAdministrationAdministrativePlan(org.museframework.bian.classes.Plan unitTrustAdministrationAdministrativePlan) {
        this.unitTrustAdministrationAdministrativePlan = unitTrustAdministrationAdministrativePlan;
    }

    public org.museframework.bian.classes.Plan getUnitTrustAdministrationAdministrativePlan() {
        return unitTrustAdministrationAdministrativePlan;
    }

    public void setUnitTrustAdministrationAdministrationTask(org.museframework.bian.classes.Arrangement unitTrustAdministrationAdministrationTask) {
        this.unitTrustAdministrationAdministrationTask = unitTrustAdministrationAdministrationTask;
    }

    public org.museframework.bian.classes.Arrangement getUnitTrustAdministrationAdministrationTask() {
        return unitTrustAdministrationAdministrationTask;
    }
}