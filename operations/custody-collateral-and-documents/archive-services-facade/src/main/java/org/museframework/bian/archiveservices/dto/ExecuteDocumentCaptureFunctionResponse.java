package org.museframework.bian.archiveservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteDocumentCaptureFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction documentCaptureFunction;

    public void setDocumentCaptureFunction(org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction documentCaptureFunction) {
        this.documentCaptureFunction = documentCaptureFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction getDocumentCaptureFunction() {
        return documentCaptureFunction;
    }
}