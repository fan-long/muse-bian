package org.museframework.bian.crecarposkee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCreditCardPositionLogRequest {
    @MetaField
    private String creditcardpositionkeepingid;

    @MetaField(ref=true)
    private org.museframework.bian.crecarposkee.dto.cr.CreditCardPositionLog creditCardPositionLog;

    public void setCreditcardpositionkeepingid(String creditcardpositionkeepingid) {
        this.creditcardpositionkeepingid = creditcardpositionkeepingid;
    }

    public String getCreditcardpositionkeepingid() {
        return creditcardpositionkeepingid;
    }

    public void setCreditCardPositionLog(org.museframework.bian.crecarposkee.dto.cr.CreditCardPositionLog creditCardPositionLog) {
        this.creditCardPositionLog = creditCardPositionLog;
    }

    public org.museframework.bian.crecarposkee.dto.cr.CreditCardPositionLog getCreditCardPositionLog() {
        return creditCardPositionLog;
    }
}