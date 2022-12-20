package org.museframework.bian.sessiondialogue.dto;

public class UpdateHistoryRequest {
    private String sessiondialogueid;

    private String historyid;

    private org.museframework.bian.sessiondialogue.dto.bq.History history;

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

    public void setHistory(org.museframework.bian.sessiondialogue.dto.bq.History history) {
        this.history = history;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.History getHistory() {
        return history;
    }
}