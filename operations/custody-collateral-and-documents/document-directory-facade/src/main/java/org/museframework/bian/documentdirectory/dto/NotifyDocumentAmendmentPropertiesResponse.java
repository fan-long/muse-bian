package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyDocumentAmendmentPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentAmendmentProperties documentAmendmentProperties;

    public void setDocumentAmendmentProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentAmendmentProperties documentAmendmentProperties) {
        this.documentAmendmentProperties = documentAmendmentProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentAmendmentProperties getDocumentAmendmentProperties() {
        return documentAmendmentProperties;
    }
}