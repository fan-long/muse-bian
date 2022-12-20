package org.museframework.bian.carterope.dto;

public class UpdateCaptureRequest {
    private String cardterminaloperationid;

    private String captureid;

    private org.museframework.bian.carterope.dto.bq.Capture capture;

    public void setCardterminaloperationid(String cardterminaloperationid) {
        this.cardterminaloperationid = cardterminaloperationid;
    }

    public String getCardterminaloperationid() {
        return cardterminaloperationid;
    }

    public void setCaptureid(String captureid) {
        this.captureid = captureid;
    }

    public String getCaptureid() {
        return captureid;
    }

    public void setCapture(org.museframework.bian.carterope.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.carterope.dto.bq.Capture getCapture() {
        return capture;
    }
}