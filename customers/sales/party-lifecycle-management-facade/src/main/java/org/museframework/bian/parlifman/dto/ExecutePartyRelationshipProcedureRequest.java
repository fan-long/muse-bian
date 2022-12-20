package org.museframework.bian.parlifman.dto;

public class ExecutePartyRelationshipProcedureRequest {
    private String partylifecyclemanagementid;

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