package org.museframework.bian.cuscamdes.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCustomerCampaignSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cuscamdes.dto.cr.CustomerCampaignSpecification customerCampaignSpecification;

    public void setCustomerCampaignSpecification(org.museframework.bian.cuscamdes.dto.cr.CustomerCampaignSpecification customerCampaignSpecification) {
        this.customerCampaignSpecification = customerCampaignSpecification;
    }

    public org.museframework.bian.cuscamdes.dto.cr.CustomerCampaignSpecification getCustomerCampaignSpecification() {
        return customerCampaignSpecification;
    }
}