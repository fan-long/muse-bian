package org.museframework.bian.productmatching;

import org.museframework.bian.productmatching.dto.InitiateProductTypeSelectionRequest;
import org.museframework.bian.productmatching.dto.InitiateProductTypeSelectionResponse;
import org.museframework.bian.productmatching.dto.RetrieveProductTypeSelectionRequest;
import org.museframework.bian.productmatching.dto.RetrieveProductTypeSelectionResponse;
import org.museframework.bian.productmatching.dto.UpdateProductTypeSelectionRequest;
import org.museframework.bian.productmatching.dto.UpdateProductTypeSelectionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductMatching", group="ProductTypeSelection")
public interface BqProductTypeSelection {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Product Type Selection")
    InitiateProductTypeSelectionResponse initiateProductTypeSelection(InitiateProductTypeSelectionRequest req);

    @Description("ReBQ Retrieve details about any aspect of Product Type Selection")
    RetrieveProductTypeSelectionResponse retrieveProductTypeSelection(RetrieveProductTypeSelectionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Product Type Selection")
    UpdateProductTypeSelectionResponse updateProductTypeSelection(UpdateProductTypeSelectionRequest req);
}