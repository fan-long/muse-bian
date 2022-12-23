package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluatePasswordResponse {
    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Password password;

    public void setPassword(org.museframework.bian.partyauthentication.dto.bq.Password password) {
        this.password = password;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Password getPassword() {
        return password;
    }
}