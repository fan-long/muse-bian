package org.museframework.bian.parlifman.dto;

public class RetrieveDocumentationRequest {
    private String partylifecyclemanagementid;

    private String documentationid;

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
}