/*The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine*/
package org.museframework.bian.mutfunadm.dto.bq;

public class MutualFundAdministrationOutcome {
    /**/
    private org.museframework.bian.classes.Analysis mutualFundAdministrationPerformanceAnalysis;

    /**/
    private org.museframework.bian.classes.Analysis mutualFundAdministrationActivityAnalysis;

    /**/
    private org.museframework.bian.classes.Plan mutualFundAdministrationAdministrativePlan;

    /**/
    private org.museframework.bian.classes.Arrangement mutualFundAdministrationAdministrationTask;

    public void setMutualFundAdministrationPerformanceAnalysis(org.museframework.bian.classes.Analysis mutualFundAdministrationPerformanceAnalysis) {
        this.mutualFundAdministrationPerformanceAnalysis = mutualFundAdministrationPerformanceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getMutualFundAdministrationPerformanceAnalysis() {
        return mutualFundAdministrationPerformanceAnalysis;
    }

    public void setMutualFundAdministrationActivityAnalysis(org.museframework.bian.classes.Analysis mutualFundAdministrationActivityAnalysis) {
        this.mutualFundAdministrationActivityAnalysis = mutualFundAdministrationActivityAnalysis;
    }

    public org.museframework.bian.classes.Analysis getMutualFundAdministrationActivityAnalysis() {
        return mutualFundAdministrationActivityAnalysis;
    }

    public void setMutualFundAdministrationAdministrativePlan(org.museframework.bian.classes.Plan mutualFundAdministrationAdministrativePlan) {
        this.mutualFundAdministrationAdministrativePlan = mutualFundAdministrationAdministrativePlan;
    }

    public org.museframework.bian.classes.Plan getMutualFundAdministrationAdministrativePlan() {
        return mutualFundAdministrationAdministrativePlan;
    }

    public void setMutualFundAdministrationAdministrationTask(org.museframework.bian.classes.Arrangement mutualFundAdministrationAdministrationTask) {
        this.mutualFundAdministrationAdministrationTask = mutualFundAdministrationAdministrationTask;
    }

    public org.museframework.bian.classes.Arrangement getMutualFundAdministrationAdministrationTask() {
        return mutualFundAdministrationAdministrationTask;
    }
}