package org.museframework.bian.chelocbox.dto;

public class ExchangePaperCheckProcessingFulfillmentRequest {
    private String chequelockboxid;

    private String papercheckprocessingfulfillmentid;

    private org.museframework.bian.chelocbox.dto.bq.PaperCheckProcessingFulfillment paperCheckProcessingFulfillment;

    public void setChequelockboxid(String chequelockboxid) {
        this.chequelockboxid = chequelockboxid;
    }

    public String getChequelockboxid() {
        return chequelockboxid;
    }

    public void setPapercheckprocessingfulfillmentid(String papercheckprocessingfulfillmentid) {
        this.papercheckprocessingfulfillmentid = papercheckprocessingfulfillmentid;
    }

    public String getPapercheckprocessingfulfillmentid() {
        return papercheckprocessingfulfillmentid;
    }

    public void setPaperCheckProcessingFulfillment(org.museframework.bian.chelocbox.dto.bq.PaperCheckProcessingFulfillment paperCheckProcessingFulfillment) {
        this.paperCheckProcessingFulfillment = paperCheckProcessingFulfillment;
    }

    public org.museframework.bian.chelocbox.dto.bq.PaperCheckProcessingFulfillment getPaperCheckProcessingFulfillment() {
        return paperCheckProcessingFulfillment;
    }
}