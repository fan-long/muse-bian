package org.museframework.bian.servicedirectory.dto;

public class NotifyServiceDeliveryServicingPropertiesRequest {
    private String servicedirectoryid;

    private String servicedeliveryservicingpropertiesid;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setServicedeliveryservicingpropertiesid(String servicedeliveryservicingpropertiesid) {
        this.servicedeliveryservicingpropertiesid = servicedeliveryservicingpropertiesid;
    }

    public String getServicedeliveryservicingpropertiesid() {
        return servicedeliveryservicingpropertiesid;
    }
}