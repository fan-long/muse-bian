/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.cuscamman.dto.bq;

public class CampaignDirection {
    /*Schedule of planned and actual customer campaign design development and refinement activity*/
    private String customerCampaignDevelopmentSchedule;

    /*Schedule of planned and actual customer campaign execution activities*/
    private String customerCampaignExecutionSchedule;

    public void setCustomerCampaignDevelopmentSchedule(String customerCampaignDevelopmentSchedule) {
        this.customerCampaignDevelopmentSchedule = customerCampaignDevelopmentSchedule;
    }

    public String getCustomerCampaignDevelopmentSchedule() {
        return customerCampaignDevelopmentSchedule;
    }

    public void setCustomerCampaignExecutionSchedule(String customerCampaignExecutionSchedule) {
        this.customerCampaignExecutionSchedule = customerCampaignExecutionSchedule;
    }

    public String getCustomerCampaignExecutionSchedule() {
        return customerCampaignExecutionSchedule;
    }
}