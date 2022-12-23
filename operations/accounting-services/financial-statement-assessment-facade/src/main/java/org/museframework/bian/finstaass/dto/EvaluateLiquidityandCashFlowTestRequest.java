package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateLiquidityandCashFlowTestRequest {
    @MetaField
    private String financialstatementassessmentid;

    @MetaField
    private String liquidityandcashflowtestid;

    @MetaField(ref=true)
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