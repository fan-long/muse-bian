/*The configuration and execution of Notional Account Interest Allocation Fulfillment arrangement within the Notional Account Interest Allocation Fulfillment*/
package org.museframework.bian.notionalpooling.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class NotionalPoolingOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility notionalPoolingFinancialFacility;

    /**/
    @MetaField
    private String notionalPoolingWorkProduct;

    public void setNotionalPoolingFinancialFacility(org.museframework.bian.classes.FinancialFacility notionalPoolingFinancialFacility) {
        this.notionalPoolingFinancialFacility = notionalPoolingFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getNotionalPoolingFinancialFacility() {
        return notionalPoolingFinancialFacility;
    }

    public void setNotionalPoolingWorkProduct(String notionalPoolingWorkProduct) {
        this.notionalPoolingWorkProduct = notionalPoolingWorkProduct;
    }

    public String getNotionalPoolingWorkProduct() {
        return notionalPoolingWorkProduct;
    }
}