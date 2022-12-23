package org.museframework.bian.rewpoiawaandred.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeRedemptionRequest {
    @MetaField
    private String rewardpointsawardsandredemptionid;

    @MetaField
    private String redemptionid;

    @MetaField(ref=true)
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