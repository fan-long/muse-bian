package org.museframework.bian.cusevehis.dto;

public class UpdateRelationshipResponse {
    private org.museframework.bian.cusevehis.dto.bq.Relationship relationship;

    public void setRelationship(org.museframework.bian.cusevehis.dto.bq.Relationship relationship) {
        this.relationship = relationship;
    }

    public org.museframework.bian.cusevehis.dto.bq.Relationship getRelationship() {
        return relationship;
    }
}