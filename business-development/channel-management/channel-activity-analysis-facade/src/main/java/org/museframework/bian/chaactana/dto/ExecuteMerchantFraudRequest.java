package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteMerchantFraudRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField
    private String merchantfraudid;

    @MetaField(ref=true)
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