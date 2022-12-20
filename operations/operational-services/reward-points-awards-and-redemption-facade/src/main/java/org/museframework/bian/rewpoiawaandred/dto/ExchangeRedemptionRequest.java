package org.museframework.bian.rewpoiawaandred.dto;

public class ExchangeRedemptionRequest {
    private String rewardpointsawardsandredemptionid;

    private String redemptionid;

    private org.museframework.bian.rewpoiawaandred.dto.bq.Redemption redemption;

    public void setRewardpointsawardsandredemptionid(String rewardpointsawardsandredemptionid) {
        this.rewardpointsawardsandredemptionid = rewardpointsawardsandredemptionid;
    }

    public String getRewardpointsawardsandredemptionid() {
        return rewardpointsawardsandredemptionid;
    }

    public void setRedemptionid(String redemptionid) {
        this.redemptionid = redemptionid;
    }

    public String getRedemptionid() {
        return redemptionid;
    }

    public void setRedemption(org.museframework.bian.rewpoiawaandred.dto.bq.Redemption redemption) {
        this.redemption = redemption;
    }

    public org.museframework.bian.rewpoiawaandred.dto.bq.Redemption getRedemption() {
        return redemption;
    }
}