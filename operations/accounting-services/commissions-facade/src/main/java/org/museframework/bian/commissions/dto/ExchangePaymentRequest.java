package org.museframework.bian.commissions.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangePaymentRequest {
    @MetaField
    private String commissionsid;

    @MetaField
    private String paymentid;

    @MetaField(ref=true)
    private org.museframework.bian.commissions.dto.bq.Payment payment;

    public void setCommissionsid(String commissionsid) {
        this.commissionsid = commissionsid;
    }

    public String getCommissionsid() {
        return commissionsid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPayment(org.museframework.bian.commissions.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.commissions.dto.bq.Payment getPayment() {
        return payment;
    }
}