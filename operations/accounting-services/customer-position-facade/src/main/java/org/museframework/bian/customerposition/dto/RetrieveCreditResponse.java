package org.museframework.bian.customerposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCreditResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerposition.dto.bq.Credit credit;

    public void setCredit(org.museframework.bian.customerposition.dto.bq.Credit credit) {
        this.credit = credit;
    }

    public org.museframework.bian.customerposition.dto.bq.Credit getCredit() {
        return credit;
    }
}