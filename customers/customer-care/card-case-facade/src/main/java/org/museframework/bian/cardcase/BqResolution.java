package org.museframework.bian.cardcase;

import org.museframework.bian.cardcase.dto.RetrieveResolutionRequest;
import org.museframework.bian.cardcase.dto.RetrieveResolutionResponse;
import org.museframework.bian.cardcase.dto.UpdateResolutionRequest;
import org.museframework.bian.cardcase.dto.UpdateResolutionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardCase", group="Resolution")
public interface BqResolution {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the resolution of a card case")
    UpdateResolutionResponse updateResolution(UpdateResolutionRequest req);

    @Description("ReBQ Retrieve details about the resolution actions for a card case")
    RetrieveResolutionResponse retrieveResolution(RetrieveResolutionRequest req);
}