package org.museframework.bian.carterope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestAuthorizationRequest {
    @MetaField
    private String cardterminaloperationid;

    @MetaField
    private String authorizationid;

    @MetaField(ref=true)
    private org.museframework.bian.carterope.dto.bq.Authorization authorization;

    public void setCardterminaloperationid(String cardterminaloperationid) {
        this.cardterminaloperationid = cardterminaloperationid;
    }

    public String getCardterminaloperationid() {
        return cardterminaloperationid;
    }

    public void setAuthorizationid(String authorizationid) {
        this.authorizationid = authorizationid;
    }

    public String getAuthorizationid() {
        return authorizationid;
    }

    public void setAuthorization(org.museframework.bian.carterope.dto.bq.Authorization authorization) {
        this.authorization = authorization;
    }

    public org.museframework.bian.carterope.dto.bq.Authorization getAuthorization() {
        return authorization;
    }
}