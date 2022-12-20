package org.museframework.bian.partyauthentication.dto;

public class EvaluatePasswordRequest {
    private String partyauthenticationid;

    private String passwordid;

    private org.museframework.bian.partyauthentication.dto.bq.Password password;

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

    public void setPassword(org.museframework.bian.partyauthentication.dto.bq.Password password) {
        this.password = password;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Password getPassword() {
        return password;
    }
}