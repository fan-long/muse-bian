package org.museframework.bian.issdevtra.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInternalNotificationRequest {
    @MetaField
    private String issueddevicetrackingid;

    @MetaField
    private String internalnotificationid;

    @MetaField(ref=true)
    private org.museframework.bian.issdevtra.dto.bq.InternalNotification internalNotification;

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

    public void setInternalNotification(org.museframework.bian.issdevtra.dto.bq.InternalNotification internalNotification) {
        this.internalNotification = internalNotification;
    }

    public org.museframework.bian.issdevtra.dto.bq.InternalNotification getInternalNotification() {
        return internalNotification;
    }
}