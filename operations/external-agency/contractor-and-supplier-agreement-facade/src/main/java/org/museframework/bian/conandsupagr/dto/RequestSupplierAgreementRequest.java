package org.museframework.bian.conandsupagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestSupplierAgreementRequest {
    @MetaField
    private String contractorandsupplieragreementid;

    @MetaField(ref=true)
    private org.museframework.bian.conandsupagr.dto.cr.SupplierAgreement supplierAgreement;

    public void setContractorandsupplieragreementid(String contractorandsupplieragreementid) {
        this.contractorandsupplieragreementid = contractorandsupplieragreementid;
    }

    public String getContractorandsupplieragreementid() {
        return contractorandsupplieragreementid;
    }

    public void setSupplierAgreement(org.museframework.bian.conandsupagr.dto.cr.SupplierAgreement supplierAgreement) {
        this.supplierAgreement = supplierAgreement;
    }

    public org.museframework.bian.conandsupagr.dto.cr.SupplierAgreement getSupplierAgreement() {
        return supplierAgreement;
    }
}