package org.museframework.bian.cuscrerat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCustomerCreditRatingStateRequest {
    @MetaField
    private String customercreditratingid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscrerat.dto.cr.CustomerCreditRatingState customerCreditRatingState;

    public void setCustomercreditratingid(String customercreditratingid) {
        this.customercreditratingid = customercreditratingid;
    }

    public String getCustomercreditratingid() {
        return customercreditratingid;
    }

    public void setCustomerCreditRatingState(org.museframework.bian.cuscrerat.dto.cr.CustomerCreditRatingState customerCreditRatingState) {
        this.customerCreditRatingState = customerCreditRatingState;
    }

    public org.museframework.bian.cuscrerat.dto.cr.CustomerCreditRatingState getCustomerCreditRatingState() {
        return customerCreditRatingState;
    }
}