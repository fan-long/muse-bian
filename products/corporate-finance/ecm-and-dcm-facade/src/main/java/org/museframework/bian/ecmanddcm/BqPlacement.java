package org.museframework.bian.ecmanddcm;

import org.museframework.bian.ecmanddcm.dto.RequestPlacementRequest;
import org.museframework.bian.ecmanddcm.dto.RequestPlacementResponse;
import org.museframework.bian.ecmanddcm.dto.RetrievePlacementRequest;
import org.museframework.bian.ecmanddcm.dto.RetrievePlacementResponse;
import org.museframework.bian.ecmanddcm.dto.UpdatePlacementRequest;
import org.museframework.bian.ecmanddcm.dto.UpdatePlacementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="ECMAndDCM", group="Placement")
public interface BqPlacement {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of ECM And DCM placement activity")
    UpdatePlacementResponse updatePlacement(UpdatePlacementRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in the placement activity")
    RequestPlacementResponse requestPlacement(RequestPlacementRequest req);

    @Description("ReBQ Retrieve details about the ECM And DCM placement actions")
    RetrievePlacementResponse retrievePlacement(RetrievePlacementRequest req);
}