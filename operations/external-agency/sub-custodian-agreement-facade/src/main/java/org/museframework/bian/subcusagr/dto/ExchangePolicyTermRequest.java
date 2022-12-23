package org.museframework.bian.subcusagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangePolicyTermRequest {
    @MetaField
    private String subcustodianagreementid;

    @MetaField
    private String policytermid;

    @MetaField(ref=true)
    private org.museframework.bian.subcusagr.dto.bq.PolicyTerm policyTerm;

    public void setSubcustodianagreementid(String subcustodianagreementid) {
        this.subcustodianagreementid = subcustodianagreementid;
    }

    public String getSubcustodianagreementid() {
        return subcustodianagreementid;
    }

    public void setPolicytermid(String policytermid) {
        this.policytermid = policytermid;
    }

    public String getPolicytermid() {
        return policytermid;
    }

    public void setPolicyTerm(org.museframework.bian.subcusagr.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}