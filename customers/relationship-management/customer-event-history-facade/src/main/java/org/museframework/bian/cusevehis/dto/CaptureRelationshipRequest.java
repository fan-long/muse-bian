package org.museframework.bian.cusevehis.dto;

public class CaptureRelationshipRequest {
    private String customereventhistoryid;

    private String relationshipid;

    private org.museframework.bian.cusevehis.dto.bq.Relationship relationship;

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

    public void setRelationship(org.museframework.bian.cusevehis.dto.bq.Relationship relationship) {
        this.relationship = relationship;
    }

    public org.museframework.bian.cusevehis.dto.bq.Relationship getRelationship() {
        return relationship;
    }
}