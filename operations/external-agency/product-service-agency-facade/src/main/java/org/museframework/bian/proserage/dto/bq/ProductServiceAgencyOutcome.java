/*Covers the legal considerations of the agreement*/
package org.museframework.bian.proserage.dto.bq;

public class ProductServiceAgencyOutcome {
    /**/
    private org.museframework.bian.classes.Agreement productServiceAgencyAgreement;

    /**/
    private String productServiceAgencyWorkProduct;

    public void setProductServiceAgencyAgreement(org.museframework.bian.classes.Agreement productServiceAgencyAgreement) {
        this.productServiceAgencyAgreement = productServiceAgencyAgreement;
    }

    public org.museframework.bian.classes.Agreement getProductServiceAgencyAgreement() {
        return productServiceAgencyAgreement;
    }

    public void setProductServiceAgencyWorkProduct(String productServiceAgencyWorkProduct) {
        this.productServiceAgencyWorkProduct = productServiceAgencyWorkProduct;
    }

    public String getProductServiceAgencyWorkProduct() {
        return productServiceAgencyWorkProduct;
    }
}