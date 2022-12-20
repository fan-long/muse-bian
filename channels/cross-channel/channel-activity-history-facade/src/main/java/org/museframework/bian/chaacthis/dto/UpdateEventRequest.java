package org.museframework.bian.chaacthis.dto;

public class UpdateEventRequest {
    private String channelactivityhistoryid;

    private String eventid;

    private org.museframework.bian.chaacthis.dto.bq.Event event;

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

    public void setEvent(org.museframework.bian.chaacthis.dto.bq.Event event) {
        this.event = event;
    }

    public org.museframework.bian.chaacthis.dto.bq.Event getEvent() {
        return event;
    }
}