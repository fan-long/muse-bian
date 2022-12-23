package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecutePaymentAccountReconciliationFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction paymentAccountReconciliationFunction;

    public void setPaymentAccountReconciliationFunction(org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction paymentAccountReconciliationFunction) {
        this.paymentAccountReconciliationFunction = paymentAccountReconciliationFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction getPaymentAccountReconciliationFunction() {
        return paymentAccountReconciliationFunction;
    }
}