package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateBiometricRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField
    private String biometricid;

    @MetaField(ref=true)
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