package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveChequeExtractionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chequeprocessing.dto.bq.ChequeExtraction chequeExtraction;

    public void setChequeExtraction(org.museframework.bian.chequeprocessing.dto.bq.ChequeExtraction chequeExtraction) {
        this.chequeExtraction = chequeExtraction;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.ChequeExtraction getChequeExtraction() {
        return chequeExtraction;
    }
}