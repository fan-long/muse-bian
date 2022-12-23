package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePaymentInitiationRequest {
    @MetaField
    private String directdebitid;

    @MetaField
    private String paymentinitiationid;

    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.bq.PaymentInitiation paymentInitiation;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }

    public void setPaymentInitiation(org.museframework.bian.directdebit.dto.bq.PaymentInitiation paymentInitiation) {
        this.paymentInitiation = paymentInitiation;
    }

    public org.museframework.bian.directdebit.dto.bq.PaymentInitiation getPaymentInitiation() {
        return paymentInitiation;
    }
}