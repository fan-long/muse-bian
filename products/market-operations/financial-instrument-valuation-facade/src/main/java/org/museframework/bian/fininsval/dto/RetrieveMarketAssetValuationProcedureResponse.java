package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketAssetValuationProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fininsval.dto.cr.MarketAssetValuationProcedure marketAssetValuationProcedure;

    public void setMarketAssetValuationProcedure(org.museframework.bian.fininsval.dto.cr.MarketAssetValuationProcedure marketAssetValuationProcedure) {
        this.marketAssetValuationProcedure = marketAssetValuationProcedure;
    }

    public org.museframework.bian.fininsval.dto.cr.MarketAssetValuationProcedure getMarketAssetValuationProcedure() {
        return marketAssetValuationProcedure;
    }
}