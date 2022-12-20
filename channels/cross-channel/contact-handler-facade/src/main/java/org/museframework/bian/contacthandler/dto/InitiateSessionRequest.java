package org.museframework.bian.contacthandler.dto;

public class InitiateSessionRequest {
    private String contacthandlerid;

    private String sessionid;

    private org.museframework.bian.contacthandler.dto.bq.Session session;

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

    public void setSession(org.museframework.bian.contacthandler.dto.bq.Session session) {
        this.session = session;
    }

    public org.museframework.bian.contacthandler.dto.bq.Session getSession() {
        return session;
    }
}