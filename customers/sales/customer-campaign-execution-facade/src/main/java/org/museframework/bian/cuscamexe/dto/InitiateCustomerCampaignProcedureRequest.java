package org.museframework.bian.cuscamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCustomerCampaignProcedureRequest {
    @MetaField(ref=true)
    private org.museframework.bian.cuscamexe.dto.cr.CustomerCampaignProcedure customerCampaignProcedure;

    public void setCustomerCampaignProcedure(org.museframework.bian.cuscamexe.dto.cr.CustomerCampaignProcedure customerCampaignProcedure) {
        this.customerCampaignProcedure = customerCampaignProcedure;
    }

    public org.museframework.bian.cuscamexe.dto.cr.CustomerCampaignProcedure getCustomerCampaignProcedure() {
        return customerCampaignProcedure;
    }
}