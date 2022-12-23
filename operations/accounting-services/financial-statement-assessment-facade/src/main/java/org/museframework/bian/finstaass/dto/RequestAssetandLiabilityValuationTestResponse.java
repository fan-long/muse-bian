package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestAssetandLiabilityValuationTestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.finstaass.dto.bq.AssetandLiabilityValuationTest assetandLiabilityValuationTest;

    public void setAssetandLiabilityValuationTest(org.museframework.bian.finstaass.dto.bq.AssetandLiabilityValuationTest assetandLiabilityValuationTest) {
        this.assetandLiabilityValuationTest = assetandLiabilityValuationTest;
    }

    public org.museframework.bian.finstaass.dto.bq.AssetandLiabilityValuationTest getAssetandLiabilityValuationTest() {
        return assetandLiabilityValuationTest;
    }
}