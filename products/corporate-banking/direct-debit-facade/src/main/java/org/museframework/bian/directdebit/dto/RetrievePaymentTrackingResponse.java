package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePaymentTrackingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.bq.PaymentTracking paymentTracking;

    public void setPaymentTracking(org.museframework.bian.directdebit.dto.bq.PaymentTracking paymentTracking) {
        this.paymentTracking = paymentTracking;
    }

    public org.museframework.bian.directdebit.dto.bq.PaymentTracking getPaymentTracking() {
        return paymentTracking;
    }
}