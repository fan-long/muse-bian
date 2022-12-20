package org.museframework.bian.conadvser;

import org.museframework.bian.conadvser.dto.InitiateProductGuidanceRequest;
import org.museframework.bian.conadvser.dto.InitiateProductGuidanceResponse;
import org.museframework.bian.conadvser.dto.RetrieveProductGuidanceRequest;
import org.museframework.bian.conadvser.dto.RetrieveProductGuidanceResponse;
import org.museframework.bian.conadvser.dto.UpdateProductGuidanceRequest;
import org.museframework.bian.conadvser.dto.UpdateProductGuidanceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="ConsumerAdvisoryServices", group="ProductGuidance")
public interface BqProductGuidance {
    @GenericDtxEndpoint
    @Description("InBQ Initiate product guidance advisory session")
    InitiateProductGuidanceResponse initiateProductGuidance(InitiateProductGuidanceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about a product guidance advisory session")
    UpdateProductGuidanceResponse updateProductGuidance(UpdateProductGuidanceRequest req);

    @Description("ReBQ Retrieve details about a product guidance advisory session")
    RetrieveProductGuidanceResponse retrieveProductGuidance(RetrieveProductGuidanceRequest req);
}