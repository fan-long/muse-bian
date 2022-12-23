package org.museframework.bian.trabooove.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestTradingBookAnalysisandReportingDutyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.trabooove.dto.bq.TradingBookAnalysisandReportingDuty tradingBookAnalysisandReportingDuty;

    public void setTradingBookAnalysisandReportingDuty(org.museframework.bian.trabooove.dto.bq.TradingBookAnalysisandReportingDuty tradingBookAnalysisandReportingDuty) {
        this.tradingBookAnalysisandReportingDuty = tradingBookAnalysisandReportingDuty;
    }

    public org.museframework.bian.trabooove.dto.bq.TradingBookAnalysisandReportingDuty getTradingBookAnalysisandReportingDuty() {
        return tradingBookAnalysisandReportingDuty;
    }
}