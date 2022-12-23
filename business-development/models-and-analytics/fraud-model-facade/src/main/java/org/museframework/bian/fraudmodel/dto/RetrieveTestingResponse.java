package org.museframework.bian.fraudmodel.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTestingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fraudmodel.dto.bq.Testing testing;

    public void setTesting(org.museframework.bian.fraudmodel.dto.bq.Testing testing) {
        this.testing = testing;
    }

    public org.museframework.bian.fraudmodel.dto.bq.Testing getTesting() {
        return testing;
    }
}