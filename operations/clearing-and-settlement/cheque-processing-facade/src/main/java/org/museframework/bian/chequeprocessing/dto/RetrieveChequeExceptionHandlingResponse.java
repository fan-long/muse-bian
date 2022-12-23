package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveChequeExceptionHandlingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling chequeExceptionHandling;

    public void setChequeExceptionHandling(org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling chequeExceptionHandling) {
        this.chequeExceptionHandling = chequeExceptionHandling;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling getChequeExceptionHandling() {
        return chequeExceptionHandling;
    }
}