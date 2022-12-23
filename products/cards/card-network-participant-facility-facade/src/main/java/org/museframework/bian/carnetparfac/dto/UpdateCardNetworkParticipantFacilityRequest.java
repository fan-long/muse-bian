package org.museframework.bian.carnetparfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCardNetworkParticipantFacilityRequest {
    @MetaField
    private String cardnetworkparticipantfacilityid;

    @MetaField(ref=true)
    private org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility cardNetworkParticipantFacility;

    public void setCardnetworkparticipantfacilityid(String cardnetworkparticipantfacilityid) {
        this.cardnetworkparticipantfacilityid = cardnetworkparticipantfacilityid;
    }

    public String getCardnetworkparticipantfacilityid() {
        return cardnetworkparticipantfacilityid;
    }

    public void setCardNetworkParticipantFacility(org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility cardNetworkParticipantFacility) {
        this.cardNetworkParticipantFacility = cardNetworkParticipantFacility;
    }

    public org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility getCardNetworkParticipantFacility() {
        return cardNetworkParticipantFacility;
    }
}