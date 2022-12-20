package org.museframework.bian.payraiope;

import org.museframework.bian.payraiope.dto.ExchangePaymentAccountReconciliationFunctionRequest;
import org.museframework.bian.payraiope.dto.ExchangePaymentAccountReconciliationFunctionResponse;
import org.museframework.bian.payraiope.dto.ExecutePaymentAccountReconciliationFunctionRequest;
import org.museframework.bian.payraiope.dto.ExecutePaymentAccountReconciliationFunctionResponse;
import org.museframework.bian.payraiope.dto.InitiatePaymentAccountReconciliationFunctionRequest;
import org.museframework.bian.payraiope.dto.InitiatePaymentAccountReconciliationFunctionResponse;
import org.museframework.bian.payraiope.dto.NotifyPaymentAccountReconciliationFunctionRequest;
import org.museframework.bian.payraiope.dto.NotifyPaymentAccountReconciliationFunctionResponse;
import org.museframework.bian.payraiope.dto.RequestPaymentAccountReconciliationFunctionRequest;
import org.museframework.bian.payraiope.dto.RequestPaymentAccountReconciliationFunctionResponse;
import org.museframework.bian.payraiope.dto.RetrievePaymentAccountReconciliationFunctionRequest;
import org.museframework.bian.payraiope.dto.RetrievePaymentAccountReconciliationFunctionResponse;
import org.museframework.bian.payraiope.dto.UpdatePaymentAccountReconciliationFunctionRequest;
import org.museframework.bian.payraiope.dto.UpdatePaymentAccountReconciliationFunctionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An operational service or function supported within the Outbound Transaction Function for doing Outbound Transaction Function")
@GenericDomain(name="PaymentRailOperations", group="PaymentAccountReconciliationFunction")
public interface BqPaymentAccountReconciliationFunction {
    @GenericDtxEndpoint
    @Description("Exchange Payment Account Reconciliation Function")
    ExchangePaymentAccountReconciliationFunctionResponse exchangePaymentAccountReconciliationFunction(ExchangePaymentAccountReconciliationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Payment Account Reconciliation Function")
    ExecutePaymentAccountReconciliationFunctionResponse executePaymentAccountReconciliationFunction(ExecutePaymentAccountReconciliationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Payment Account Reconciliation Function")
    InitiatePaymentAccountReconciliationFunctionResponse initiatePaymentAccountReconciliationFunction(InitiatePaymentAccountReconciliationFunctionRequest req);

    @Description("Notify Payment Account Reconciliation Function")
    NotifyPaymentAccountReconciliationFunctionResponse notifyPaymentAccountReconciliationFunction(NotifyPaymentAccountReconciliationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Request Payment Account Reconciliation Function")
    RequestPaymentAccountReconciliationFunctionResponse requestPaymentAccountReconciliationFunction(RequestPaymentAccountReconciliationFunctionRequest req);

    @Description("Retrieve Payment Account Reconciliation Function")
    RetrievePaymentAccountReconciliationFunctionResponse retrievePaymentAccountReconciliationFunction(RetrievePaymentAccountReconciliationFunctionRequest req);

    @GenericDtxEndpoint
    @Description("Update Payment Account Reconciliation Function")
    UpdatePaymentAccountReconciliationFunctionResponse updatePaymentAccountReconciliationFunction(UpdatePaymentAccountReconciliationFunctionRequest req);
}