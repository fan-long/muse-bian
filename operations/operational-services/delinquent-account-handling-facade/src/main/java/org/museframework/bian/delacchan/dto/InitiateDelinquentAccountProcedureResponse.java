package org.museframework.bian.delacchan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateDelinquentAccountProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure delinquentAccountProcedure;

    public void setDelinquentAccountProcedure(org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure delinquentAccountProcedure) {
        this.delinquentAccountProcedure = delinquentAccountProcedure;
    }

    public org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure getDelinquentAccountProcedure() {
        return delinquentAccountProcedure;
    }
}