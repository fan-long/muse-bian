package org.museframework.bian.commissions.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCheckResponse {
    @MetaField(ref=true)
    private org.museframework.bian.commissions.dto.bq.Check check;

    public void setCheck(org.museframework.bian.commissions.dto.bq.Check check) {
        this.check = check;
    }

    public org.museframework.bian.commissions.dto.bq.Check getCheck() {
        return check;
    }
}