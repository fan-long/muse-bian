package org.museframework.bian.rewpoiawaandred.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRedemptionRequest {
    @MetaField
    private String rewardpointsawardsandredemptionid;

    @MetaField
    private String redemptionid;

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
}