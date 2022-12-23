package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDocumentVersionPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentversionpropertiesid;

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
}