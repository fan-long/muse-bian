/*A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement

Examples: Required disclosures*/
package org.museframework.bian.commissionagreement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CommissionAgreementOutcome {
    /**/
    @MetaField
    private String commissionAgreementAgreement;

    /**/
    @MetaField
    private String commissionAgreementWorkProduct;

    public void setCommissionAgreementAgreement(String commissionAgreementAgreement) {
        this.commissionAgreementAgreement = commissionAgreementAgreement;
    }

    public String getCommissionAgreementAgreement() {
        return commissionAgreementAgreement;
    }

    public void setCommissionAgreementWorkProduct(String commissionAgreementWorkProduct) {
        this.commissionAgreementWorkProduct = commissionAgreementWorkProduct;
    }

    public String getCommissionAgreementWorkProduct() {
        return commissionAgreementWorkProduct;
    }
}