package org.museframework.bian.contacthandler.dto;

public class RetrieveRoutingResponse {
    private org.museframework.bian.contacthandler.dto.bq.Routing routing;

    public void setRouting(org.museframework.bian.contacthandler.dto.bq.Routing routing) {
        this.routing = routing;
    }

    public org.museframework.bian.contacthandler.dto.bq.Routing getRouting() {
        return routing;
    }
}