package org.museframework.bian.cardclearing.dto;

public class UpdateCaptureRequest {
    private String cardclearingid;

    private String captureid;

    private org.museframework.bian.cardclearing.dto.bq.Capture capture;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setCaptureid(String captureid) {
        this.captureid = captureid;
    }

    public String getCaptureid() {
        return captureid;
    }

    public void setCapture(org.museframework.bian.cardclearing.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.cardclearing.dto.bq.Capture getCapture() {
        return capture;
    }
}