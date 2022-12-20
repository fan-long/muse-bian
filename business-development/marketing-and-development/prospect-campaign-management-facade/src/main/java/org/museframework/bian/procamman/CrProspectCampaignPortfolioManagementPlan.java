package org.museframework.bian.procamman;

import org.museframework.bian.procamman.dto.CreateProspectCampaignPortfolioManagementPlanRequest;
import org.museframework.bian.procamman.dto.CreateProspectCampaignPortfolioManagementPlanResponse;
import org.museframework.bian.procamman.dto.RequestProspectCampaignPortfolioManagementPlanRequest;
import org.museframework.bian.procamman.dto.RequestProspectCampaignPortfolioManagementPlanResponse;
import org.museframework.bian.procamman.dto.RetrieveProspectCampaignPortfolioManagementPlanRequest;
import org.museframework.bian.procamman.dto.RetrieveProspectCampaignPortfolioManagementPlanResponse;
import org.museframework.bian.procamman.dto.UpdateProspectCampaignPortfolioManagementPlanRequest;
import org.museframework.bian.procamman.dto.UpdateProspectCampaignPortfolioManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Prospect Campaign Management.")
@GenericDomain(name="ProspectCampaignManagement", group="ProspectCampaignPortfolioManagementPlan")
public interface CrProspectCampaignPortfolioManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create and invoke the prospect campaign portfolio management plan")
    CreateProspectCampaignPortfolioManagementPlanResponse createProspectCampaignPortfolioManagementPlan(CreateProspectCampaignPortfolioManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of the customer campaign portfolio management plan")
    UpdateProspectCampaignPortfolioManagementPlanResponse updateProspectCampaignPortfolioManagementPlan(UpdateProspectCampaignPortfolioManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in the campaign plan")
    RequestProspectCampaignPortfolioManagementPlanResponse requestProspectCampaignPortfolioManagementPlan(RequestProspectCampaignPortfolioManagementPlanRequest req);

    @Description("ReCR Retrieve details about the prospect campaign portfolio management plan")
    RetrieveProspectCampaignPortfolioManagementPlanResponse retrieveProspectCampaignPortfolioManagementPlan(RetrieveProspectCampaignPortfolioManagementPlanRequest req);
}