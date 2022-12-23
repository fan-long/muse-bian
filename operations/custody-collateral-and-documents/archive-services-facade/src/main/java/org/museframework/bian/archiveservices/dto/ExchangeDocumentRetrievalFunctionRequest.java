package org.museframework.bian.archiveservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeDocumentRetrievalFunctionRequest {
    @MetaField
    private String archiveservicesid;

    @MetaField
    private String documentretrievalfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.archiveservices.dto.bq.DocumentRetrievalFunction documentRetrievalFunction;

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

    public void setDocumentRetrievalFunction(org.museframework.bian.archiveservices.dto.bq.DocumentRetrievalFunction documentRetrievalFunction) {
        this.documentRetrievalFunction = documentRetrievalFunction;
    }

    public org.museframework.bian.archiveservices.dto.bq.DocumentRetrievalFunction getDocumentRetrievalFunction() {
        return documentRetrievalFunction;
    }
}