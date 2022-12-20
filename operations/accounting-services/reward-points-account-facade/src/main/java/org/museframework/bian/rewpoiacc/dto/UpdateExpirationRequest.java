package org.museframework.bian.rewpoiacc.dto;

public class UpdateExpirationRequest {
    private String rewardpointsaccountid;

    private String expirationid;

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