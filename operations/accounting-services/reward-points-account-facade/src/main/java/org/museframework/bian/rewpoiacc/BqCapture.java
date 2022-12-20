package org.museframework.bian.rewpoiacc;

import org.museframework.bian.rewpoiacc.dto.CaptureCaptureRequest;
import org.museframework.bian.rewpoiacc.dto.CaptureCaptureResponse;
import org.museframework.bian.rewpoiacc.dto.InitiateCaptureRequest;
import org.museframework.bian.rewpoiacc.dto.InitiateCaptureResponse;
import org.museframework.bian.rewpoiacc.dto.RetrieveCaptureRequest;
import org.museframework.bian.rewpoiacc.dto.RetrieveCaptureResponse;
import org.museframework.bian.rewpoiacc.dto.UpdateCaptureRequest;
import org.museframework.bian.rewpoiacc.dto.UpdateCaptureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of the events/transactions recorded by the log  Examples: Customer life event, Servicing event")
@GenericDomain(name="RewardPointsAccount", group="Capture")
public interface BqCapture {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Capture activity or event related information")
    CaptureCaptureResponse captureCapture(CaptureCaptureRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Capture")
    InitiateCaptureResponse initiateCapture(InitiateCaptureRequest req);

    @Description("ReBQ Retrieve details about any aspect of Capture")
    RetrieveCaptureResponse retrieveCapture(RetrieveCaptureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Capture")
    UpdateCaptureResponse updateCapture(UpdateCaptureRequest req);
}