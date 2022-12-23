package org.museframework.bian.procamdes.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureProspectCampaignSpecificationRequest {
    @MetaField
    private String prospectcampaigndesignid;

    @MetaField(ref=true)
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