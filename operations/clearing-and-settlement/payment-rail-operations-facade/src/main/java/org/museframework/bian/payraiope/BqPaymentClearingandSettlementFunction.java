package org.museframework.bian.payraiope;

import org.museframework.bian.payraiope.dto.ExchangePaymentClearingandSettlementFunctionRequest;
import org.museframework.bian.payraiope.dto.ExchangePaymentClearingandSettlementFunctionResponse;
import org.museframework.bian.payraiope.dto.ExecutePaymentClearingandSettlementFunctionRequest;
import org.museframework.bian.payraiope.dto.ExecutePaymentClearingandSettlementFunctionResponse;
import org.museframework.bian.payraiope.dto.InitiatePaymentClearingandSettlementFunctionRequest;
import org.museframework.bian.payraiope.dto.InitiatePaymentClearingandSettlementFunctionResponse;
import org.museframework.bian.payraiope.dto.NotifyPaymentClearingandSettlementFunctionRequest;
import org.museframework.bian.payraiope.dto.NotifyPaymentClearingandSettlementFunctionResponse;
import org.museframework.bian.payraiope.dto.RequestPaymentClearingandSettlementFunctionRequest;
import org.museframework.bian.payraiope.dto.RequestPaymentClearingandSettlementFunctionResponse;
import org.museframework.bian.payraiope.dto.RetrievePaymentClearingandSettlementFunctionRequest;
import org.museframework.bian.payraiope.dto.RetrievePaymentClearingandSettlementFunctionResponse;
import org.museframework.bian.payraiope.dto.UpdatePaymentClearingandSettlementFunctionRequest;
import org.museframework.bian.payraiope.dto.UpdatePaymentClearingandSettlementFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Outbound Transaction Function for doing Outbound Transaction Function")
@GenericDomain(name="PaymentRailOperations", group="PaymentClearingandSettlementFunction")
public interface BqPaymentClearingandSettlementFunction {
    @GenericDtxEndpoint
    @Description("Exchange Payment Clearing and Settlement Function")
    ExchangePaymentClearingandSettlementFunctionResponse exchangePaymentClearingandSettlementFunction(ExchangePaymentClearingandSettlementFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Payment Clearing and Settlement Function")
    ExecutePaymentClearingandSettlementFunctionResponse executePaymentClearingandSettlementFunction(ExecutePaymentClearingandSettlementFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Payment Clearing and Settlement Function")
    InitiatePaymentClearingandSettlementFunctionResponse initiatePaymentClearingandSettlementFunction(InitiatePaymentClearingandSettlementFunctionRequest req);

    @Description("Notify Payment Clearing and Settlement Function")
    NotifyPaymentClearingandSettlementFunctionResponse notifyPaymentClearingandSettlementFunction(NotifyPaymentClearingandSettlementFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Payment Clearing and Settlement Function")
    RequestPaymentClearingandSettlementFunctionResponse requestPaymentClearingandSettlementFunction(RequestPaymentClearingandSettlementFunctionRequest req);

    @Description("Retrieve Payment Clearing and Settlement Function")
    RetrievePaymentClearingandSettlementFunctionResponse retrievePaymentClearingandSettlementFunction(RetrievePaymentClearingandSettlementFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Payment Clearing and Settlement Function")
    UpdatePaymentClearingandSettlementFunctionResponse updatePaymentClearingandSettlementFunction(UpdatePaymentClearingandSettlementFunctionRequest req);
}