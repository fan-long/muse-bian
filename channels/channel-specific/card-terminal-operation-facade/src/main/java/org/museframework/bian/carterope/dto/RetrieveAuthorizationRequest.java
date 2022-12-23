package org.museframework.bian.carterope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAuthorizationRequest {
    @MetaField
    private String cardterminaloperationid;

    @MetaField
    private String authorizationid;

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
}