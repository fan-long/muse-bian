package org.museframework.bian.servicedirectory.dto;

public class RetrieveSalesServicingPropertiesRequest {
    private String servicedirectoryid;

    private String salesservicingpropertiesid;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setSalesservicingpropertiesid(String salesservicingpropertiesid) {
        this.salesservicingpropertiesid = salesservicingpropertiesid;
    }

    public String getSalesservicingpropertiesid() {
        return salesservicingpropertiesid;
    }
}