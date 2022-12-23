package org.museframework.bian.customeragreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateRegulatoryTermsRequest {
    @MetaField
    private String customeragreementid;

    @MetaField
    private String regulatorytermsid;

    @MetaField(ref=true)
    private org.museframework.bian.customeragreement.dto.bq.RegulatoryTerms regulatoryTerms;

    public void setCustomeragreementid(String customeragreementid) {
        this.customeragreementid = customeragreementid;
    }

    public String getCustomeragreementid() {
        return customeragreementid;
    }

    public void setRegulatorytermsid(String regulatorytermsid) {
        this.regulatorytermsid = regulatorytermsid;
    }

    public String getRegulatorytermsid() {
        return regulatorytermsid;
    }

    public void setRegulatoryTerms(org.museframework.bian.customeragreement.dto.bq.RegulatoryTerms regulatoryTerms) {
        this.regulatoryTerms = regulatoryTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.RegulatoryTerms getRegulatoryTerms() {
        return regulatoryTerms;
    }
}