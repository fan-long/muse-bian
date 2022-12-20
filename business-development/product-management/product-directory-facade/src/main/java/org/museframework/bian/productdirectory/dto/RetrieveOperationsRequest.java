package org.museframework.bian.productdirectory.dto;

public class RetrieveOperationsRequest {
    private String productdirectoryid;

    private String operationsid;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setOperationsid(String operationsid) {
        this.operationsid = operationsid;
    }

    public String getOperationsid() {
        return operationsid;
    }
}