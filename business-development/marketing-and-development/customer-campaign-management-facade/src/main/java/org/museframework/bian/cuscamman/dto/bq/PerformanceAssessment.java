/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.cuscamman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PerformanceAssessment {
    /*The type of work task (e.g. track competitor activity, track customer behaviors)*/
    @MetaField(0)
    private String performanceAssessmentWorkTaskType;

    /*The make-up of the market tracking task performed, includes consolidation and analysis of market research to reach specific insights*/
    @MetaField(0)
    private String performanceAssessmentWorkTask;

    /*File of consolidated notes, evaluations and findings for the work task*/
    @MetaField(0)
    private String performanceAssessmentWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task - indication of the need to amend, redirect and/or expand customer campaign activity*/
    @MetaField(0)
    private String performanceAssessmentWorkTaskResult;

    /*The date-time the performance assessment task is performed*/
    @MetaField(0)
    private String performanceAssessmentWorkTaskDate_Time;

    public void setPerformanceAssessmentWorkTaskType(String performanceAssessmentWorkTaskType) {
        this.performanceAssessmentWorkTaskType = performanceAssessmentWorkTaskType;
    }

    public String getPerformanceAssessmentWorkTaskType() {
        return performanceAssessmentWorkTaskType;
    }

    public void setPerformanceAssessmentWorkTask(String performanceAssessmentWorkTask) {
        this.performanceAssessmentWorkTask = performanceAssessmentWorkTask;
    }

    public String getPerformanceAssessmentWorkTask() {
        return performanceAssessmentWorkTask;
    }

    public void setPerformanceAssessmentWorkTaskWorkProducts(String performanceAssessmentWorkTaskWorkProducts) {
        this.performanceAssessmentWorkTaskWorkProducts = performanceAssessmentWorkTaskWorkProducts;
    }

    public String getPerformanceAssessmentWorkTaskWorkProducts() {
        return performanceAssessmentWorkTaskWorkProducts;
    }

    public void setPerformanceAssessmentWorkTaskResult(String performanceAssessmentWorkTaskResult) {
        this.performanceAssessmentWorkTaskResult = performanceAssessmentWorkTaskResult;
    }

    public String getPerformanceAssessmentWorkTaskResult() {
        return performanceAssessmentWorkTaskResult;
    }

    public void setPerformanceAssessmentWorkTaskDate_Time(String performanceAssessmentWorkTaskDate_Time) {
        this.performanceAssessmentWorkTaskDate_Time = performanceAssessmentWorkTaskDate_Time;
    }

    public String getPerformanceAssessmentWorkTaskDate_Time() {
        return performanceAssessmentWorkTaskDate_Time;
    }
}