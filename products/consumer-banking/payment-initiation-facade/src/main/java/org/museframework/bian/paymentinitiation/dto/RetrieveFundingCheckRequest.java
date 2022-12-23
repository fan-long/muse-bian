package org.museframework.bian.paymentinitiation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFundingCheckRequest {
    @MetaField
    private String paymentinitiationid;

    @MetaField
    private String fundingcheckid;

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }

    public void setFundingcheckid(String fundingcheckid) {
        this.fundingcheckid = fundingcheckid;
    }

    public String getFundingcheckid() {
        return fundingcheckid;
    }
}