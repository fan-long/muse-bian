package org.museframework.bian.customeragreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluatePolicyTermsRequest {
    @MetaField
    private String customeragreementid;

    @MetaField
    private String policytermsid;

    @MetaField(ref=true)
    private org.museframework.bian.customeragreement.dto.bq.PolicyTerms policyTerms;

    public void setCustomeragreementid(String customeragreementid) {
        this.customeragreementid = customeragreementid;
    }

    public String getCustomeragreementid() {
        return customeragreementid;
    }

    public void setPolicytermsid(String policytermsid) {
        this.policytermsid = policytermsid;
    }

    public String getPolicytermsid() {
        return policytermsid;
    }

    public void setPolicyTerms(org.museframework.bian.customeragreement.dto.bq.PolicyTerms policyTerms) {
        this.policyTerms = policyTerms;
    }

    public org.museframework.bian.customeragreement.dto.bq.PolicyTerms getPolicyTerms() {
        return policyTerms;
    }
}