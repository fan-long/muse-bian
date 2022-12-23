package org.museframework.bian.cuscamdes.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCustomerCampaignSpecificationRequest {
    @MetaField
    private String customercampaigndesignid;

    @MetaField(ref=true)
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