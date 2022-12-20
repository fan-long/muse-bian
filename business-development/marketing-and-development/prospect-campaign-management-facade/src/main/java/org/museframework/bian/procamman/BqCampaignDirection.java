package org.museframework.bian.procamman;

import org.museframework.bian.procamman.dto.CreateCampaignDirectionRequest;
import org.museframework.bian.procamman.dto.CreateCampaignDirectionResponse;
import org.museframework.bian.procamman.dto.RequestCampaignDirectionRequest;
import org.museframework.bian.procamman.dto.RequestCampaignDirectionResponse;
import org.museframework.bian.procamman.dto.RetrieveCampaignDirectionRequest;
import org.museframework.bian.procamman.dto.RetrieveCampaignDirectionResponse;
import org.museframework.bian.procamman.dto.UpdateCampaignDirectionRequest;
import org.museframework.bian.procamman.dto.UpdateCampaignDirectionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="ProspectCampaignManagement", group="CampaignDirection")
public interface BqCampaignDirection {
    @GenericDtxEndpoint
    @Description("CrBQ Create prospect campaign direction schedules")
    CreateCampaignDirectionResponse createCampaignDirection(CreateCampaignDirectionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the prospect campaign design and execution schedules")
    UpdateCampaignDirectionResponse updateCampaignDirection(UpdateCampaignDirectionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the schedules")
    RequestCampaignDirectionResponse requestCampaignDirection(RequestCampaignDirectionRequest req);

    @Description("ReBQ Retrieve details about the campaign design and execution direction and scheduling activity")
    RetrieveCampaignDirectionResponse retrieveCampaignDirection(RetrieveCampaignDirectionRequest req);
}