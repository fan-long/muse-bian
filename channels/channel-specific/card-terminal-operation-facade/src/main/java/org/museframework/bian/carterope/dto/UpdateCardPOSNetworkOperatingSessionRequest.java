package org.museframework.bian.carterope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCardPOSNetworkOperatingSessionRequest {
    @MetaField
    private String cardterminaloperationid;

    @MetaField(ref=true)
    private org.museframework.bian.carterope.dto.cr.CardPOSNetworkOperatingSession cardPOSNetworkOperatingSession;

    public void setCardterminaloperationid(String cardterminaloperationid) {
        this.cardterminaloperationid = cardterminaloperationid;
    }

    public String getCardterminaloperationid() {
        return cardterminaloperationid;
    }

    public void setCardPOSNetworkOperatingSession(org.museframework.bian.carterope.dto.cr.CardPOSNetworkOperatingSession cardPOSNetworkOperatingSession) {
        this.cardPOSNetworkOperatingSession = cardPOSNetworkOperatingSession;
    }

    public org.museframework.bian.carterope.dto.cr.CardPOSNetworkOperatingSession getCardPOSNetworkOperatingSession() {
        return cardPOSNetworkOperatingSession;
    }
}