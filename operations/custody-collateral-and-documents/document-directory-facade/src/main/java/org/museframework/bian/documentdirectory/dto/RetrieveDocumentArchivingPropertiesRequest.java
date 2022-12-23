package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDocumentArchivingPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentarchivingpropertiesid;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentarchivingpropertiesid(String documentarchivingpropertiesid) {
        this.documentarchivingpropertiesid = documentarchivingpropertiesid;
    }

    public String getDocumentarchivingpropertiesid() {
        return documentarchivingpropertiesid;
    }
}