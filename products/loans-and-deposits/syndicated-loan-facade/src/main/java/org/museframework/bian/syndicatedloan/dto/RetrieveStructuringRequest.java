package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveStructuringRequest {
    @MetaField
    private String syndicatedloanid;

    @MetaField
    private String structuringid;

    public void setSyndicatedloanid(String syndicatedloanid) {
        this.syndicatedloanid = syndicatedloanid;
    }

    public String getSyndicatedloanid() {
        return syndicatedloanid;
    }

    public void setStructuringid(String structuringid) {
        this.structuringid = structuringid;
    }

    public String getStructuringid() {
        return structuringid;
    }
}