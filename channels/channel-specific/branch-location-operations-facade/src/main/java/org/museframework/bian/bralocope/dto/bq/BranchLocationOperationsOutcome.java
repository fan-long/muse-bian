/*The Non-cash Inventory Handling is an activity that is performed as one aspect of carrying out the Branch Location Administration Plan
*/
package org.museframework.bian.bralocope.dto.bq;

public class BranchLocationOperationsOutcome {
    /**/
    private org.museframework.bian.classes.Analysis branchLocationOperationsPerformanceAnalysis;

    /**/
    private org.museframework.bian.classes.Analysis branchLocationOperationsActivityAnalysis;

    /**/
    private org.museframework.bian.classes.Plan branchLocationOperationsAdministrativePlan;

    /**/
    private org.museframework.bian.classes.Arrangement branchLocationOperationsAdministrationTask;

    public void setBranchLocationOperationsPerformanceAnalysis(org.museframework.bian.classes.Analysis branchLocationOperationsPerformanceAnalysis) {
        this.branchLocationOperationsPerformanceAnalysis = branchLocationOperationsPerformanceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getBranchLocationOperationsPerformanceAnalysis() {
        return branchLocationOperationsPerformanceAnalysis;
    }

    public void setBranchLocationOperationsActivityAnalysis(org.museframework.bian.classes.Analysis branchLocationOperationsActivityAnalysis) {
        this.branchLocationOperationsActivityAnalysis = branchLocationOperationsActivityAnalysis;
    }

    public org.museframework.bian.classes.Analysis getBranchLocationOperationsActivityAnalysis() {
        return branchLocationOperationsActivityAnalysis;
    }

    public void setBranchLocationOperationsAdministrativePlan(org.museframework.bian.classes.Plan branchLocationOperationsAdministrativePlan) {
        this.branchLocationOperationsAdministrativePlan = branchLocationOperationsAdministrativePlan;
    }

    public org.museframework.bian.classes.Plan getBranchLocationOperationsAdministrativePlan() {
        return branchLocationOperationsAdministrativePlan;
    }

    public void setBranchLocationOperationsAdministrationTask(org.museframework.bian.classes.Arrangement branchLocationOperationsAdministrationTask) {
        this.branchLocationOperationsAdministrationTask = branchLocationOperationsAdministrationTask;
    }

    public org.museframework.bian.classes.Arrangement getBranchLocationOperationsAdministrationTask() {
        return branchLocationOperationsAdministrationTask;
    }
}