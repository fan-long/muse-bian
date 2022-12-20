package org.museframework.bian.rewpoiawaandred.dto;

public class UpdateAwardRequest {
    private String rewardpointsawardsandredemptionid;

    private String awardid;

    private org.museframework.bian.rewpoiawaandred.dto.bq.Award award;

    public void setRewardpointsawardsandredemptionid(String rewardpointsawardsandredemptionid) {
        this.rewardpointsawardsandredemptionid = rewardpointsawardsandredemptionid;
    }

    public String getRewardpointsawardsandredemptionid() {
        return rewardpointsawardsandredemptionid;
    }

    public void setAwardid(String awardid) {
        this.awardid = awardid;
    }

    public String getAwardid() {
        return awardid;
    }

    public void setAward(org.museframework.bian.rewpoiawaandred.dto.bq.Award award) {
        this.award = award;
    }

    public org.museframework.bian.rewpoiawaandred.dto.bq.Award getAward() {
        return award;
    }
}