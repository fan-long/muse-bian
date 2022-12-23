package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestChannelActivityAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis channelActivityAnalysis;

    public void setChannelActivityAnalysis(org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis channelActivityAnalysis) {
        this.channelActivityAnalysis = channelActivityAnalysis;
    }

    public org.museframework.bian.chaactana.dto.cr.ChannelActivityAnalysis getChannelActivityAnalysis() {
        return channelActivityAnalysis;
    }
}