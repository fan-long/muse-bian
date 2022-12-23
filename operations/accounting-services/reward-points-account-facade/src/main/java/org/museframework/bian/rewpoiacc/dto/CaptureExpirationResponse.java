package org.museframework.bian.rewpoiacc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureExpirationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.rewpoiacc.dto.bq.Expiration expiration;

    public void setExpiration(org.museframework.bian.rewpoiacc.dto.bq.Expiration expiration) {
        this.expiration = expiration;
    }

    public org.museframework.bian.rewpoiacc.dto.bq.Expiration getExpiration() {
        return expiration;
    }
}