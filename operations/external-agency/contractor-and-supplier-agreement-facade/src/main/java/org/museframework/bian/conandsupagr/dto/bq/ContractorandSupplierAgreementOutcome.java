/*Covers the regulatory considerations of the agreement*/
package org.museframework.bian.conandsupagr.dto.bq;

public class ContractorandSupplierAgreementOutcome {
    /**/
    private org.museframework.bian.classes.Agreement contractorandSupplierAgreementAgreement;

    /**/
    private String contractorandSupplierAgreementWorkProduct;

    public void setContractorandSupplierAgreementAgreement(org.museframework.bian.classes.Agreement contractorandSupplierAgreementAgreement) {
        this.contractorandSupplierAgreementAgreement = contractorandSupplierAgreementAgreement;
    }

    public org.museframework.bian.classes.Agreement getContractorandSupplierAgreementAgreement() {
        return contractorandSupplierAgreementAgreement;
    }

    public void setContractorandSupplierAgreementWorkProduct(String contractorandSupplierAgreementWorkProduct) {
        this.contractorandSupplierAgreementWorkProduct = contractorandSupplierAgreementWorkProduct;
    }

    public String getContractorandSupplierAgreementWorkProduct() {
        return contractorandSupplierAgreementWorkProduct;
    }
}