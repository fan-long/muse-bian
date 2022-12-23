package org.museframework.bian.paymentinitiation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiatePaymentInitiationTransactionRequest {
    @MetaField(ref=true)
    private org.museframework.bian.paymentinitiation.dto.cr.PaymentInitiationTransaction paymentInitiationTransaction;

    public void setPaymentInitiationTransaction(org.museframework.bian.paymentinitiation.dto.cr.PaymentInitiationTransaction paymentInitiationTransaction) {
        this.paymentInitiationTransaction = paymentInitiationTransaction;
    }

    public org.museframework.bian.paymentinitiation.dto.cr.PaymentInitiationTransaction getPaymentInitiationTransaction() {
        return paymentInitiationTransaction;
    }
}