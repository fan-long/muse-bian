package org.museframework.bian.operationalgateway;

import org.museframework.bian.operationalgateway.dto.ExchangeOutboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.ExchangeOutboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.ExecuteOutboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.ExecuteOutboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.InitiateOutboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.InitiateOutboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.NotifyOutboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.NotifyOutboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.RequestOutboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.RequestOutboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.RetrieveOutboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.RetrieveOutboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.UpdateOutboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.UpdateOutboundMessageFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Inbound Message Function for doing Inbound Message Function")
@GenericDomain(name="OperationalGateway", group="OutboundMessageFunction")
public interface BqOutboundMessageFunction {
    @GenericDtxEndpoint
    @Description("Exchange Outbound Message Function")
    ExchangeOutboundMessageFunctionResponse exchangeOutboundMessageFunction(ExchangeOutboundMessageFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Outbound Message Function")
    ExecuteOutboundMessageFunctionResponse executeOutboundMessageFunction(ExecuteOutboundMessageFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Outbound Message Function")
    InitiateOutboundMessageFunctionResponse initiateOutboundMessageFunction(InitiateOutboundMessageFunctionRequest req);

    @Description("Notify Outbound Message Function")
    NotifyOutboundMessageFunctionResponse notifyOutboundMessageFunction(NotifyOutboundMessageFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Outbound Message Function")
    RequestOutboundMessageFunctionResponse requestOutboundMessageFunction(RequestOutboundMessageFunctionRequest req);

    @Description("Retrieve Outbound Message Function")
    RetrieveOutboundMessageFunctionResponse retrieveOutboundMessageFunction(RetrieveOutboundMessageFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Outbound Message Function")
    UpdateOutboundMessageFunctionResponse updateOutboundMessageFunction(UpdateOutboundMessageFunctionRequest req);
}