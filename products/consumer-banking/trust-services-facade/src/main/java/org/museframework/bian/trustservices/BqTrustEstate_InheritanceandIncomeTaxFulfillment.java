package org.museframework.bian.trustservices;

import org.museframework.bian.trustservices.dto.ExchangeTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.trustservices.dto.ExchangeTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.trustservices.dto.ExecuteTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.trustservices.dto.ExecuteTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.trustservices.dto.InitiateTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.trustservices.dto.InitiateTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.trustservices.dto.NotifyTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.trustservices.dto.NotifyTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.trustservices.dto.RequestTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.trustservices.dto.RequestTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.trustservices.dto.RetrieveTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.trustservices.dto.RetrieveTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.trustservices.dto.UpdateTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.trustservices.dto.UpdateTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Estate, Inheritance and Income Tax Fulfillment arrangement within the Trust Estate, Inheritance and Income Tax Fulfillment")
@GenericDomain(name="TrustServices", group="TrustEstate_InheritanceandIncomeTaxFulfillment")
public interface BqTrustEstate_InheritanceandIncomeTaxFulfillment {
    @GenericDtxEndpoint
    @Description("Exchange Trust Estate, Inheritance and Income Tax Fulfillment")
    ExchangeTrustEstate_InheritanceandIncomeTaxFulfillmentResponse exchangeTrustEstate_InheritanceandIncomeTaxFulfillment(ExchangeTrustEstate_InheritanceandIncomeTaxFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trust Estate, Inheritance and Income Tax Fulfillment")
    ExecuteTrustEstate_InheritanceandIncomeTaxFulfillmentResponse executeTrustEstate_InheritanceandIncomeTaxFulfillment(ExecuteTrustEstate_InheritanceandIncomeTaxFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Trust Estate, Inheritance and Income Tax Fulfillment")
    InitiateTrustEstate_InheritanceandIncomeTaxFulfillmentResponse initiateTrustEstate_InheritanceandIncomeTaxFulfillment(InitiateTrustEstate_InheritanceandIncomeTaxFulfillmentRequest req);

    @Description("Notify Trust Estate, Inheritance and Income Tax Fulfillment")
    NotifyTrustEstate_InheritanceandIncomeTaxFulfillmentResponse notifyTrustEstate_InheritanceandIncomeTaxFulfillment(NotifyTrustEstate_InheritanceandIncomeTaxFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Request Trust Estate, Inheritance and Income Tax Fulfillment")
    RequestTrustEstate_InheritanceandIncomeTaxFulfillmentResponse requestTrustEstate_InheritanceandIncomeTaxFulfillment(RequestTrustEstate_InheritanceandIncomeTaxFulfillmentRequest req);

    @Description("Retrieve Trust Estate, Inheritance and Income Tax Fulfillment")
    RetrieveTrustEstate_InheritanceandIncomeTaxFulfillmentResponse retrieveTrustEstate_InheritanceandIncomeTaxFulfillment(RetrieveTrustEstate_InheritanceandIncomeTaxFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("Update Trust Estate, Inheritance and Income Tax Fulfillment")
    UpdateTrustEstate_InheritanceandIncomeTaxFulfillmentResponse updateTrustEstate_InheritanceandIncomeTaxFulfillment(UpdateTrustEstate_InheritanceandIncomeTaxFulfillmentRequest req);
}