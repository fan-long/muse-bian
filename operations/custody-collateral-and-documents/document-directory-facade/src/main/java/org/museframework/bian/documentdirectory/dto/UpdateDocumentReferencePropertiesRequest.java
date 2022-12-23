package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDocumentReferencePropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentreferencepropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentReferenceProperties documentReferenceProperties;

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

    public void setDocumentReferenceProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentReferenceProperties documentReferenceProperties) {
        this.documentReferenceProperties = documentReferenceProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentReferenceProperties getDocumentReferenceProperties() {
        return documentReferenceProperties;
    }
}