/*The Production Performance Assessment Duty is a specific role or responsibility that is one aspect of Production Performance Assessment Duty*/
package org.museframework.bian.brokeredproduct.dto.bq;

public class BrokeredProductOutcome {
    /**/
    private org.museframework.bian.classes.Analysis brokeredProductPerformanceAnalysis;

    /**/
    private org.museframework.bian.classes.Analysis brokeredProductActivityAnalysis;

    /**/
    private org.museframework.bian.classes.Plan brokeredProductCharter;

    /**/
    private org.museframework.bian.classes.Project brokeredProductProject;

    public void setBrokeredProductPerformanceAnalysis(org.museframework.bian.classes.Analysis brokeredProductPerformanceAnalysis) {
        this.brokeredProductPerformanceAnalysis = brokeredProductPerformanceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getBrokeredProductPerformanceAnalysis() {
        return brokeredProductPerformanceAnalysis;
    }

    public void setBrokeredProductActivityAnalysis(org.museframework.bian.classes.Analysis brokeredProductActivityAnalysis) {
        this.brokeredProductActivityAnalysis = brokeredProductActivityAnalysis;
    }

    public org.museframework.bian.classes.Analysis getBrokeredProductActivityAnalysis() {
        return brokeredProductActivityAnalysis;
    }

    public void setBrokeredProductCharter(org.museframework.bian.classes.Plan brokeredProductCharter) {
        this.brokeredProductCharter = brokeredProductCharter;
    }

    public org.museframework.bian.classes.Plan getBrokeredProductCharter() {
        return brokeredProductCharter;
    }

    public void setBrokeredProductProject(org.museframework.bian.classes.Project brokeredProductProject) {
        this.brokeredProductProject = brokeredProductProject;
    }

    public org.museframework.bian.classes.Project getBrokeredProductProject() {
        return brokeredProductProject;
    }
}