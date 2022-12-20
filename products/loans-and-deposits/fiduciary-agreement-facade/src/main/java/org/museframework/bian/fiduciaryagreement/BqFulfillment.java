package org.museframework.bian.fiduciaryagreement;

import org.museframework.bian.fiduciaryagreement.dto.ExchangeFulfillmentRequest;
import org.museframework.bian.fiduciaryagreement.dto.ExchangeFulfillmentResponse;
import org.museframework.bian.fiduciaryagreement.dto.RequestFulfillmentRequest;
import org.museframework.bian.fiduciaryagreement.dto.RequestFulfillmentResponse;
import org.museframework.bian.fiduciaryagreement.dto.RetrieveFulfillmentRequest;
import org.museframework.bian.fiduciaryagreement.dto.RetrieveFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Fiduciary Agreement.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="FiduciaryAgreement", group="Fulfillment")
public interface BqFulfillment {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Fulfillment processing")
    ExchangeFulfillmentResponse exchangeFulfillment(ExchangeFulfillmentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Fulfillment")
    RetrieveFulfillmentResponse retrieveFulfillment(RetrieveFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Fulfillment")
    RequestFulfillmentResponse requestFulfillment(RequestFulfillmentRequest req);
}