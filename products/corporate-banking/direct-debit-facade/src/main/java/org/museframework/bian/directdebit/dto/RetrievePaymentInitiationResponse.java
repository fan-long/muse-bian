package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePaymentInitiationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.bq.PaymentInitiation paymentInitiation;

    public void setPaymentInitiation(org.museframework.bian.directdebit.dto.bq.PaymentInitiation paymentInitiation) {
        this.paymentInitiation = paymentInitiation;
    }

    public org.museframework.bian.directdebit.dto.bq.PaymentInitiation getPaymentInitiation() {
        return paymentInitiation;
    }
}