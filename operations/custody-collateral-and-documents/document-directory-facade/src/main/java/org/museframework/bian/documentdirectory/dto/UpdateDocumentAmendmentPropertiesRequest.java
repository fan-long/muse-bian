package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDocumentAmendmentPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentamendmentpropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentAmendmentProperties documentAmendmentProperties;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentamendmentpropertiesid(String documentamendmentpropertiesid) {
        this.documentamendmentpropertiesid = documentamendmentpropertiesid;
    }

    public String getDocumentamendmentpropertiesid() {
        return documentamendmentpropertiesid;
    }

    public void setDocumentAmendmentProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentAmendmentProperties documentAmendmentProperties) {
        this.documentAmendmentProperties = documentAmendmentProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentAmendmentProperties getDocumentAmendmentProperties() {
        return documentAmendmentProperties;
    }
}