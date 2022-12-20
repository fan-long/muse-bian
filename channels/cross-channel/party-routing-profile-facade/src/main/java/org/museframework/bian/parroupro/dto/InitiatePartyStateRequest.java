package org.museframework.bian.parroupro.dto;

public class InitiatePartyStateRequest {
    private org.museframework.bian.parroupro.dto.cr.PartyState partyState;

    public void setPartyState(org.museframework.bian.parroupro.dto.cr.PartyState partyState) {
        this.partyState = partyState;
    }

    public org.museframework.bian.parroupro.dto.cr.PartyState getPartyState() {
        return partyState;
    }
}