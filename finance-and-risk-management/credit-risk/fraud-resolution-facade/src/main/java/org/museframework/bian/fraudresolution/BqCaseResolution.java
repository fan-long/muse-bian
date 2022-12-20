package org.museframework.bian.fraudresolution;

import org.museframework.bian.fraudresolution.dto.RequestCaseResolutionRequest;
import org.museframework.bian.fraudresolution.dto.RequestCaseResolutionResponse;
import org.museframework.bian.fraudresolution.dto.RetrieveCaseResolutionRequest;
import org.museframework.bian.fraudresolution.dto.RetrieveCaseResolutionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="FraudResolution", group="CaseResolution")
public interface BqCaseResolution {
    @GenericDtxEndpoint
    @Description("RqBQ Request reworking of resolution to a case")
    RequestCaseResolutionResponse requestCaseResolution(RequestCaseResolutionRequest req);

    @Description("ReCR Retrieve information about an active fraud case resolution")
    RetrieveCaseResolutionResponse retrieveCaseResolution(RetrieveCaseResolutionRequest req);
}