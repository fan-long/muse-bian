package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLifeResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.Life life;

    public void setLife(org.museframework.bian.cusevehis.dto.bq.Life life) {
        this.life = life;
    }

    public org.museframework.bian.cusevehis.dto.bq.Life getLife() {
        return life;
    }
}