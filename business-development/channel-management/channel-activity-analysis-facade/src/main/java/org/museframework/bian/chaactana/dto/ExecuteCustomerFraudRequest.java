package org.museframework.bian.chaactana.dto;

public class ExecuteCustomerFraudRequest {
    private String channelactivityanalysisid;

    private String customerfraudid;

    private org.museframework.bian.chaactana.dto.bq.CustomerFraud customerFraud;

    public void setChannelactivityanalysisid(String channelactivityanalysisid) {
        this.channelactivityanalysisid = channelactivityanalysisid;
    }

    public String getChannelactivityanalysisid() {
        return channelactivityanalysisid;
    }

    public void setCustomerfraudid(String customerfraudid) {
        this.customerfraudid = customerfraudid;
    }

    public String getCustomerfraudid() {
        return customerfraudid;
    }

    public void setCustomerFraud(org.museframework.bian.chaactana.dto.bq.CustomerFraud customerFraud) {
        this.customerFraud = customerFraud;
    }

    public org.museframework.bian.chaactana.dto.bq.CustomerFraud getCustomerFraud() {
        return customerFraud;
    }
}