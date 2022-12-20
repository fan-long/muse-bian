package org.museframework.bian.factoring;

import org.museframework.bian.factoring.dto.ExchangeAccountReceivableProcessingFulfillmentRequest;
import org.museframework.bian.factoring.dto.ExchangeAccountReceivableProcessingFulfillmentResponse;
import org.museframework.bian.factoring.dto.ExecuteAccountReceivableProcessingFulfillmentRequest;
import org.museframework.bian.factoring.dto.ExecuteAccountReceivableProcessingFulfillmentResponse;
import org.museframework.bian.factoring.dto.InitiateAccountReceivableProcessingFulfillmentRequest;
import org.museframework.bian.factoring.dto.InitiateAccountReceivableProcessingFulfillmentResponse;
import org.museframework.bian.factoring.dto.NotifyAccountReceivableProcessingFulfillmentRequest;
import org.museframework.bian.factoring.dto.NotifyAccountReceivableProcessingFulfillmentResponse;
import org.museframework.bian.factoring.dto.RequestAccountReceivableProcessingFulfillmentRequest;
import org.museframework.bian.factoring.dto.RequestAccountReceivableProcessingFulfillmentResponse;
import org.museframework.bian.factoring.dto.RetrieveAccountReceivableProcessingFulfillmentRequest;
import org.museframework.bian.factoring.dto.RetrieveAccountReceivableProcessingFulfillmentResponse;
import org.museframework.bian.factoring.dto.UpdateAccountReceivableProcessingFulfillmentRequest;
import org.museframework.bian.factoring.dto.UpdateAccountReceivableProcessingFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment")
@GenericDomain(name="Factoring", group="AccountReceivableProcessingFulfillment")
public interface BqAccountReceivableProcessingFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Account Receivable Processing Fulfillment")
    ExchangeAccountReceivableProcessingFulfillmentResponse exchangeAccountReceivableProcessingFulfillment(ExchangeAccountReceivableProcessingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Account Receivable Processing Fulfillment")
    ExecuteAccountReceivableProcessingFulfillmentResponse executeAccountReceivableProcessingFulfillment(ExecuteAccountReceivableProcessingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Account Receivable Processing Fulfillment")
    InitiateAccountReceivableProcessingFulfillmentResponse initiateAccountReceivableProcessingFulfillment(InitiateAccountReceivableProcessingFulfillmentRequest req);

    @Description("Notify Account Receivable Processing Fulfillment")
    NotifyAccountReceivableProcessingFulfillmentResponse notifyAccountReceivableProcessingFulfillment(NotifyAccountReceivableProcessingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Account Receivable Processing Fulfillment")
    RequestAccountReceivableProcessingFulfillmentResponse requestAccountReceivableProcessingFulfillment(RequestAccountReceivableProcessingFulfillmentRequest req);

    @Description("Retrieve Account Receivable Processing Fulfillment")
    RetrieveAccountReceivableProcessingFulfillmentResponse retrieveAccountReceivableProcessingFulfillment(RetrieveAccountReceivableProcessingFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Account Receivable Processing Fulfillment")
    UpdateAccountReceivableProcessingFulfillmentResponse updateAccountReceivableProcessingFulfillment(UpdateAccountReceivableProcessingFulfillmentRequest req);
}