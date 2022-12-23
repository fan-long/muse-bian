package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiatePaymentRequest {
    @MetaField
    private String accountsreceivableid;

    @MetaField
    private String paymentid;

    @MetaField(ref=true)
    private org.museframework.bian.accountsreceivable.dto.bq.Payment payment;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPayment(org.museframework.bian.accountsreceivable.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.Payment getPayment() {
        return payment;
    }
}