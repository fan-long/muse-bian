package org.museframework.bian.marketorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFundingCheckResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marketorder.dto.bq.FundingCheck fundingCheck;

    public void setFundingCheck(org.museframework.bian.marketorder.dto.bq.FundingCheck fundingCheck) {
        this.fundingCheck = fundingCheck;
    }

    public org.museframework.bian.marketorder.dto.bq.FundingCheck getFundingCheck() {
        return fundingCheck;
    }
}