package org.museframework.bian.corporatetreasury.dto;

public class CaptureLiquidityRequest {
    private String corporatetreasuryid;

    private String liquidityid;

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