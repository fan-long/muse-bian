package org.museframework.bian.serevehis.dto;

public class CaptureIssueResponse {
    private org.museframework.bian.serevehis.dto.bq.Issue issue;

    public void setIssue(org.museframework.bian.serevehis.dto.bq.Issue issue) {
        this.issue = issue;
    }

    public org.museframework.bian.serevehis.dto.bq.Issue getIssue() {
        return issue;
    }
}