/*The configuration and execution of Batch Debit arrangement within the Direct Debit Facility*/
package org.museframework.bian.directdebit.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DirectDebitOutcome {
    /**/
    @MetaField(0)
    private String directDebitFinancialFacility;

    /**/
    @MetaField(0)
    private String directDebitWorkProduct;

    public void setDirectDebitFinancialFacility(String directDebitFinancialFacility) {
        this.directDebitFinancialFacility = directDebitFinancialFacility;
    }

    public String getDirectDebitFinancialFacility() {
        return directDebitFinancialFacility;
    }

    public void setDirectDebitWorkProduct(String directDebitWorkProduct) {
        this.directDebitWorkProduct = directDebitWorkProduct;
    }

    public String getDirectDebitWorkProduct() {
        return directDebitWorkProduct;
    }
}