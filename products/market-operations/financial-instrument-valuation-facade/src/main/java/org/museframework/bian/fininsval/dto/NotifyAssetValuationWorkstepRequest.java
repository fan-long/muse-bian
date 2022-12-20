package org.museframework.bian.fininsval.dto;

public class NotifyAssetValuationWorkstepRequest {
    private String financialinstrumentvaluationid;

    private String assetvaluationworkstepid;

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
}