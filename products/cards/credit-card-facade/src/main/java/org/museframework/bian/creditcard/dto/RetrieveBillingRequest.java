package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBillingRequest {
    @MetaField
    private String creditcardid;

    @MetaField
    private String billingid;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setBillingid(String billingid) {
        this.billingid = billingid;
    }

    public String getBillingid() {
        return billingid;
    }
}