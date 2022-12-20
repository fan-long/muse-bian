package org.museframework.bian.delacchan;

import org.museframework.bian.delacchan.dto.RetrieveResolutionRequest;
import org.museframework.bian.delacchan.dto.RetrieveResolutionResponse;
import org.museframework.bian.delacchan.dto.UpdateResolutionRequest;
import org.museframework.bian.delacchan.dto.UpdateResolutionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="DelinquentAccountHandling", group="Resolution")
public interface BqResolution {
    @GenericDtxEndpoint
    @Description("UpBQ Update a resolution plan")
    UpdateResolutionResponse updateResolution(UpdateResolutionRequest req);

    @Description("ReBQ Retrieve details about a delinquent account recovery plan")
    RetrieveResolutionResponse retrieveResolution(RetrieveResolutionRequest req);
}