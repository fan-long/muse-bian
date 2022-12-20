package org.museframework.bian.servicedirectory.dto;

public class ExecuteSalesServicingPropertiesResponse {
    private org.museframework.bian.servicedirectory.dto.bq.SalesServicingProperties salesServicingProperties;

    public void setSalesServicingProperties(org.museframework.bian.servicedirectory.dto.bq.SalesServicingProperties salesServicingProperties) {
        this.salesServicingProperties = salesServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.SalesServicingProperties getSalesServicingProperties() {
        return salesServicingProperties;
    }
}