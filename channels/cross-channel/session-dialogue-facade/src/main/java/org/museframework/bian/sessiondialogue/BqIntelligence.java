package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.InitiateIntelligenceRequest;
import org.museframework.bian.sessiondialogue.dto.InitiateIntelligenceResponse;
import org.museframework.bian.sessiondialogue.dto.RetrieveIntelligenceRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveIntelligenceResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateIntelligenceRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateIntelligenceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="SessionDialogue", group="Intelligence")
public interface BqIntelligence {
    @GenericDtxEndpoint
    @Description("InBQ Initiate customer insight capture")
    InitiateIntelligenceResponse initiateIntelligence(InitiateIntelligenceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for customer insight capture")
    UpdateIntelligenceResponse updateIntelligence(UpdateIntelligenceRequest req);

    @Description("ReBQ Retrieve details about customer insight capture")
    RetrieveIntelligenceResponse retrieveIntelligence(RetrieveIntelligenceRequest req);
}