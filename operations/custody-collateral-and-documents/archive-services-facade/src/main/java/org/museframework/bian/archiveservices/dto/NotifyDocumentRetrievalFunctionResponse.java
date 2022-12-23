package org.museframework.bian.archiveservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyDocumentRetrievalFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.archiveservices.dto.bq.DocumentRetrievalFunction documentRetrievalFunction;

    public void setDocumentRetrievalFunction(org.museframework.bian.archiveservices.dto.bq.DocumentRetrievalFunction documentRetrievalFunction) {
        this.documentRetrievalFunction = documentRetrievalFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentRetrievalFunction getDocumentRetrievalFunction() {
        return documentRetrievalFunction;
    }
}