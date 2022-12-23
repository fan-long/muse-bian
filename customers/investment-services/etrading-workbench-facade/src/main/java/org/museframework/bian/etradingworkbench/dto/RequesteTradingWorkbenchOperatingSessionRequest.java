package org.museframework.bian.etradingworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequesteTradingWorkbenchOperatingSessionRequest {
    @MetaField
    private String etradingworkbenchid;

    @MetaField(ref=true)
    private org.museframework.bian.etradingworkbench.dto.cr.eTradingWorkbenchOperatingSession eTradingWorkbenchOperatingSession;

    public void setEtradingworkbenchid(String etradingworkbenchid) {
        this.etradingworkbenchid = etradingworkbenchid;
    }

    public String getEtradingworkbenchid() {
        return etradingworkbenchid;
    }

    public void seteTradingWorkbenchOperatingSession(org.museframework.bian.etradingworkbench.dto.cr.eTradingWorkbenchOperatingSession eTradingWorkbenchOperatingSession) {
        this.eTradingWorkbenchOperatingSession = eTradingWorkbenchOperatingSession;
    }

    public org.museframework.bian.etradingworkbench.dto.cr.eTradingWorkbenchOperatingSession geteTradingWorkbenchOperatingSession() {
        return eTradingWorkbenchOperatingSession;
    }
}