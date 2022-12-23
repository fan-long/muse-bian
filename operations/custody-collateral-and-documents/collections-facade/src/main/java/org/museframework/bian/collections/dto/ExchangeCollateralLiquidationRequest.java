package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeCollateralLiquidationRequest {
    @MetaField
    private String collectionsid;

    @MetaField
    private String collateralliquidationid;

    @MetaField(ref=true)
    private org.museframework.bian.collections.dto.bq.CollateralLiquidation collateralLiquidation;

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

    public void setCollateralLiquidation(org.museframework.bian.collections.dto.bq.CollateralLiquidation collateralLiquidation) {
        this.collateralLiquidation = collateralLiquidation;
    }

    public org.museframework.bian.collections.dto.bq.CollateralLiquidation getCollateralLiquidation() {
        return collateralLiquidation;
    }
}