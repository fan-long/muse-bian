package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBankandCampaignAlignmentRequest {
    @MetaField
    private String productmatchingid;

    @MetaField
    private String bankandcampaignalignmentid;

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
}