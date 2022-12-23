package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateTradedPositionOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession tradedPositionOperatingSession;

    public void setTradedPositionOperatingSession(org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession tradedPositionOperatingSession) {
        this.tradedPositionOperatingSession = tradedPositionOperatingSession;
    }

    public org.museframework.bian.traposope.dto.cr.TradedPositionOperatingSession getTradedPositionOperatingSession() {
        return tradedPositionOperatingSession;
    }
}