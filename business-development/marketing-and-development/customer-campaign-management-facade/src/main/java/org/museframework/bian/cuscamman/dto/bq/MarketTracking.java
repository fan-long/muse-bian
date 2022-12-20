/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.cuscamman.dto.bq;

public class MarketTracking {
    /*The type of work task (e.g. track competitor activity, track customer behaviors)*/
    private String marketTrackingWorkTaskType;

    /*The make-up of the market tracking task performed, includes consolidation and analysis of market research to reach specific insights*/
    private String marketTrackingWorkTask;

    /*Reference to an internally maintained market research viewpoint*/
    private org.museframework.bian.classes.Object generalMarketResearchDirectoryEntryInstanceReference;

    /*Reference to an internally maintained competitor analysis viewpoint*/
    private org.museframework.bian.classes.Object competitorAnalysisInstanceReference;

    /*Reference to internally maintained customer survey materials*/
    private org.museframework.bian.classes.Object customerSurveyProcedureInstanceReference;

    /*File of consolidated notes, evaluations and findings for the market tracking work task*/
    private String marketTrackingWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task - typically points of view drawn from the market research, competitor research and customer surveys*/
    private String marketTrackingWorkTaskResult;

    /*The date-time the market tracking task is performed*/
    private String marketTrackingWorkTaskDate_Time;

    public void setMarketTrackingWorkTaskType(String marketTrackingWorkTaskType) {
        this.marketTrackingWorkTaskType = marketTrackingWorkTaskType;
    }

    public String getMarketTrackingWorkTaskType() {
        return marketTrackingWorkTaskType;
    }

    public void setMarketTrackingWorkTask(String marketTrackingWorkTask) {
        this.marketTrackingWorkTask = marketTrackingWorkTask;
    }

    public String getMarketTrackingWorkTask() {
        return marketTrackingWorkTask;
    }

    public void setGeneralMarketResearchDirectoryEntryInstanceReference(org.museframework.bian.classes.Object generalMarketResearchDirectoryEntryInstanceReference) {
        this.generalMarketResearchDirectoryEntryInstanceReference = generalMarketResearchDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getGeneralMarketResearchDirectoryEntryInstanceReference() {
        return generalMarketResearchDirectoryEntryInstanceReference;
    }

    public void setCompetitorAnalysisInstanceReference(org.museframework.bian.classes.Object competitorAnalysisInstanceReference) {
        this.competitorAnalysisInstanceReference = competitorAnalysisInstanceReference;
    }

    public org.museframework.bian.classes.Object getCompetitorAnalysisInstanceReference() {
        return competitorAnalysisInstanceReference;
    }

    public void setCustomerSurveyProcedureInstanceReference(org.museframework.bian.classes.Object customerSurveyProcedureInstanceReference) {
        this.customerSurveyProcedureInstanceReference = customerSurveyProcedureInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerSurveyProcedureInstanceReference() {
        return customerSurveyProcedureInstanceReference;
    }

    public void setMarketTrackingWorkTaskWorkProducts(String marketTrackingWorkTaskWorkProducts) {
        this.marketTrackingWorkTaskWorkProducts = marketTrackingWorkTaskWorkProducts;
    }

    public String getMarketTrackingWorkTaskWorkProducts() {
        return marketTrackingWorkTaskWorkProducts;
    }

    public void setMarketTrackingWorkTaskResult(String marketTrackingWorkTaskResult) {
        this.marketTrackingWorkTaskResult = marketTrackingWorkTaskResult;
    }

    public String getMarketTrackingWorkTaskResult() {
        return marketTrackingWorkTaskResult;
    }

    public void setMarketTrackingWorkTaskDate_Time(String marketTrackingWorkTaskDate_Time) {
        this.marketTrackingWorkTaskDate_Time = marketTrackingWorkTaskDate_Time;
    }

    public String getMarketTrackingWorkTaskDate_Time() {
        return marketTrackingWorkTaskDate_Time;
    }
}