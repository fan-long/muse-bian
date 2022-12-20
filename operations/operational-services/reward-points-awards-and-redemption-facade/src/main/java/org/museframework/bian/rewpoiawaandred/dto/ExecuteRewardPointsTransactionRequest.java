package org.museframework.bian.rewpoiawaandred.dto;

public class ExecuteRewardPointsTransactionRequest {
    private String rewardpointsawardsandredemptionid;

    private org.museframework.bian.rewpoiawaandred.dto.cr.RewardPointsTransaction rewardPointsTransaction;

    public void setRewardpointsawardsandredemptionid(String rewardpointsawardsandredemptionid) {
        this.rewardpointsawardsandredemptionid = rewardpointsawardsandredemptionid;
    }

    public String getRewardpointsawardsandredemptionid() {
        return rewardpointsawardsandredemptionid;
    }

    public void setRewardPointsTransaction(org.museframework.bian.rewpoiawaandred.dto.cr.RewardPointsTransaction rewardPointsTransaction) {
        this.rewardPointsTransaction = rewardPointsTransaction;
    }

    public org.museframework.bian.rewpoiawaandred.dto.cr.RewardPointsTransaction getRewardPointsTransaction() {
        return rewardPointsTransaction;
    }
}