package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateStatusRequest {
    @MetaField
    private String partyroutingprofileid;

    @MetaField
    private String statusid;

    @MetaField(ref=true)
    private org.museframework.bian.parroupro.dto.bq.Status status;

    public void setPartyroutingprofileid(String partyroutingprofileid) {
        this.partyroutingprofileid = partyroutingprofileid;
    }

    public String getPartyroutingprofileid() {
        return partyroutingprofileid;
    }

    public void setStatusid(String statusid) {
        this.statusid = statusid;
    }

    public String getStatusid() {
        return statusid;
    }

    public void setStatus(org.museframework.bian.parroupro.dto.bq.Status status) {
        this.status = status;
    }

    public org.museframework.bian.parroupro.dto.bq.Status getStatus() {
        return status;
    }
}