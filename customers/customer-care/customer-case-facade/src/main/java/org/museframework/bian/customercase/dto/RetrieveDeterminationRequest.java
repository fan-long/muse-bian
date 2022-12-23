package org.museframework.bian.customercase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDeterminationRequest {
    @MetaField
    private String customercaseid;

    @MetaField
    private String determinationid;

    public void setCustomercaseid(String customercaseid) {
        this.customercaseid = customercaseid;
    }

    public String getCustomercaseid() {
        return customercaseid;
    }

    public void setDeterminationid(String determinationid) {
        this.determinationid = determinationid;
    }

    public String getDeterminationid() {
        return determinationid;
    }
}