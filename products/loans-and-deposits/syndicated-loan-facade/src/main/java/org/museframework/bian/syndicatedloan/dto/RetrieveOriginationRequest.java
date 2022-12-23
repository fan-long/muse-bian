package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOriginationRequest {
    @MetaField
    private String syndicatedloanid;

    @MetaField
    private String originationid;

    public void setSyndicatedloanid(String syndicatedloanid) {
        this.syndicatedloanid = syndicatedloanid;
    }

    public String getSyndicatedloanid() {
        return syndicatedloanid;
    }

    public void setOriginationid(String originationid) {
        this.originationid = originationid;
    }

    public String getOriginationid() {
        return originationid;
    }
}