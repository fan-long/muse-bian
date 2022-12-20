package org.museframework.bian.serevehis;

import org.museframework.bian.serevehis.dto.CaptureServicingFacilityRequest;
import org.museframework.bian.serevehis.dto.CaptureServicingFacilityResponse;
import org.museframework.bian.serevehis.dto.RetrieveServicingFacilityRequest;
import org.museframework.bian.serevehis.dto.RetrieveServicingFacilityResponse;
import org.museframework.bian.serevehis.dto.UpdateServicingFacilityRequest;
import org.museframework.bian.serevehis.dto.UpdateServicingFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="ServicingEventHistory", group="ServicingFacility")
public interface BqServicingFacility {
    @GenericDtxEndpoint
    @Description("UpBQ Update captured facility utilization event details")
    UpdateServicingFacilityResponse updateServicingFacility(UpdateServicingFacilityRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture  facility utilization event details")
    CaptureServicingFacilityResponse captureServicingFacility(CaptureServicingFacilityRequest req);

    @Description("ReBQ Retrieve  facility utilization event details")
    RetrieveServicingFacilityResponse retrieveServicingFacility(RetrieveServicingFacilityRequest req);
}