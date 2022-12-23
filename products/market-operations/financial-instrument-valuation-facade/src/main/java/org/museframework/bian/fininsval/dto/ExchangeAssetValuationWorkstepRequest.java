package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeAssetValuationWorkstepRequest {
    @MetaField
    private String financialinstrumentvaluationid;

    @MetaField
    private String assetvaluationworkstepid;

    @MetaField(ref=true)
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