package org.museframework.bian.parroupro;

import org.museframework.bian.parroupro.dto.ExecutePartyStateRequest;
import org.museframework.bian.parroupro.dto.ExecutePartyStateResponse;
import org.museframework.bian.parroupro.dto.InitiatePartyStateRequest;
import org.museframework.bian.parroupro.dto.InitiatePartyStateResponse;
import org.museframework.bian.parroupro.dto.RequestPartyStateRequest;
import org.museframework.bian.parroupro.dto.RequestPartyStateResponse;
import org.museframework.bian.parroupro.dto.RetrievePartyStateRequest;
import org.museframework.bian.parroupro.dto.RetrievePartyStateResponse;
import org.museframework.bian.parroupro.dto.UpdatePartyStateRequest;
import org.museframework.bian.parroupro.dto.UpdatePartyStateResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Monitor and define the status/rating of some entity within Customer Profile. ")
@GenericDomain(name="PartyRoutingProfile", group="PartyState")
public interface CrPartyState {
    @GenericDtxEndpoint
    @Description("InCR Initiate profile state monitoring for a party")
    InitiatePartyStateResponse initiatePartyState(InitiatePartyStateRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update monitoring for a party")
    UpdatePartyStateResponse updatePartyState(UpdatePartyStateRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated action for a monitored party (e.g. refresh)")
    ExecutePartyStateResponse executePartyState(ExecutePartyStateRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention for a monitored party (e.g. review settings)")
    RequestPartyStateResponse requestPartyState(RequestPartyStateRequest req);

    @Description("ReCR Retrieve details about the monitored party state")
    RetrievePartyStateResponse retrievePartyState(RetrievePartyStateRequest req);
}