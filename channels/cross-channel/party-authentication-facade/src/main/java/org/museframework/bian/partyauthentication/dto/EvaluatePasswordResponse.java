package org.museframework.bian.partyauthentication.dto;

public class EvaluatePasswordResponse {
    private org.museframework.bian.partyauthentication.dto.bq.Password password;

    public void setPassword(org.museframework.bian.partyauthentication.dto.bq.Password password) {
        this.password = password;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Password getPassword() {
        return password;
    }
}