package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveStatusRequest {
    @MetaField
    private String partyroutingprofileid;

    @MetaField
    private String statusid;

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
}