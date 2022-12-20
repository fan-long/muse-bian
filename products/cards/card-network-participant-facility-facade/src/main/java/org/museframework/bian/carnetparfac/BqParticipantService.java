package org.museframework.bian.carnetparfac;

import org.museframework.bian.carnetparfac.dto.ExecuteParticipantServiceRequest;
import org.museframework.bian.carnetparfac.dto.ExecuteParticipantServiceResponse;
import org.museframework.bian.carnetparfac.dto.RequestParticipantServiceRequest;
import org.museframework.bian.carnetparfac.dto.RequestParticipantServiceResponse;
import org.museframework.bian.carnetparfac.dto.RetrieveParticipantServiceRequest;
import org.museframework.bian.carnetparfac.dto.RetrieveParticipantServiceResponse;
import org.museframework.bian.carnetparfac.dto.UpdateParticipantServiceRequest;
import org.museframework.bian.carnetparfac.dto.UpdateParticipantServiceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CardNetworkParticipantFacility", group="ParticipantService")
public interface BqParticipantService {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about a participant service request")
    UpdateParticipantServiceResponse updateParticipantService(UpdateParticipantServiceRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated participant service request (e.g. merchant alert)")
    ExecuteParticipantServiceResponse executeParticipantService(ExecuteParticipantServiceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention with a service request (e.g. arbitration)")
    RequestParticipantServiceResponse requestParticipantService(RequestParticipantServiceRequest req);

    @Description("ReBQ Retrieve details about participant service requests")
    RetrieveParticipantServiceResponse retrieveParticipantService(RetrieveParticipantServiceRequest req);
}