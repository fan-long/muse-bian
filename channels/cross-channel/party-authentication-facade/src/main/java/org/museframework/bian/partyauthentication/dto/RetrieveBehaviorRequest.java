package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBehaviorRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField
    private String behaviorid;

    public void setPartyauthenticationid(String partyauthenticationid) {
        this.partyauthenticationid = partyauthenticationid;
    }

    public String getPartyauthenticationid() {
        return partyauthenticationid;
    }

    public void setBehaviorid(String behaviorid) {
        this.behaviorid = behaviorid;
    }

    public String getBehaviorid() {
        return behaviorid;
    }
}