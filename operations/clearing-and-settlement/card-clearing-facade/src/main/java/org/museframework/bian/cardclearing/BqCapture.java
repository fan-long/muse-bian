package org.museframework.bian.cardclearing;

import org.museframework.bian.cardclearing.dto.RetrieveCaptureRequest;
import org.museframework.bian.cardclearing.dto.RetrieveCaptureResponse;
import org.museframework.bian.cardclearing.dto.UpdateCaptureRequest;
import org.museframework.bian.cardclearing.dto.UpdateCaptureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardClearing", group="Capture")
public interface BqCapture {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of a captured card transaction (for repair)")
    UpdateCaptureResponse updateCapture(UpdateCaptureRequest req);

    @Description("ReBQ Retrieve details about a captured card transaction")
    RetrieveCaptureResponse retrieveCapture(RetrieveCaptureRequest req);
}