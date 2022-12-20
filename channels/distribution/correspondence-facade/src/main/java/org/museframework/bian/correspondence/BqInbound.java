package org.museframework.bian.correspondence;

import org.museframework.bian.correspondence.dto.InitiateInboundRequest;
import org.museframework.bian.correspondence.dto.InitiateInboundResponse;
import org.museframework.bian.correspondence.dto.RetrieveInboundRequest;
import org.museframework.bian.correspondence.dto.RetrieveInboundResponse;
import org.museframework.bian.correspondence.dto.UpdateInboundRequest;
import org.museframework.bian.correspondence.dto.UpdateInboundResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="Correspondence", group="Inbound")
public interface BqInbound {
    @GenericDtxEndpoint
    @Description("InBQ Initiate processing of an inbound correspondence item")
    InitiateInboundResponse initiateInbound(InitiateInboundRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an inbound correspondence item")
    UpdateInboundResponse updateInbound(UpdateInboundRequest req);

    @Description("ReBQ Retrieve details about an inbound correspondence item")
    RetrieveInboundResponse retrieveInbound(RetrieveInboundRequest req);
}