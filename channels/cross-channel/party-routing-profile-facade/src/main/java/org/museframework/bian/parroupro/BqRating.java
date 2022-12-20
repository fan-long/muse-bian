package org.museframework.bian.parroupro;

import org.museframework.bian.parroupro.dto.CaptureRatingRequest;
import org.museframework.bian.parroupro.dto.CaptureRatingResponse;
import org.museframework.bian.parroupro.dto.RetrieveRatingRequest;
import org.museframework.bian.parroupro.dto.RetrieveRatingResponse;
import org.museframework.bian.parroupro.dto.UpdateRatingRequest;
import org.museframework.bian.parroupro.dto.UpdateRatingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of information feeds/measures that can be used to track the status of one or more items/entitites  Examples: Composite position, Customer alert")
@GenericDomain(name="PartyRoutingProfile", group="Rating")
public interface BqRating {
    @GenericDtxEndpoint
    @Description("UpBQ Update rating measures for a monitored party")
    UpdateRatingResponse updateRating(UpdateRatingRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture rating measures for a monitored party")
    CaptureRatingResponse captureRating(CaptureRatingRequest req);

    @Description("ReBQ Retrieve details about rating measures for a party")
    RetrieveRatingResponse retrieveRating(RetrieveRatingRequest req);
}