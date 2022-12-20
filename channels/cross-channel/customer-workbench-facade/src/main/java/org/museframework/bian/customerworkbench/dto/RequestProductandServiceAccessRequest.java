package org.museframework.bian.customerworkbench.dto;

public class RequestProductandServiceAccessRequest {
    private String customerworkbenchid;

    private String productandserviceaccessid;

    private org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess productandServiceAccess;

    public void setCustomerworkbenchid(String customerworkbenchid) {
        this.customerworkbenchid = customerworkbenchid;
    }

    public String getCustomerworkbenchid() {
        return customerworkbenchid;
    }

    public void setProductandserviceaccessid(String productandserviceaccessid) {
        this.productandserviceaccessid = productandserviceaccessid;
    }

    public String getProductandserviceaccessid() {
        return productandserviceaccessid;
    }

    public void setProductandServiceAccess(org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess productandServiceAccess) {
        this.productandServiceAccess = productandServiceAccess;
    }

    public org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess getProductandServiceAccess() {
        return productandServiceAccess;
    }
}