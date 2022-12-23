package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePartyRelationshipProcedureRequest {
    @MetaField
    private String partylifecyclemanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.parlifman.dto.cr.PartyRelationshipProcedure partyRelationshipProcedure;

    public void setPartylifecyclemanagementid(String partylifecyclemanagementid) {
        this.partylifecyclemanagementid = partylifecyclemanagementid;
    }

    public String getPartylifecyclemanagementid() {
        return partylifecyclemanagementid;
    }

    public void setPartyRelationshipProcedure(org.museframework.bian.parlifman.dto.cr.PartyRelationshipProcedure partyRelationshipProcedure) {
        this.partyRelationshipProcedure = partyRelationshipProcedure;
    }

    public org.museframework.bian.parlifman.dto.cr.PartyRelationshipProcedure getPartyRelationshipProcedure() {
        return partyRelationshipProcedure;
    }
}