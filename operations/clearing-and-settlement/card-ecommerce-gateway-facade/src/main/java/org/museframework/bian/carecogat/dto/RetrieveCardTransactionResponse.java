package org.museframework.bian.carecogat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCardTransactionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carecogat.dto.bq.CardTransaction cardTransaction;

    public void setCardTransaction(org.museframework.bian.carecogat.dto.bq.CardTransaction cardTransaction) {
        this.cardTransaction = cardTransaction;
    }

    public org.museframework.bian.carecogat.dto.bq.CardTransaction getCardTransaction() {
        return cardTransaction;
    }
}