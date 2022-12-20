package org.museframework.bian.rewpoiacc.dto;

public class InitiateCaptureResponse {
    private org.museframework.bian.rewpoiacc.dto.bq.Capture capture;

    public void setCapture(org.museframework.bian.rewpoiacc.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.rewpoiacc.dto.bq.Capture getCapture() {
        return capture;
    }
}