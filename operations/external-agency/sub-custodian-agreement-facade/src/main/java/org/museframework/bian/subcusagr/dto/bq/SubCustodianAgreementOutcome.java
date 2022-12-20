/*Covers the legal considerations of the agreement*/
package org.museframework.bian.subcusagr.dto.bq;

public class SubCustodianAgreementOutcome {
    /**/
    private org.museframework.bian.classes.Agreement subCustodianAgreementAgreement;

    /**/
    private String subCustodianAgreementWorkProduct;

    public void setSubCustodianAgreementAgreement(org.museframework.bian.classes.Agreement subCustodianAgreementAgreement) {
        this.subCustodianAgreementAgreement = subCustodianAgreementAgreement;
    }

    public org.museframework.bian.classes.Agreement getSubCustodianAgreementAgreement() {
        return subCustodianAgreementAgreement;
    }

    public void setSubCustodianAgreementWorkProduct(String subCustodianAgreementWorkProduct) {
        this.subCustodianAgreementWorkProduct = subCustodianAgreementWorkProduct;
    }

    public String getSubCustodianAgreementWorkProduct() {
        return subCustodianAgreementWorkProduct;
    }
}