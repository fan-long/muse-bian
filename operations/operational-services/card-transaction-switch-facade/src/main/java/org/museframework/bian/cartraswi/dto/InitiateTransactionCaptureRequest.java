package org.museframework.bian.cartraswi.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTransactionCaptureRequest {
    @MetaField
    private String cardtransactionswitchid;

    @MetaField
    private String transactioncaptureid;

    @MetaField(ref=true)
    private org.museframework.bian.cartraswi.dto.bq.TransactionCapture transactionCapture;

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

    public void setTransactionCapture(org.museframework.bian.cartraswi.dto.bq.TransactionCapture transactionCapture) {
        this.transactionCapture = transactionCapture;
    }

    public org.museframework.bian.cartraswi.dto.bq.TransactionCapture getTransactionCapture() {
        return transactionCapture;
    }
}