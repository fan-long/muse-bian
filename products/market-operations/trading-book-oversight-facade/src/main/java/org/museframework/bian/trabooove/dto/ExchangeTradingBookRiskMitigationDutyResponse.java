package org.museframework.bian.trabooove.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeTradingBookRiskMitigationDutyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.trabooove.dto.bq.TradingBookRiskMitigationDuty tradingBookRiskMitigationDuty;

    public void setTradingBookRiskMitigationDuty(org.museframework.bian.trabooove.dto.bq.TradingBookRiskMitigationDuty tradingBookRiskMitigationDuty) {
        this.tradingBookRiskMitigationDuty = tradingBookRiskMitigationDuty;
    }

    public org.museframework.bian.trabooove.dto.bq.TradingBookRiskMitigationDuty getTradingBookRiskMitigationDuty() {
        return tradingBookRiskMitigationDuty;
    }
}