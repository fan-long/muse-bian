package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteBillingRequest {
    @MetaField
    private String creditcardid;

    @MetaField
    private String billingid;

    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.Billing billing;

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

    public void setBilling(org.museframework.bian.creditcard.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.creditcard.dto.bq.Billing getBilling() {
        return billing;
    }
}