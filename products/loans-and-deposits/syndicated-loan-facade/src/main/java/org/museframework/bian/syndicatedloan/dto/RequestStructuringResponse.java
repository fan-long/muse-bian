package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestStructuringResponse {
    @MetaField(ref=true)
    private org.museframework.bian.syndicatedloan.dto.bq.Structuring structuring;

    public void setStructuring(org.museframework.bian.syndicatedloan.dto.bq.Structuring structuring) {
        this.structuring = structuring;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Structuring getStructuring() {
        return structuring;
    }
}