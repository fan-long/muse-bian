package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangePaymentAccountReconciliationFunctionRequest {
    @MetaField
    private String paymentrailoperationsid;

    @MetaField
    private String paymentaccountreconciliationfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction paymentAccountReconciliationFunction;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setPaymentaccountreconciliationfunctionid(String paymentaccountreconciliationfunctionid) {
        this.paymentaccountreconciliationfunctionid = paymentaccountreconciliationfunctionid;
    }

    public String getPaymentaccountreconciliationfunctionid() {
        return paymentaccountreconciliationfunctionid;
    }

    public void setPaymentAccountReconciliationFunction(org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction paymentAccountReconciliationFunction) {
        this.paymentAccountReconciliationFunction = paymentAccountReconciliationFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction getPaymentAccountReconciliationFunction() {
        return paymentAccountReconciliationFunction;
    }
}