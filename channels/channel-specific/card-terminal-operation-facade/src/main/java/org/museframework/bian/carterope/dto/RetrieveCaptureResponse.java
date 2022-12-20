package org.museframework.bian.carterope.dto;

public class RetrieveCaptureResponse {
    private org.museframework.bian.carterope.dto.bq.Capture capture;

    public void setCapture(org.museframework.bian.carterope.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.carterope.dto.bq.Capture getCapture() {
        return capture;
    }
}