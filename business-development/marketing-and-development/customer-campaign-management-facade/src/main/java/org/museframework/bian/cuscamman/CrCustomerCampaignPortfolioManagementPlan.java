package org.museframework.bian.cuscamman;

import org.museframework.bian.cuscamman.dto.CreateCustomerCampaignPortfolioManagementPlanRequest;
import org.museframework.bian.cuscamman.dto.CreateCustomerCampaignPortfolioManagementPlanResponse;
import org.museframework.bian.cuscamman.dto.RequestCustomerCampaignPortfolioManagementPlanRequest;
import org.museframework.bian.cuscamman.dto.RequestCustomerCampaignPortfolioManagementPlanResponse;
import org.museframework.bian.cuscamman.dto.RetrieveCustomerCampaignPortfolioManagementPlanRequest;
import org.museframework.bian.cuscamman.dto.RetrieveCustomerCampaignPortfolioManagementPlanResponse;
import org.museframework.bian.cuscamman.dto.UpdateCustomerCampaignPortfolioManagementPlanRequest;
import org.museframework.bian.cuscamman.dto.UpdateCustomerCampaignPortfolioManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Customer Campaign Management.")
@GenericDomain(name="CustomerCampaignManagement", group="CustomerCampaignPortfolioManagementPlan")
public interface CrCustomerCampaignPortfolioManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create and invoke the customer campaign portfolio management plan")
    CreateCustomerCampaignPortfolioManagementPlanResponse createCustomerCampaignPortfolioManagementPlan(CreateCustomerCampaignPortfolioManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of the customer campaign portfolio management plan")
    UpdateCustomerCampaignPortfolioManagementPlanResponse updateCustomerCampaignPortfolioManagementPlan(UpdateCustomerCampaignPortfolioManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in the campaign plan")
    RequestCustomerCampaignPortfolioManagementPlanResponse requestCustomerCampaignPortfolioManagementPlan(RequestCustomerCampaignPortfolioManagementPlanRequest req);

    @Description("ReCR Retrieve details about the customer campaign portfolio management plan")
    RetrieveCustomerCampaignPortfolioManagementPlanResponse retrieveCustomerCampaignPortfolioManagementPlan(RetrieveCustomerCampaignPortfolioManagementPlanRequest req);
}