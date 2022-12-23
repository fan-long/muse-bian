/*The Production Performance Assessment Duty is a specific role or responsibility that is one aspect of Production Performance Assessment Duty*/
package org.museframework.bian.brokeredproduct.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BrokeredProductOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Analysis brokeredProductPerformanceAnalysis;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Analysis brokeredProductActivityAnalysis;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan brokeredProductCharter;

    /**/
    @MetaField(ref=true)
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