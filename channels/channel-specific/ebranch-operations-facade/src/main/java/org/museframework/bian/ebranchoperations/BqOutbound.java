package org.museframework.bian.ebranchoperations;

import org.museframework.bian.ebranchoperations.dto.InitiateOutboundRequest;
import org.museframework.bian.ebranchoperations.dto.InitiateOutboundResponse;
import org.museframework.bian.ebranchoperations.dto.RetrieveOutboundRequest;
import org.museframework.bian.ebranchoperations.dto.RetrieveOutboundResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="eBranchOperations", group="Outbound")
public interface BqOutbound {
    @GenericDtxEndpoint
    @Description("InBQ Initiate an outbound eBranch connection")
    InitiateOutboundResponse initiateOutbound(InitiateOutboundRequest req);

    @Description("ReBQ Retrieve details about an outbound eBranch connection")
    RetrieveOutboundResponse retrieveOutbound(RetrieveOutboundRequest req);
}