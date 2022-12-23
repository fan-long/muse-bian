package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeStockSplitorReversalActionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateaction.dto.bq.StockSplitorReversalActionWorkstep stockSplitorReversalActionWorkstep;

    public void setStockSplitorReversalActionWorkstep(org.museframework.bian.corporateaction.dto.bq.StockSplitorReversalActionWorkstep stockSplitorReversalActionWorkstep) {
        this.stockSplitorReversalActionWorkstep = stockSplitorReversalActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.StockSplitorReversalActionWorkstep getStockSplitorReversalActionWorkstep() {
        return stockSplitorReversalActionWorkstep;
    }
}