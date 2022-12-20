package org.museframework.bian.serevehis.dto;

public class UpdateIssueRequest {
    private String servicingeventhistoryid;

    private String issueid;

    private org.museframework.bian.serevehis.dto.bq.Issue issue;

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

    public void setIssue(org.museframework.bian.serevehis.dto.bq.Issue issue) {
        this.issue = issue;
    }

    public org.museframework.bian.serevehis.dto.bq.Issue getIssue() {
        return issue;
    }
}