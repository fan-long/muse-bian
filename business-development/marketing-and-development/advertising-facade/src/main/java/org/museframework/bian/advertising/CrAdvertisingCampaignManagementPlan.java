package org.museframework.bian.advertising;

import org.museframework.bian.advertising.dto.CreateAdvertisingCampaignManagementPlanRequest;
import org.museframework.bian.advertising.dto.CreateAdvertisingCampaignManagementPlanResponse;
import org.museframework.bian.advertising.dto.RequestAdvertisingCampaignManagementPlanRequest;
import org.museframework.bian.advertising.dto.RequestAdvertisingCampaignManagementPlanResponse;
import org.museframework.bian.advertising.dto.RetrieveAdvertisingCampaignManagementPlanRequest;
import org.museframework.bian.advertising.dto.RetrieveAdvertisingCampaignManagementPlanResponse;
import org.museframework.bian.advertising.dto.UpdateAdvertisingCampaignManagementPlanRequest;
import org.museframework.bian.advertising.dto.UpdateAdvertisingCampaignManagementPlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Advertising.")
@GenericDomain(name="Advertising", group="AdvertisingCampaignManagementPlan")
public interface CrAdvertisingCampaignManagementPlan {
    @GenericDtxEndpoint
    @Description("CrCR Create and invoke the advertising campaign management plan")
    CreateAdvertisingCampaignManagementPlanResponse createAdvertisingCampaignManagementPlan(CreateAdvertisingCampaignManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of the advertising campaign management plan")
    UpdateAdvertisingCampaignManagementPlanResponse updateAdvertisingCampaignManagementPlan(UpdateAdvertisingCampaignManagementPlanRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in the campaign plan (e.g. rework campaign priorities)")
    RequestAdvertisingCampaignManagementPlanResponse requestAdvertisingCampaignManagementPlan(RequestAdvertisingCampaignManagementPlanRequest req);

    @Description("ReCR Retrieve details about the advertising campaign management plan")
    RetrieveAdvertisingCampaignManagementPlanResponse retrieveAdvertisingCampaignManagementPlan(RetrieveAdvertisingCampaignManagementPlanRequest req);
}