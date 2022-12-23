/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.procamman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CampaignDirection {
    /*Schedule of planned and actual prospect campaign design development and refinement activity*/
    @MetaField
    private String prospectCampaignDevelopmentSchedule;

    /*Schedule of planned and actual prospect campaign execution activities*/
    @MetaField
    private String prospectCampaignExecutionSchedule;

    public void setProspectCampaignDevelopmentSchedule(String prospectCampaignDevelopmentSchedule) {
        this.prospectCampaignDevelopmentSchedule = prospectCampaignDevelopmentSchedule;
    }

    public String getProspectCampaignDevelopmentSchedule() {
        return prospectCampaignDevelopmentSchedule;
    }

    public void setProspectCampaignExecutionSchedule(String prospectCampaignExecutionSchedule) {
        this.prospectCampaignExecutionSchedule = prospectCampaignExecutionSchedule;
    }

    public String getProspectCampaignExecutionSchedule() {
        return prospectCampaignExecutionSchedule;
    }
}