package org.museframework.bian.carfinset.dto;

public class UpdateProcessingRequest {
    private String cardfinancialsettlementid;

    private String processingid;

    private org.museframework.bian.carfinset.dto.bq.Processing processing;

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

    public void setProcessing(org.museframework.bian.carfinset.dto.bq.Processing processing) {
        this.processing = processing;
    }

    public org.museframework.bian.carfinset.dto.bq.Processing getProcessing() {
        return processing;
    }
}