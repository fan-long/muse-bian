/*Covers the regulatory considerations of the agreement*/
package org.museframework.bian.conandsupagr.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ContractorandSupplierAgreementOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement contractorandSupplierAgreementAgreement;

    /**/
    @MetaField(0)
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