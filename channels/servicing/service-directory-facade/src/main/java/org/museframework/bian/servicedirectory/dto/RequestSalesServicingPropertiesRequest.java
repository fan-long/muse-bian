package org.museframework.bian.servicedirectory.dto;

public class RequestSalesServicingPropertiesRequest {
    private String servicedirectoryid;

    private String salesservicingpropertiesid;

    private org.museframework.bian.servicedirectory.dto.bq.SalesServicingProperties salesServicingProperties;

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

    public void setSalesServicingProperties(org.museframework.bian.servicedirectory.dto.bq.SalesServicingProperties salesServicingProperties) {
        this.salesServicingProperties = salesServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.SalesServicingProperties getSalesServicingProperties() {
        return salesServicingProperties;
    }
}