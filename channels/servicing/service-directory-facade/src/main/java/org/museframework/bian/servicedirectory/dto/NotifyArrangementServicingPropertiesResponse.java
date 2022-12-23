package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyArrangementServicingPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.ArrangementServicingProperties arrangementServicingProperties;

    public void setArrangementServicingProperties(org.museframework.bian.servicedirectory.dto.bq.ArrangementServicingProperties arrangementServicingProperties) {
        this.arrangementServicingProperties = arrangementServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.ArrangementServicingProperties getArrangementServicingProperties() {
        return arrangementServicingProperties;
    }
}