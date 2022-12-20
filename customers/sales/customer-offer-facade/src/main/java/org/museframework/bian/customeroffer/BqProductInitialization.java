package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveProductInitializationRequest;
import org.museframework.bian.customeroffer.dto.RetrieveProductInitializationResponse;
import org.museframework.bian.customeroffer.dto.UpdateProductInitializationRequest;
import org.museframework.bian.customeroffer.dto.UpdateProductInitializationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="ProductInitialization")
public interface BqProductInitialization {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the product initiation request")
    UpdateProductInitializationResponse updateProductInitialization(UpdateProductInitializationRequest req);

    @Description("ReBQ Retrieve details about the product initiation request")
    RetrieveProductInitializationResponse retrieveProductInitialization(RetrieveProductInitializationRequest req);
}