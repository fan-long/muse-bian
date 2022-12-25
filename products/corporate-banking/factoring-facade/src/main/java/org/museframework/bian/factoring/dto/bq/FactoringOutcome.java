/*The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment*/
package org.museframework.bian.factoring.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FactoringOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility factoringFinancialFacility;

    /**/
    @MetaField(0)
    private String factoringWorkProduct;

    public void setFactoringFinancialFacility(org.museframework.bian.classes.FinancialFacility factoringFinancialFacility) {
        this.factoringFinancialFacility = factoringFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getFactoringFinancialFacility() {
        return factoringFinancialFacility;
    }

    public void setFactoringWorkProduct(String factoringWorkProduct) {
        this.factoringWorkProduct = factoringWorkProduct;
    }

    public String getFactoringWorkProduct() {
        return factoringWorkProduct;
    }
}