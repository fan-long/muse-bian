package org.museframework.bian.serevehis.dto;

public class RetrieveIssueRequest {
    private String servicingeventhistoryid;

    private String issueid;

    public void setServicingeventhistoryid(String servicingeventhistoryid) {
        this.servicingeventhistoryid = servicingeventhistoryid;
    }

    public String getServicingeventhistoryid() {
        return servicingeventhistoryid;
    }

    public void setIssueid(String issueid) {
        this.issueid = issueid;
    }

    public String getIssueid() {
        return issueid;
    }
}