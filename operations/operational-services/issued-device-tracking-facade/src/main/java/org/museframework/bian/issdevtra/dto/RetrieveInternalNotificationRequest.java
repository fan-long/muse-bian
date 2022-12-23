package org.museframework.bian.issdevtra.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInternalNotificationRequest {
    @MetaField
    private String issueddevicetrackingid;

    @MetaField
    private String internalnotificationid;

    public void setIssueddevicetrackingid(String issueddevicetrackingid) {
        this.issueddevicetrackingid = issueddevicetrackingid;
    }

    public String getIssueddevicetrackingid() {
        return issueddevicetrackingid;
    }

    public void setInternalnotificationid(String internalnotificationid) {
        this.internalnotificationid = internalnotificationid;
    }

    public String getInternalnotificationid() {
        return internalnotificationid;
    }
}