package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveServicingEventLogResponse {
    @MetaField(ref=true)
    private org.museframework.bian.serevehis.dto.cr.ServicingEventLog servicingEventLog;

    public void setServicingEventLog(org.museframework.bian.serevehis.dto.cr.ServicingEventLog servicingEventLog) {
        this.servicingEventLog = servicingEventLog;
    }

    public org.museframework.bian.serevehis.dto.cr.ServicingEventLog getServicingEventLog() {
        return servicingEventLog;
    }
}