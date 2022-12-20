/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.promotionalevents.dto.bq;

public class ImpactAssessment {
    /*The type of work task (e.g. track market response to promotional event participation)*/
    private String impactAssessmentWorkTaskType;

    /*The make-up of the market tracking task performed, includes consolidation and analysis of market research*/
    private String impactAssessmentWorkTask;

    /*File of consolidated notes, evaluations and findings for the work task*/
    private String impactAssessmentWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task - indication of the need to redirect and/or expand promotional event activity*/
    private String impactAssessmentWorkTaskResult;

    /*The date-time the performance assessment task is performed*/
    private String impactAssessmentWorkTaskDate_Time;

    public void setImpactAssessmentWorkTaskType(String impactAssessmentWorkTaskType) {
        this.impactAssessmentWorkTaskType = impactAssessmentWorkTaskType;
    }

    public String getImpactAssessmentWorkTaskType() {
        return impactAssessmentWorkTaskType;
    }

    public void setImpactAssessmentWorkTask(String impactAssessmentWorkTask) {
        this.impactAssessmentWorkTask = impactAssessmentWorkTask;
    }

    public String getImpactAssessmentWorkTask() {
        return impactAssessmentWorkTask;
    }

    public void setImpactAssessmentWorkTaskWorkProducts(String impactAssessmentWorkTaskWorkProducts) {
        this.impactAssessmentWorkTaskWorkProducts = impactAssessmentWorkTaskWorkProducts;
    }

    public String getImpactAssessmentWorkTaskWorkProducts() {
        return impactAssessmentWorkTaskWorkProducts;
    }

    public void setImpactAssessmentWorkTaskResult(String impactAssessmentWorkTaskResult) {
        this.impactAssessmentWorkTaskResult = impactAssessmentWorkTaskResult;
    }

    public String getImpactAssessmentWorkTaskResult() {
        return impactAssessmentWorkTaskResult;
    }

    public void setImpactAssessmentWorkTaskDate_Time(String impactAssessmentWorkTaskDate_Time) {
        this.impactAssessmentWorkTaskDate_Time = impactAssessmentWorkTaskDate_Time;
    }

    public String getImpactAssessmentWorkTaskDate_Time() {
        return impactAssessmentWorkTaskDate_Time;
    }
}