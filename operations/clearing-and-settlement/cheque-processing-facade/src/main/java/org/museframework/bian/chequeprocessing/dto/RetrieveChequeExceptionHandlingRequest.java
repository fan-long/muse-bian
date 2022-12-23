package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveChequeExceptionHandlingRequest {
    @MetaField
    private String chequeprocessingid;

    @MetaField
    private String chequeexceptionhandlingid;

    public void setChequeprocessingid(String chequeprocessingid) {
        this.chequeprocessingid = chequeprocessingid;
    }

    public String getChequeprocessingid() {
        return chequeprocessingid;
    }

    public void setChequeexceptionhandlingid(String chequeexceptionhandlingid) {
        this.chequeexceptionhandlingid = chequeexceptionhandlingid;
    }

    public String getChequeexceptionhandlingid() {
        return chequeexceptionhandlingid;
    }
}