package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateNegotiationRequest {
    @MetaField
    private String accountrecoveryid;

    @MetaField
    private String negotiationid;

    @MetaField(ref=true)
    private org.museframework.bian.accountrecovery.dto.bq.Negotiation negotiation;

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

    public void setNegotiation(org.museframework.bian.accountrecovery.dto.bq.Negotiation negotiation) {
        this.negotiation = negotiation;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Negotiation getNegotiation() {
        return negotiation;
    }
}