package org.museframework.bian.customerworkbench.dto;

public class RetrieveProductandServiceAccessRequest {
    private String customerworkbenchid;

    private String productandserviceaccessid;

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
}