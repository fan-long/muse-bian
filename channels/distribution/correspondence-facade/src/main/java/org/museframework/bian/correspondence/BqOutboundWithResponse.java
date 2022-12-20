package org.museframework.bian.correspondence;

import org.museframework.bian.correspondence.dto.InitiateOutboundWithResponseRequest;
import org.museframework.bian.correspondence.dto.InitiateOutboundWithResponseResponse;
import org.museframework.bian.correspondence.dto.RetrieveOutboundWithResponseRequest;
import org.museframework.bian.correspondence.dto.RetrieveOutboundWithResponseResponse;
import org.museframework.bian.correspondence.dto.UpdateOutboundWithResponseRequest;
import org.museframework.bian.correspondence.dto.UpdateOutboundWithResponseResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="Correspondence", group="OutboundWithResponse")
public interface BqOutboundWithResponse {
    @GenericDtxEndpoint
    @Description("InBQ Initiate processing outbound correspondence with tracked response")
    InitiateOutboundWithResponseResponse initiateOutboundWithResponse(InitiateOutboundWithResponseRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an outbound correspondence with tracked response")
    UpdateOutboundWithResponseResponse updateOutboundWithResponse(UpdateOutboundWithResponseRequest req);

    @Description("ReBQ Retrieve details about an outbound correspondence with tracked response")
    RetrieveOutboundWithResponseResponse retrieveOutboundWithResponse(RetrieveOutboundWithResponseRequest req);
}