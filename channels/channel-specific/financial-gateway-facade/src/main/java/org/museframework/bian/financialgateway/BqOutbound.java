package org.museframework.bian.financialgateway;

import org.museframework.bian.financialgateway.dto.InitiateOutboundRequest;
import org.museframework.bian.financialgateway.dto.InitiateOutboundResponse;
import org.museframework.bian.financialgateway.dto.RetrieveOutboundRequest;
import org.museframework.bian.financialgateway.dto.RetrieveOutboundResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="FinancialGateway", group="Outbound")
public interface BqOutbound {
    @GenericDtxEndpoint
    @Description("InBQ Initiate outbound financial message handling")
    InitiateOutboundResponse initiateOutbound(InitiateOutboundRequest req);

    @Description("ReBQ Retrieve details about an outbound financial message")
    RetrieveOutboundResponse retrieveOutbound(RetrieveOutboundRequest req);
}