package org.museframework.bian.locdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.locdatman.dto.bq.Location location;

    public void setLocation(org.museframework.bian.locdatman.dto.bq.Location location) {
        this.location = location;
    }

    public org.museframework.bian.locdatman.dto.bq.Location getLocation() {
        return location;
    }
}