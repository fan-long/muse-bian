package org.museframework.bian.fininsval.dto;

public class InitiateAssetValuationInformationConsolidationWorkstepRequest {
    private String financialinstrumentvaluationid;

    private String assetvaluationinformationconsolidationworkstepid;

    private org.museframework.bian.fininsval.dto.bq.AssetValuationInformationConsolidationWorkstep assetValuationInformationConsolidationWorkstep;

    public void setFinancialinstrumentvaluationid(String financialinstrumentvaluationid) {
        this.financialinstrumentvaluationid = financialinstrumentvaluationid;
    }

    public String getFinancialinstrumentvaluationid() {
        return financialinstrumentvaluationid;
    }

    public void setAssetvaluationinformationconsolidationworkstepid(String assetvaluationinformationconsolidationworkstepid) {
        this.assetvaluationinformationconsolidationworkstepid = assetvaluationinformationconsolidationworkstepid;
    }

    public String getAssetvaluationinformationconsolidationworkstepid() {
        return assetvaluationinformationconsolidationworkstepid;
    }

    public void setAssetValuationInformationConsolidationWorkstep(org.museframework.bian.fininsval.dto.bq.AssetValuationInformationConsolidationWorkstep assetValuationInformationConsolidationWorkstep) {
        this.assetValuationInformationConsolidationWorkstep = assetValuationInformationConsolidationWorkstep;
    }

    public org.museframework.bian.fininsval.dto.bq.AssetValuationInformationConsolidationWorkstep getAssetValuationInformationConsolidationWorkstep() {
        return assetValuationInformationConsolidationWorkstep;
    }
}