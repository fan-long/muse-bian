package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeOriginationRequest {
    @MetaField
    private String syndicatedloanid;

    @MetaField
    private String originationid;

    @MetaField(ref=true)
    private org.museframework.bian.syndicatedloan.dto.bq.Origination origination;

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

    public void setOrigination(org.museframework.bian.syndicatedloan.dto.bq.Origination origination) {
        this.origination = origination;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Origination getOrigination() {
        return origination;
    }
}