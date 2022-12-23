package org.museframework.bian.documentservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeDocumentServiceProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure documentServiceProcedure;

    public void setDocumentServiceProcedure(org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure documentServiceProcedure) {
        this.documentServiceProcedure = documentServiceProcedure;
    }

    public org.museframework.bian.documentservices.dto.cr.DocumentServiceProcedure getDocumentServiceProcedure() {
        return documentServiceProcedure;
    }
}