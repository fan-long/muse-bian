package org.museframework.bian.cuscamdes.dto;

public class RequestCustomerCampaignSpecificationResponse {
    private org.museframework.bian.cuscamdes.dto.cr.CustomerCampaignSpecification customerCampaignSpecification;

    public void setCustomerCampaignSpecification(org.museframework.bian.cuscamdes.dto.cr.CustomerCampaignSpecification customerCampaignSpecification) {
        this.customerCampaignSpecification = customerCampaignSpecification;
    }

    public org.museframework.bian.cuscamdes.dto.cr.CustomerCampaignSpecification getCustomerCampaignSpecification() {
        return customerCampaignSpecification;
    }
}