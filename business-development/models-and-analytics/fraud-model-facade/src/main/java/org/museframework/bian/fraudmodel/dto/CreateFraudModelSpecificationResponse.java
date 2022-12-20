package org.museframework.bian.fraudmodel.dto;

public class CreateFraudModelSpecificationResponse {
    private org.museframework.bian.fraudmodel.dto.cr.FraudModelSpecification fraudModelSpecification;

    public void setFraudModelSpecification(org.museframework.bian.fraudmodel.dto.cr.FraudModelSpecification fraudModelSpecification) {
        this.fraudModelSpecification = fraudModelSpecification;
    }

    public org.museframework.bian.fraudmodel.dto.cr.FraudModelSpecification getFraudModelSpecification() {
        return fraudModelSpecification;
    }
}