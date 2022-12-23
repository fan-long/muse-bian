package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveLetterofCreditPayoutTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.bq.LetterofCreditPayoutTask letterofCreditPayoutTask;

    public void setLetterofCreditPayoutTask(org.museframework.bian.letofcre.dto.bq.LetterofCreditPayoutTask letterofCreditPayoutTask) {
        this.letterofCreditPayoutTask = letterofCreditPayoutTask;
    }

    public org.museframework.bian.letofcre.dto.bq.LetterofCreditPayoutTask getLetterofCreditPayoutTask() {
        return letterofCreditPayoutTask;
    }
}