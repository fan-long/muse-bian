package org.museframework.bian.promotionalevents;

import org.museframework.bian.promotionalevents.dto.CreateParticipationRequest;
import org.museframework.bian.promotionalevents.dto.CreateParticipationResponse;
import org.museframework.bian.promotionalevents.dto.RequestParticipationRequest;
import org.museframework.bian.promotionalevents.dto.RequestParticipationResponse;
import org.museframework.bian.promotionalevents.dto.RetrieveParticipationRequest;
import org.museframework.bian.promotionalevents.dto.RetrieveParticipationResponse;
import org.museframework.bian.promotionalevents.dto.UpdateParticipationRequest;
import org.museframework.bian.promotionalevents.dto.UpdateParticipationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="PromotionalEvents", group="Participation")
public interface BqParticipation {
    @GenericDtxEndpoint
    @Description("CrBQ Create promotional event participation plan")
    CreateParticipationResponse createParticipation(CreateParticipationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update the event participation schedule")
    UpdateParticipationResponse updateParticipation(UpdateParticipationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention to the schedules")
    RequestParticipationResponse requestParticipation(RequestParticipationRequest req);

    @Description("ReBQ Retrieve details about promotional event participation activity")
    RetrieveParticipationResponse retrieveParticipation(RetrieveParticipationRequest req);
}