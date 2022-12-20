package org.museframework.bian.conandsupagr.dto;

public class GrantSupplierAgreementRequest {
    private String contractorandsupplieragreementid;

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