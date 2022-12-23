package org.museframework.bian.chaacthis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateChannelActivityLogRequest {
    @MetaField(ref=true)
    private org.museframework.bian.chaacthis.dto.cr.ChannelActivityLog channelActivityLog;

    public void setChannelActivityLog(org.museframework.bian.chaacthis.dto.cr.ChannelActivityLog channelActivityLog) {
        this.channelActivityLog = channelActivityLog;
    }

    public org.museframework.bian.chaacthis.dto.cr.ChannelActivityLog getChannelActivityLog() {
        return channelActivityLog;
    }
}