package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateACHFulfillmentOperatingSessionRequest {
    @MetaField
    private String achoperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.cr.ACHFulfillmentOperatingSession aCHFulfillmentOperatingSession;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setaCHFulfillmentOperatingSession(org.museframework.bian.achoperations.dto.cr.ACHFulfillmentOperatingSession aCHFulfillmentOperatingSession) {
        this.aCHFulfillmentOperatingSession = aCHFulfillmentOperatingSession;
    }

    public org.museframework.bian.achoperations.dto.cr.ACHFulfillmentOperatingSession getaCHFulfillmentOperatingSession() {
        return aCHFulfillmentOperatingSession;
    }
}