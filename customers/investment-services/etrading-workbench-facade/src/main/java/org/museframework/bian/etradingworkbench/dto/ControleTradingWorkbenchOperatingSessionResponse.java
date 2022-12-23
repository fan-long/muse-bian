package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControleTradingWorkbenchOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.cr.eTradingWorkbenchOperatingSession eTradingWorkbenchOperatingSession;

    public void seteTradingWorkbenchOperatingSession(org.museframework.bian.etradingworkbench.dto.cr.eTradingWorkbenchOperatingSession eTradingWorkbenchOperatingSession) {
        this.eTradingWorkbenchOperatingSession = eTradingWorkbenchOperatingSession;
    }

    public org.museframework.bian.etradingworkbench.dto.cr.eTradingWorkbenchOperatingSession geteTradingWorkbenchOperatingSession() {
        return eTradingWorkbenchOperatingSession;
    }
}