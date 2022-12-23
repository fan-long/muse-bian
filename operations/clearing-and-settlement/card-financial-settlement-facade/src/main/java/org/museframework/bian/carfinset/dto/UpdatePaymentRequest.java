package org.museframework.bian.carfinset.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePaymentRequest {
    @MetaField
    private String cardfinancialsettlementid;

    @MetaField
    private String paymentid;

    @MetaField(ref=true)
    private org.museframework.bian.carfinset.dto.bq.Payment payment;

    public void setCardfinancialsettlementid(String cardfinancialsettlementid) {
        this.cardfinancialsettlementid = cardfinancialsettlementid;
    }

    public String getCardfinancialsettlementid() {
        return cardfinancialsettlementid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPayment(org.museframework.bian.carfinset.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.carfinset.dto.bq.Payment getPayment() {
        return payment;
    }
}