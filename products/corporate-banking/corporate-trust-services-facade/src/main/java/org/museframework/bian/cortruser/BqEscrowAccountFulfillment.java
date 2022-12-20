package org.museframework.bian.cortruser;

import org.museframework.bian.cortruser.dto.ExchangeEscrowAccountFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExchangeEscrowAccountFulfillmentResponse;
import org.museframework.bian.cortruser.dto.ExecuteEscrowAccountFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExecuteEscrowAccountFulfillmentResponse;
import org.museframework.bian.cortruser.dto.InitiateEscrowAccountFulfillmentRequest;
import org.museframework.bian.cortruser.dto.InitiateEscrowAccountFulfillmentResponse;
import org.museframework.bian.cortruser.dto.NotifyEscrowAccountFulfillmentRequest;
import org.museframework.bian.cortruser.dto.NotifyEscrowAccountFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RequestEscrowAccountFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RequestEscrowAccountFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RetrieveEscrowAccountFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RetrieveEscrowAccountFulfillmentResponse;
import org.museframework.bian.cortruser.dto.UpdateEscrowAccountFulfillmentRequest;
import org.museframework.bian.cortruser.dto.UpdateEscrowAccountFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment")
@GenericDomain(name="CorporateTrustServices", group="EscrowAccountFulfillment")
public interface BqEscrowAccountFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Escrow Account Fulfillment")
    ExchangeEscrowAccountFulfillmentResponse exchangeEscrowAccountFulfillment(ExchangeEscrowAccountFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Escrow Account Fulfillment")
    ExecuteEscrowAccountFulfillmentResponse executeEscrowAccountFulfillment(ExecuteEscrowAccountFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Escrow Account Fulfillment")
    InitiateEscrowAccountFulfillmentResponse initiateEscrowAccountFulfillment(InitiateEscrowAccountFulfillmentRequest req);

    @Description("Notify Escrow Account Fulfillment")
    NotifyEscrowAccountFulfillmentResponse notifyEscrowAccountFulfillment(NotifyEscrowAccountFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Escrow Account Fulfillment")
    RequestEscrowAccountFulfillmentResponse requestEscrowAccountFulfillment(RequestEscrowAccountFulfillmentRequest req);

    @Description("Retrieve Escrow Account Fulfillment")
    RetrieveEscrowAccountFulfillmentResponse retrieveEscrowAccountFulfillment(RetrieveEscrowAccountFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Escrow Account Fulfillment")
    UpdateEscrowAccountFulfillmentResponse updateEscrowAccountFulfillment(UpdateEscrowAccountFulfillmentRequest req);
}