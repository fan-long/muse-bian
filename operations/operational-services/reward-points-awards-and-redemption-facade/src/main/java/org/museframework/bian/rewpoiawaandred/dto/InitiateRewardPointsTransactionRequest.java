package org.museframework.bian.rewpoiawaandred.dto;

public class InitiateRewardPointsTransactionRequest {
    private org.museframework.bian.rewpoiawaandred.dto.cr.RewardPointsTransaction rewardPointsTransaction;

    public void setRewardPointsTransaction(org.museframework.bian.rewpoiawaandred.dto.cr.RewardPointsTransaction rewardPointsTransaction) {
        this.rewardPointsTransaction = rewardPointsTransaction;
    }

    public org.museframework.bian.rewpoiawaandred.dto.cr.RewardPointsTransaction getRewardPointsTransaction() {
        return rewardPointsTransaction;
    }
}