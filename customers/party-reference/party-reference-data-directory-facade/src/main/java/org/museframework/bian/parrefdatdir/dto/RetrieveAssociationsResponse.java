package org.museframework.bian.parrefdatdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAssociationsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parrefdatdir.dto.bq.Associations associations;

    public void setAssociations(org.museframework.bian.parrefdatdir.dto.bq.Associations associations) {
        this.associations = associations;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Associations getAssociations() {
        return associations;
    }
}