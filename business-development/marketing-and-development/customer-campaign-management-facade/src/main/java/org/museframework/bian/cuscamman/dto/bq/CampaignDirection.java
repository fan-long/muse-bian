/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.cuscamman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CampaignDirection {
    /*Schedule of planned and actual customer campaign design development and refinement activity*/
    @MetaField(0)
    private String customerCampaignDevelopmentSchedule;

    /*Schedule of planned and actual customer campaign execution activities*/
    @MetaField(0)
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