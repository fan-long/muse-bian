package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveNegotiationRequest {
    @MetaField
    private String accountrecoveryid;

    @MetaField
    private String negotiationid;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setNegotiationid(String negotiationid) {
        this.negotiationid = negotiationid;
    }

    public String getNegotiationid() {
        return negotiationid;
    }
}