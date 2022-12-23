package org.museframework.bian.carterope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateBatchResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carterope.dto.bq.Batch batch;

    public void setBatch(org.museframework.bian.carterope.dto.bq.Batch batch) {
        this.batch = batch;
    }

    public org.museframework.bian.carterope.dto.bq.Batch getBatch() {
        return batch;
    }
}