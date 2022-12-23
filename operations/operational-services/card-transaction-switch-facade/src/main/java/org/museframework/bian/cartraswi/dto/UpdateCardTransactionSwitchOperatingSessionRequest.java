package org.museframework.bian.cartraswi.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCardTransactionSwitchOperatingSessionRequest {
    @MetaField
    private String cardtransactionswitchid;

    @MetaField(ref=true)
    private org.museframework.bian.cartraswi.dto.cr.CardTransactionSwitchOperatingSession cardTransactionSwitchOperatingSession;

    public void setCardtransactionswitchid(String cardtransactionswitchid) {
        this.cardtransactionswitchid = cardtransactionswitchid;
    }

    public String getCardtransactionswitchid() {
        return cardtransactionswitchid;
    }

    public void setCardTransactionSwitchOperatingSession(org.museframework.bian.cartraswi.dto.cr.CardTransactionSwitchOperatingSession cardTransactionSwitchOperatingSession) {
        this.cardTransactionSwitchOperatingSession = cardTransactionSwitchOperatingSession;
    }

    public org.museframework.bian.cartraswi.dto.cr.CardTransactionSwitchOperatingSession getCardTransactionSwitchOperatingSession() {
        return cardTransactionSwitchOperatingSession;
    }
}