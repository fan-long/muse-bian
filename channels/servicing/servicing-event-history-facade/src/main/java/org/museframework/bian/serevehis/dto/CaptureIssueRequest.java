package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureIssueRequest {
    @MetaField
    private String servicingeventhistoryid;

    @MetaField
    private String issueid;

    @MetaField(ref=true)
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