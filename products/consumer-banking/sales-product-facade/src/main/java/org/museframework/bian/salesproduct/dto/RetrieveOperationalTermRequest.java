package org.museframework.bian.salesproduct.dto;

public class RetrieveOperationalTermRequest {
    private String salesproductid;

    private String operationaltermid;

    public void setSalesproductid(String salesproductid) {
        this.salesproductid = salesproductid;
    }

    public String getSalesproductid() {
        return salesproductid;
    }

    public void setOperationaltermid(String operationaltermid) {
        this.operationaltermid = operationaltermid;
    }

    public String getOperationaltermid() {
        return operationaltermid;
    }
}