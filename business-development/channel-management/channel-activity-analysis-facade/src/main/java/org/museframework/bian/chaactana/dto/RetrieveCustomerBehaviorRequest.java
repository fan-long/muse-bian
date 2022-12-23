package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCustomerBehaviorRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField
    private String customerbehaviorid;

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
}