package org.museframework.bian.servicedirectory.dto;

public class ExecuteAccessControlServicingPropertiesRequest {
    private String servicedirectoryid;

    private String accesscontrolservicingpropertiesid;

    private org.museframework.bian.servicedirectory.dto.bq.AccessControlServicingProperties accessControlServicingProperties;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setAccesscontrolservicingpropertiesid(String accesscontrolservicingpropertiesid) {
        this.accesscontrolservicingpropertiesid = accesscontrolservicingpropertiesid;
    }

    public String getAccesscontrolservicingpropertiesid() {
        return accesscontrolservicingpropertiesid;
    }

    public void setAccessControlServicingProperties(org.museframework.bian.servicedirectory.dto.bq.AccessControlServicingProperties accessControlServicingProperties) {
        this.accessControlServicingProperties = accessControlServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.AccessControlServicingProperties getAccessControlServicingProperties() {
        return accessControlServicingProperties;
    }
}