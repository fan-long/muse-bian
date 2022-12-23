package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateSWUpdateResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerworkbench.dto.bq.SWUpdate sWUpdate;

    public void setsWUpdate(org.museframework.bian.customerworkbench.dto.bq.SWUpdate sWUpdate) {
        this.sWUpdate = sWUpdate;
    }

    public org.museframework.bian.customerworkbench.dto.bq.SWUpdate getsWUpdate() {
        return sWUpdate;
    }
}