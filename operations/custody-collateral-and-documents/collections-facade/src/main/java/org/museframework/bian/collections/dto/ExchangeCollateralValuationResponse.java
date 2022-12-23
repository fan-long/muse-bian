package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeCollateralValuationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.collections.dto.bq.CollateralValuation collateralValuation;

    public void setCollateralValuation(org.museframework.bian.collections.dto.bq.CollateralValuation collateralValuation) {
        this.collateralValuation = collateralValuation;
    }

    public org.museframework.bian.collections.dto.bq.CollateralValuation getCollateralValuation() {
        return collateralValuation;
    }
}