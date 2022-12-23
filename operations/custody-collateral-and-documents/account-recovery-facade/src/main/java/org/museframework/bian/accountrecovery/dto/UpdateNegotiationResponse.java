package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateNegotiationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountrecovery.dto.bq.Negotiation negotiation;

    public void setNegotiation(org.museframework.bian.accountrecovery.dto.bq.Negotiation negotiation) {
        this.negotiation = negotiation;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Negotiation getNegotiation() {
        return negotiation;
    }
}