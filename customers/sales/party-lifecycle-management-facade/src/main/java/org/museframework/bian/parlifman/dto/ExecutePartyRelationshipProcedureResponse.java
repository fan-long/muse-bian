package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecutePartyRelationshipProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parlifman.dto.cr.PartyRelationshipProcedure partyRelationshipProcedure;

    public void setPartyRelationshipProcedure(org.museframework.bian.parlifman.dto.cr.PartyRelationshipProcedure partyRelationshipProcedure) {
        this.partyRelationshipProcedure = partyRelationshipProcedure;
    }

    public org.museframework.bian.parlifman.dto.cr.PartyRelationshipProcedure getPartyRelationshipProcedure() {
        return partyRelationshipProcedure;
    }
}