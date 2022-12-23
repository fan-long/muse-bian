package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBiometricRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField
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