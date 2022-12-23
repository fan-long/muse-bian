package org.museframework.bian.conandsupagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateLegalTermRequest {
    @MetaField
    private String contractorandsupplieragreementid;

    @MetaField
    private String legaltermid;

    @MetaField(ref=true)
    private org.museframework.bian.conandsupagr.dto.bq.LegalTerm legalTerm;

    public void setContractorandsupplieragreementid(String contractorandsupplieragreementid) {
        this.contractorandsupplieragreementid = contractorandsupplieragreementid;
    }

    public String getContractorandsupplieragreementid() {
        return contractorandsupplieragreementid;
    }

    public void setLegaltermid(String legaltermid) {
        this.legaltermid = legaltermid;
    }

    public String getLegaltermid() {
        return legaltermid;
    }

    public void setLegalTerm(org.museframework.bian.conandsupagr.dto.bq.LegalTerm legalTerm) {
        this.legalTerm = legalTerm;
    }

    public org.museframework.bian.conandsupagr.dto.bq.LegalTerm getLegalTerm() {
        return legalTerm;
    }
}