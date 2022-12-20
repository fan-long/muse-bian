package org.museframework.bian.cusevehis;

import org.museframework.bian.cusevehis.dto.CaptureServicingRequest;
import org.museframework.bian.cusevehis.dto.CaptureServicingResponse;
import org.museframework.bian.cusevehis.dto.RetrieveServicingRequest;
import org.museframework.bian.cusevehis.dto.RetrieveServicingResponse;
import org.museframework.bian.cusevehis.dto.UpdateServicingRequest;
import org.museframework.bian.cusevehis.dto.UpdateServicingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="CustomerEventHistory", group="Servicing")
public interface BqServicing {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured servicing event details")
    UpdateServicingResponse updateServicing(UpdateServicingRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture servicing event details")
    CaptureServicingResponse captureServicing(CaptureServicingRequest req);

    @Description("ReBQ Retrieve servicing event details")
    RetrieveServicingResponse retrieveServicing(RetrieveServicingRequest req);
}