package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCustomerFraudRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField
    private String customerfraudid;

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
}