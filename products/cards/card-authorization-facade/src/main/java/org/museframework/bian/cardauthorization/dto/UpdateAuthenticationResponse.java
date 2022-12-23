package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateAuthenticationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardauthorization.dto.bq.Authentication authentication;

    public void setAuthentication(org.museframework.bian.cardauthorization.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.cardauthorization.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}