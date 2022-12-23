package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateMaintainRelationsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.regandlegaut.dto.bq.MaintainRelations maintainRelations;

    public void setMaintainRelations(org.museframework.bian.regandlegaut.dto.bq.MaintainRelations maintainRelations) {
        this.maintainRelations = maintainRelations;
    }

    public org.museframework.bian.regandlegaut.dto.bq.MaintainRelations getMaintainRelations() {
        return maintainRelations;
    }
}