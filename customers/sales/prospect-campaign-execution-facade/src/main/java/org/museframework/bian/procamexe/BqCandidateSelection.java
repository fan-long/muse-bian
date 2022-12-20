package org.museframework.bian.procamexe;

import org.museframework.bian.procamexe.dto.RetrieveCandidateSelectionRequest;
import org.museframework.bian.procamexe.dto.RetrieveCandidateSelectionResponse;
import org.museframework.bian.procamexe.dto.UpdateCandidateSelectionRequest;
import org.museframework.bian.procamexe.dto.UpdateCandidateSelectionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="ProspectCampaignExecution", group="CandidateSelection")
public interface BqCandidateSelection {
    @GenericDtxEndpoint
    @Description("UpBQ Update a campaign candidate list")
    UpdateCandidateSelectionResponse updateCandidateSelection(UpdateCandidateSelectionRequest req);

    @Description("ReBQ Retrieve details about a campaign candidate list")
    RetrieveCandidateSelectionResponse retrieveCandidateSelection(RetrieveCandidateSelectionRequest req);
}