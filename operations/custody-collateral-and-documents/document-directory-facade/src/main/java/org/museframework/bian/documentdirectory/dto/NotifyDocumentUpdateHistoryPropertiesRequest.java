package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyDocumentUpdateHistoryPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentupdatehistorypropertiesid;

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
}