package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLetterofCreditIssuanceandBookingTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.bq.LetterofCreditIssuanceandBookingTask letterofCreditIssuanceandBookingTask;

    public void setLetterofCreditIssuanceandBookingTask(org.museframework.bian.letofcre.dto.bq.LetterofCreditIssuanceandBookingTask letterofCreditIssuanceandBookingTask) {
        this.letterofCreditIssuanceandBookingTask = letterofCreditIssuanceandBookingTask;
    }

    public org.museframework.bian.letofcre.dto.bq.LetterofCreditIssuanceandBookingTask getLetterofCreditIssuanceandBookingTask() {
        return letterofCreditIssuanceandBookingTask;
    }
}