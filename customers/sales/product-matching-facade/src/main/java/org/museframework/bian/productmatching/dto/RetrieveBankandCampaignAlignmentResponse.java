package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBankandCampaignAlignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment bankandCampaignAlignment;

    public void setBankandCampaignAlignment(org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment bankandCampaignAlignment) {
        this.bankandCampaignAlignment = bankandCampaignAlignment;
    }

    public org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment getBankandCampaignAlignment() {
        return bankandCampaignAlignment;
    }
}