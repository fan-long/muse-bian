package org.museframework.bian.productmatching;

import org.museframework.bian.productmatching.dto.InitiateProductEligibilityRequest;
import org.museframework.bian.productmatching.dto.InitiateProductEligibilityResponse;
import org.museframework.bian.productmatching.dto.RetrieveProductEligibilityRequest;
import org.museframework.bian.productmatching.dto.RetrieveProductEligibilityResponse;
import org.museframework.bian.productmatching.dto.UpdateProductEligibilityRequest;
import org.museframework.bian.productmatching.dto.UpdateProductEligibilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductMatching", group="ProductEligibility")
public interface BqProductEligibility {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Product Eligibility")
    InitiateProductEligibilityResponse initiateProductEligibility(InitiateProductEligibilityRequest req);

    @Description("ReBQ Retrieve details about any aspect of Product Eligibility")
    RetrieveProductEligibilityResponse retrieveProductEligibility(RetrieveProductEligibilityRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Product Eligibility")
    UpdateProductEligibilityResponse updateProductEligibility(UpdateProductEligibilityRequest req);
}