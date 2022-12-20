package org.museframework.bian.poiofser;

import org.museframework.bian.poiofser.dto.RetrieveInteractionRequest;
import org.museframework.bian.poiofser.dto.RetrieveInteractionResponse;
import org.museframework.bian.poiofser.dto.UpdateInteractionRequest;
import org.museframework.bian.poiofser.dto.UpdateInteractionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="PointofService", group="Interaction")
public interface BqInteraction {
    @GenericDtxEndpoint
    @Description("UpBQ Update details for a customer interaction session")
    UpdateInteractionResponse updateInteraction(UpdateInteractionRequest req);

    @Description("ReBQ Retrieve details about a customer interaction session")
    RetrieveInteractionResponse retrieveInteraction(RetrieveInteractionRequest req);
}