package org.museframework.bian.carfinset.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProcessingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carfinset.dto.bq.Processing processing;

    public void setProcessing(org.museframework.bian.carfinset.dto.bq.Processing processing) {
        this.processing = processing;
    }

    public org.museframework.bian.carfinset.dto.bq.Processing getProcessing() {
        return processing;
    }
}