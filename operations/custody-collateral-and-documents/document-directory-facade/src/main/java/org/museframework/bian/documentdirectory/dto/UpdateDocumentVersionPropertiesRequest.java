package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDocumentVersionPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentversionpropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties documentVersionProperties;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentversionpropertiesid(String documentversionpropertiesid) {
        this.documentversionpropertiesid = documentversionpropertiesid;
    }

    public String getDocumentversionpropertiesid() {
        return documentversionpropertiesid;
    }

    public void setDocumentVersionProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties documentVersionProperties) {
        this.documentVersionProperties = documentVersionProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentVersionProperties getDocumentVersionProperties() {
        return documentVersionProperties;
    }
}