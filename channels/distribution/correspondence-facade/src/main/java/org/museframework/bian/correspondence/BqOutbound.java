package org.museframework.bian.correspondence;

import org.museframework.bian.correspondence.dto.InitiateOutboundRequest;
import org.museframework.bian.correspondence.dto.InitiateOutboundResponse;
import org.museframework.bian.correspondence.dto.RetrieveOutboundRequest;
import org.museframework.bian.correspondence.dto.RetrieveOutboundResponse;
import org.museframework.bian.correspondence.dto.UpdateOutboundRequest;
import org.museframework.bian.correspondence.dto.UpdateOutboundResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="Correspondence", group="Outbound")
public interface BqOutbound {
    @GenericDtxEndpoint
    @Description("InBQ Initiate processing an outbound correspondence item")
    InitiateOutboundResponse initiateOutbound(InitiateOutboundRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an outbound correspondence item")
    UpdateOutboundResponse updateOutbound(UpdateOutboundRequest req);

    @Description("ReBQ Retrieve details about an outbound correspondence item")
    RetrieveOutboundResponse retrieveOutbound(RetrieveOutboundRequest req);
}