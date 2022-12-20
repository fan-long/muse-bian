package org.museframework.bian.carfinset.dto;

public class RetrieveProcessingRequest {
    private String cardfinancialsettlementid;

    private String processingid;

    public void setCardfinancialsettlementid(String cardfinancialsettlementid) {
        this.cardfinancialsettlementid = cardfinancialsettlementid;
    }

    public String getCardfinancialsettlementid() {
        return cardfinancialsettlementid;
    }

    public void setProcessingid(String processingid) {
        this.processingid = processingid;
    }

    public String getProcessingid() {
        return processingid;
    }
}