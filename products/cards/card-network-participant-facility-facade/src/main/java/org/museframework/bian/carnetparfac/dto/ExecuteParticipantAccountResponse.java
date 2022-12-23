package org.museframework.bian.carnetparfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteParticipantAccountResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carnetparfac.dto.bq.ParticipantAccount participantAccount;

    public void setParticipantAccount(org.museframework.bian.carnetparfac.dto.bq.ParticipantAccount participantAccount) {
        this.participantAccount = participantAccount;
    }

    public org.museframework.bian.carnetparfac.dto.bq.ParticipantAccount getParticipantAccount() {
        return participantAccount;
    }
}