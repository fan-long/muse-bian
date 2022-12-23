package org.museframework.bian.documentservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestDocumentServiceProcedureRequest {
    @MetaField
    private String documentservicesid;

    @MetaField(ref=true)
    private org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure documentServiceProcedure;

    public void setDocumentservicesid(String documentservicesid) {
        this.documentservicesid = documentservicesid;
    }

    public String getDocumentservicesid() {
        return documentservicesid;
    }

    public void setDocumentServiceProcedure(org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure documentServiceProcedure) {
        this.documentServiceProcedure = documentServiceProcedure;
    }

    public org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure getDocumentServiceProcedure() {
        return documentServiceProcedure;
    }
}