package org.museframework.bian.carterope.dto;

public class RetrieveBatchRequest {
    private String cardterminaloperationid;

    private String batchid;

    public void setCardterminaloperationid(String cardterminaloperationid) {
        this.cardterminaloperationid = cardterminaloperationid;
    }

    public String getCardterminaloperationid() {
        return cardterminaloperationid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getBatchid() {
        return batchid;
    }
}