package org.museframework.bian.cardcollections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePaymentTermsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcollections.dto.bq.PaymentTerms paymentTerms;

    public void setPaymentTerms(org.museframework.bian.cardcollections.dto.bq.PaymentTerms paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public org.museframework.bian.cardcollections.dto.bq.PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }
}