package org.museframework.bian.fininsval.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyAssetValuationWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fininsval.dto.bq.AssetValuationWorkstep assetValuationWorkstep;

    public void setAssetValuationWorkstep(org.museframework.bian.fininsval.dto.bq.AssetValuationWorkstep assetValuationWorkstep) {
        this.assetValuationWorkstep = assetValuationWorkstep;
    }

    public org.museframework.bian.fininsval.dto.bq.AssetValuationWorkstep getAssetValuationWorkstep() {
        return assetValuationWorkstep;
    }
}