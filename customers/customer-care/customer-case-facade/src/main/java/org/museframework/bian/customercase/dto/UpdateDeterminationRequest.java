package org.museframework.bian.customercase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDeterminationRequest {
    @MetaField
    private String customercaseid;

    @MetaField
    private String determinationid;

    @MetaField(ref=true)
    private org.museframework.bian.customercase.dto.bq.Determination determination;

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

    public void setDetermination(org.museframework.bian.customercase.dto.bq.Determination determination) {
        this.determination = determination;
    }

    public org.museframework.bian.customercase.dto.bq.Determination getDetermination() {
        return determination;
    }
}