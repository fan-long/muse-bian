package org.museframework.bian.parlifman.dto;

public class RetrieveAuthenticationRequest {
    private String partylifecyclemanagementid;

    private String authenticationid;

    public void setPartylifecyclemanagementid(String partylifecyclemanagementid) {
        this.partylifecyclemanagementid = partylifecyclemanagementid;
    }

    public String getPartylifecyclemanagementid() {
        return partylifecyclemanagementid;
    }

    public void setAuthenticationid(String authenticationid) {
        this.authenticationid = authenticationid;
    }

    public String getAuthenticationid() {
        return authenticationid;
    }
}