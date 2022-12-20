/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.seractana.dto.bq;

public class RootCauseAlgorithm {
    /*Defines the algorithm used and its intended analytical insights*/
    private String servicingActivityRootCauseAlgorithmSpecification;

    /*The type of work task (e.g. consolidate servicing activity history, apply pattern detection, refine/qualify detected servicing pattern definition)*/
    private String servicingActivityRootCauseAnalysisWorkTaskType;

    /*The make-up/schedule of the work task performed*/
    private String servicingActivityRootCauseAnalysisWorkTask;

    /*File of consolidated notes, evaluations and findings for the work task*/
    private String servicingActivityRootCauseAnalysisWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task - indication of the nature of any identified servicing patterns and the associated root cause hypotheses*/
    private String servicingActivityRootCauseAnalysisWorkTaskResult;

    /*The date-time the specific work task is performed*/
    private String servicingActivityRootCauseAnalysisWorkTaskDate_Time;

    public void setServicingActivityRootCauseAlgorithmSpecification(String servicingActivityRootCauseAlgorithmSpecification) {
        this.servicingActivityRootCauseAlgorithmSpecification = servicingActivityRootCauseAlgorithmSpecification;
    }

    public String getServicingActivityRootCauseAlgorithmSpecification() {
        return servicingActivityRootCauseAlgorithmSpecification;
    }

    public void setServicingActivityRootCauseAnalysisWorkTaskType(String servicingActivityRootCauseAnalysisWorkTaskType) {
        this.servicingActivityRootCauseAnalysisWorkTaskType = servicingActivityRootCauseAnalysisWorkTaskType;
    }

    public String getServicingActivityRootCauseAnalysisWorkTaskType() {
        return servicingActivityRootCauseAnalysisWorkTaskType;
    }

    public void setServicingActivityRootCauseAnalysisWorkTask(String servicingActivityRootCauseAnalysisWorkTask) {
        this.servicingActivityRootCauseAnalysisWorkTask = servicingActivityRootCauseAnalysisWorkTask;
    }

    public String getServicingActivityRootCauseAnalysisWorkTask() {
        return servicingActivityRootCauseAnalysisWorkTask;
    }

    public void setServicingActivityRootCauseAnalysisWorkTaskWorkProducts(String servicingActivityRootCauseAnalysisWorkTaskWorkProducts) {
        this.servicingActivityRootCauseAnalysisWorkTaskWorkProducts = servicingActivityRootCauseAnalysisWorkTaskWorkProducts;
    }

    public String getServicingActivityRootCauseAnalysisWorkTaskWorkProducts() {
        return servicingActivityRootCauseAnalysisWorkTaskWorkProducts;
    }

    public void setServicingActivityRootCauseAnalysisWorkTaskResult(String servicingActivityRootCauseAnalysisWorkTaskResult) {
        this.servicingActivityRootCauseAnalysisWorkTaskResult = servicingActivityRootCauseAnalysisWorkTaskResult;
    }

    public String getServicingActivityRootCauseAnalysisWorkTaskResult() {
        return servicingActivityRootCauseAnalysisWorkTaskResult;
    }

    public void setServicingActivityRootCauseAnalysisWorkTaskDate_Time(String servicingActivityRootCauseAnalysisWorkTaskDate_Time) {
        this.servicingActivityRootCauseAnalysisWorkTaskDate_Time = servicingActivityRootCauseAnalysisWorkTaskDate_Time;
    }

    public String getServicingActivityRootCauseAnalysisWorkTaskDate_Time() {
        return servicingActivityRootCauseAnalysisWorkTaskDate_Time;
    }
}