package org.museframework.bian.archiveservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestDocumentCaptureFunctionRequest {
    @MetaField
    private String archiveservicesid;

    @MetaField
    private String documentcapturefunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction documentCaptureFunction;

    public void setArchiveservicesid(String archiveservicesid) {
        this.archiveservicesid = archiveservicesid;
    }

    public String getArchiveservicesid() {
        return archiveservicesid;
    }

    public void setDocumentcapturefunctionid(String documentcapturefunctionid) {
        this.documentcapturefunctionid = documentcapturefunctionid;
    }

    public String getDocumentcapturefunctionid() {
        return documentcapturefunctionid;
    }

    public void setDocumentCaptureFunction(org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction documentCaptureFunction) {
        this.documentCaptureFunction = documentCaptureFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentCaptureFunction getDocumentCaptureFunction() {
        return documentCaptureFunction;
    }
}