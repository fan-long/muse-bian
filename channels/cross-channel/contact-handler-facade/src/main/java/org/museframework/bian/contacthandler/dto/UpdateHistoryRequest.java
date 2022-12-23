package org.museframework.bian.contacthandler.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateHistoryRequest {
    @MetaField
    private String contacthandlerid;

    @MetaField
    private String historyid;

    @MetaField(ref=true)
    private org.museframework.bian.contacthandler.dto.bq.History history;

    public void setContacthandlerid(String contacthandlerid) {
        this.contacthandlerid = contacthandlerid;
    }

    public String getContacthandlerid() {
        return contacthandlerid;
    }

    public void setHistoryid(String historyid) {
        this.historyid = historyid;
    }

    public String getHistoryid() {
        return historyid;
    }

    public void setHistory(org.museframework.bian.contacthandler.dto.bq.History history) {
        this.history = history;
    }

    public org.museframework.bian.contacthandler.dto.bq.History getHistory() {
        return history;
    }
}