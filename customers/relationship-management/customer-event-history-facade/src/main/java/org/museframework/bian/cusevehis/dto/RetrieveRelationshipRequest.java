package org.museframework.bian.cusevehis.dto;

public class RetrieveRelationshipRequest {
    private String customereventhistoryid;

    private String relationshipid;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setRelationshipid(String relationshipid) {
        this.relationshipid = relationshipid;
    }

    public String getRelationshipid() {
        return relationshipid;
    }
}