package org.museframework.bian.crecarposkee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCardTransactionEventResponse {
    @MetaField(ref=true)
    private org.museframework.bian.crecarposkee.dto.bq.CardTransactionEvent cardTransactionEvent;

    public void setCardTransactionEvent(org.museframework.bian.crecarposkee.dto.bq.CardTransactionEvent cardTransactionEvent) {
        this.cardTransactionEvent = cardTransactionEvent;
    }

    public org.museframework.bian.crecarposkee.dto.bq.CardTransactionEvent getCardTransactionEvent() {
        return cardTransactionEvent;
    }
}