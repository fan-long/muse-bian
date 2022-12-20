package org.museframework.bian.finstaass.dto;

public class NotifyLiquidityandCashFlowTestRequest {
    private String financialstatementassessmentid;

    private String liquidityandcashflowtestid;

    public void setFinancialstatementassessmentid(String financialstatementassessmentid) {
        this.financialstatementassessmentid = financialstatementassessmentid;
    }

    public String getFinancialstatementassessmentid() {
        return financialstatementassessmentid;
    }

    public void setLiquidityandcashflowtestid(String liquidityandcashflowtestid) {
        this.liquidityandcashflowtestid = liquidityandcashflowtestid;
    }

    public String getLiquidityandcashflowtestid() {
        return liquidityandcashflowtestid;
    }
}