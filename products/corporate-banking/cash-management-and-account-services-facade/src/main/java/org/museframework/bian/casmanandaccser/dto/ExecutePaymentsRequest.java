package org.museframework.bian.casmanandaccser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePaymentsRequest {
    @MetaField
    private String cashmanagementandaccountservicesid;

    @MetaField
    private String paymentsid;

    @MetaField(ref=true)
    private org.museframework.bian.casmanandaccser.dto.bq.Payments payments;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.casmanandaccser.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.Payments getPayments() {
        return payments;
    }
}