package org.museframework.bian.procamdes.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProspectCampaignSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.procamdes.dto.cr.ProspectCampaignSpecification prospectCampaignSpecification;

    public void setProspectCampaignSpecification(org.museframework.bian.procamdes.dto.cr.ProspectCampaignSpecification prospectCampaignSpecification) {
        this.prospectCampaignSpecification = prospectCampaignSpecification;
    }

    public org.museframework.bian.procamdes.dto.cr.ProspectCampaignSpecification getProspectCampaignSpecification() {
        return prospectCampaignSpecification;
    }
}