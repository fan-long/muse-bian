package org.museframework.bian.cartraswi.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCardTransactionSwitchOperatingSessionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cartraswi.dto.cr.CardTransactionSwitchOperatingSession cardTransactionSwitchOperatingSession;

    public void setCardTransactionSwitchOperatingSession(org.museframework.bian.cartraswi.dto.cr.CardTransactionSwitchOperatingSession cardTransactionSwitchOperatingSession) {
        this.cardTransactionSwitchOperatingSession = cardTransactionSwitchOperatingSession;
    }

    public org.museframework.bian.cartraswi.dto.cr.CardTransactionSwitchOperatingSession getCardTransactionSwitchOperatingSession() {
        return cardTransactionSwitchOperatingSession;
    }
}