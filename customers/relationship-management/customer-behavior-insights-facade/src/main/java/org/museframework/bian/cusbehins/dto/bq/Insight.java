/*A collection of models/calculations/algoritms that can be applied to a subject or activity

Examples: Average balance calculation, Propensity to buy*/
package org.museframework.bian.cusbehins.dto.bq;

public class Insight {
    /*The type of customer insight developed in this evaluation (e.g. retention candidate, cross-sell candidate)*/
    private String insightEvaluationCustomerInsightType;

    /*Record of a task to develop the customer insight*/
    private String insightEvaluationTask;

    /*The specific details of the analysis (can be a default/standard and scheduled refresh)*/
    private String insightEvaluationRequestSpecification;

    /*Reference to the behavior model used to develop the insight*/
    private org.museframework.bian.classes.Object insightEvaluationCustomerBehaviorModelReference;

    /*The data file, report of production activity used in the analysis*/
    private String insightEvaluationProductandServiceActivityReport;

    /*The Record containing the selected event records from the log*/
    private String insightEvaluationCustomerEventLogReport;

    /*The Record containing the selected event records from the log*/
    private String insightEvaluationServicingEventLogReport;

    /*The Record containing the selected event records from the log*/
    private String insightEvaluationChannelEventLogReport;

    /*The content of a specific market research report or database in any suitable form*/
    private String insightEvaluationMarketResearchReport;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    private String insightEvaluationWorkProducts;

    /*The output from executing the assessment*/
    private String insightEvaluationRequestResult;

    public void setInsightEvaluationCustomerInsightType(String insightEvaluationCustomerInsightType) {
        this.insightEvaluationCustomerInsightType = insightEvaluationCustomerInsightType;
    }

    public String getInsightEvaluationCustomerInsightType() {
        return insightEvaluationCustomerInsightType;
    }

    public void setInsightEvaluationTask(String insightEvaluationTask) {
        this.insightEvaluationTask = insightEvaluationTask;
    }

    public String getInsightEvaluationTask() {
        return insightEvaluationTask;
    }

    public void setInsightEvaluationRequestSpecification(String insightEvaluationRequestSpecification) {
        this.insightEvaluationRequestSpecification = insightEvaluationRequestSpecification;
    }

    public String getInsightEvaluationRequestSpecification() {
        return insightEvaluationRequestSpecification;
    }

    public void setInsightEvaluationCustomerBehaviorModelReference(org.museframework.bian.classes.Object insightEvaluationCustomerBehaviorModelReference) {
        this.insightEvaluationCustomerBehaviorModelReference = insightEvaluationCustomerBehaviorModelReference;
    }

    public org.museframework.bian.classes.Object getInsightEvaluationCustomerBehaviorModelReference() {
        return insightEvaluationCustomerBehaviorModelReference;
    }

    public void setInsightEvaluationProductandServiceActivityReport(String insightEvaluationProductandServiceActivityReport) {
        this.insightEvaluationProductandServiceActivityReport = insightEvaluationProductandServiceActivityReport;
    }

    public String getInsightEvaluationProductandServiceActivityReport() {
        return insightEvaluationProductandServiceActivityReport;
    }

    public void setInsightEvaluationCustomerEventLogReport(String insightEvaluationCustomerEventLogReport) {
        this.insightEvaluationCustomerEventLogReport = insightEvaluationCustomerEventLogReport;
    }

    public String getInsightEvaluationCustomerEventLogReport() {
        return insightEvaluationCustomerEventLogReport;
    }

    public void setInsightEvaluationServicingEventLogReport(String insightEvaluationServicingEventLogReport) {
        this.insightEvaluationServicingEventLogReport = insightEvaluationServicingEventLogReport;
    }

    public String getInsightEvaluationServicingEventLogReport() {
        return insightEvaluationServicingEventLogReport;
    }

    public void setInsightEvaluationChannelEventLogReport(String insightEvaluationChannelEventLogReport) {
        this.insightEvaluationChannelEventLogReport = insightEvaluationChannelEventLogReport;
    }

    public String getInsightEvaluationChannelEventLogReport() {
        return insightEvaluationChannelEventLogReport;
    }

    public void setInsightEvaluationMarketResearchReport(String insightEvaluationMarketResearchReport) {
        this.insightEvaluationMarketResearchReport = insightEvaluationMarketResearchReport;
    }

    public String getInsightEvaluationMarketResearchReport() {
        return insightEvaluationMarketResearchReport;
    }

    public void setInsightEvaluationWorkProducts(String insightEvaluationWorkProducts) {
        this.insightEvaluationWorkProducts = insightEvaluationWorkProducts;
    }

    public String getInsightEvaluationWorkProducts() {
        return insightEvaluationWorkProducts;
    }

    public void setInsightEvaluationRequestResult(String insightEvaluationRequestResult) {
        this.insightEvaluationRequestResult = insightEvaluationRequestResult;
    }

    public String getInsightEvaluationRequestResult() {
        return insightEvaluationRequestResult;
    }
}