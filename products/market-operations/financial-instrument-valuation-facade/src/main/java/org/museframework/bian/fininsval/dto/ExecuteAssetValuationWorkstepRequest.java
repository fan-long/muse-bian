package org.museframework.bian.fininsval.dto;

public class ExecuteAssetValuationWorkstepRequest {
    private String financialinstrumentvaluationid;

    private String assetvaluationworkstepid;

    private org.museframework.bian.fininsval.dto.bq.AssetValuationWorkstep assetValuationWorkstep;

    public void setFinancialinstrumentvaluationid(String financialinstrumentvaluationid) {
        this.financialinstrumentvaluationid = financialinstrumentvaluationid;
    }

    public String getFinancialinstrumentvaluationid() {
        return financialinstrumentvaluationid;
    }

    public void setAssetvaluationworkstepid(String assetvaluationworkstepid) {
        this.assetvaluationworkstepid = assetvaluationworkstepid;
    }

    public String getAssetvaluationworkstepid() {
        return assetvaluationworkstepid;
    }

    public void setAssetValuationWorkstep(org.museframework.bian.fininsval.dto.bq.AssetValuationWorkstep assetValuationWorkstep) {
        this.assetValuationWorkstep = assetValuationWorkstep;
    }

    public org.museframework.bian.fininsval.dto.bq.AssetValuationWorkstep getAssetValuationWorkstep() {
        return assetValuationWorkstep;
    }
}