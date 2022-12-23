package org.museframework.bian.rewpoiawaandred.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateAwardRequest {
    @MetaField
    private String rewardpointsawardsandredemptionid;

    @MetaField
    private String awardid;

    @MetaField(ref=true)
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