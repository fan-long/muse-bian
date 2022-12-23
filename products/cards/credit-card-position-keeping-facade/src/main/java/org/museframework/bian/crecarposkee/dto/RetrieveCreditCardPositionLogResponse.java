package org.museframework.bian.crecarposkee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCreditCardPositionLogResponse {
    @MetaField(ref=true)
    private org.museframework.bian.crecarposkee.dto.cr.CreditCardPositionLog creditCardPositionLog;

    public void setCreditCardPositionLog(org.museframework.bian.crecarposkee.dto.cr.CreditCardPositionLog creditCardPositionLog) {
        this.creditCardPositionLog = creditCardPositionLog;
    }

    public org.museframework.bian.crecarposkee.dto.cr.CreditCardPositionLog getCreditCardPositionLog() {
        return creditCardPositionLog;
    }
}