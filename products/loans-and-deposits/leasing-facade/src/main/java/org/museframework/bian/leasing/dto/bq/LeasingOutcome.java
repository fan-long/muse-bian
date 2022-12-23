/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.leasing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class LeasingOutcome {
    /**/
    @MetaField
    private String leasingFinancialFacility;

    /**/
    @MetaField
    private String leasingWorkProduct;

    public void setLeasingFinancialFacility(String leasingFinancialFacility) {
        this.leasingFinancialFacility = leasingFinancialFacility;
    }

    public String getLeasingFinancialFacility() {
        return leasingFinancialFacility;
    }

    public void setLeasingWorkProduct(String leasingWorkProduct) {
        this.leasingWorkProduct = leasingWorkProduct;
    }

    public String getLeasingWorkProduct() {
        return leasingWorkProduct;
    }
}