package org.museframework.bian.fiduciaryagreement.dto;

public class RequestAgreementRequest {
    private String fiduciaryagreementid;

    private String agreementid;

    private org.museframework.bian.fiduciaryagreement.dto.bq.Agreement agreement;

    public void setFiduciaryagreementid(String fiduciaryagreementid) {
        this.fiduciaryagreementid = fiduciaryagreementid;
    }

    public String getFiduciaryagreementid() {
        return fiduciaryagreementid;
    }

    public void setAgreementid(String agreementid) {
        this.agreementid = agreementid;
    }

    public String getAgreementid() {
        return agreementid;
    }

    public void setAgreement(org.museframework.bian.fiduciaryagreement.dto.bq.Agreement agreement) {
        this.agreement = agreement;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.Agreement getAgreement() {
        return agreement;
    }
}