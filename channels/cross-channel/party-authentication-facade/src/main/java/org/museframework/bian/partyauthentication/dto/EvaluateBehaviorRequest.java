package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateBehaviorRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField
    private String behaviorid;

    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Behavior behavior;

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

    public void setBehavior(org.museframework.bian.partyauthentication.dto.bq.Behavior behavior) {
        this.behavior = behavior;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Behavior getBehavior() {
        return behavior;
    }
}