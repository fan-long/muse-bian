package org.museframework.bian.segmentdirection;

import org.museframework.bian.segmentdirection.dto.CaptureSegmentStrategyRequest;
import org.museframework.bian.segmentdirection.dto.CaptureSegmentStrategyResponse;
import org.museframework.bian.segmentdirection.dto.CreateSegmentStrategyRequest;
import org.museframework.bian.segmentdirection.dto.CreateSegmentStrategyResponse;
import org.museframework.bian.segmentdirection.dto.RequestSegmentStrategyRequest;
import org.museframework.bian.segmentdirection.dto.RequestSegmentStrategyResponse;
import org.museframework.bian.segmentdirection.dto.RetrieveSegmentStrategyRequest;
import org.museframework.bian.segmentdirection.dto.RetrieveSegmentStrategyResponse;
import org.museframework.bian.segmentdirection.dto.UpdateSegmentStrategyRequest;
import org.museframework.bian.segmentdirection.dto.UpdateSegmentStrategyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Define the policies, goals & objectives and strategies for an organizational entity or unit  within Segment Direction.  Example: Direct a division of the enterprise.")
@GenericDomain(name="SegmentDirection", group="SegmentStrategy")
public interface CrSegmentStrategy {
    @GenericDtxEndpoint
    @Description("CrCR Create a segment strategy for the associated division")
    CreateSegmentStrategyResponse createSegmentStrategy(CreateSegmentStrategyRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of the segment strategy")
    UpdateSegmentStrategyResponse updateSegmentStrategy(UpdateSegmentStrategyRequest req);

    @GenericDtxEndpoint
    @Description("CaCR Capture activity details related to implementation of the strategy")
    CaptureSegmentStrategyResponse captureSegmentStrategy(CaptureSegmentStrategyRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention")
    RequestSegmentStrategyResponse requestSegmentStrategy(RequestSegmentStrategyRequest req);

    @Description("ReCR Retrieve details relating to the strategy and any supporting activities")
    RetrieveSegmentStrategyResponse retrieveSegmentStrategy(RetrieveSegmentStrategyRequest req);
}