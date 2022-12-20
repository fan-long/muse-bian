package org.museframework.bian.partyauthentication.dto;

public class RetrieveBiometricRequest {
    private String partyauthenticationid;

    private String biometricid;

    public void setPartyauthenticationid(String partyauthenticationid) {
        this.partyauthenticationid = partyauthenticationid;
    }

    public String getPartyauthenticationid() {
        return partyauthenticationid;
    }

    public void setBiometricid(String biometricid) {
        this.biometricid = biometricid;
    }

    public String getBiometricid() {
        return biometricid;
    }
}