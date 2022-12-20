package org.museframework.bian.rewpoiacc.dto;

public class UpdateCaptureRequest {
    private String rewardpointsaccountid;

    private String captureid;

    private org.museframework.bian.rewpoiacc.dto.bq.Capture capture;

    public void setRewardpointsaccountid(String rewardpointsaccountid) {
        this.rewardpointsaccountid = rewardpointsaccountid;
    }

    public String getRewardpointsaccountid() {
        return rewardpointsaccountid;
    }

    public void setCaptureid(String captureid) {
        this.captureid = captureid;
    }

    public String getCaptureid() {
        return captureid;
    }

    public void setCapture(org.museframework.bian.rewpoiacc.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.rewpoiacc.dto.bq.Capture getCapture() {
        return capture;
    }
}