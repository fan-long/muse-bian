package org.museframework.bian.servicedirectory.dto;

public class UpdateProductAccessServicingPropertiesRequest {
    private String servicedirectoryid;

    private String productaccessservicingpropertiesid;

    private org.museframework.bian.servicedirectory.dto.bq.ProductAccessServicingProperties productAccessServicingProperties;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setProductaccessservicingpropertiesid(String productaccessservicingpropertiesid) {
        this.productaccessservicingpropertiesid = productaccessservicingpropertiesid;
    }

    public String getProductaccessservicingpropertiesid() {
        return productaccessservicingpropertiesid;
    }

    public void setProductAccessServicingProperties(org.museframework.bian.servicedirectory.dto.bq.ProductAccessServicingProperties productAccessServicingProperties) {
        this.productAccessServicingProperties = productAccessServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.ProductAccessServicingProperties getProductAccessServicingProperties() {
        return productAccessServicingProperties;
    }
}