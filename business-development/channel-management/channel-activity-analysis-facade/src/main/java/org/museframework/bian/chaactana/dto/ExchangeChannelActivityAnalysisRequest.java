package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeChannelActivityAnalysisRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis channelActivityAnalysis;

    public void setChannelactivityanalysisid(String channelactivityanalysisid) {
        this.channelactivityanalysisid = channelactivityanalysisid;
    }

    public String getChannelactivityanalysisid() {
        return channelactivityanalysisid;
    }

    public void setChannelActivityAnalysis(org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis channelActivityAnalysis) {
        this.channelActivityAnalysis = channelActivityAnalysis;
    }

    public org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis getChannelActivityAnalysis() {
        return channelActivityAnalysis;
    }
}