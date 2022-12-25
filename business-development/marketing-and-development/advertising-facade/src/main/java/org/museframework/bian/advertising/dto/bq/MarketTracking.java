/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.advertising.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MarketTracking {
    /*The type of work task (e.g. track advertising activity, assess advertising impact)*/
    @MetaField(0)
    private String marketTrackingWorkTaskType;

    /*The make-up of the market tracking task performed, includes consolidation and analysis of market research to assess competitor advertising activity and impact of advertising campaigns*/
    @MetaField(0)
    private String marketTrackingWorkTask;

    /*Reference to an internally maintained market research viewpoint*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object generalMarketResearchDirectoryEntryInstanceReference;

    /*File of consolidated notes, evaluations and findings for the market tracking work task*/
    @MetaField(0)
    private String marketTrackingWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task - typically points of view drawn from the market research*/
    @MetaField(0)
    private String marketTrackingWorkTaskResult;

    /*The date-time the market tracking task is performed*/
    @MetaField(0)
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