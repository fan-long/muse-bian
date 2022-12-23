package org.museframework.bian.finstaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestLiquidityandCashFlowTestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.finstaass.dto.bq.LiquidityandCashFlowTest liquidityandCashFlowTest;

    public void setLiquidityandCashFlowTest(org.museframework.bian.finstaass.dto.bq.LiquidityandCashFlowTest liquidityandCashFlowTest) {
        this.liquidityandCashFlowTest = liquidityandCashFlowTest;
    }

    public org.museframework.bian.finstaass.dto.bq.LiquidityandCashFlowTest getLiquidityandCashFlowTest() {
        return liquidityandCashFlowTest;
    }
}