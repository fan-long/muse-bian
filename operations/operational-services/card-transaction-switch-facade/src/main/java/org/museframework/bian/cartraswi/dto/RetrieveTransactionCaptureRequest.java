package org.museframework.bian.cartraswi.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionCaptureRequest {
    @MetaField
    private String cardtransactionswitchid;

    @MetaField
    private String transactioncaptureid;

    public void setCardtransactionswitchid(String cardtransactionswitchid) {
        this.cardtransactionswitchid = cardtransactionswitchid;
    }

    public String getCardtransactionswitchid() {
        return cardtransactionswitchid;
    }

    public void setTransactioncaptureid(String transactioncaptureid) {
        this.transactioncaptureid = transactioncaptureid;
    }

    public String getTransactioncaptureid() {
        return transactioncaptureid;
    }
}