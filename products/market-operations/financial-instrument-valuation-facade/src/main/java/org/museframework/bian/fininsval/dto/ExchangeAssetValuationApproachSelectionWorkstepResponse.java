package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeAssetValuationApproachSelectionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fininsval.dto.bq.AssetValuationApproachSelectionWorkstep assetValuationApproachSelectionWorkstep;

    public void setAssetValuationApproachSelectionWorkstep(org.museframework.bian.fininsval.dto.bq.AssetValuationApproachSelectionWorkstep assetValuationApproachSelectionWorkstep) {
        this.assetValuationApproachSelectionWorkstep = assetValuationApproachSelectionWorkstep;
    }

    public org.museframework.bian.fininsval.dto.bq.AssetValuationApproachSelectionWorkstep getAssetValuationApproachSelectionWorkstep() {
        return assetValuationApproachSelectionWorkstep;
    }
}