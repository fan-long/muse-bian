package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCollateralValuationRequest {
    @MetaField
    private String collectionsid;

    @MetaField
    private String collateralvaluationid;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setCollateralvaluationid(String collateralvaluationid) {
        this.collateralvaluationid = collateralvaluationid;
    }

    public String getCollateralvaluationid() {
        return collateralvaluationid;
    }
}