package org.museframework.bian.fiduciaryagreement.dto;

public class UpdateAgreementResponse {
    private org.museframework.bian.fiduciaryagreement.dto.bq.Agreement agreement;

    public void setAgreement(org.museframework.bian.fiduciaryagreement.dto.bq.Agreement agreement) {
        this.agreement = agreement;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.Agreement getAgreement() {
        return agreement;
    }
}