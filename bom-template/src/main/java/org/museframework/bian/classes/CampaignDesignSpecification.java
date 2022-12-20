/*A design specification defined for a campaign  (e.g. customer campaign, prospect campaign)
*/
package org.museframework.bian.classes;

public class CampaignDesignSpecification {
    /**/
    private String campaignDesignSpecificationType;

    public void setCampaignDesignSpecificationType(String campaignDesignSpecificationType) {
        this.campaignDesignSpecificationType = campaignDesignSpecificationType;
    }

    public String getCampaignDesignSpecificationType() {
        return campaignDesignSpecificationType;
    }
}