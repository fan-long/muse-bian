package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiatePartyStateRequest {
    @MetaField(ref=true)
    private org.museframework.bian.parroupro.dto.cr.PartyState partyState;

    public void setPartyState(org.museframework.bian.parroupro.dto.cr.PartyState partyState) {
        this.partyState = partyState;
    }

    public org.museframework.bian.parroupro.dto.cr.PartyState getPartyState() {
        return partyState;
    }
}