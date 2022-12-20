package org.museframework.bian.partyauthentication.dto;

public class RetrievePasswordRequest {
    private String partyauthenticationid;

    private String passwordid;

    public void setPartyauthenticationid(String partyauthenticationid) {
        this.partyauthenticationid = partyauthenticationid;
    }

    public String getPartyauthenticationid() {
        return partyauthenticationid;
    }

    public void setPasswordid(String passwordid) {
        this.passwordid = passwordid;
    }

    public String getPasswordid() {
        return passwordid;
    }
}