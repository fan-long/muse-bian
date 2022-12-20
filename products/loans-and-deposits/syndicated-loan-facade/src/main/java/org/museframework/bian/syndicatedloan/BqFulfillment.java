package org.museframework.bian.syndicatedloan;

import org.museframework.bian.syndicatedloan.dto.ExchangeFulfillmentRequest;
import org.museframework.bian.syndicatedloan.dto.ExchangeFulfillmentResponse;
import org.museframework.bian.syndicatedloan.dto.RequestFulfillmentRequest;
import org.museframework.bian.syndicatedloan.dto.RequestFulfillmentResponse;
import org.museframework.bian.syndicatedloan.dto.RetrieveFulfillmentRequest;
import org.museframework.bian.syndicatedloan.dto.RetrieveFulfillmentResponse;
import org.museframework.bian.syndicatedloan.dto.UpdateFulfillmentRequest;
import org.museframework.bian.syndicatedloan.dto.UpdateFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="SyndicatedLoan", group="Fulfillment")
public interface BqFulfillment {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Fulfillment processing")
    ExchangeFulfillmentResponse exchangeFulfillment(ExchangeFulfillmentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Fulfillment")
    RetrieveFulfillmentResponse retrieveFulfillment(RetrieveFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Fulfillment")
    RequestFulfillmentResponse requestFulfillment(RequestFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Fulfillment")
    UpdateFulfillmentResponse updateFulfillment(UpdateFulfillmentRequest req);
}