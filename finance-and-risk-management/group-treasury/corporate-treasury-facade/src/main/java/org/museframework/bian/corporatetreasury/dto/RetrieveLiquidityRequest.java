package org.museframework.bian.corporatetreasury.dto;

public class RetrieveLiquidityRequest {
    private String corporatetreasuryid;

    private String liquidityid;

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
}