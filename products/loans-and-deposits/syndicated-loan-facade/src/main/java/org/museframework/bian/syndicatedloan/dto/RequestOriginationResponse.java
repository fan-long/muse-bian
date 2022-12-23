package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestOriginationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.syndicatedloan.dto.bq.Origination origination;

    public void setOrigination(org.museframework.bian.syndicatedloan.dto.bq.Origination origination) {
        this.origination = origination;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Origination getOrigination() {
        return origination;
    }
}