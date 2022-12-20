package org.museframework.bian.promotionalevents;

import org.museframework.bian.promotionalevents.dto.ExecuteMarketTrackingRequest;
import org.museframework.bian.promotionalevents.dto.ExecuteMarketTrackingResponse;
import org.museframework.bian.promotionalevents.dto.RequestMarketTrackingRequest;
import org.museframework.bian.promotionalevents.dto.RequestMarketTrackingResponse;
import org.museframework.bian.promotionalevents.dto.RetrieveMarketTrackingRequest;
import org.museframework.bian.promotionalevents.dto.RetrieveMarketTrackingResponse;
import org.museframework.bian.promotionalevents.dto.UpdateMarketTrackingRequest;
import org.museframework.bian.promotionalevents.dto.UpdateMarketTrackingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="PromotionalEvents", group="MarketTracking")
public interface BqMarketTracking {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the market tracking activity")
    UpdateMarketTrackingResponse updateMarketTracking(UpdateMarketTrackingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated task for the tracking activity")
    ExecuteMarketTrackingResponse executeMarketTracking(ExecuteMarketTrackingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in the market tracking")
    RequestMarketTrackingResponse requestMarketTracking(RequestMarketTrackingRequest req);

    @Description("ReBQ Retrieve details about the market tracking activity")
    RetrieveMarketTrackingResponse retrieveMarketTracking(RetrieveMarketTrackingRequest req);
}