/*A metric to evaluate the customer campaign  
- to assess the target and actual impact of the customer campaign
- to select/identify candidate customers*/
package org.museframework.bian.classes;

public class CustomerCampaignMetric {
    /*A description of the metric, defining how it is to be measured in campaign deployment*/
    private String campaignMetricDefinition;

    /*A description of the target performance for the metric that can be defined for different usage scenarios as appropriate*/
    private String campaignMetricGoal;

    public void setCampaignMetricDefinition(String campaignMetricDefinition) {
        this.campaignMetricDefinition = campaignMetricDefinition;
    }

    public String getCampaignMetricDefinition() {
        return campaignMetricDefinition;
    }

    public void setCampaignMetricGoal(String campaignMetricGoal) {
        this.campaignMetricGoal = campaignMetricGoal;
    }

    public String getCampaignMetricGoal() {
        return campaignMetricGoal;
    }
}