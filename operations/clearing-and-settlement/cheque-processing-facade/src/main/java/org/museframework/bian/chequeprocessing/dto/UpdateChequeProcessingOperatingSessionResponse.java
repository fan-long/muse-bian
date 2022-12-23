package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateChequeProcessingOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession chequeProcessingOperatingSession;

    public void setChequeProcessingOperatingSession(org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession chequeProcessingOperatingSession) {
        this.chequeProcessingOperatingSession = chequeProcessingOperatingSession;
    }

    public org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession getChequeProcessingOperatingSession() {
        return chequeProcessingOperatingSession;
    }
}