package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAuthenticationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Authentication authentication;

    public void setAuthentication(org.museframework.bian.sessiondialogue.dto.bq.Authentication authentication) {
        this.authentication = authentication;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Authentication getAuthentication() {
        return authentication;
    }
}