package org.museframework.bian.partyauthentication.dto;

public class RetrieveBiometricResponse {
    private org.museframework.bian.partyauthentication.dto.bq.Biometric biometric;

    public void setBiometric(org.museframework.bian.partyauthentication.dto.bq.Biometric biometric) {
        this.biometric = biometric;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Biometric getBiometric() {
        return biometric;
    }
}