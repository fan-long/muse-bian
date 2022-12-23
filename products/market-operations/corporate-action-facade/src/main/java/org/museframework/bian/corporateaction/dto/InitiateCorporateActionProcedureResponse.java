package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCorporateActionProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateaction.dto.cr.CorporateActionProcedure corporateActionProcedure;

    public void setCorporateActionProcedure(org.museframework.bian.corporateaction.dto.cr.CorporateActionProcedure corporateActionProcedure) {
        this.corporateActionProcedure = corporateActionProcedure;
    }

    public org.museframework.bian.corporateaction.dto.cr.CorporateActionProcedure getCorporateActionProcedure() {
        return corporateActionProcedure;
    }
}