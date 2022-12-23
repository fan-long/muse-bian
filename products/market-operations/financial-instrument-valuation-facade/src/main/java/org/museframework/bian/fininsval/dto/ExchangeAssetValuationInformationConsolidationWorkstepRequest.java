package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeAssetValuationInformationConsolidationWorkstepRequest {
    @MetaField
    private String financialinstrumentvaluationid;

    @MetaField
    private String assetvaluationinformationconsolidationworkstepid;

    @MetaField(ref=true)
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