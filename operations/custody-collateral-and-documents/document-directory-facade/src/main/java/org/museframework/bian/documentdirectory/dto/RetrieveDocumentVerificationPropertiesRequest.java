package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDocumentVerificationPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentverificationpropertiesid;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentverificationpropertiesid(String documentverificationpropertiesid) {
        this.documentverificationpropertiesid = documentverificationpropertiesid;
    }

    public String getDocumentverificationpropertiesid() {
        return documentverificationpropertiesid;
    }
}