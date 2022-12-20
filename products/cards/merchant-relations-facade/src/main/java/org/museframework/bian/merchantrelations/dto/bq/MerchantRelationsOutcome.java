/*Covers the legal considerations of the agreement*/
package org.museframework.bian.merchantrelations.dto.bq;

public class MerchantRelationsOutcome {
    /**/
    private org.museframework.bian.classes.Agreement merchantRelationsAgreement;

    /**/
    private String merchantRelationsWorkProduct;

    public void setMerchantRelationsAgreement(org.museframework.bian.classes.Agreement merchantRelationsAgreement) {
        this.merchantRelationsAgreement = merchantRelationsAgreement;
    }

    public org.museframework.bian.classes.Agreement getMerchantRelationsAgreement() {
        return merchantRelationsAgreement;
    }

    public void setMerchantRelationsWorkProduct(String merchantRelationsWorkProduct) {
        this.merchantRelationsWorkProduct = merchantRelationsWorkProduct;
    }

    public String getMerchantRelationsWorkProduct() {
        return merchantRelationsWorkProduct;
    }
}