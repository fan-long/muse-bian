package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAssetValuationWorkstepRequest {
    @MetaField
    private String financialinstrumentvaluationid;

    @MetaField
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