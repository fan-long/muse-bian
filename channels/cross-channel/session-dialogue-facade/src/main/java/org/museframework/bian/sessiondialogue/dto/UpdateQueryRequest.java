package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateQueryRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String queryid;

    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Query query;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setQueryid(String queryid) {
        this.queryid = queryid;
    }

    public String getQueryid() {
        return queryid;
    }

    public void setQuery(org.museframework.bian.sessiondialogue.dto.bq.Query query) {
        this.query = query;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Query getQuery() {
        return query;
    }
}