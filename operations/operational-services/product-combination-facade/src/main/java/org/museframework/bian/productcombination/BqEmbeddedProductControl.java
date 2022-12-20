package org.museframework.bian.productcombination;

import org.museframework.bian.productcombination.dto.InitiateEmbeddedProductControlRequest;
import org.museframework.bian.productcombination.dto.InitiateEmbeddedProductControlResponse;
import org.museframework.bian.productcombination.dto.RetrieveEmbeddedProductControlRequest;
import org.museframework.bian.productcombination.dto.RetrieveEmbeddedProductControlResponse;
import org.museframework.bian.productcombination.dto.UpdateEmbeddedProductControlRequest;
import org.museframework.bian.productcombination.dto.UpdateEmbeddedProductControlResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Product Combination.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="ProductCombination", group="EmbeddedProductControl")
public interface BqEmbeddedProductControl {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Embedded Product Control")
    InitiateEmbeddedProductControlResponse initiateEmbeddedProductControl(InitiateEmbeddedProductControlRequest req);

    @Description("ReBQ Retrieve details about any aspect of Embedded Product Control")
    RetrieveEmbeddedProductControlResponse retrieveEmbeddedProductControl(RetrieveEmbeddedProductControlRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Embedded Product Control")
    UpdateEmbeddedProductControlResponse updateEmbeddedProductControl(UpdateEmbeddedProductControlRequest req);
}