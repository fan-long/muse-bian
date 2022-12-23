package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyAssetValuationApproachSelectionWorkstepRequest {
    @MetaField
    private String financialinstrumentvaluationid;

    @MetaField
    private String assetvaluationapproachselectionworkstepid;

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
}