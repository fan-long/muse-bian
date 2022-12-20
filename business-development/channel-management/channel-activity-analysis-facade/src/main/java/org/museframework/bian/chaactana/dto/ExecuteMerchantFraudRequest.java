package org.museframework.bian.chaactana.dto;

public class ExecuteMerchantFraudRequest {
    private String channelactivityanalysisid;

    private String merchantfraudid;

    private org.museframework.bian.chaactana.dto.bq.MerchantFraud merchantFraud;

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

    public void setMerchantFraud(org.museframework.bian.chaactana.dto.bq.MerchantFraud merchantFraud) {
        this.merchantFraud = merchantFraud;
    }

    public org.museframework.bian.chaactana.dto.bq.MerchantFraud getMerchantFraud() {
        return merchantFraud;
    }
}