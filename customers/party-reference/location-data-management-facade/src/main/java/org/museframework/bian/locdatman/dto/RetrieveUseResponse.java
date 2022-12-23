package org.museframework.bian.locdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveUseResponse {
    @MetaField(ref=true)
    private org.museframework.bian.locdatman.dto.bq.Use use;

    public void setUse(org.museframework.bian.locdatman.dto.bq.Use use) {
        this.use = use;
    }

    public org.museframework.bian.locdatman.dto.bq.Use getUse() {
        return use;
    }
}