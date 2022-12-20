package org.museframework.bian.cortruser;

import org.museframework.bian.cortruser.dto.ExchangeDebtTrusteeFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExchangeDebtTrusteeFulfillmentResponse;
import org.museframework.bian.cortruser.dto.ExecuteDebtTrusteeFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExecuteDebtTrusteeFulfillmentResponse;
import org.museframework.bian.cortruser.dto.InitiateDebtTrusteeFulfillmentRequest;
import org.museframework.bian.cortruser.dto.InitiateDebtTrusteeFulfillmentResponse;
import org.museframework.bian.cortruser.dto.NotifyDebtTrusteeFulfillmentRequest;
import org.museframework.bian.cortruser.dto.NotifyDebtTrusteeFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RequestDebtTrusteeFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RequestDebtTrusteeFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RetrieveDebtTrusteeFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RetrieveDebtTrusteeFulfillmentResponse;
import org.museframework.bian.cortruser.dto.UpdateDebtTrusteeFulfillmentRequest;
import org.museframework.bian.cortruser.dto.UpdateDebtTrusteeFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment")
@GenericDomain(name="CorporateTrustServices", group="DebtTrusteeFulfillment")
public interface BqDebtTrusteeFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Debt Trustee Fulfillment")
    ExchangeDebtTrusteeFulfillmentResponse exchangeDebtTrusteeFulfillment(ExchangeDebtTrusteeFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Debt Trustee Fulfillment")
    ExecuteDebtTrusteeFulfillmentResponse executeDebtTrusteeFulfillment(ExecuteDebtTrusteeFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Debt Trustee Fulfillment")
    InitiateDebtTrusteeFulfillmentResponse initiateDebtTrusteeFulfillment(InitiateDebtTrusteeFulfillmentRequest req);

    @Description("Notify Debt Trustee Fulfillment")
    NotifyDebtTrusteeFulfillmentResponse notifyDebtTrusteeFulfillment(NotifyDebtTrusteeFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Debt Trustee Fulfillment")
    RequestDebtTrusteeFulfillmentResponse requestDebtTrusteeFulfillment(RequestDebtTrusteeFulfillmentRequest req);

    @Description("Retrieve Debt Trustee Fulfillment")
    RetrieveDebtTrusteeFulfillmentResponse retrieveDebtTrusteeFulfillment(RetrieveDebtTrusteeFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Debt Trustee Fulfillment")
    UpdateDebtTrusteeFulfillmentResponse updateDebtTrusteeFulfillment(UpdateDebtTrusteeFulfillmentRequest req);
}