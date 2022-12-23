package org.museframework.bian.rewpoiacc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureRewardPointsLogRequest {
    @MetaField
    private String rewardpointsaccountid;

    @MetaField(ref=true)
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