package org.museframework.bian.rewpoiacc.dto;

public class RetrieveExpirationRequest {
    private String rewardpointsaccountid;

    private String expirationid;

    public void setRewardpointsaccountid(String rewardpointsaccountid) {
        this.rewardpointsaccountid = rewardpointsaccountid;
    }

    public String getRewardpointsaccountid() {
        return rewardpointsaccountid;
    }

    public void setExpirationid(String expirationid) {
        this.expirationid = expirationid;
    }

    public String getExpirationid() {
        return expirationid;
    }
}