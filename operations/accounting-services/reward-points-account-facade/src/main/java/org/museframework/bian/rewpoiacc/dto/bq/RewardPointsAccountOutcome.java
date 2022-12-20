/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.rewpoiacc.dto.bq;

public class RewardPointsAccountOutcome {
    /**/
    private String rewardPointsAccountIncident;

    /**/
    private String rewardPointsAccountLog;

    public void setRewardPointsAccountIncident(String rewardPointsAccountIncident) {
        this.rewardPointsAccountIncident = rewardPointsAccountIncident;
    }

    public String getRewardPointsAccountIncident() {
        return rewardPointsAccountIncident;
    }

    public void setRewardPointsAccountLog(String rewardPointsAccountLog) {
        this.rewardPointsAccountLog = rewardPointsAccountLog;
    }

    public String getRewardPointsAccountLog() {
        return rewardPointsAccountLog;
    }
}