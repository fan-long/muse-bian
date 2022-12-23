package org.museframework.bian.documentservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyDocumentServiceProcedureRequest {
    @MetaField
    private String documentservicesid;

    public void setDocumentservicesid(String documentservicesid) {
        this.documentservicesid = documentservicesid;
    }

    public String getDocumentservicesid() {
        return documentservicesid;
    }
}