package org.museframework.bian.cartraswi.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionRoutingRequest {
    @MetaField
    private String cardtransactionswitchid;

    @MetaField
    private String transactionroutingid;

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
}