package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteTradedPositionOperatingSessionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession tradedPositionOperatingSession;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradedPositionOperatingSession(org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession tradedPositionOperatingSession) {
        this.tradedPositionOperatingSession = tradedPositionOperatingSession;
    }

    public org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession getTradedPositionOperatingSession() {
        return tradedPositionOperatingSession;
    }
}