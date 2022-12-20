package org.museframework.bian.cuscamexe.dto;

public class InitiateCustomerCampaignProcedureResponse {
    private org.museframework.bian.cuscamexe.dto.cr.CustomerCampaignProcedure customerCampaignProcedure;

    public void setCustomerCampaignProcedure(org.museframework.bian.cuscamexe.dto.cr.CustomerCampaignProcedure customerCampaignProcedure) {
        this.customerCampaignProcedure = customerCampaignProcedure;
    }

    public org.museframework.bian.cuscamexe.dto.cr.CustomerCampaignProcedure getCustomerCampaignProcedure() {
        return customerCampaignProcedure;
    }
}