package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLiquidityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatetreasury.dto.bq.Liquidity liquidity;

    public void setLiquidity(org.museframework.bian.corporatetreasury.dto.bq.Liquidity liquidity) {
        this.liquidity = liquidity;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.Liquidity getLiquidity() {
        return liquidity;
    }
}