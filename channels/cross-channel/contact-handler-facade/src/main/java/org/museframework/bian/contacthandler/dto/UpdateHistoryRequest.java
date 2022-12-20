package org.museframework.bian.contacthandler.dto;

public class UpdateHistoryRequest {
    private String contacthandlerid;

    private String historyid;

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