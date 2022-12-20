package org.museframework.bian.rewpoiacc.dto;

public class InitiateRewardPointsLogRequest {
    private org.museframework.bian.rewpoiacc.dto.cr.RewardPointsLog rewardPointsLog;

    public void setRewardPointsLog(org.museframework.bian.rewpoiacc.dto.cr.RewardPointsLog rewardPointsLog) {
        this.rewardPointsLog = rewardPointsLog;
    }

    public org.museframework.bian.rewpoiacc.dto.cr.RewardPointsLog getRewardPointsLog() {
        return rewardPointsLog;
    }
}