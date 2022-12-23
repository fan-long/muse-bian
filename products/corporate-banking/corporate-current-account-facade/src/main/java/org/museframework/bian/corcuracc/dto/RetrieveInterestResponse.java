package org.museframework.bian.corcuracc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveInterestResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corcuracc.dto.bq.Interest interest;

    public void setInterest(org.museframework.bian.corcuracc.dto.bq.Interest interest) {
        this.interest = interest;
    }

    public org.museframework.bian.corcuracc.dto.bq.Interest getInterest() {
        return interest;
    }
}