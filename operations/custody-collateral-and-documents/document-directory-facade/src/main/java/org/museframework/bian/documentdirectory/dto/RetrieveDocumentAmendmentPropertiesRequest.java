package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDocumentAmendmentPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentamendmentpropertiesid;

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
}