package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAlertRequest {
    @MetaField
    private String partyroutingprofileid;

    @MetaField
    private String alertid;

    public void setPartyroutingprofileid(String partyroutingprofileid) {
        this.partyroutingprofileid = partyroutingprofileid;
    }

    public String getPartyroutingprofileid() {
        return partyroutingprofileid;
    }

    public void setAlertid(String alertid) {
        this.alertid = alertid;
    }

    public String getAlertid() {
        return alertid;
    }
}