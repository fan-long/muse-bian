package org.museframework.bian.currentaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePaymentsRequest {
    @MetaField
    private String currentaccountid;

    @MetaField
    private String paymentsid;

    @MetaField(ref=true)
    private org.museframework.bian.currentaccount.dto.bq.Payments payments;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.currentaccount.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.currentaccount.dto.bq.Payments getPayments() {
        return payments;
    }
}