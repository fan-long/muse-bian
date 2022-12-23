package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestDocumentVersionPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties documentVersionProperties;

    public void setDocumentVersionProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties documentVersionProperties) {
        this.documentVersionProperties = documentVersionProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties getDocumentVersionProperties() {
        return documentVersionProperties;
    }
}