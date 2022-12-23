package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureDirectDebitResponse {
    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.bq.DirectDebit directDebit;

    public void setDirectDebit(org.museframework.bian.virtualaccount.dto.bq.DirectDebit directDebit) {
        this.directDebit = directDebit;
    }

    public org.museframework.bian.virtualaccount.dto.bq.DirectDebit getDirectDebit() {
        return directDebit;
    }
}