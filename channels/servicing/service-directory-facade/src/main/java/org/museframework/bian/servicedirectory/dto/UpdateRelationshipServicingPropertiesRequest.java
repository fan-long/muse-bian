package org.museframework.bian.servicedirectory.dto;

public class UpdateRelationshipServicingPropertiesRequest {
    private String servicedirectoryid;

    private String relationshipservicingpropertiesid;

    private org.museframework.bian.servicedirectory.dto.bq.RelationshipServicingProperties relationshipServicingProperties;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setRelationshipservicingpropertiesid(String relationshipservicingpropertiesid) {
        this.relationshipservicingpropertiesid = relationshipservicingpropertiesid;
    }

    public String getRelationshipservicingpropertiesid() {
        return relationshipservicingpropertiesid;
    }

    public void setRelationshipServicingProperties(org.museframework.bian.servicedirectory.dto.bq.RelationshipServicingProperties relationshipServicingProperties) {
        this.relationshipServicingProperties = relationshipServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.RelationshipServicingProperties getRelationshipServicingProperties() {
        return relationshipServicingProperties;
    }
}