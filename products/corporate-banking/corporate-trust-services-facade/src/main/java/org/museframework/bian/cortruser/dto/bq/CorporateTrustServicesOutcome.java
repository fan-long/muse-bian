/*The configuration and execution of Trust Court Administration Fulfillment arrangement within the Trust Court Administration Fulfillment*/
package org.museframework.bian.cortruser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorporateTrustServicesOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility corporateTrustServicesFinancialFacility;

    /**/
    @MetaField
    private String corporateTrustServicesWorkProduct;

    public void setCorporateTrustServicesFinancialFacility(org.museframework.bian.classes.FinancialFacility corporateTrustServicesFinancialFacility) {
        this.corporateTrustServicesFinancialFacility = corporateTrustServicesFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getCorporateTrustServicesFinancialFacility() {
        return corporateTrustServicesFinancialFacility;
    }

    public void setCorporateTrustServicesWorkProduct(String corporateTrustServicesWorkProduct) {
        this.corporateTrustServicesWorkProduct = corporateTrustServicesWorkProduct;
    }

    public String getCorporateTrustServicesWorkProduct() {
        return corporateTrustServicesWorkProduct;
    }
}