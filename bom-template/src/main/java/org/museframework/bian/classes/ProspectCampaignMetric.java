/*Metric that is defined to assess the target and actual impact of the campaign*/
package org.museframework.bian.classes;

public class ProspectCampaignMetric {
    /*A description of the metric, defining how it is to be measured in deployment*/
    private String prospectCampaignMetricDefinition;

    /*A description of the target performance for the metric that can be defined for different usage scenarios as appropriate*/
    private String prospectCampaignMetricGoal;

    public void setProspectCampaignMetricDefinition(String prospectCampaignMetricDefinition) {
        this.prospectCampaignMetricDefinition = prospectCampaignMetricDefinition;
    }

    public String getProspectCampaignMetricDefinition() {
        return prospectCampaignMetricDefinition;
    }

    public void setProspectCampaignMetricGoal(String prospectCampaignMetricGoal) {
        this.prospectCampaignMetricGoal = prospectCampaignMetricGoal;
    }

    public String getProspectCampaignMetricGoal() {
        return prospectCampaignMetricGoal;
    }
}