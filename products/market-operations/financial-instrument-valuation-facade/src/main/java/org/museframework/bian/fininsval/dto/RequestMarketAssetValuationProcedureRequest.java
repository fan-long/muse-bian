package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestMarketAssetValuationProcedureRequest {
    @MetaField
    private String financialinstrumentvaluationid;

    @MetaField(ref=true)
    private org.museframework.bian.fininsval.dto.cr.MarketAssetValuationProcedure marketAssetValuationProcedure;

    public void setFinancialinstrumentvaluationid(String financialinstrumentvaluationid) {
        this.financialinstrumentvaluationid = financialinstrumentvaluationid;
    }

    public String getFinancialinstrumentvaluationid() {
        return financialinstrumentvaluationid;
    }

    public void setMarketAssetValuationProcedure(org.museframework.bian.fininsval.dto.cr.MarketAssetValuationProcedure marketAssetValuationProcedure) {
        this.marketAssetValuationProcedure = marketAssetValuationProcedure;
    }

    public org.museframework.bian.fininsval.dto.cr.MarketAssetValuationProcedure getMarketAssetValuationProcedure() {
        return marketAssetValuationProcedure;
    }
}