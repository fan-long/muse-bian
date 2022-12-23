package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateStructuringRequest {
    @MetaField
    private String syndicatedloanid;

    @MetaField
    private String structuringid;

    @MetaField(ref=true)
    private org.museframework.bian.syndicatedloan.dto.bq.Structuring structuring;

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

    public void setStructuring(org.museframework.bian.syndicatedloan.dto.bq.Structuring structuring) {
        this.structuring = structuring;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Structuring getStructuring() {
        return structuring;
    }
}