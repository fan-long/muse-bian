package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RegisterDocumentArchivingPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentArchivingProperties documentArchivingProperties;

    public void setDocumentArchivingProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentArchivingProperties documentArchivingProperties) {
        this.documentArchivingProperties = documentArchivingProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentArchivingProperties getDocumentArchivingProperties() {
        return documentArchivingProperties;
    }
}