package org.museframework.bian.merchantrelations.dto;

public class ExchangeMerchantRelationshipAgreementResponse {
    private org.museframework.bian.merchantrelations.dto.cr.MerchantRelationshipAgreement merchantRelationshipAgreement;

    public void setMerchantRelationshipAgreement(org.museframework.bian.merchantrelations.dto.cr.MerchantRelationshipAgreement merchantRelationshipAgreement) {
        this.merchantRelationshipAgreement = merchantRelationshipAgreement;
    }

    public org.museframework.bian.merchantrelations.dto.cr.MerchantRelationshipAgreement getMerchantRelationshipAgreement() {
        return merchantRelationshipAgreement;
    }
}