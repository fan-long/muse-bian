package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCollateralRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String collateralid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Collateral collateral;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setCollateralid(String collateralid) {
        this.collateralid = collateralid;
    }

    public String getCollateralid() {
        return collateralid;
    }

    public void setCollateral(org.museframework.bian.customeroffer.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.customeroffer.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}