package org.museframework.bian.advvoiserope;

import org.museframework.bian.advvoiserope.dto.InitiateInboundRequest;
import org.museframework.bian.advvoiserope.dto.InitiateInboundResponse;
import org.museframework.bian.advvoiserope.dto.RetrieveInboundRequest;
import org.museframework.bian.advvoiserope.dto.RetrieveInboundResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="AdvancedVoiceServicesOperations", group="Inbound")
public interface BqInbound {
    @GenericDtxEndpoint
    @Description("InBQ Execute an inbound voice connection")
    InitiateInboundResponse initiateInbound(InitiateInboundRequest req);

    @Description("ReBQ Retrieve details about an inbound voice connection")
    RetrieveInboundResponse retrieveInbound(RetrieveInboundRequest req);
}