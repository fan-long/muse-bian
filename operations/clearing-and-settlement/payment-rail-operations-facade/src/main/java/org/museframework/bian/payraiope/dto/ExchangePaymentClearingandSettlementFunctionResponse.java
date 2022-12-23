package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangePaymentClearingandSettlementFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.payraiope.dto.bq.PaymentClearingandSettlementFunction paymentClearingandSettlementFunction;

    public void setPaymentClearingandSettlementFunction(org.museframework.bian.payraiope.dto.bq.PaymentClearingandSettlementFunction paymentClearingandSettlementFunction) {
        this.paymentClearingandSettlementFunction = paymentClearingandSettlementFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.PaymentClearingandSettlementFunction getPaymentClearingandSettlementFunction() {
        return paymentClearingandSettlementFunction;
    }
}