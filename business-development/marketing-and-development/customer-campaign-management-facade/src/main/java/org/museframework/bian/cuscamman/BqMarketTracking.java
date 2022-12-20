package org.museframework.bian.cuscamman;

import org.museframework.bian.cuscamman.dto.ExecuteMarketTrackingRequest;
import org.museframework.bian.cuscamman.dto.ExecuteMarketTrackingResponse;
import org.museframework.bian.cuscamman.dto.RequestMarketTrackingRequest;
import org.museframework.bian.cuscamman.dto.RequestMarketTrackingResponse;
import org.museframework.bian.cuscamman.dto.RetrieveMarketTrackingRequest;
import org.museframework.bian.cuscamman.dto.RetrieveMarketTrackingResponse;
import org.museframework.bian.cuscamman.dto.UpdateMarketTrackingRequest;
import org.museframework.bian.cuscamman.dto.UpdateMarketTrackingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CustomerCampaignManagement", group="MarketTracking")
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