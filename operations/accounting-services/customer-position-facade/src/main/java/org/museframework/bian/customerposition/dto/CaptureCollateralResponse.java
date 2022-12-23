package org.museframework.bian.customerposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureCollateralResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerposition.dto.bq.Collateral collateral;

    public void setCollateral(org.museframework.bian.customerposition.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.customerposition.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}