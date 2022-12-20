package org.museframework.bian.cardclearing.dto;

public class RetrieveRoutingResponse {
    private org.museframework.bian.cardclearing.dto.bq.Routing routing;

    public void setRouting(org.museframework.bian.cardclearing.dto.bq.Routing routing) {
        this.routing = routing;
    }

    public org.museframework.bian.cardclearing.dto.bq.Routing getRouting() {
        return routing;
    }
}