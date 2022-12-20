package org.museframework.bian.customeroffer.dto;

public class UpdateAgreementResponse {
    private org.museframework.bian.customeroffer.dto.bq.Agreement agreement;

    public void setAgreement(org.museframework.bian.customeroffer.dto.bq.Agreement agreement) {
        this.agreement = agreement;
    }

    public org.museframework.bian.customeroffer.dto.bq.Agreement getAgreement() {
        return agreement;
    }
}