package org.museframework.bian.spepricon;

import org.museframework.bian.spepricon.dto.InitiatePricingTermsRequest;
import org.museframework.bian.spepricon.dto.InitiatePricingTermsResponse;
import org.museframework.bian.spepricon.dto.RetrievePricingTermsRequest;
import org.museframework.bian.spepricon.dto.RetrievePricingTermsResponse;
import org.museframework.bian.spepricon.dto.UpdatePricingTermsRequest;
import org.museframework.bian.spepricon.dto.UpdatePricingTermsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity  within Special Pricing Conditions.")
@GenericDomain(name="SpecialPricingConditions", group="PricingTerms")
public interface BqPricingTerms {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Pricing Terms")
    InitiatePricingTermsResponse initiatePricingTerms(InitiatePricingTermsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Pricing Terms")
    RetrievePricingTermsResponse retrievePricingTerms(RetrievePricingTermsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Pricing Terms")
    UpdatePricingTermsResponse updatePricingTerms(UpdatePricingTermsRequest req);
}