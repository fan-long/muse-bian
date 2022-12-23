package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCardTransactionRequest {
    @MetaField
    private String creditcardid;

    @MetaField
    private String cardtransactionid;

    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.CardTransaction cardTransaction;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setCardtransactionid(String cardtransactionid) {
        this.cardtransactionid = cardtransactionid;
    }

    public String getCardtransactionid() {
        return cardtransactionid;
    }

    public void setCardTransaction(org.museframework.bian.creditcard.dto.bq.CardTransaction cardTransaction) {
        this.cardTransaction = cardTransaction;
    }

    public org.museframework.bian.creditcard.dto.bq.CardTransaction getCardTransaction() {
        return cardTransaction;
    }
}