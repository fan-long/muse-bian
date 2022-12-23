package org.museframework.bian.cuscamdes.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCustomerCampaignSpecificationRequest {
    @MetaField
    private String customercampaigndesignid;

    public void setCustomercampaigndesignid(String customercampaigndesignid) {
        this.customercampaigndesignid = customercampaigndesignid;
    }

    public String getCustomercampaigndesignid() {
        return customercampaigndesignid;
    }
}