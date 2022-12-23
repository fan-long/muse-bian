package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateProcessingErrorandIntegrityChecksResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proquaass.dto.bq.ProcessingErrorandIntegrityChecks processingErrorandIntegrityChecks;

    public void setProcessingErrorandIntegrityChecks(org.museframework.bian.proquaass.dto.bq.ProcessingErrorandIntegrityChecks processingErrorandIntegrityChecks) {
        this.processingErrorandIntegrityChecks = processingErrorandIntegrityChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.ProcessingErrorandIntegrityChecks getProcessingErrorandIntegrityChecks() {
        return processingErrorandIntegrityChecks;
    }
}