package org.museframework.bian.opeiteman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateOpenItemProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.opeiteman.dto.cr.OpenItemProcedure openItemProcedure;

    public void setOpenItemProcedure(org.museframework.bian.opeiteman.dto.cr.OpenItemProcedure openItemProcedure) {
        this.openItemProcedure = openItemProcedure;
    }

    public org.museframework.bian.opeiteman.dto.cr.OpenItemProcedure getOpenItemProcedure() {
        return openItemProcedure;
    }
}