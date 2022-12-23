package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteDocumentReferencePropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentReferenceProperties documentReferenceProperties;

    public void setDocumentReferenceProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentReferenceProperties documentReferenceProperties) {
        this.documentReferenceProperties = documentReferenceProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentReferenceProperties getDocumentReferenceProperties() {
        return documentReferenceProperties;
    }
}