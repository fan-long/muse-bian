package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateBroadcastRequest {
    @MetaField
    private String customerworkbenchid;

    @MetaField
    private String broadcastid;

    @MetaField(ref=true)
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