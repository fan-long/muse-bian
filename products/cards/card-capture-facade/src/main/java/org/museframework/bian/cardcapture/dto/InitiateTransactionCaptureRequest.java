package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTransactionCaptureRequest {
    @MetaField
    private String cardcaptureid;

    @MetaField
    private String transactioncaptureid;

    @MetaField(ref=true)
    private org.museframework.bian.cardcapture.dto.bq.TransactionCapture transactionCapture;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setTransactioncaptureid(String transactioncaptureid) {
        this.transactioncaptureid = transactioncaptureid;
    }

    public String getTransactioncaptureid() {
        return transactioncaptureid;
    }

    public void setTransactionCapture(org.museframework.bian.cardcapture.dto.bq.TransactionCapture transactionCapture) {
        this.transactionCapture = transactionCapture;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionCapture getTransactionCapture() {
        return transactionCapture;
    }
}