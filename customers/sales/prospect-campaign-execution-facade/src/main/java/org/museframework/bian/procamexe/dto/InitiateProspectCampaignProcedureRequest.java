package org.museframework.bian.procamexe.dto;

public class InitiateProspectCampaignProcedureRequest {
    private org.museframework.bian.procamexe.dto.cr.ProspectCampaignProcedure prospectCampaignProcedure;

    public void setProspectCampaignProcedure(org.museframework.bian.procamexe.dto.cr.ProspectCampaignProcedure prospectCampaignProcedure) {
        this.prospectCampaignProcedure = prospectCampaignProcedure;
    }

    public org.museframework.bian.procamexe.dto.cr.ProspectCampaignProcedure getProspectCampaignProcedure() {
        return prospectCampaignProcedure;
    }
}