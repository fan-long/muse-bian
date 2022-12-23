package org.museframework.bian.archiveservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDocumentCaptureFunctionRequest {
    @MetaField
    private String archiveservicesid;

    @MetaField
    private String documentcapturefunctionid;

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
}