package org.museframework.bian.chelocbox.dto;

public class NotifyPaperCheckProcessingFulfillmentRequest {
    private String chequelockboxid;

    private String papercheckprocessingfulfillmentid;

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
}