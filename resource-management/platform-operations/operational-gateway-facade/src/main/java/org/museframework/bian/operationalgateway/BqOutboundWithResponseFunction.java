package org.museframework.bian.operationalgateway;

import org.museframework.bian.operationalgateway.dto.ExchangeOutboundWithResponseFunctionRequest;
import org.museframework.bian.operationalgateway.dto.ExchangeOutboundWithResponseFunctionResponse;
import org.museframework.bian.operationalgateway.dto.ExecuteOutboundWithResponseFunctionRequest;
import org.museframework.bian.operationalgateway.dto.ExecuteOutboundWithResponseFunctionResponse;
import org.museframework.bian.operationalgateway.dto.InitiateOutboundWithResponseFunctionRequest;
import org.museframework.bian.operationalgateway.dto.InitiateOutboundWithResponseFunctionResponse;
import org.museframework.bian.operationalgateway.dto.NotifyOutboundWithResponseFunctionRequest;
import org.museframework.bian.operationalgateway.dto.NotifyOutboundWithResponseFunctionResponse;
import org.museframework.bian.operationalgateway.dto.RequestOutboundWithResponseFunctionRequest;
import org.museframework.bian.operationalgateway.dto.RequestOutboundWithResponseFunctionResponse;
import org.museframework.bian.operationalgateway.dto.RetrieveOutboundWithResponseFunctionRequest;
import org.museframework.bian.operationalgateway.dto.RetrieveOutboundWithResponseFunctionResponse;
import org.museframework.bian.operationalgateway.dto.UpdateOutboundWithResponseFunctionRequest;
import org.museframework.bian.operationalgateway.dto.UpdateOutboundWithResponseFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Inbound Message Function for doing Inbound Message Function")
@GenericDomain(name="OperationalGateway", group="OutboundWithResponseFunction")
public interface BqOutboundWithResponseFunction {
    @GenericDtxEndpoint
    @Description("Exchange Outbound With Response Function")
    ExchangeOutboundWithResponseFunctionResponse exchangeOutboundWithResponseFunction(ExchangeOutboundWithResponseFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Outbound With Response Function")
    ExecuteOutboundWithResponseFunctionResponse executeOutboundWithResponseFunction(ExecuteOutboundWithResponseFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Outbound With Response Function")
    InitiateOutboundWithResponseFunctionResponse initiateOutboundWithResponseFunction(InitiateOutboundWithResponseFunctionRequest req);

    @Description("Notify Outbound With Response Function")
    NotifyOutboundWithResponseFunctionResponse notifyOutboundWithResponseFunction(NotifyOutboundWithResponseFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Outbound With Response Function")
    RequestOutboundWithResponseFunctionResponse requestOutboundWithResponseFunction(RequestOutboundWithResponseFunctionRequest req);

    @Description("Retrieve Outbound With Response Function")
    RetrieveOutboundWithResponseFunctionResponse retrieveOutboundWithResponseFunction(RetrieveOutboundWithResponseFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Outbound With Response Function")
    UpdateOutboundWithResponseFunctionResponse updateOutboundWithResponseFunction(UpdateOutboundWithResponseFunctionRequest req);
}