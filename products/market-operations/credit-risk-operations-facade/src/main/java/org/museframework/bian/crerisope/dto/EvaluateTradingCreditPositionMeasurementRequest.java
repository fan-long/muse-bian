package org.museframework.bian.crerisope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateTradingCreditPositionMeasurementRequest {
    @MetaField(ref=true)
    private org.museframework.bian.crerisope.dto.cr.TradingCreditPositionMeasurement tradingCreditPositionMeasurement;

    public void setTradingCreditPositionMeasurement(org.museframework.bian.crerisope.dto.cr.TradingCreditPositionMeasurement tradingCreditPositionMeasurement) {
        this.tradingCreditPositionMeasurement = tradingCreditPositionMeasurement;
    }

    public org.museframework.bian.crerisope.dto.cr.TradingCreditPositionMeasurement getTradingCreditPositionMeasurement() {
        return tradingCreditPositionMeasurement;
    }
}