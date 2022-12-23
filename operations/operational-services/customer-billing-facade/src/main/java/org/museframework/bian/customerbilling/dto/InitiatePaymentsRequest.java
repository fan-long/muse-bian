package org.museframework.bian.customerbilling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiatePaymentsRequest {
    @MetaField
    private String customerbillingid;

    @MetaField
    private String paymentsid;

    @MetaField(ref=true)
    private org.museframework.bian.customerbilling.dto.bq.Payments payments;

    public void setCustomerbillingid(String customerbillingid) {
        this.customerbillingid = customerbillingid;
    }

    public String getCustomerbillingid() {
        return customerbillingid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.customerbilling.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.customerbilling.dto.bq.Payments getPayments() {
        return payments;
    }
}