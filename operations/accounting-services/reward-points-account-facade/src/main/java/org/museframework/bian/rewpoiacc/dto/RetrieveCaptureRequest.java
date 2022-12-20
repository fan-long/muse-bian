package org.museframework.bian.rewpoiacc.dto;

public class RetrieveCaptureRequest {
    private String rewardpointsaccountid;

    private String captureid;

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
}