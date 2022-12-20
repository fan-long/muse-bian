package org.museframework.bian.parroupro;

import org.museframework.bian.parroupro.dto.CaptureAlertRequest;
import org.museframework.bian.parroupro.dto.CaptureAlertResponse;
import org.museframework.bian.parroupro.dto.RetrieveAlertRequest;
import org.museframework.bian.parroupro.dto.RetrieveAlertResponse;
import org.museframework.bian.parroupro.dto.UpdateAlertRequest;
import org.museframework.bian.parroupro.dto.UpdateAlertResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="PartyRoutingProfile", group="Alert")
public interface BqAlert {
    @GenericDtxEndpoint
    @Description("UpBQ Update alerts for a monitored party")
    UpdateAlertResponse updateAlert(UpdateAlertRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture alerts for a monitored party")
    CaptureAlertResponse captureAlert(CaptureAlertRequest req);

    @Description("ReBQ Retrieve details about alerts for a party")
    RetrieveAlertResponse retrieveAlert(RetrieveAlertRequest req);
}