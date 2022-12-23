package org.museframework.bian.rewpoiacc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveExpirationRequest {
    @MetaField
    private String rewardpointsaccountid;

    @MetaField
    private String expirationid;

    public void setRewardpointsaccountid(String rewardpointsaccountid) {
        this.rewardpointsaccountid = rewardpointsaccountid;
    }

    public String getRewardpointsaccountid() {
        return rewardpointsaccountid;
    }

    public void setExpirationid(String expirationid) {
        this.expirationid = expirationid;
    }

    public String getExpirationid() {
        return expirationid;
    }
}