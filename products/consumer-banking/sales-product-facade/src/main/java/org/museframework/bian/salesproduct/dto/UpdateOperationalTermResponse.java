package org.museframework.bian.salesproduct.dto;

public class UpdateOperationalTermResponse {
    private org.museframework.bian.salesproduct.dto.bq.OperationalTerm operationalTerm;

    public void setOperationalTerm(org.museframework.bian.salesproduct.dto.bq.OperationalTerm operationalTerm) {
        this.operationalTerm = operationalTerm;
    }

    public org.museframework.bian.salesproduct.dto.bq.OperationalTerm getOperationalTerm() {
        return operationalTerm;
    }
}