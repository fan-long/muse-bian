package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteAssetValuationApproachSelectionWorkstepRequest {
    @MetaField
    private String financialinstrumentvaluationid;

    @MetaField
    private String assetvaluationapproachselectionworkstepid;

    @MetaField(ref=true)
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