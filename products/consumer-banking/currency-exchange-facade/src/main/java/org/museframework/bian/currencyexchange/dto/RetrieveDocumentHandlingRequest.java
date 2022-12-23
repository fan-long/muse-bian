package org.museframework.bian.currencyexchange.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDocumentHandlingRequest {
    @MetaField
    private String currencyexchangeid;

    @MetaField
    private String documenthandlingid;

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
}