package org.museframework.bian.corporatetreasury.dto;

public class RetrieveLiquidityResponse {
    private org.museframework.bian.corporatetreasury.dto.bq.Liquidity liquidity;

    public void setLiquidity(org.museframework.bian.corporatetreasury.dto.bq.Liquidity liquidity) {
        this.liquidity = liquidity;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.Liquidity getLiquidity() {
        return liquidity;
    }
}