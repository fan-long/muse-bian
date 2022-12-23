package org.museframework.bian.consumerloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDisbursementRequest {
    @MetaField
    private String consumerloanid;

    @MetaField
    private String disbursementid;

    public void setConsumerloanid(String consumerloanid) {
        this.consumerloanid = consumerloanid;
    }

    public String getConsumerloanid() {
        return consumerloanid;
    }

    public void setDisbursementid(String disbursementid) {
        this.disbursementid = disbursementid;
    }

    public String getDisbursementid() {
        return disbursementid;
    }
}