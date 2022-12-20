package org.museframework.bian.sessiondialogue.dto;

public class InitiateQueryRequest {
    private String sessiondialogueid;

    private String queryid;

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