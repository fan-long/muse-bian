package org.museframework.bian.carnetparfac;

import org.museframework.bian.carnetparfac.dto.InitiateCardNetworkParticipantFacilityRequest;
import org.museframework.bian.carnetparfac.dto.InitiateCardNetworkParticipantFacilityResponse;
import org.museframework.bian.carnetparfac.dto.RetrieveCardNetworkParticipantFacilityRequest;
import org.museframework.bian.carnetparfac.dto.RetrieveCardNetworkParticipantFacilityResponse;
import org.museframework.bian.carnetparfac.dto.UpdateCardNetworkParticipantFacilityRequest;
import org.museframework.bian.carnetparfac.dto.UpdateCardNetworkParticipantFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Card Network Participant Facility. ")
@GenericDomain(name="CardNetworkParticipantFacility", group="CardNetworkParticipantFacility")
public interface CrCardNetworkParticipantFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a new network participant facility")
    InitiateCardNetworkParticipantFacilityResponse initiateCardNetworkParticipantFacility(InitiateCardNetworkParticipantFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an active network participant facility")
    UpdateCardNetworkParticipantFacilityResponse updateCardNetworkParticipantFacility(UpdateCardNetworkParticipantFacilityRequest req);

    @Description("ReCR Retrieve details about a network participant facility")
    RetrieveCardNetworkParticipantFacilityResponse retrieveCardNetworkParticipantFacility(RetrieveCardNetworkParticipantFacilityRequest req);
}