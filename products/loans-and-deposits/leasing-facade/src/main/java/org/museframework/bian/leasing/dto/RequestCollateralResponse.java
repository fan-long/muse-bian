package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCollateralResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Collateral collateral;

    public void setCollateral(org.museframework.bian.leasing.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.leasing.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}