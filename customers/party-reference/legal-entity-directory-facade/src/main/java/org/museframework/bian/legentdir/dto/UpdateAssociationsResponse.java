package org.museframework.bian.legentdir.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateAssociationsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.legentdir.dto.bq.Associations associations;

    public void setAssociations(org.museframework.bian.legentdir.dto.bq.Associations associations) {
        this.associations = associations;
    }

    public org.museframework.bian.legentdir.dto.bq.Associations getAssociations() {
        return associations;
    }
}