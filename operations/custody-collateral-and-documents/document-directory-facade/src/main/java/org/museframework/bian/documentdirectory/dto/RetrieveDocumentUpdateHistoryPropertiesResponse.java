package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDocumentUpdateHistoryPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentUpdateHistoryProperties documentUpdateHistoryProperties;

    public void setDocumentUpdateHistoryProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentUpdateHistoryProperties documentUpdateHistoryProperties) {
        this.documentUpdateHistoryProperties = documentUpdateHistoryProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentUpdateHistoryProperties getDocumentUpdateHistoryProperties() {
        return documentUpdateHistoryProperties;
    }
}