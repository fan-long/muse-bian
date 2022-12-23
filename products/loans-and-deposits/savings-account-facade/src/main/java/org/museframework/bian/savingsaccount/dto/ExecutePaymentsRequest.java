package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePaymentsRequest {
    @MetaField
    private String savingsaccountid;

    @MetaField
    private String paymentsid;

    @MetaField(ref=true)
    private org.museframework.bian.savingsaccount.dto.bq.Payments payments;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.savingsaccount.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.savingsaccount.dto.bq.Payments getPayments() {
        return payments;
    }
}