package org.museframework.bian.chaacthis.dto;

public class RetrieveEventResponse {
    private org.museframework.bian.chaacthis.dto.bq.Event event;

    public void setEvent(org.museframework.bian.chaacthis.dto.bq.Event event) {
        this.event = event;
    }

    public org.museframework.bian.chaacthis.dto.bq.Event getEvent() {
        return event;
    }
}