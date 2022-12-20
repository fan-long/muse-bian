package org.museframework.bian.chaactana.dto;

public class RetrieveMerchantFraudRequest {
    private String channelactivityanalysisid;

    private String merchantfraudid;

    public void setChannelactivityanalysisid(String channelactivityanalysisid) {
        this.channelactivityanalysisid = channelactivityanalysisid;
    }

    public String getChannelactivityanalysisid() {
        return channelactivityanalysisid;
    }

    public void setMerchantfraudid(String merchantfraudid) {
        this.merchantfraudid = merchantfraudid;
    }

    public String getMerchantfraudid() {
        return merchantfraudid;
    }
}