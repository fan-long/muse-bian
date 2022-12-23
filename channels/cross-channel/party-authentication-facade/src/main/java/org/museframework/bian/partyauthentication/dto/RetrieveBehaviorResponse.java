package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBehaviorResponse {
    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Behavior behavior;

    public void setBehavior(org.museframework.bian.partyauthentication.dto.bq.Behavior behavior) {
        this.behavior = behavior;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Behavior getBehavior() {
        return behavior;
    }
}