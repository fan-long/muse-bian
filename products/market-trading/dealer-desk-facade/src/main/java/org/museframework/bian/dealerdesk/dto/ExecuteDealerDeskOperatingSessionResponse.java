package org.museframework.bian.dealerdesk.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteDealerDeskOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.dealerdesk.dto.cr.DealerDeskOperatingSession dealerDeskOperatingSession;

    public void setDealerDeskOperatingSession(org.museframework.bian.dealerdesk.dto.cr.DealerDeskOperatingSession dealerDeskOperatingSession) {
        this.dealerDeskOperatingSession = dealerDeskOperatingSession;
    }

    public org.museframework.bian.dealerdesk.dto.cr.DealerDeskOperatingSession getDealerDeskOperatingSession() {
        return dealerDeskOperatingSession;
    }
}