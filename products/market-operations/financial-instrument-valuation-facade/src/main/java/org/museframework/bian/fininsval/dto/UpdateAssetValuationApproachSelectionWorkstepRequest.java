package org.museframework.bian.fininsval.dto;

public class UpdateAssetValuationApproachSelectionWorkstepRequest {
    private String financialinstrumentvaluationid;

    private String assetvaluationapproachselectionworkstepid;

    private org.museframework.bian.fininsval.dto.bq.AssetValuationApproachSelectionWorkstep assetValuationApproachSelectionWorkstep;

    public void setFinancialinstrumentvaluationid(String financialinstrumentvaluationid) {
        this.financialinstrumentvaluationid = financialinstrumentvaluationid;
    }

    public String getFinancialinstrumentvaluationid() {
        return financialinstrumentvaluationid;
    }

    public void setAssetvaluationapproachselectionworkstepid(String assetvaluationapproachselectionworkstepid) {
        this.assetvaluationapproachselectionworkstepid = assetvaluationapproachselectionworkstepid;
    }

    public String getAssetvaluationapproachselectionworkstepid() {
        return assetvaluationapproachselectionworkstepid;
    }

    public void setAssetValuationApproachSelectionWorkstep(org.museframework.bian.fininsval.dto.bq.AssetValuationApproachSelectionWorkstep assetValuationApproachSelectionWorkstep) {
        this.assetValuationApproachSelectionWorkstep = assetValuationApproachSelectionWorkstep;
    }

    public org.museframework.bian.fininsval.dto.bq.AssetValuationApproachSelectionWorkstep getAssetValuationApproachSelectionWorkstep() {
        return assetValuationApproachSelectionWorkstep;
    }
}