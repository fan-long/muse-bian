package org.museframework.bian.procamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateProspectCampaignProcedureRequest {
    @MetaField(ref=true)
    private org.museframework.bian.procamexe.dto.cr.ProspectCampaignProcedure prospectCampaignProcedure;

    public void setProspectCampaignProcedure(org.museframework.bian.procamexe.dto.cr.ProspectCampaignProcedure prospectCampaignProcedure) {
        this.prospectCampaignProcedure = prospectCampaignProcedure;
    }

    public org.museframework.bian.procamexe.dto.cr.ProspectCampaignProcedure getProspectCampaignProcedure() {
        return prospectCampaignProcedure;
    }
}