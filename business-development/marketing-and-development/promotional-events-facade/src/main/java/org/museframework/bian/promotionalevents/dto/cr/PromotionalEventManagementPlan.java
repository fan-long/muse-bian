/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Promotional Events.*/
package org.museframework.bian.promotionalevents.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.PromotionalEventManagementPlan
@MetaDto
public class PromotionalEventManagementPlan {
    /*The collection of promotional events that is used to assess performance and coverage and support promotional event sponsorship and participation decisions*/
    @MetaField(0)
    private String promotionalEventPortfolio;

    /*The type of promotional event (e.g. sports event, art/entertainment event, media event)*/
    @MetaField(0)
    private String promotionalEventType;

    /*A description of the promotional event that clarifies the required sponsorship and participation and the anticipated marketing impact and target audience*/
    @MetaField(0)
    private String promotionalEventDescription;

    /*Metrics that are defined to assess the target and actual impact of the promotional event*/
    @MetaField(0)
    private String promotionalEventMetrics;

    /*A description of the metric, defining how it is to be measured during and after the event*/
    @MetaField(0)
    private String promotionalEventMetricDefinition;

    /*A description of the target performance for the metric*/
    @MetaField(0)
    private String promotionalEventMetricGoal;

    /*The schedule of involvement in the portfolio/collection of promotional events*/
    @MetaField(0)
    private String promotionalEventSchedule;

    /*Maintains a consolidated record of the impact of the portfolio of promotional events*/
    @MetaField(0)
    private String promotionalEventPerformanceRecord;

    public void setPromotionalEventPortfolio(String promotionalEventPortfolio) {
        this.promotionalEventPortfolio = promotionalEventPortfolio;
    }

    public String getPromotionalEventPortfolio() {
        return promotionalEventPortfolio;
    }

    public void setPromotionalEventType(String promotionalEventType) {
        this.promotionalEventType = promotionalEventType;
    }

    public String getPromotionalEventType() {
        return promotionalEventType;
    }

    public void setPromotionalEventDescription(String promotionalEventDescription) {
        this.promotionalEventDescription = promotionalEventDescription;
    }

    public String getPromotionalEventDescription() {
        return promotionalEventDescription;
    }

    public void setPromotionalEventMetrics(String promotionalEventMetrics) {
        this.promotionalEventMetrics = promotionalEventMetrics;
    }

    public String getPromotionalEventMetrics() {
        return promotionalEventMetrics;
    }

    public void setPromotionalEventMetricDefinition(String promotionalEventMetricDefinition) {
        this.promotionalEventMetricDefinition = promotionalEventMetricDefinition;
    }

    public String getPromotionalEventMetricDefinition() {
        return promotionalEventMetricDefinition;
    }

    public void setPromotionalEventMetricGoal(String promotionalEventMetricGoal) {
        this.promotionalEventMetricGoal = promotionalEventMetricGoal;
    }

    public String getPromotionalEventMetricGoal() {
        return promotionalEventMetricGoal;
    }

    public void setPromotionalEventSchedule(String promotionalEventSchedule) {
        this.promotionalEventSchedule = promotionalEventSchedule;
    }

    public String getPromotionalEventSchedule() {
        return promotionalEventSchedule;
    }

    public void setPromotionalEventPerformanceRecord(String promotionalEventPerformanceRecord) {
        this.promotionalEventPerformanceRecord = promotionalEventPerformanceRecord;
    }

    public String getPromotionalEventPerformanceRecord() {
        return promotionalEventPerformanceRecord;
    }
}