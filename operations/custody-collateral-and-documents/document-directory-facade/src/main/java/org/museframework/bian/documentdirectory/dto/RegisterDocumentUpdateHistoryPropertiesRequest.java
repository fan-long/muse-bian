package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterDocumentUpdateHistoryPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentupdatehistorypropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentUpdateHistoryProperties documentUpdateHistoryProperties;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentupdatehistorypropertiesid(String documentupdatehistorypropertiesid) {
        this.documentupdatehistorypropertiesid = documentupdatehistorypropertiesid;
    }

    public String getDocumentupdatehistorypropertiesid() {
        return documentupdatehistorypropertiesid;
    }

    public void setDocumentUpdateHistoryProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentUpdateHistoryProperties documentUpdateHistoryProperties) {
        this.documentUpdateHistoryProperties = documentUpdateHistoryProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentUpdateHistoryProperties getDocumentUpdateHistoryProperties() {
        return documentUpdateHistoryProperties;
    }
}