package org.museframework.bian.corporateaction.dto;

public class ExchangeStockSplitorReversalActionWorkstepRequest {
    private String corporateactionid;

    private String stocksplitorreversalactionworkstepid;

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