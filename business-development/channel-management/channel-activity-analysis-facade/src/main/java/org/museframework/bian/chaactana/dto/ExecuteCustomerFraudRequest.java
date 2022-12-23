package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCustomerFraudRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField
    private String customerfraudid;

    @MetaField(ref=true)
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