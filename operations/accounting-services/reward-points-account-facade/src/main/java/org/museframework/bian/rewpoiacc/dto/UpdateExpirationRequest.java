package org.museframework.bian.rewpoiacc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateExpirationRequest {
    @MetaField
    private String rewardpointsaccountid;

    @MetaField
    private String expirationid;

    @MetaField(ref=true)
    private org.museframework.bian.rewpoiacc.dto.bq.Expiration expiration;

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

    public void setExpiration(org.museframework.bian.rewpoiacc.dto.bq.Expiration expiration) {
        this.expiration = expiration;
    }

    public org.museframework.bian.rewpoiacc.dto.bq.Expiration getExpiration() {
        return expiration;
    }
}