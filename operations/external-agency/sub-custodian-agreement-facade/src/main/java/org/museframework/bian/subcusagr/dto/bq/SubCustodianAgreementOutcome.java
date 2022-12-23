/*Covers the legal considerations of the agreement*/
package org.museframework.bian.subcusagr.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SubCustodianAgreementOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement subCustodianAgreementAgreement;

    /**/
    @MetaField
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