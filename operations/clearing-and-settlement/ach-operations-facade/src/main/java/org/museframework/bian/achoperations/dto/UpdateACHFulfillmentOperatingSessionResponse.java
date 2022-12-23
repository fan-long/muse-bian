package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateACHFulfillmentOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.cr.ACHFulfillmentOperatingSession aCHFulfillmentOperatingSession;

    public void setaCHFulfillmentOperatingSession(org.museframework.bian.achoperations.dto.cr.ACHFulfillmentOperatingSession aCHFulfillmentOperatingSession) {
        this.aCHFulfillmentOperatingSession = aCHFulfillmentOperatingSession;
    }

    public org.museframework.bian.achoperations.dto.cr.ACHFulfillmentOperatingSession getaCHFulfillmentOperatingSession() {
        return aCHFulfillmentOperatingSession;
    }
}