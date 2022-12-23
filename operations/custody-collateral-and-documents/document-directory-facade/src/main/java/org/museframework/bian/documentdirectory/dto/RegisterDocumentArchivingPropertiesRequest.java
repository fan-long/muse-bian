package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterDocumentArchivingPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentarchivingpropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentArchivingProperties documentArchivingProperties;

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

    public void setDocumentArchivingProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentArchivingProperties documentArchivingProperties) {
        this.documentArchivingProperties = documentArchivingProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentArchivingProperties getDocumentArchivingProperties() {
        return documentArchivingProperties;
    }
}