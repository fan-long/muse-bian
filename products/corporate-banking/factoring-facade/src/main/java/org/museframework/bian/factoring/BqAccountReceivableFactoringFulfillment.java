package org.museframework.bian.factoring;

import org.museframework.bian.factoring.dto.ExchangeAccountReceivableFactoringFulfillmentRequest;
import org.museframework.bian.factoring.dto.ExchangeAccountReceivableFactoringFulfillmentResponse;
import org.museframework.bian.factoring.dto.ExecuteAccountReceivableFactoringFulfillmentRequest;
import org.museframework.bian.factoring.dto.ExecuteAccountReceivableFactoringFulfillmentResponse;
import org.museframework.bian.factoring.dto.InitiateAccountReceivableFactoringFulfillmentRequest;
import org.museframework.bian.factoring.dto.InitiateAccountReceivableFactoringFulfillmentResponse;
import org.museframework.bian.factoring.dto.NotifyAccountReceivableFactoringFulfillmentRequest;
import org.museframework.bian.factoring.dto.NotifyAccountReceivableFactoringFulfillmentResponse;
import org.museframework.bian.factoring.dto.RequestAccountReceivableFactoringFulfillmentRequest;
import org.museframework.bian.factoring.dto.RequestAccountReceivableFactoringFulfillmentResponse;
import org.museframework.bian.factoring.dto.RetrieveAccountReceivableFactoringFulfillmentRequest;
import org.museframework.bian.factoring.dto.RetrieveAccountReceivableFactoringFulfillmentResponse;
import org.museframework.bian.factoring.dto.UpdateAccountReceivableFactoringFulfillmentRequest;
import org.museframework.bian.factoring.dto.UpdateAccountReceivableFactoringFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment")
@GenericDomain(name="Factoring", group="AccountReceivableFactoringFulfillment")
public interface BqAccountReceivableFactoringFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Account Receivable Factoring Fulfillment")
    ExchangeAccountReceivableFactoringFulfillmentResponse exchangeAccountReceivableFactoringFulfillment(ExchangeAccountReceivableFactoringFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Account Receivable Factoring Fulfillment")
    ExecuteAccountReceivableFactoringFulfillmentResponse executeAccountReceivableFactoringFulfillment(ExecuteAccountReceivableFactoringFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Account Receivable Factoring Fulfillment")
    InitiateAccountReceivableFactoringFulfillmentResponse initiateAccountReceivableFactoringFulfillment(InitiateAccountReceivableFactoringFulfillmentRequest req);

    @Description("Notify Account Receivable Factoring Fulfillment")
    NotifyAccountReceivableFactoringFulfillmentResponse notifyAccountReceivableFactoringFulfillment(NotifyAccountReceivableFactoringFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Account Receivable Factoring Fulfillment")
    RequestAccountReceivableFactoringFulfillmentResponse requestAccountReceivableFactoringFulfillment(RequestAccountReceivableFactoringFulfillmentRequest req);

    @Description("Retrieve Account Receivable Factoring Fulfillment")
    RetrieveAccountReceivableFactoringFulfillmentResponse retrieveAccountReceivableFactoringFulfillment(RetrieveAccountReceivableFactoringFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Account Receivable Factoring Fulfillment")
    UpdateAccountReceivableFactoringFulfillmentResponse updateAccountReceivableFactoringFulfillment(UpdateAccountReceivableFactoringFulfillmentRequest req);
}