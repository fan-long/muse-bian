package org.museframework.bian.parlifman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDocumentationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parlifman.dto.bq.Documentation documentation;

    public void setDocumentation(org.museframework.bian.parlifman.dto.bq.Documentation documentation) {
        this.documentation = documentation;
    }

    public org.museframework.bian.parlifman.dto.bq.Documentation getDocumentation() {
        return documentation;
    }
}