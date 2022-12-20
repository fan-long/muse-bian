package org.museframework.bian.corporateaction.dto;

public class NotifyStockSplitorReversalActionWorkstepRequest {
    private String corporateactionid;

    private String stocksplitorreversalactionworkstepid;

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
}