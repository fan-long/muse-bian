package org.museframework.bian.cuscamman;

import org.museframework.bian.cuscamman.dto.CreateCampaignDirectionRequest;
import org.museframework.bian.cuscamman.dto.CreateCampaignDirectionResponse;
import org.museframework.bian.cuscamman.dto.RequestCampaignDirectionRequest;
import org.museframework.bian.cuscamman.dto.RequestCampaignDirectionResponse;
import org.museframework.bian.cuscamman.dto.RetrieveCampaignDirectionRequest;
import org.museframework.bian.cuscamman.dto.RetrieveCampaignDirectionResponse;
import org.museframework.bian.cuscamman.dto.UpdateCampaignDirectionRequest;
import org.museframework.bian.cuscamman.dto.UpdateCampaignDirectionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CustomerCampaignManagement", group="CampaignDirection")
public interface BqCampaignDirection {
    @GenericDtxEndpoint
    @Description("CrBQ Create customer campaign direction schedules")
    CreateCampaignDirectionResponse createCampaignDirection(CreateCampaignDirectionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the customer campaign design and execution schedules")
    UpdateCampaignDirectionResponse updateCampaignDirection(UpdateCampaignDirectionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the schedules")
    RequestCampaignDirectionResponse requestCampaignDirection(RequestCampaignDirectionRequest req);

    @Description("ReBQ Retrieve details about the campaign design and execution direction and scheduling activity")
    RetrieveCampaignDirectionResponse retrieveCampaignDirection(RetrieveCampaignDirectionRequest req);
}