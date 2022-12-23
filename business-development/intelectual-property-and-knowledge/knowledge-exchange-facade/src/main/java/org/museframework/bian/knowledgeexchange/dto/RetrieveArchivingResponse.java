package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveArchivingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.knowledgeexchange.dto.bq.Archiving archiving;

    public void setArchiving(org.museframework.bian.knowledgeexchange.dto.bq.Archiving archiving) {
        this.archiving = archiving;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.Archiving getArchiving() {
        return archiving;
    }
}