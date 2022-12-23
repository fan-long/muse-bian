package org.museframework.bian.cartraswi.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTransactionRoutingRequest {
    @MetaField
    private String cardtransactionswitchid;

    @MetaField
    private String transactionroutingid;

    @MetaField(ref=true)
    private org.museframework.bian.cartraswi.dto.bq.TransactionRouting transactionRouting;

    public void setCardtransactionswitchid(String cardtransactionswitchid) {
        this.cardtransactionswitchid = cardtransactionswitchid;
    }

    public String getCardtransactionswitchid() {
        return cardtransactionswitchid;
    }

    public void setTransactionroutingid(String transactionroutingid) {
        this.transactionroutingid = transactionroutingid;
    }

    public String getTransactionroutingid() {
        return transactionroutingid;
    }

    public void setTransactionRouting(org.museframework.bian.cartraswi.dto.bq.TransactionRouting transactionRouting) {
        this.transactionRouting = transactionRouting;
    }

    public org.museframework.bian.cartraswi.dto.bq.TransactionRouting getTransactionRouting() {
        return transactionRouting;
    }
}