package org.museframework.bian.customercase;

import org.museframework.bian.customercase.dto.RetrieveResolutionRequest;
import org.museframework.bian.customercase.dto.RetrieveResolutionResponse;
import org.museframework.bian.customercase.dto.UpdateResolutionRequest;
import org.museframework.bian.customercase.dto.UpdateResolutionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerCase", group="Resolution")
public interface BqResolution {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the resolution tasks of a customer case")
    UpdateResolutionResponse updateResolution(UpdateResolutionRequest req);

    @Description("ReBQ Retrieve details about the resolution actions for a customer case")
    RetrieveResolutionResponse retrieveResolution(RetrieveResolutionRequest req);
}