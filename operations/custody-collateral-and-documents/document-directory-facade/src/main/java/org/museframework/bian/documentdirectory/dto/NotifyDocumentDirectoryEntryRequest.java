package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyDocumentDirectoryEntryRequest {
    @MetaField
    private String documentdirectoryid;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }
}