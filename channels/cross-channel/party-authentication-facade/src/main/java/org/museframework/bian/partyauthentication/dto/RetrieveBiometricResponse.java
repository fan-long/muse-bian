package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBiometricResponse {
    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Biometric biometric;

    public void setBiometric(org.museframework.bian.partyauthentication.dto.bq.Biometric biometric) {
        this.biometric = biometric;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Biometric getBiometric() {
        return biometric;
    }
}