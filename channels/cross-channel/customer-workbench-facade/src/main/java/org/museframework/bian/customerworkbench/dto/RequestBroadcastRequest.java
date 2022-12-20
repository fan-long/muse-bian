package org.museframework.bian.customerworkbench.dto;

public class RequestBroadcastRequest {
    private String customerworkbenchid;

    private String broadcastid;

    private org.museframework.bian.customerworkbench.dto.bq.Broadcast broadcast;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setBroadcastid(String broadcastid) {
        this.broadcastid = broadcastid;
    }

    public String getBroadcastid() {
        return broadcastid;
    }

    public void setBroadcast(org.museframework.bian.customerworkbench.dto.bq.Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public org.museframework.bian.customerworkbench.dto.bq.Broadcast getBroadcast() {
        return broadcast;
    }
}