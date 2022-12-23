package org.museframework.bian.chequeprocessing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateChequeExceptionHandlingRequest {
    @MetaField
    private String chequeprocessingid;

    @MetaField
    private String chequeexceptionhandlingid;

    @MetaField(ref=true)
    private org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling chequeExceptionHandling;

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

    public void setChequeExceptionHandling(org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling chequeExceptionHandling) {
        this.chequeExceptionHandling = chequeExceptionHandling;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling getChequeExceptionHandling() {
        return chequeExceptionHandling;
    }
}