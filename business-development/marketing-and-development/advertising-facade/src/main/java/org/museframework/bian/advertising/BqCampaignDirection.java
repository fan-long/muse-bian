package org.museframework.bian.advertising;

import org.museframework.bian.advertising.dto.CreateCampaignDirectionRequest;
import org.museframework.bian.advertising.dto.CreateCampaignDirectionResponse;
import org.museframework.bian.advertising.dto.RequestCampaignDirectionRequest;
import org.museframework.bian.advertising.dto.RequestCampaignDirectionResponse;
import org.museframework.bian.advertising.dto.RetrieveCampaignDirectionRequest;
import org.museframework.bian.advertising.dto.RetrieveCampaignDirectionResponse;
import org.museframework.bian.advertising.dto.UpdateCampaignDirectionRequest;
import org.museframework.bian.advertising.dto.UpdateCampaignDirectionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="Advertising", group="CampaignDirection")
public interface BqCampaignDirection {
    @GenericDtxEndpoint
    @Description("CrBQ Create advertising campaign direction schedules (e.g. create the schedules for design or execution activity)")
    CreateCampaignDirectionResponse createCampaignDirection(CreateCampaignDirectionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the advertising campaign design and execution schedules")
    UpdateCampaignDirectionResponse updateCampaignDirection(UpdateCampaignDirectionRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the schedules (e.g. rework priorities)")
    RequestCampaignDirectionResponse requestCampaignDirection(RequestCampaignDirectionRequest req);

    @Description("ReBQ Retrieve details about advertising campaign design and execution direction and scheduling activities")
    RetrieveCampaignDirectionResponse retrieveCampaignDirection(RetrieveCampaignDirectionRequest req);
}