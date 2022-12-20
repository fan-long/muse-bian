package org.museframework.bian.cortruser;

import org.museframework.bian.cortruser.dto.ExchangeTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExchangeTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.cortruser.dto.ExecuteTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.cortruser.dto.ExecuteTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.cortruser.dto.InitiateTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.cortruser.dto.InitiateTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.cortruser.dto.NotifyTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.cortruser.dto.NotifyTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RequestTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RequestTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.cortruser.dto.RetrieveTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.cortruser.dto.RetrieveTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.bian.cortruser.dto.UpdateTrustEstate_InheritanceandIncomeTaxFulfillmentRequest;
import org.museframework.bian.cortruser.dto.UpdateTrustEstate_InheritanceandIncomeTaxFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment")
@GenericDomain(name="CorporateTrustServices", group="TrustEstate_InheritanceandIncomeTaxFulfillment")
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