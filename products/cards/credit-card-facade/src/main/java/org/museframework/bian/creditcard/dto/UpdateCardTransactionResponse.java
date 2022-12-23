package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCardTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.CardTransaction cardTransaction;

    public void setCardTransaction(org.museframework.bian.creditcard.dto.bq.CardTransaction cardTransaction) {
        this.cardTransaction = cardTransaction;
    }

    public org.museframework.bian.creditcard.dto.bq.CardTransaction getCardTransaction() {
        return cardTransaction;
    }
}