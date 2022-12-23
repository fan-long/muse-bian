package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAssetValuationInformationConsolidationWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fininsval.dto.bq.AssetValuationInformationConsolidationWorkstep assetValuationInformationConsolidationWorkstep;

    public void setAssetValuationInformationConsolidationWorkstep(org.museframework.bian.fininsval.dto.bq.AssetValuationInformationConsolidationWorkstep assetValuationInformationConsolidationWorkstep) {
        this.assetValuationInformationConsolidationWorkstep = assetValuationInformationConsolidationWorkstep;
    }

    public org.museframework.bian.fininsval.dto.bq.AssetValuationInformationConsolidationWorkstep getAssetValuationInformationConsolidationWorkstep() {
        return assetValuationInformationConsolidationWorkstep;
    }
}