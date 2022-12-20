package org.museframework.bian.crerismod;

import org.museframework.bian.crerismod.dto.CaptureTestingRequest;
import org.museframework.bian.crerismod.dto.CaptureTestingResponse;
import org.museframework.bian.crerismod.dto.RequestTestingRequest;
import org.museframework.bian.crerismod.dto.RequestTestingResponse;
import org.museframework.bian.crerismod.dto.RetrieveTestingRequest;
import org.museframework.bian.crerismod.dto.RetrieveTestingResponse;
import org.museframework.bian.crerismod.dto.UpdateTestingRequest;
import org.museframework.bian.crerismod.dto.UpdateTestingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main design elements/views making up the overall specification  Examples: Business Requirements")
@GenericDomain(name="CreditRiskModels", group="Testing")
public interface BqTesting {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Testing activity or event related information")
    CaptureTestingResponse captureTesting(CaptureTestingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Testing")
    RetrieveTestingResponse retrieveTesting(RetrieveTestingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Testing")
    RequestTestingResponse requestTesting(RequestTestingRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Testing")
    UpdateTestingResponse updateTesting(UpdateTestingRequest req);
}