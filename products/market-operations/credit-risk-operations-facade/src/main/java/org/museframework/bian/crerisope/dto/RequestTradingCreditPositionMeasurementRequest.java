package org.museframework.bian.crerisope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTradingCreditPositionMeasurementRequest {
    @MetaField
    private String creditriskoperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.crerisope.dto.cr.TradingCreditPositionMeasurement tradingCreditPositionMeasurement;

    public void setCreditriskoperationsid(String creditriskoperationsid) {
        this.creditriskoperationsid = creditriskoperationsid;
    }

    public String getCreditriskoperationsid() {
        return creditriskoperationsid;
    }

    public void setTradingCreditPositionMeasurement(org.museframework.bian.crerisope.dto.cr.TradingCreditPositionMeasurement tradingCreditPositionMeasurement) {
        this.tradingCreditPositionMeasurement = tradingCreditPositionMeasurement;
    }

    public org.museframework.bian.crerisope.dto.cr.TradingCreditPositionMeasurement getTradingCreditPositionMeasurement() {
        return tradingCreditPositionMeasurement;
    }
}