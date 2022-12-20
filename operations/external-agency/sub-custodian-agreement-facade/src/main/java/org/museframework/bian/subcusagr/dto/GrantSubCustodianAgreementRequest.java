package org.museframework.bian.subcusagr.dto;

public class GrantSubCustodianAgreementRequest {
    private String subcustodianagreementid;

    private org.museframework.bian.subcusagr.dto.cr.SubCustodianAgreement subCustodianAgreement;

    public void setSubcustodianagreementid(String subcustodianagreementid) {
        this.subcustodianagreementid = subcustodianagreementid;
    }

    public String getSubcustodianagreementid() {
        return subcustodianagreementid;
    }

    public void setSubCustodianAgreement(org.museframework.bian.subcusagr.dto.cr.SubCustodianAgreement subCustodianAgreement) {
        this.subCustodianAgreement = subCustodianAgreement;
    }

    public org.museframework.bian.subcusagr.dto.cr.SubCustodianAgreement getSubCustodianAgreement() {
        return subCustodianAgreement;
    }
}