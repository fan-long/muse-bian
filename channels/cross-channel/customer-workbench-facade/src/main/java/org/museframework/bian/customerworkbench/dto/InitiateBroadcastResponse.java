package org.museframework.bian.customerworkbench.dto;

public class InitiateBroadcastResponse {
    private org.museframework.bian.customerworkbench.dto.bq.Broadcast broadcast;

    public void setBroadcast(org.museframework.bian.customerworkbench.dto.bq.Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public org.museframework.bian.customerworkbench.dto.bq.Broadcast getBroadcast() {
        return broadcast;
    }
}