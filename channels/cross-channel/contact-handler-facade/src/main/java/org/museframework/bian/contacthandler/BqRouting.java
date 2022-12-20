package org.museframework.bian.contacthandler;

import org.museframework.bian.contacthandler.dto.RetrieveRoutingRequest;
import org.museframework.bian.contacthandler.dto.RetrieveRoutingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="ContactHandler", group="Routing")
public interface BqRouting {
    @Description("ReBQ Retrieve details about a routing task")
    RetrieveRoutingResponse retrieveRouting(RetrieveRoutingRequest req);
}