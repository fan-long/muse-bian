package org.museframework.bian.contacthandler.dto;

public class RetrieveHistoryRequest {
    private String contacthandlerid;

    private String historyid;

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
}