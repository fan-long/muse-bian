package org.museframework.bian.parroupro.dto;

public class ExecutePartyStateRequest {
    private String partyroutingprofileid;

    private org.museframework.bian.parroupro.dto.cr.PartyState partyState;

    public void setPartyroutingprofileid(String partyroutingprofileid) {
        this.partyroutingprofileid = partyroutingprofileid;
    }

    public String getPartyroutingprofileid() {
        return partyroutingprofileid;
    }

    public void setPartyState(org.museframework.bian.parroupro.dto.cr.PartyState partyState) {
        this.partyState = partyState;
    }

    public org.museframework.bian.parroupro.dto.cr.PartyState getPartyState() {
        return partyState;
    }
}