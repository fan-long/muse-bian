package org.museframework.bian.commissions.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCheckRequest {
    @MetaField
    private String commissionsid;

    @MetaField
    private String checkid;

    public void setCommissionsid(String commissionsid) {
        this.commissionsid = commissionsid;
    }

    public String getCommissionsid() {
        return commissionsid;
    }

    public void setCheckid(String checkid) {
        this.checkid = checkid;
    }

    public String getCheckid() {
        return checkid;
    }
}