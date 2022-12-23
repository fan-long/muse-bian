package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyDocumentVerificationPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties documentVerificationProperties;

    public void setDocumentVerificationProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties documentVerificationProperties) {
        this.documentVerificationProperties = documentVerificationProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties getDocumentVerificationProperties() {
        return documentVerificationProperties;
    }
}