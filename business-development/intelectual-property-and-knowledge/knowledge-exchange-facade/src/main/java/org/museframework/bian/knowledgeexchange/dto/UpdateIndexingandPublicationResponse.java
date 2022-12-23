package org.museframework.bian.knowledgeexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateIndexingandPublicationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.knowledgeexchange.dto.bq.IndexingandPublication indexingandPublication;

    public void setIndexingandPublication(org.museframework.bian.knowledgeexchange.dto.bq.IndexingandPublication indexingandPublication) {
        this.indexingandPublication = indexingandPublication;
    }

    public org.museframework.bian.knowledgeexchange.dto.bq.IndexingandPublication getIndexingandPublication() {
        return indexingandPublication;
    }
}