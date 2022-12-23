package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePrecedentsRequest {
    @MetaField
    private String partylifecyclemanagementid;

    @MetaField
    private String precedentsid;

    @MetaField(ref=true)
    private org.museframework.bian.parlifman.dto.bq.Precedents precedents;

    public void setPartylifecyclemanagementid(String partylifecyclemanagementid) {
        this.partylifecyclemanagementid = partylifecyclemanagementid;
    }

    public String getPartylifecyclemanagementid() {
        return partylifecyclemanagementid;
    }

    public void setPrecedentsid(String precedentsid) {
        this.precedentsid = precedentsid;
    }

    public String getPrecedentsid() {
        return precedentsid;
    }

    public void setPrecedents(org.museframework.bian.parlifman.dto.bq.Precedents precedents) {
        this.precedents = precedents;
    }

    public org.museframework.bian.parlifman.dto.bq.Precedents getPrecedents() {
        return precedents;
    }
}