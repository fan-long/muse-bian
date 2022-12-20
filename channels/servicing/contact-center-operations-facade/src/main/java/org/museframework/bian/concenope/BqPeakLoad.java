package org.museframework.bian.concenope;

import org.museframework.bian.concenope.dto.RequestPeakLoadRequest;
import org.museframework.bian.concenope.dto.RequestPeakLoadResponse;
import org.museframework.bian.concenope.dto.RetrievePeakLoadRequest;
import org.museframework.bian.concenope.dto.RetrievePeakLoadResponse;
import org.museframework.bian.concenope.dto.UpdatePeakLoadRequest;
import org.museframework.bian.concenope.dto.UpdatePeakLoadResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="ContactCenterOperations", group="PeakLoad")
public interface BqPeakLoad {
    @GenericDtxEndpoint
    @Description("UpBQ Update details or the response to a peak load situation")
    UpdatePeakLoadResponse updatePeakLoad(UpdatePeakLoadRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention due to peak loading")
    RequestPeakLoadResponse requestPeakLoad(RequestPeakLoadRequest req);

    @Description("ReBQ Retrieve details about peak load response activity")
    RetrievePeakLoadResponse retrievePeakLoad(RetrievePeakLoadRequest req);
}