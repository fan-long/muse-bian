package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateFXTransactionPricingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing fXTransactionPricing;

    public void setfXTransactionPricing(org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing fXTransactionPricing) {
        this.fXTransactionPricing = fXTransactionPricing;
    }

    public org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing getfXTransactionPricing() {
        return fXTransactionPricing;
    }
}