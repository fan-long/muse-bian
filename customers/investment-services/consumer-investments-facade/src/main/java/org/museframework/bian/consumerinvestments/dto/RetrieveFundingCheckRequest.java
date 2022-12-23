package org.museframework.bian.consumerinvestments.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFundingCheckRequest {
    @MetaField
    private String consumerinvestmentsid;

    @MetaField
    private String fundingcheckid;

    public void setConsumerinvestmentsid(String consumerinvestmentsid) {
        this.consumerinvestmentsid = consumerinvestmentsid;
    }

    public String getConsumerinvestmentsid() {
        return consumerinvestmentsid;
    }

    public void setFundingcheckid(String fundingcheckid) {
        this.fundingcheckid = fundingcheckid;
    }

    public String getFundingcheckid() {
        return fundingcheckid;
    }
}