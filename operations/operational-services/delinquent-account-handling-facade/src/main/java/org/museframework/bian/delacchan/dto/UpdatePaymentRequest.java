package org.museframework.bian.delacchan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePaymentRequest {
    @MetaField
    private String delinquentaccounthandlingid;

    @MetaField
    private String paymentid;

    @MetaField(ref=true)
    private org.museframework.bian.delacchan.dto.bq.Payment payment;

    public void setDelinquentaccounthandlingid(String delinquentaccounthandlingid) {
        this.delinquentaccounthandlingid = delinquentaccounthandlingid;
    }

    public String getDelinquentaccounthandlingid() {
        return delinquentaccounthandlingid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPayment(org.museframework.bian.delacchan.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.delacchan.dto.bq.Payment getPayment() {
        return payment;
    }
}