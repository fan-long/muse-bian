package org.museframework.bian.servicedirectory.dto;

public class UpdateServiceDeliveryServicingPropertiesRequest {
    private String servicedirectoryid;

    private String servicedeliveryservicingpropertiesid;

    private org.museframework.bian.servicedirectory.dto.bq.ServiceDeliveryServicingProperties serviceDeliveryServicingProperties;

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

    public void setServiceDeliveryServicingProperties(org.museframework.bian.servicedirectory.dto.bq.ServiceDeliveryServicingProperties serviceDeliveryServicingProperties) {
        this.serviceDeliveryServicingProperties = serviceDeliveryServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.ServiceDeliveryServicingProperties getServiceDeliveryServicingProperties() {
        return serviceDeliveryServicingProperties;
    }
}