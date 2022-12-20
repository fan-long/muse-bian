package org.museframework.bian.productdirectory.dto;

public class RegisterOperationsRequest {
    private String productdirectoryid;

    private String operationsid;

    private org.museframework.bian.productdirectory.dto.bq.Operations operations;

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

    public void setOperations(org.museframework.bian.productdirectory.dto.bq.Operations operations) {
        this.operations = operations;
    }

    public org.museframework.bian.productdirectory.dto.bq.Operations getOperations() {
        return operations;
    }
}