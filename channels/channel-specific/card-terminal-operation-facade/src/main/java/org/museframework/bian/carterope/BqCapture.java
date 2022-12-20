package org.museframework.bian.carterope;

import org.museframework.bian.carterope.dto.InitiateCaptureRequest;
import org.museframework.bian.carterope.dto.InitiateCaptureResponse;
import org.museframework.bian.carterope.dto.RequestCaptureRequest;
import org.museframework.bian.carterope.dto.RequestCaptureResponse;
import org.museframework.bian.carterope.dto.RetrieveCaptureRequest;
import org.museframework.bian.carterope.dto.RetrieveCaptureResponse;
import org.museframework.bian.carterope.dto.UpdateCaptureRequest;
import org.museframework.bian.carterope.dto.UpdateCaptureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CardTerminalOperation", group="Capture")
public interface BqCapture {
    @GenericDtxEndpoint
    @Description("InBQ Initiate transaction capture at the POS")
    InitiateCaptureResponse initiateCapture(InitiateCaptureRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of the card capture transaction")
    UpdateCaptureResponse updateCapture(UpdateCaptureRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention with a capture transaction")
    RequestCaptureResponse requestCapture(RequestCaptureRequest req);

    @Description("ReBQ Retrieve details about a card capture transaction")
    RetrieveCaptureResponse retrieveCapture(RetrieveCaptureRequest req);
}