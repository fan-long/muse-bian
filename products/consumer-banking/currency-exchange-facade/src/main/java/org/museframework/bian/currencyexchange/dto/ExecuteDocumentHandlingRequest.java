package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteDocumentHandlingRequest {
    @MetaField
    private String currencyexchangeid;

    @MetaField
    private String documenthandlingid;

    @MetaField(ref=true)
    private org.museframework.bian.currencyexchange.dto.bq.DocumentHandling documentHandling;

    public void setCurrencyexchangeid(String currencyexchangeid) {
        this.currencyexchangeid = currencyexchangeid;
    }

    public String getCurrencyexchangeid() {
        return currencyexchangeid;
    }

    public void setDocumenthandlingid(String documenthandlingid) {
        this.documenthandlingid = documenthandlingid;
    }

    public String getDocumenthandlingid() {
        return documenthandlingid;
    }

    public void setDocumentHandling(org.museframework.bian.currencyexchange.dto.bq.DocumentHandling documentHandling) {
        this.documentHandling = documentHandling;
    }

    public org.museframework.bian.currencyexchange.dto.bq.DocumentHandling getDocumentHandling() {
        return documentHandling;
    }
}