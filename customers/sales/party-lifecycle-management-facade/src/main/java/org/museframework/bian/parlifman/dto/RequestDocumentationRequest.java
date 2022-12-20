package org.museframework.bian.parlifman.dto;

public class RequestDocumentationRequest {
    private String partylifecyclemanagementid;

    private String documentationid;

    private org.museframework.bian.parlifman.dto.bq.Documentation documentation;

    public void setPartylifecyclemanagementid(String partylifecyclemanagementid) {
        this.partylifecyclemanagementid = partylifecyclemanagementid;
    }

    public String getPartylifecyclemanagementid() {
        return partylifecyclemanagementid;
    }

    public void setDocumentationid(String documentationid) {
        this.documentationid = documentationid;
    }

    public String getDocumentationid() {
        return documentationid;
    }

    public void setDocumentation(org.museframework.bian.parlifman.dto.bq.Documentation documentation) {
        this.documentation = documentation;
    }

    public org.museframework.bian.parlifman.dto.bq.Documentation getDocumentation() {
        return documentation;
    }
}