/*Metric that is defined to assess the target and actual impact of the campaign
*/
package org.museframework.bian.classes;

public class CampaignAssessmentMetric {
    /**/
    private String metricDefinition;

    /**/
    private String metricGoal;

    public void setMetricDefinition(String metricDefinition) {
        this.metricDefinition = metricDefinition;
    }

    public String getMetricDefinition() {
        return metricDefinition;
    }

    public void setMetricGoal(String metricGoal) {
        this.metricGoal = metricGoal;
    }

    public String getMetricGoal() {
        return metricGoal;
    }
}