package org.museframework.bian.rewpoiacc.dto;

public class CaptureRewardPointsLogRequest {
    private String rewardpointsaccountid;

    private org.museframework.bian.rewpoiacc.dto.cr.RewardPointsLog rewardPointsLog;

    public void setRewardpointsaccountid(String rewardpointsaccountid) {
        this.rewardpointsaccountid = rewardpointsaccountid;
    }

    public String getRewardpointsaccountid() {
        return rewardpointsaccountid;
    }

    public void setRewardPointsLog(org.museframework.bian.rewpoiacc.dto.cr.RewardPointsLog rewardPointsLog) {
        this.rewardPointsLog = rewardPointsLog;
    }

    public org.museframework.bian.rewpoiacc.dto.cr.RewardPointsLog getRewardPointsLog() {
        return rewardPointsLog;
    }
}