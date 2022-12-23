package org.museframework.bian.customeragreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateLegalTermsRequest {
    @MetaField
    private String customeragreementid;

    @MetaField
    private String legaltermsid;

    @MetaField(ref=true)
    private org.museframework.bian.customeragreement.dto.bq.LegalTerms legalTerms;

    public void setCustomeragreementid(String customeragreementid) {
        this.customeragreementid = customeragreementid;
    }

    public String getCustomeragreementid() {
        return customeragreementid;
    }

    public void setLegaltermsid(String legaltermsid) {
        this.legaltermsid = legaltermsid;
    }

    public String getLegaltermsid() {
        return legaltermsid;
    }

    public void setLegalTerms(org.museframework.bian.customeragreement.dto.bq.LegalTerms legalTerms) {
        this.legalTerms = legalTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.LegalTerms getLegalTerms() {
        return legalTerms;
    }
}