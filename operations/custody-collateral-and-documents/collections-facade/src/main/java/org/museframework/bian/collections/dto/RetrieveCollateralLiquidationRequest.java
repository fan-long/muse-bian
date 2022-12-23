package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCollateralLiquidationRequest {
    @MetaField
    private String collectionsid;

    @MetaField
    private String collateralliquidationid;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setCollateralliquidationid(String collateralliquidationid) {
        this.collateralliquidationid = collateralliquidationid;
    }

    public String getCollateralliquidationid() {
        return collateralliquidationid;
    }
}