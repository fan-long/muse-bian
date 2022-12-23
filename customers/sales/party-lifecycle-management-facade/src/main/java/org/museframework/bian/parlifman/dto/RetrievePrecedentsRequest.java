package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePrecedentsRequest {
    @MetaField
    private String partylifecyclemanagementid;

    @MetaField
    private String precedentsid;

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
}