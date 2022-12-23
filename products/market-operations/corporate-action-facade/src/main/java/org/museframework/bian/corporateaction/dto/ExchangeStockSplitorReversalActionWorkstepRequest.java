package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeStockSplitorReversalActionWorkstepRequest {
    @MetaField
    private String corporateactionid;

    @MetaField
    private String stocksplitorreversalactionworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.corporateaction.dto.bq.StockSplitorReversalActionWorkstep stockSplitorReversalActionWorkstep;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setStocksplitorreversalactionworkstepid(String stocksplitorreversalactionworkstepid) {
        this.stocksplitorreversalactionworkstepid = stocksplitorreversalactionworkstepid;
    }

    public String getStocksplitorreversalactionworkstepid() {
        return stocksplitorreversalactionworkstepid;
    }

    public void setStockSplitorReversalActionWorkstep(org.museframework.bian.corporateaction.dto.bq.StockSplitorReversalActionWorkstep stockSplitorReversalActionWorkstep) {
        this.stockSplitorReversalActionWorkstep = stockSplitorReversalActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.StockSplitorReversalActionWorkstep getStockSplitorReversalActionWorkstep() {
        return stockSplitorReversalActionWorkstep;
    }
}