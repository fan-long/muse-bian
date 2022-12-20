package org.museframework.bian.serevehis.dto;

public class RetrieveSessionRequest {
    private String servicingeventhistoryid;

    private String sessionid;

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
}