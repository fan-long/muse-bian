package org.museframework.bian.serevehis.dto;

public class UpdateSessionRequest {
    private String servicingeventhistoryid;

    private String sessionid;

    private org.museframework.bian.serevehis.dto.bq.Session session;

    public void setServicingeventhistoryid(String servicingeventhistoryid) {
        this.servicingeventhistoryid = servicingeventhistoryid;
    }

    public String getServicingeventhistoryid() {
        return servicingeventhistoryid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSession(org.museframework.bian.serevehis.dto.bq.Session session) {
        this.session = session;
    }

    public org.museframework.bian.serevehis.dto.bq.Session getSession() {
        return session;
    }
}