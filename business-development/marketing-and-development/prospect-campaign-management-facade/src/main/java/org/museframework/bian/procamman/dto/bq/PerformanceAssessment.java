/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.procamman.dto.bq;

public class PerformanceAssessment {
    /*The type of work task (e.g. track competitor activity, track customer behaviors)*/
    private String performanceAssessmentWorkTaskType;

    /*The make-up of the market tracking task performed, includes consolidation and analysis of market research to reach specific insights*/
    private String performanceAssessmentWorkTask;

    /*File of consolidated notes, evaluations and findings for the work task*/
    private String performanceAssessmentWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task - indication of the need to amend, redirect and/or expand prospect campaign activity*/
    private String performanceAssessmentWorkTaskResult;

    /*The date-time the performance assessment task is performed*/
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