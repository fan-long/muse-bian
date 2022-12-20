package org.museframework.bian.carterope.dto;

public class UpdateBatchRequest {
    private String cardterminaloperationid;

    private String batchid;

    private org.museframework.bian.carterope.dto.bq.Batch batch;

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

    public void setBatch(org.museframework.bian.carterope.dto.bq.Batch batch) {
        this.batch = batch;
    }

    public org.museframework.bian.carterope.dto.bq.Batch getBatch() {
        return batch;
    }
}