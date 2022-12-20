package org.museframework.bian.crerismod.dto;

public class RequestCreditRiskModelSpecificationRequest {
    private String creditriskmodelsid;

    private org.museframework.bian.crerismod.dto.cr.CreditRiskModelSpecification creditRiskModelSpecification;

    public void setCreditriskmodelsid(String creditriskmodelsid) {
        this.creditriskmodelsid = creditriskmodelsid;
    }

    public String getCreditriskmodelsid() {
        return creditriskmodelsid;
    }

    public void setCreditRiskModelSpecification(org.museframework.bian.crerismod.dto.cr.CreditRiskModelSpecification creditRiskModelSpecification) {
        this.creditRiskModelSpecification = creditRiskModelSpecification;
    }

    public org.museframework.bian.crerismod.dto.cr.CreditRiskModelSpecification getCreditRiskModelSpecification() {
        return creditRiskModelSpecification;
    }
}