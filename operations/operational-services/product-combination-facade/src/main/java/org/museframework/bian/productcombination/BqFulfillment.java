package org.museframework.bian.productcombination;

import org.museframework.bian.productcombination.dto.ControlFulfillmentRequest;
import org.museframework.bian.productcombination.dto.ControlFulfillmentResponse;
import org.museframework.bian.productcombination.dto.ExchangeFulfillmentRequest;
import org.museframework.bian.productcombination.dto.ExchangeFulfillmentResponse;
import org.museframework.bian.productcombination.dto.ExecuteFulfillmentRequest;
import org.museframework.bian.productcombination.dto.ExecuteFulfillmentResponse;
import org.museframework.bian.productcombination.dto.InitiateFulfillmentRequest;
import org.museframework.bian.productcombination.dto.InitiateFulfillmentResponse;
import org.museframework.bian.productcombination.dto.RequestFulfillmentRequest;
import org.museframework.bian.productcombination.dto.RequestFulfillmentResponse;
import org.museframework.bian.productcombination.dto.RetrieveFulfillmentRequest;
import org.museframework.bian.productcombination.dto.RetrieveFulfillmentResponse;
import org.museframework.bian.productcombination.dto.UpdateFulfillmentRequest;
import org.museframework.bian.productcombination.dto.UpdateFulfillmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Product Combination.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="ProductCombination", group="Fulfillment")
public interface BqFulfillment {
    @GenericDtxEndpoint
    @Description("CoBQ Control the processing of Fulfillment")
    ControlFulfillmentResponse controlFulfillment(ControlFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Fulfillment processing")
    ExchangeFulfillmentResponse exchangeFulfillment(ExchangeFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Fulfillment")
    ExecuteFulfillmentResponse executeFulfillment(ExecuteFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Fulfillment")
    InitiateFulfillmentResponse initiateFulfillment(InitiateFulfillmentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Fulfillment")
    RetrieveFulfillmentResponse retrieveFulfillment(RetrieveFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Fulfillment")
    RequestFulfillmentResponse requestFulfillment(RequestFulfillmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Fulfillment")
    UpdateFulfillmentResponse updateFulfillment(UpdateFulfillmentRequest req);
}