package org.museframework.bian.productcombination.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTransferPricingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productcombination.dto.bq.TransferPricing transferPricing;

    public void setTransferPricing(org.museframework.bian.productcombination.dto.bq.TransferPricing transferPricing) {
        this.transferPricing = transferPricing;
    }

    public org.museframework.bian.productcombination.dto.bq.TransferPricing getTransferPricing() {
        return transferPricing;
    }
}