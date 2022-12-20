package org.museframework.bian.payraiope;

import org.museframework.bian.payraiope.dto.ExchangeOutboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.ExchangeOutboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.ExecuteOutboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.ExecuteOutboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.InitiateOutboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.InitiateOutboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.NotifyOutboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.NotifyOutboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.RequestOutboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.RequestOutboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.RetrieveOutboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.RetrieveOutboundTransactionFunctionResponse;
import org.museframework.bian.payraiope.dto.UpdateOutboundTransactionFunctionRequest;
import org.museframework.bian.payraiope.dto.UpdateOutboundTransactionFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Outbound Transaction Function for doing Outbound Transaction Function")
@GenericDomain(name="PaymentRailOperations", group="OutboundTransactionFunction")
public interface BqOutboundTransactionFunction {
    @GenericDtxEndpoint
    @Description("Exchange Outbound Transaction Function")
    ExchangeOutboundTransactionFunctionResponse exchangeOutboundTransactionFunction(ExchangeOutboundTransactionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Outbound Transaction Function")
    ExecuteOutboundTransactionFunctionResponse executeOutboundTransactionFunction(ExecuteOutboundTransactionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Outbound Transaction Function")
    InitiateOutboundTransactionFunctionResponse initiateOutboundTransactionFunction(InitiateOutboundTransactionFunctionRequest req);

    @Description("Notify Outbound Transaction Function")
    NotifyOutboundTransactionFunctionResponse notifyOutboundTransactionFunction(NotifyOutboundTransactionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Outbound Transaction Function")
    RequestOutboundTransactionFunctionResponse requestOutboundTransactionFunction(RequestOutboundTransactionFunctionRequest req);

    @Description("Retrieve Outbound Transaction Function")
    RetrieveOutboundTransactionFunctionResponse retrieveOutboundTransactionFunction(RetrieveOutboundTransactionFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Outbound Transaction Function")
    UpdateOutboundTransactionFunctionResponse updateOutboundTransactionFunction(UpdateOutboundTransactionFunctionRequest req);
}