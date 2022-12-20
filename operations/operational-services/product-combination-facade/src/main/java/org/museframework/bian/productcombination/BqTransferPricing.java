package org.museframework.bian.productcombination;

import org.museframework.bian.productcombination.dto.ExchangeTransferPricingRequest;
import org.museframework.bian.productcombination.dto.ExchangeTransferPricingResponse;
import org.museframework.bian.productcombination.dto.RequestTransferPricingRequest;
import org.museframework.bian.productcombination.dto.RequestTransferPricingResponse;
import org.museframework.bian.productcombination.dto.RetrieveTransferPricingRequest;
import org.museframework.bian.productcombination.dto.RetrieveTransferPricingResponse;
import org.museframework.bian.productcombination.dto.UpdateTransferPricingRequest;
import org.museframework.bian.productcombination.dto.UpdateTransferPricingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Product Combination.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="ProductCombination", group="TransferPricing")
public interface BqTransferPricing {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Transfer Pricing processing")
    ExchangeTransferPricingResponse exchangeTransferPricing(ExchangeTransferPricingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Transfer Pricing")
    RetrieveTransferPricingResponse retrieveTransferPricing(RetrieveTransferPricingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Transfer Pricing")
    RequestTransferPricingResponse requestTransferPricing(RequestTransferPricingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Transfer Pricing")
    UpdateTransferPricingResponse updateTransferPricing(UpdateTransferPricingRequest req);
}