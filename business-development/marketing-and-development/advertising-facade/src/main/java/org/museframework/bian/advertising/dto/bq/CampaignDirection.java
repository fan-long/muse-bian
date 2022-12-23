/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.advertising.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CampaignDirection {
    /*Schedule of planned and actual advertising campaign design development and refinement activity*/
    @MetaField
    private String advertisingCampaignDevelopmentSchedule;

    /*Schedule of planned and actual customer campaign execution activities*/
    @MetaField
    private String advertisingCampaignExecutionSchedule;

    public void setAdvertisingCampaignDevelopmentSchedule(String advertisingCampaignDevelopmentSchedule) {
        this.advertisingCampaignDevelopmentSchedule = advertisingCampaignDevelopmentSchedule;
    }

    public String getAdvertisingCampaignDevelopmentSchedule() {
        return advertisingCampaignDevelopmentSchedule;
    }

    public void setAdvertisingCampaignExecutionSchedule(String advertisingCampaignExecutionSchedule) {
        this.advertisingCampaignExecutionSchedule = advertisingCampaignExecutionSchedule;
    }

    public String getAdvertisingCampaignExecutionSchedule() {
        return advertisingCampaignExecutionSchedule;
    }
}