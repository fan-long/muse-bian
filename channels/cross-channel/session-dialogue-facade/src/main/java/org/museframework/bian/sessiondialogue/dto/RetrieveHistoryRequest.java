package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveHistoryRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String historyid;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setHistoryid(String historyid) {
        this.historyid = historyid;
    }

    public String getHistoryid() {
        return historyid;
    }
}