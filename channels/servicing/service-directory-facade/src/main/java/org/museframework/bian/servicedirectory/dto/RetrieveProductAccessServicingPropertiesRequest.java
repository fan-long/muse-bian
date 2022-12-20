package org.museframework.bian.servicedirectory.dto;

public class RetrieveProductAccessServicingPropertiesRequest {
    private String servicedirectoryid;

    private String productaccessservicingpropertiesid;

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
}