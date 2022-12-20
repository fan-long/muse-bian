package org.museframework.bian.cusevehis;

import org.museframework.bian.cusevehis.dto.CaptureProductProcessingRequest;
import org.museframework.bian.cusevehis.dto.CaptureProductProcessingResponse;
import org.museframework.bian.cusevehis.dto.RetrieveProductProcessingRequest;
import org.museframework.bian.cusevehis.dto.RetrieveProductProcessingResponse;
import org.museframework.bian.cusevehis.dto.UpdateProductProcessingRequest;
import org.museframework.bian.cusevehis.dto.UpdateProductProcessingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="CustomerEventHistory", group="ProductProcessing")
public interface BqProductProcessing {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured product processing event details")
    UpdateProductProcessingResponse updateProductProcessing(UpdateProductProcessingRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture product processing event details")
    CaptureProductProcessingResponse captureProductProcessing(CaptureProductProcessingRequest req);

    @Description("ReBQ Retrieve product processing event details")
    RetrieveProductProcessingResponse retrieveProductProcessing(RetrieveProductProcessingRequest req);
}