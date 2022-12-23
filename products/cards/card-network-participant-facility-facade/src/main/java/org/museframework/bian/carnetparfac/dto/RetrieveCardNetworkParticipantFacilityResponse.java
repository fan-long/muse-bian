package org.museframework.bian.carnetparfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCardNetworkParticipantFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility cardNetworkParticipantFacility;

    public void setCardNetworkParticipantFacility(org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility cardNetworkParticipantFacility) {
        this.cardNetworkParticipantFacility = cardNetworkParticipantFacility;
    }

    public org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility getCardNetworkParticipantFacility() {
        return cardNetworkParticipantFacility;
    }
}