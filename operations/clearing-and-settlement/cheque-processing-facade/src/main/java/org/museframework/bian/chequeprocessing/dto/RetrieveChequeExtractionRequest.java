package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveChequeExtractionRequest {
    @MetaField
    private String chequeprocessingid;

    @MetaField
    private String chequeextractionid;

    public void setChequeprocessingid(String chequeprocessingid) {
        this.chequeprocessingid = chequeprocessingid;
    }

    public String getChequeprocessingid() {
        return chequeprocessingid;
    }

    public void setChequeextractionid(String chequeextractionid) {
        this.chequeextractionid = chequeextractionid;
    }

    public String getChequeextractionid() {
        return chequeextractionid;
    }
}