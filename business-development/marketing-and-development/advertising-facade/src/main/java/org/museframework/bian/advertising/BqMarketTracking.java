package org.museframework.bian.advertising;

import org.museframework.bian.advertising.dto.ExecuteMarketTrackingRequest;
import org.museframework.bian.advertising.dto.ExecuteMarketTrackingResponse;
import org.museframework.bian.advertising.dto.RequestMarketTrackingRequest;
import org.museframework.bian.advertising.dto.RequestMarketTrackingResponse;
import org.museframework.bian.advertising.dto.RetrieveMarketTrackingRequest;
import org.museframework.bian.advertising.dto.RetrieveMarketTrackingResponse;
import org.museframework.bian.advertising.dto.UpdateMarketTrackingRequest;
import org.museframework.bian.advertising.dto.UpdateMarketTrackingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="Advertising", group="MarketTracking")
public interface BqMarketTracking {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the market tracking activity (e.g. change source)")
    UpdateMarketTrackingResponse updateMarketTracking(UpdateMarketTrackingRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated task for the tracking activity (e.g. upload new data)")
    ExecuteMarketTrackingResponse executeMarketTracking(ExecuteMarketTrackingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention in the market tracking (e.g. request reworking of the analysis)")
    RequestMarketTrackingResponse requestMarketTracking(RequestMarketTrackingRequest req);

    @Description("ReBQ Retrieve details about the market tracking activity")
    RetrieveMarketTrackingResponse retrieveMarketTracking(RetrieveMarketTrackingRequest req);
}