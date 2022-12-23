package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCollateralResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Collateral collateral;

    public void setCollateral(org.museframework.bian.merchandisingloan.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}