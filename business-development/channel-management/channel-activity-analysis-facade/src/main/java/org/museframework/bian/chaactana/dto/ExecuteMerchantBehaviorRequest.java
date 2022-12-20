package org.museframework.bian.chaactana.dto;

public class ExecuteMerchantBehaviorRequest {
    private String channelactivityanalysisid;

    private String merchantbehaviorid;

    private org.museframework.bian.chaactana.dto.bq.MerchantBehavior merchantBehavior;

    public void setChannelactivityanalysisid(String channelactivityanalysisid) {
        this.channelactivityanalysisid = channelactivityanalysisid;
    }

    public String getChannelactivityanalysisid() {
        return channelactivityanalysisid;
    }

    public void setMerchantbehaviorid(String merchantbehaviorid) {
        this.merchantbehaviorid = merchantbehaviorid;
    }

    public String getMerchantbehaviorid() {
        return merchantbehaviorid;
    }

    public void setMerchantBehavior(org.museframework.bian.chaactana.dto.bq.MerchantBehavior merchantBehavior) {
        this.merchantBehavior = merchantBehavior;
    }

    public org.museframework.bian.chaactana.dto.bq.MerchantBehavior getMerchantBehavior() {
        return merchantBehavior;
    }
}