package org.museframework.bian.sessiondialogue.dto;

public class RetrieveQueryRequest {
    private String sessiondialogueid;

    private String queryid;

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
}