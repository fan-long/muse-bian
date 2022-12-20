package org.museframework.bian.cardcollections;

import org.museframework.bian.cardcollections.dto.RetrieveResolutionRequest;
import org.museframework.bian.cardcollections.dto.RetrieveResolutionResponse;
import org.museframework.bian.cardcollections.dto.UpdateResolutionRequest;
import org.museframework.bian.cardcollections.dto.UpdateResolutionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardCollections", group="Resolution")
public interface BqResolution {
    @GenericDtxEndpoint
    @Description("UpBQ Update a resolution plan")
    UpdateResolutionResponse updateResolution(UpdateResolutionRequest req);

    @Description("ReBQ Retrieve details about a card collections resolution plan")
    RetrieveResolutionResponse retrieveResolution(RetrieveResolutionRequest req);
}