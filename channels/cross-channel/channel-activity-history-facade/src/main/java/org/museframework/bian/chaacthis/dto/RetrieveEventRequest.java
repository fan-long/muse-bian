package org.museframework.bian.chaacthis.dto;

public class RetrieveEventRequest {
    private String channelactivityhistoryid;

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