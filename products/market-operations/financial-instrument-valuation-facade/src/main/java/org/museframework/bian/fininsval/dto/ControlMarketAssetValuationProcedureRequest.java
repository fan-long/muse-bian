package org.museframework.bian.fininsval.dto;

public class ControlMarketAssetValuationProcedureRequest {
    private String financialinstrumentvaluationid;

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