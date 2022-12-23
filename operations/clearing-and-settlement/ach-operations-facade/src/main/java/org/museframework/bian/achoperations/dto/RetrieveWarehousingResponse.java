package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveWarehousingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.bq.Warehousing warehousing;

    public void setWarehousing(org.museframework.bian.achoperations.dto.bq.Warehousing warehousing) {
        this.warehousing = warehousing;
    }

    public org.museframework.bian.achoperations.dto.bq.Warehousing getWarehousing() {
        return warehousing;
    }
}