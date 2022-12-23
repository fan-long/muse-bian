package org.museframework.bian.marketorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFundingCheckRequest {
    @MetaField
    private String marketorderid;

    @MetaField
    private String fundingcheckid;

    public void setMarketorderid(String marketorderid) {
        this.marketorderid = marketorderid;
    }

    public String getMarketorderid() {
        return marketorderid;
    }

    public void setFundingcheckid(String fundingcheckid) {
        this.fundingcheckid = fundingcheckid;
    }

    public String getFundingcheckid() {
        return fundingcheckid;
    }
}