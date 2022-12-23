package org.museframework.bian.conandsupagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePolicyTermRequest {
    @MetaField
    private String contractorandsupplieragreementid;

    @MetaField
    private String policytermid;

    @MetaField(ref=true)
    private org.museframework.bian.conandsupagr.dto.bq.PolicyTerm policyTerm;

    public void setContractorandsupplieragreementid(String contractorandsupplieragreementid) {
        this.contractorandsupplieragreementid = contractorandsupplieragreementid;
    }

    public String getContractorandsupplieragreementid() {
        return contractorandsupplieragreementid;
    }

    public void setPolicytermid(String policytermid) {
        this.policytermid = policytermid;
    }

    public String getPolicytermid() {
        return policytermid;
    }

    public void setPolicyTerm(org.museframework.bian.conandsupagr.dto.bq.PolicyTerm policyTerm) {
        this.policyTerm = policyTerm;
    }

    public org.museframework.bian.conandsupagr.dto.bq.PolicyTerm getPolicyTerm() {
        return policyTerm;
    }
}