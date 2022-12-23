package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCreditResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Credit credit;

    public void setCredit(org.museframework.bian.customeroffer.dto.bq.Credit credit) {
        this.credit = credit;
    }

    public org.museframework.bian.customeroffer.dto.bq.Credit getCredit() {
        return credit;
    }
}