package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBankandCampaignAlignmentRequest {
    @MetaField
    private String productmatchingid;

    @MetaField
    private String bankandcampaignalignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment bankandCampaignAlignment;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setBankandcampaignalignmentid(String bankandcampaignalignmentid) {
        this.bankandcampaignalignmentid = bankandcampaignalignmentid;
    }

    public String getBankandcampaignalignmentid() {
        return bankandcampaignalignmentid;
    }

    public void setBankandCampaignAlignment(org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment bankandCampaignAlignment) {
        this.bankandCampaignAlignment = bankandCampaignAlignment;
    }

    public org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment getBankandCampaignAlignment() {
        return bankandCampaignAlignment;
    }
}