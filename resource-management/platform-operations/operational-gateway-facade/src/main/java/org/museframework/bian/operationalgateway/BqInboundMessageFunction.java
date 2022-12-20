package org.museframework.bian.operationalgateway;

import org.museframework.bian.operationalgateway.dto.ExchangeInboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.ExchangeInboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.ExecuteInboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.ExecuteInboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.InitiateInboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.InitiateInboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.NotifyInboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.NotifyInboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.RequestInboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.RequestInboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.RetrieveInboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.RetrieveInboundMessageFunctionResponse;
import org.museframework.bian.operationalgateway.dto.UpdateInboundMessageFunctionRequest;
import org.museframework.bian.operationalgateway.dto.UpdateInboundMessageFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Inbound Message Function for doing Inbound Message Function")
@GenericDomain(name="OperationalGateway", group="InboundMessageFunction")
public interface BqInboundMessageFunction {
    @GenericDtxEndpoint
    @Description("Exchange Inbound Message Function")
    ExchangeInboundMessageFunctionResponse exchangeInboundMessageFunction(ExchangeInboundMessageFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Inbound Message Function")
    ExecuteInboundMessageFunctionResponse executeInboundMessageFunction(ExecuteInboundMessageFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Inbound Message Function")
    InitiateInboundMessageFunctionResponse initiateInboundMessageFunction(InitiateInboundMessageFunctionRequest req);

    @Description("Notify Inbound Message Function")
    NotifyInboundMessageFunctionResponse notifyInboundMessageFunction(NotifyInboundMessageFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Inbound Message Function")
    RequestInboundMessageFunctionResponse requestInboundMessageFunction(RequestInboundMessageFunctionRequest req);

    @Description("Retrieve Inbound Message Function")
    RetrieveInboundMessageFunctionResponse retrieveInboundMessageFunction(RetrieveInboundMessageFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Inbound Message Function")
    UpdateInboundMessageFunctionResponse updateInboundMessageFunction(UpdateInboundMessageFunctionRequest req);
}