package org.museframework.bian.procamdes.dto;

public class ExecuteProspectCampaignSpecificationRequest {
    private String prospectcampaigndesignid;

    private org.museframework.bian.procamdes.dto.cr.ProspectCampaignSpecification prospectCampaignSpecification;

    public void setProspectcampaigndesignid(String prospectcampaigndesignid) {
        this.prospectcampaigndesignid = prospectcampaigndesignid;
    }

    public String getProspectcampaigndesignid() {
        return prospectcampaigndesignid;
    }

    public void setProspectCampaignSpecification(org.museframework.bian.procamdes.dto.cr.ProspectCampaignSpecification prospectCampaignSpecification) {
        this.prospectCampaignSpecification = prospectCampaignSpecification;
    }

    public org.museframework.bian.procamdes.dto.cr.ProspectCampaignSpecification getProspectCampaignSpecification() {
        return prospectCampaignSpecification;
    }
}