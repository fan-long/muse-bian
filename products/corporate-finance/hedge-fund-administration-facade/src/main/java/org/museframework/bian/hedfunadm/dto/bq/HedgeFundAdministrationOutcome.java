/*The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine*/
package org.museframework.bian.hedfunadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class HedgeFundAdministrationOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Analysis hedgeFundAdministrationPerformanceAnalysis;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Analysis hedgeFundAdministrationActivityAnalysis;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan hedgeFundAdministrationAdministrativePlan;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement hedgeFundAdministrationAdministrationTask;

    public void setHedgeFundAdministrationPerformanceAnalysis(org.museframework.bian.classes.Analysis hedgeFundAdministrationPerformanceAnalysis) {
        this.hedgeFundAdministrationPerformanceAnalysis = hedgeFundAdministrationPerformanceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getHedgeFundAdministrationPerformanceAnalysis() {
        return hedgeFundAdministrationPerformanceAnalysis;
    }

    public void setHedgeFundAdministrationActivityAnalysis(org.museframework.bian.classes.Analysis hedgeFundAdministrationActivityAnalysis) {
        this.hedgeFundAdministrationActivityAnalysis = hedgeFundAdministrationActivityAnalysis;
    }

    public org.museframework.bian.classes.Analysis getHedgeFundAdministrationActivityAnalysis() {
        return hedgeFundAdministrationActivityAnalysis;
    }

    public void setHedgeFundAdministrationAdministrativePlan(org.museframework.bian.classes.Plan hedgeFundAdministrationAdministrativePlan) {
        this.hedgeFundAdministrationAdministrativePlan = hedgeFundAdministrationAdministrativePlan;
    }

    public org.museframework.bian.classes.Plan getHedgeFundAdministrationAdministrativePlan() {
        return hedgeFundAdministrationAdministrativePlan;
    }

    public void setHedgeFundAdministrationAdministrationTask(org.museframework.bian.classes.Arrangement hedgeFundAdministrationAdministrationTask) {
        this.hedgeFundAdministrationAdministrationTask = hedgeFundAdministrationAdministrationTask;
    }

    public org.museframework.bian.classes.Arrangement getHedgeFundAdministrationAdministrationTask() {
        return hedgeFundAdministrationAdministrationTask;
    }
}