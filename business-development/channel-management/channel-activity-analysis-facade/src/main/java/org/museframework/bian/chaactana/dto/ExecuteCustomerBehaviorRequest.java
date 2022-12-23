package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCustomerBehaviorRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField
    private String customerbehaviorid;

    @MetaField(ref=true)
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