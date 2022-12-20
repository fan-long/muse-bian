package org.museframework.bian.chaactana.dto;

public class ExecuteCustomerBehaviorRequest {
    private String channelactivityanalysisid;

    private String customerbehaviorid;

    private org.museframework.bian.chaactana.dto.bq.CustomerBehavior customerBehavior;

    public void setChannelactivityanalysisid(String channelactivityanalysisid) {
        this.channelactivityanalysisid = channelactivityanalysisid;
    }

    public String getChannelactivityanalysisid() {
        return channelactivityanalysisid;
    }

    public void setCustomerbehaviorid(String customerbehaviorid) {
        this.customerbehaviorid = customerbehaviorid;
    }

    public String getCustomerbehaviorid() {
        return customerbehaviorid;
    }

    public void setCustomerBehavior(org.museframework.bian.chaactana.dto.bq.CustomerBehavior customerBehavior) {
        this.customerBehavior = customerBehavior;
    }

    public org.museframework.bian.chaactana.dto.bq.CustomerBehavior getCustomerBehavior() {
        return customerBehavior;
    }
}