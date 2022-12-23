package org.museframework.bian.fiduciaryagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeAgreementRequest {
    @MetaField
    private String fiduciaryagreementid;

    @MetaField
    private String agreementid;

    @MetaField(ref=true)
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