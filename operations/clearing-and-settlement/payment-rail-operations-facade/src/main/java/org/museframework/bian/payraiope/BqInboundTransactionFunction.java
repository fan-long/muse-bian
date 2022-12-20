package org.museframework.bian.payraiope;

import org.museframework.bian.payraiope.dto.ExchangeInboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.ExchangeInboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.ExecuteInboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.ExecuteInboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.InitiateInboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.InitiateInboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.NotifyInboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.NotifyInboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.RequestInboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.RequestInboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.RetrieveInboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.RetrieveInboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.UpdateInboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.UpdateInboundTransactionFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Outbound Transaction Function for doing Outbound Transaction Function")
@GenericDomain(name="PaymentRailOperations", group="InboundTransactionFunction")
public interface BqInboundTransactionFunction {
    @GenericDtxEndpoint
    @Description("Exchange Inbound Transaction Function")
    ExchangeInboundTransactionFunctionResponse exchangeInboundTransactionFunction(ExchangeInboundTransactionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Inbound Transaction Function")
    ExecuteInboundTransactionFunctionResponse executeInboundTransactionFunction(ExecuteInboundTransactionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Inbound Transaction Function")
    InitiateInboundTransactionFunctionResponse initiateInboundTransactionFunction(InitiateInboundTransactionFunctionRequest req);

    @Description("Notify Inbound Transaction Function")
    NotifyInboundTransactionFunctionResponse notifyInboundTransactionFunction(NotifyInboundTransactionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Inbound Transaction Function")
    RequestInboundTransactionFunctionResponse requestInboundTransactionFunction(RequestInboundTransactionFunctionRequest req);

    @Description("Retrieve Inbound Transaction Function")
    RetrieveInboundTransactionFunctionResponse retrieveInboundTransactionFunction(RetrieveInboundTransactionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Inbound Transaction Function")
    UpdateInboundTransactionFunctionResponse updateInboundTransactionFunction(UpdateInboundTransactionFunctionRequest req);
}