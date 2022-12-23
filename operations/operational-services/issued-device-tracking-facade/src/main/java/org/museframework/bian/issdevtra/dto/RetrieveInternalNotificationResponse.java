package org.museframework.bian.issdevtra.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveInternalNotificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevtra.dto.bq.InternalNotification internalNotification;

    public void setInternalNotification(org.museframework.bian.issdevtra.dto.bq.InternalNotification internalNotification) {
        this.internalNotification = internalNotification;
    }

    public org.museframework.bian.issdevtra.dto.bq.InternalNotification getInternalNotification() {
        return internalNotification;
    }
}