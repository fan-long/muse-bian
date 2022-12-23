package org.museframework.bian.carecogat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCardAuthenticationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carecogat.dto.bq.CardAuthentication cardAuthentication;

    public void setCardAuthentication(org.museframework.bian.carecogat.dto.bq.CardAuthentication cardAuthentication) {
        this.cardAuthentication = cardAuthentication;
    }

    public org.museframework.bian.carecogat.dto.bq.CardAuthentication getCardAuthentication() {
        return cardAuthentication;
    }
}