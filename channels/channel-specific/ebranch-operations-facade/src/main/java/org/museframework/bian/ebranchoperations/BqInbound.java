package org.museframework.bian.ebranchoperations;

import org.museframework.bian.ebranchoperations.dto.InitiateInboundRequest;
import org.museframework.bian.ebranchoperations.dto.InitiateInboundResponse;
import org.museframework.bian.ebranchoperations.dto.RetrieveInboundRequest;
import org.museframework.bian.ebranchoperations.dto.RetrieveInboundResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="eBranchOperations", group="Inbound")
public interface BqInbound {
    @GenericDtxEndpoint
    @Description("InBQ Initiate an inbound eBranch connection")
    InitiateInboundResponse initiateInbound(InitiateInboundRequest req);

    @Description("ReBQ Retrieve details about an inbound eBranch connection")
    RetrieveInboundResponse retrieveInbound(RetrieveInboundRequest req);
}