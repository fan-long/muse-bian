package org.museframework.bian.cardcollections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiatePaymentRequest {
    @MetaField
    private String cardcollectionsid;

    @MetaField
    private String paymentid;

    @MetaField(ref=true)
    private org.museframework.bian.cardcollections.dto.bq.Payment payment;

    public void setCardcollectionsid(String cardcollectionsid) {
        this.cardcollectionsid = cardcollectionsid;
    }

    public String getCardcollectionsid() {
        return cardcollectionsid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPayment(org.museframework.bian.cardcollections.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.cardcollections.dto.bq.Payment getPayment() {
        return payment;
    }
}