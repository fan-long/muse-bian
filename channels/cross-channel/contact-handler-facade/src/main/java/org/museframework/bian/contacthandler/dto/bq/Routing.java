/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.contacthandler.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Routing {
    /*The task updates the contact record routing selection field and handles the interaction with the Contact Routing service domain to identify the servicing position/resource*/
    @MetaField(0)
    private String routingTaskRecord;

    public void setRoutingTaskRecord(String routingTaskRecord) {
        this.routingTaskRecord = routingTaskRecord;
    }

    public String getRoutingTaskRecord() {
        return routingTaskRecord;
    }
}