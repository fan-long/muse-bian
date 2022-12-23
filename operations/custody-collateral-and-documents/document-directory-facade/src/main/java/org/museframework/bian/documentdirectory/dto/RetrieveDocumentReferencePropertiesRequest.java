package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDocumentReferencePropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentreferencepropertiesid;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentreferencepropertiesid(String documentreferencepropertiesid) {
        this.documentreferencepropertiesid = documentreferencepropertiesid;
    }

    public String getDocumentreferencepropertiesid() {
        return documentreferencepropertiesid;
    }
}