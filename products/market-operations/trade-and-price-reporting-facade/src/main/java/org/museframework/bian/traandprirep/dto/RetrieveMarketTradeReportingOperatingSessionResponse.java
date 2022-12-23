package org.museframework.bian.traandprirep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketTradeReportingOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traandprirep.dto.cr.MarketTradeReportingOperatingSession marketTradeReportingOperatingSession;

    public void setMarketTradeReportingOperatingSession(org.museframework.bian.traandprirep.dto.cr.MarketTradeReportingOperatingSession marketTradeReportingOperatingSession) {
        this.marketTradeReportingOperatingSession = marketTradeReportingOperatingSession;
    }

    public org.museframework.bian.traandprirep.dto.cr.MarketTradeReportingOperatingSession getMarketTradeReportingOperatingSession() {
        return marketTradeReportingOperatingSession;
    }
}