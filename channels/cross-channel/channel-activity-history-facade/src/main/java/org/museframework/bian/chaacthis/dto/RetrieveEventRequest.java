package org.museframework.bian.chaacthis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveEventRequest {
    @MetaField
    private String channelactivityhistoryid;

    @MetaField
    private String eventid;

    public void setChannelactivityhistoryid(String channelactivityhistoryid) {
        this.channelactivityhistoryid = channelactivityhistoryid;
    }

    public String getChannelactivityhistoryid() {
        return channelactivityhistoryid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public String getEventid() {
        return eventid;
    }
}