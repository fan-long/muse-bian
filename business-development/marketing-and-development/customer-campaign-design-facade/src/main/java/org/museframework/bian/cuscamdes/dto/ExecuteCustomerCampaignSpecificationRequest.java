package org.museframework.bian.cuscamdes.dto;

public class ExecuteCustomerCampaignSpecificationRequest {
    private String customercampaigndesignid;

    private org.museframework.bian.cuscamdes.dto.cr.CustomerCampaignSpecification customerCampaignSpecification;

    public void setCustomercampaigndesignid(String customercampaigndesignid) {
        this.customercampaigndesignid = customercampaigndesignid;
    }

    public String getCustomercampaigndesignid() {
        return customercampaigndesignid;
    }

    public void setCustomerCampaignSpecification(org.museframework.bian.cuscamdes.dto.cr.CustomerCampaignSpecification customerCampaignSpecification) {
        this.customerCampaignSpecification = customerCampaignSpecification;
    }

    public org.museframework.bian.cuscamdes.dto.cr.CustomerCampaignSpecification getCustomerCampaignSpecification() {
        return customerCampaignSpecification;
    }
}