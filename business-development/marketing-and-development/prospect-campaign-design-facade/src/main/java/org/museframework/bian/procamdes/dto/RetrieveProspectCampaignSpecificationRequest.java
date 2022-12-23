package org.museframework.bian.procamdes.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProspectCampaignSpecificationRequest {
    @MetaField
    private String prospectcampaigndesignid;

    public void setProspectcampaigndesignid(String prospectcampaigndesignid) {
        this.prospectcampaigndesignid = prospectcampaigndesignid;
    }

    public String getProspectcampaigndesignid() {
        return prospectcampaigndesignid;
    }
}