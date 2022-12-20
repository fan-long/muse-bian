package org.museframework.bian.cardclearing.dto;

public class UpdateCaptureResponse {
    private org.museframework.bian.cardclearing.dto.bq.Capture capture;

    public void setCapture(org.museframework.bian.cardclearing.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.cardclearing.dto.bq.Capture getCapture() {
        return capture;
    }
}