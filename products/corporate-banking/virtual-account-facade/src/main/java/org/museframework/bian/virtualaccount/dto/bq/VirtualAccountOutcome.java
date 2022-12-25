/*The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment*/
package org.museframework.bian.virtualaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class VirtualAccountOutcome {
    /**/
    @MetaField(0)
    private String virtualAccountFinancialFacility;

    /**/
    @MetaField(0)
    private String virtualAccountWorkProduct;

    public void setVirtualAccountFinancialFacility(String virtualAccountFinancialFacility) {
        this.virtualAccountFinancialFacility = virtualAccountFinancialFacility;
    }

    public String getVirtualAccountFinancialFacility() {
        return virtualAccountFinancialFacility;
    }

    public void setVirtualAccountWorkProduct(String virtualAccountWorkProduct) {
        this.virtualAccountWorkProduct = virtualAccountWorkProduct;
    }

    public String getVirtualAccountWorkProduct() {
        return virtualAccountWorkProduct;
    }
}