package org.museframework.bian.advvoiserope;

import org.museframework.bian.advvoiserope.dto.InitiateOutboundRequest;
import org.museframework.bian.advvoiserope.dto.InitiateOutboundResponse;
import org.museframework.bian.advvoiserope.dto.RetrieveOutboundRequest;
import org.museframework.bian.advvoiserope.dto.RetrieveOutboundResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="AdvancedVoiceServicesOperations", group="Outbound")
public interface BqOutbound {
    @GenericDtxEndpoint
    @Description("InBQ Execute an outbound voice connection")
    InitiateOutboundResponse initiateOutbound(InitiateOutboundRequest req);

    @Description("ReBQ Retrieve details about an outbound voice connection")
    RetrieveOutboundResponse retrieveOutbound(RetrieveOutboundRequest req);
}