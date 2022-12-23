package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateServicingEventLogRequest {
    @MetaField
    private String servicingeventhistoryid;

    @MetaField(ref=true)
    private org.museframework.bian.serevehis.dto.cr.ServicingEventLog servicingEventLog;

    public void setServicingeventhistoryid(String servicingeventhistoryid) {
        this.servicingeventhistoryid = servicingeventhistoryid;
    }

    public String getServicingeventhistoryid() {
        return servicingeventhistoryid;
    }

    public void setServicingEventLog(org.museframework.bian.serevehis.dto.cr.ServicingEventLog servicingEventLog) {
        this.servicingEventLog = servicingEventLog;
    }

    public org.museframework.bian.serevehis.dto.cr.ServicingEventLog getServicingEventLog() {
        return servicingEventLog;
    }
}