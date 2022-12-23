package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureLiquidityRequest {
    @MetaField
    private String corporatetreasuryid;

    @MetaField
    private String liquidityid;

    @MetaField(ref=true)
    private org.museframework.bian.corporatetreasury.dto.bq.Liquidity liquidity;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setLiquidityid(String liquidityid) {
        this.liquidityid = liquidityid;
    }

    public String getLiquidityid() {
        return liquidityid;
    }

    public void setLiquidity(org.museframework.bian.corporatetreasury.dto.bq.Liquidity liquidity) {
        this.liquidity = liquidity;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.Liquidity getLiquidity() {
        return liquidity;
    }
}