package org.museframework.bian.chelocbox.dto;

public class NotifyPaperCheckProcessingFulfillmentResponse {
    private org.museframework.bian.chelocbox.dto.bq.PaperCheckProcessingFulfillment paperCheckProcessingFulfillment;

    public void setPaperCheckProcessingFulfillment(org.museframework.bian.chelocbox.dto.bq.PaperCheckProcessingFulfillment paperCheckProcessingFulfillment) {
        this.paperCheckProcessingFulfillment = paperCheckProcessingFulfillment;
    }

    public org.museframework.bian.chelocbox.dto.bq.PaperCheckProcessingFulfillment getPaperCheckProcessingFulfillment() {
        return paperCheckProcessingFulfillment;
    }
}