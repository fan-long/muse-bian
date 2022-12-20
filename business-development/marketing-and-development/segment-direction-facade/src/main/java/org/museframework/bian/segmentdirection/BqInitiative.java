package org.museframework.bian.segmentdirection;

import org.museframework.bian.segmentdirection.dto.CaptureInitiativeRequest;
import org.museframework.bian.segmentdirection.dto.CaptureInitiativeResponse;
import org.museframework.bian.segmentdirection.dto.CreateInitiativeRequest;
import org.museframework.bian.segmentdirection.dto.CreateInitiativeResponse;
import org.museframework.bian.segmentdirection.dto.RequestInitiativeRequest;
import org.museframework.bian.segmentdirection.dto.RequestInitiativeResponse;
import org.museframework.bian.segmentdirection.dto.RetrieveInitiativeRequest;
import org.museframework.bian.segmentdirection.dto.RetrieveInitiativeResponse;
import org.museframework.bian.segmentdirection.dto.UpdateInitiativeRequest;
import org.museframework.bian.segmentdirection.dto.UpdateInitiativeResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of goals and objectives for the enterprise and its main divisions  Example: Increase marketshare")
@GenericDomain(name="SegmentDirection", group="Initiative")
public interface BqInitiative {
    @GenericDtxEndpoint
    @Description("CrBQ Create/instigate a supporting segment initiative")
    CreateInitiativeResponse createInitiative(CreateInitiativeRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for a segment initiative")
    UpdateInitiativeResponse updateInitiative(UpdateInitiativeRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture activity details for a segment initiative")
    CaptureInitiativeResponse captureInitiative(CaptureInitiativeRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention into a segment initiative")
    RequestInitiativeResponse requestInitiative(RequestInitiativeRequest req);

    @Description("ReBQ Retrieve details about a segment initiative")
    RetrieveInitiativeResponse retrieveInitiative(RetrieveInitiativeRequest req);
}