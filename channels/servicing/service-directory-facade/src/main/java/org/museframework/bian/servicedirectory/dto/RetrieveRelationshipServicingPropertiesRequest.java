package org.museframework.bian.servicedirectory.dto;

public class RetrieveRelationshipServicingPropertiesRequest {
    private String servicedirectoryid;

    private String relationshipservicingpropertiesid;

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
}