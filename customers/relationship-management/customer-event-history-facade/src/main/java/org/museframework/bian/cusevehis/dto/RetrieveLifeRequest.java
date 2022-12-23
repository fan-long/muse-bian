package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLifeRequest {
    @MetaField
    private String customereventhistoryid;

    @MetaField
    private String lifeid;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setLifeid(String lifeid) {
        this.lifeid = lifeid;
    }

    public String getLifeid() {
        return lifeid;
    }
}