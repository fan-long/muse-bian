package org.museframework.bian.chaacthis.dto;

public class UpdateChannelActivityLogRequest {
    private String channelactivityhistoryid;

    private org.museframework.bian.chaacthis.dto.cr.ChannelActivityLog channelActivityLog;

    public void setChannelactivityhistoryid(String channelactivityhistoryid) {
        this.channelactivityhistoryid = channelactivityhistoryid;
    }

    public String getChannelactivityhistoryid() {
        return channelactivityhistoryid;
    }

    public void setChannelActivityLog(org.museframework.bian.chaacthis.dto.cr.ChannelActivityLog channelActivityLog) {
        this.channelActivityLog = channelActivityLog;
    }

    public org.museframework.bian.chaacthis.dto.cr.ChannelActivityLog getChannelActivityLog() {
        return channelActivityLog;
    }
}