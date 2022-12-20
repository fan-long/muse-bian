package org.museframework.bian.contacthandler.dto;

public class RetrieveSessionRequest {
    private String contacthandlerid;

    private String sessionid;

    public void setContacthandlerid(String contacthandlerid) {
        this.contacthandlerid = contacthandlerid;
    }

    public String getContacthandlerid() {
        return contacthandlerid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getSessionid() {
        return sessionid;
    }
}