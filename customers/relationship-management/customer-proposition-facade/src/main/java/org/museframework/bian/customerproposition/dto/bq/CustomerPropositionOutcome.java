/*The Customer Defined Product and Service Term reflects the application of a specific rule or regulation that is an aspect of the Customer Defined Product and Service Term*/
package org.museframework.bian.customerproposition.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerPropositionOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement customerPropositionAgreement;

    /**/
    @MetaField
    private String customerPropositionWorkProduct;

    public void setCustomerPropositionAgreement(org.museframework.bian.classes.Agreement customerPropositionAgreement) {
        this.customerPropositionAgreement = customerPropositionAgreement;
    }

    public org.museframework.bian.classes.Agreement getCustomerPropositionAgreement() {
        return customerPropositionAgreement;
    }

    public void setCustomerPropositionWorkProduct(String customerPropositionWorkProduct) {
        this.customerPropositionWorkProduct = customerPropositionWorkProduct;
    }

    public String getCustomerPropositionWorkProduct() {
        return customerPropositionWorkProduct;
    }
}