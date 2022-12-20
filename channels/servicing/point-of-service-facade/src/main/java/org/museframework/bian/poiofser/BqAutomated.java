package org.museframework.bian.poiofser;

import org.museframework.bian.poiofser.dto.InitiateAutomatedRequest;
import org.museframework.bian.poiofser.dto.InitiateAutomatedResponse;
import org.museframework.bian.poiofser.dto.RetrieveAutomatedRequest;
import org.museframework.bian.poiofser.dto.RetrieveAutomatedResponse;
import org.museframework.bian.poiofser.dto.UpdateAutomatedRequest;
import org.museframework.bian.poiofser.dto.UpdateAutomatedResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="PointofService", group="Automated")
public interface BqAutomated {
    @GenericDtxEndpoint
    @Description("InBQ Initiate an automated contact")
    InitiateAutomatedResponse initiateAutomated(InitiateAutomatedRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details about an automated contact")
    UpdateAutomatedResponse updateAutomated(UpdateAutomatedRequest req);

    @Description("ReBQ Retrieve details about an automated contact")
    RetrieveAutomatedResponse retrieveAutomated(RetrieveAutomatedRequest req);
}