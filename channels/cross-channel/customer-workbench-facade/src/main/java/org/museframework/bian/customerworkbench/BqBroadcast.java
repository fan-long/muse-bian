package org.museframework.bian.customerworkbench;

import org.museframework.bian.customerworkbench.dto.InitiateBroadcastRequest;
import org.museframework.bian.customerworkbench.dto.InitiateBroadcastResponse;
import org.museframework.bian.customerworkbench.dto.RequestBroadcastRequest;
import org.museframework.bian.customerworkbench.dto.RequestBroadcastResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CustomerWorkbench", group="Broadcast")
public interface BqBroadcast {
    @GenericDtxEndpoint
    @Description("InBQ Initiate a workstation broadcast")
    InitiateBroadcastResponse initiateBroadcast(InitiateBroadcastRequest req);

    @GenericDtxEndpoint
    @Description("ReBQ Retrieve details about a workstation broadcast")
    RequestBroadcastResponse requestBroadcast(RequestBroadcastRequest req);
}