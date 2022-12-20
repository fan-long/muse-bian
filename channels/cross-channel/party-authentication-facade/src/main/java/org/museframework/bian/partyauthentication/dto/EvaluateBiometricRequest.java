package org.museframework.bian.partyauthentication.dto;

public class EvaluateBiometricRequest {
    private String partyauthenticationid;

    private String biometricid;

    private org.museframework.bian.partyauthentication.dto.bq.Biometric biometric;

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

    public void setBiometric(org.museframework.bian.partyauthentication.dto.bq.Biometric biometric) {
        this.biometric = biometric;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Biometric getBiometric() {
        return biometric;
    }
}