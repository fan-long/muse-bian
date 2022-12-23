/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.leaiteadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class LeasingItemAdministrationOutcome {
    /**/
    @MetaField
    private String leasingItemAdministrationPerformanceAnalysis;

    /**/
    @MetaField
    private String leasingItemAdministrationActivityAnalysis;

    /**/
    @MetaField
    private String leasingItemAdministrationAdministrativePlan;

    /**/
    @MetaField
    private String leasingItemAdministrationAdministrationTask;

    public void setLeasingItemAdministrationPerformanceAnalysis(String leasingItemAdministrationPerformanceAnalysis) {
        this.leasingItemAdministrationPerformanceAnalysis = leasingItemAdministrationPerformanceAnalysis;
    }

    public String getLeasingItemAdministrationPerformanceAnalysis() {
        return leasingItemAdministrationPerformanceAnalysis;
    }

    public void setLeasingItemAdministrationActivityAnalysis(String leasingItemAdministrationActivityAnalysis) {
        this.leasingItemAdministrationActivityAnalysis = leasingItemAdministrationActivityAnalysis;
    }

    public String getLeasingItemAdministrationActivityAnalysis() {
        return leasingItemAdministrationActivityAnalysis;
    }

    public void setLeasingItemAdministrationAdministrativePlan(String leasingItemAdministrationAdministrativePlan) {
        this.leasingItemAdministrationAdministrativePlan = leasingItemAdministrationAdministrativePlan;
    }

    public String getLeasingItemAdministrationAdministrativePlan() {
        return leasingItemAdministrationAdministrativePlan;
    }

    public void setLeasingItemAdministrationAdministrationTask(String leasingItemAdministrationAdministrationTask) {
        this.leasingItemAdministrationAdministrationTask = leasingItemAdministrationAdministrationTask;
    }

    public String getLeasingItemAdministrationAdministrationTask() {
        return leasingItemAdministrationAdministrationTask;
    }
}