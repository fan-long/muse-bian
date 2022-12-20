package org.museframework.bian.finstaass.dto;

public class RequestLiquidityandCashFlowTestRequest {
    private String financialstatementassessmentid;

    private String liquidityandcashflowtestid;

    private org.museframework.bian.finstaass.dto.bq.LiquidityandCashFlowTest liquidityandCashFlowTest;

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

    public void setLiquidityandCashFlowTest(org.museframework.bian.finstaass.dto.bq.LiquidityandCashFlowTest liquidityandCashFlowTest) {
        this.liquidityandCashFlowTest = liquidityandCashFlowTest;
    }

    public org.museframework.bian.finstaass.dto.bq.LiquidityandCashFlowTest getLiquidityandCashFlowTest() {
        return liquidityandCashFlowTest;
    }
}