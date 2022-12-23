package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteMerchantBehaviorRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField
    private String merchantbehaviorid;

    @MetaField(ref=true)
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