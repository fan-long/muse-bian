package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyAssetValuationInformationConsolidationWorkstepRequest {
    @MetaField
    private String financialinstrumentvaluationid;

    @MetaField
    private String assetvaluationinformationconsolidationworkstepid;

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
}