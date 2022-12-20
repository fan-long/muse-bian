package org.museframework.bian.cuscamexe;

import org.museframework.bian.cuscamexe.dto.RetrieveCandidateSelectionRequest;
import org.museframework.bian.cuscamexe.dto.RetrieveCandidateSelectionResponse;
import org.museframework.bian.cuscamexe.dto.UpdateCandidateSelectionRequest;
import org.museframework.bian.cuscamexe.dto.UpdateCandidateSelectionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerCampaignExecution", group="CandidateSelection")
public interface BqCandidateSelection {
    @GenericDtxEndpoint
    @Description("UpBQ Update a campaign candidate list")
    UpdateCandidateSelectionResponse updateCandidateSelection(UpdateCandidateSelectionRequest req);

    @Description("ReBQ Retrieve details about a campaign candidate list")
    RetrieveCandidateSelectionResponse retrieveCandidateSelection(RetrieveCandidateSelectionRequest req);
}