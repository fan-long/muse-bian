package org.museframework.bian.servicedirectory.dto;

public class RetrieveAccessControlServicingPropertiesRequest {
    private String servicedirectoryid;

    private String accesscontrolservicingpropertiesid;

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
}