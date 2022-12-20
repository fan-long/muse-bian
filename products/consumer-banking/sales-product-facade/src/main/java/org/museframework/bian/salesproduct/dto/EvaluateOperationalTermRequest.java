package org.museframework.bian.salesproduct.dto;

public class EvaluateOperationalTermRequest {
    private String salesproductid;

    private String operationaltermid;

    private org.museframework.bian.salesproduct.dto.bq.OperationalTerm operationalTerm;

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

    public void setOperationalTerm(org.museframework.bian.salesproduct.dto.bq.OperationalTerm operationalTerm) {
        this.operationalTerm = operationalTerm;
    }

    public org.museframework.bian.salesproduct.dto.bq.OperationalTerm getOperationalTerm() {
        return operationalTerm;
    }
}