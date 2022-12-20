package org.museframework.bian.financialgateway;

import org.museframework.bian.financialgateway.dto.InitiateInboundRequest;
import org.museframework.bian.financialgateway.dto.InitiateInboundResponse;
import org.museframework.bian.financialgateway.dto.RetrieveInboundRequest;
import org.museframework.bian.financialgateway.dto.RetrieveInboundResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="FinancialGateway", group="Inbound")
public interface BqInbound {
    @GenericDtxEndpoint
    @Description("InBQ Initiate inbound financial message handling")
    InitiateInboundResponse initiateInbound(InitiateInboundRequest req);

    @Description("ReBQ Retrieve details about an inbound financial message")
    RetrieveInboundResponse retrieveInbound(RetrieveInboundRequest req);
}