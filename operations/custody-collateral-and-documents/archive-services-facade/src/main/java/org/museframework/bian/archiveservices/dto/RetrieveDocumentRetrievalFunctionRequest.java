package org.museframework.bian.archiveservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDocumentRetrievalFunctionRequest {
    @MetaField
    private String archiveservicesid;

    @MetaField
    private String documentretrievalfunctionid;

    public void setArchiveservicesid(String archiveservicesid) {
        this.archiveservicesid = archiveservicesid;
    }

    public String getArchiveservicesid() {
        return archiveservicesid;
    }

    public void setDocumentretrievalfunctionid(String documentretrievalfunctionid) {
        this.documentretrievalfunctionid = documentretrievalfunctionid;
    }

    public String getDocumentretrievalfunctionid() {
        return documentretrievalfunctionid;
    }
}