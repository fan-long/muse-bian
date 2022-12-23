/*The configuration and execution of Public Placement IPO and Underwriting Fulfillment arrangement within the Public Placement IPO and Underwriting Fulfillment*/
package org.museframework.bian.publicoffering.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PublicOfferingOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility publicOfferingFinancialFacility;

    /**/
    @MetaField
    private String publicOfferingWorkProduct;

    public void setPublicOfferingFinancialFacility(org.museframework.bian.classes.FinancialFacility publicOfferingFinancialFacility) {
        this.publicOfferingFinancialFacility = publicOfferingFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getPublicOfferingFinancialFacility() {
        return publicOfferingFinancialFacility;
    }

    public void setPublicOfferingWorkProduct(String publicOfferingWorkProduct) {
        this.publicOfferingWorkProduct = publicOfferingWorkProduct;
    }

    public String getPublicOfferingWorkProduct() {
        return publicOfferingWorkProduct;
    }
}