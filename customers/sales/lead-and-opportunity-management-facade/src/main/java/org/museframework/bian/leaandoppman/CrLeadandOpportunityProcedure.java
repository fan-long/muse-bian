package org.museframework.bian.leaandoppman;

import org.museframework.bian.leaandoppman.dto.InitiateLeadandOpportunityProcedureRequest;
import org.museframework.bian.leaandoppman.dto.InitiateLeadandOpportunityProcedureResponse;
import org.museframework.bian.leaandoppman.dto.RetrieveLeadandOpportunityProcedureRequest;
import org.museframework.bian.leaandoppman.dto.RetrieveLeadandOpportunityProcedureResponse;
import org.museframework.bian.leaandoppman.dto.UpdateLeadandOpportunityProcedureRequest;
import org.museframework.bian.leaandoppman.dto.UpdateLeadandOpportunityProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Lead and Opportunity Management. ")
@GenericDomain(name="LeadandOpportunityManagement", group="LeadandOpportunityProcedure")
public interface CrLeadandOpportunityProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate lead/opportunity procedure (capture the lead details)")
    InitiateLeadandOpportunityProcedureResponse initiateLeadandOpportunityProcedure(InitiateLeadandOpportunityProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about a lead/opportunity")
    UpdateLeadandOpportunityProcedureResponse updateLeadandOpportunityProcedure(UpdateLeadandOpportunityProcedureRequest req);

    @Description("ReCR Retrieve details about a lead/opportunity")
    RetrieveLeadandOpportunityProcedureResponse retrieveLeadandOpportunityProcedure(RetrieveLeadandOpportunityProcedureRequest req);
}