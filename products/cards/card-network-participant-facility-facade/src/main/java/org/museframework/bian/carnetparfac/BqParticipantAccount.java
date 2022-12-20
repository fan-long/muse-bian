package org.museframework.bian.carnetparfac;

import org.museframework.bian.carnetparfac.dto.ExecuteParticipantAccountRequest;
import org.museframework.bian.carnetparfac.dto.ExecuteParticipantAccountResponse;
import org.museframework.bian.carnetparfac.dto.RetrieveParticipantAccountRequest;
import org.museframework.bian.carnetparfac.dto.RetrieveParticipantAccountResponse;
import org.museframework.bian.carnetparfac.dto.UpdateParticipantAccountRequest;
import org.museframework.bian.carnetparfac.dto.UpdateParticipantAccountResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CardNetworkParticipantFacility", group="ParticipantAccount")
public interface BqParticipantAccount {
    @GenericDtxEndpoint
    @Description("UpBQ Update an account posting made to the network participant")
    UpdateParticipantAccountResponse updateParticipantAccount(UpdateParticipantAccountRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute a posting against the participant's account")
    ExecuteParticipantAccountResponse executeParticipantAccount(ExecuteParticipantAccountRequest req);

    @Description("ReBQ Retrieve details about an account posting or account")
    RetrieveParticipantAccountResponse retrieveParticipantAccount(RetrieveParticipantAccountRequest req);
}