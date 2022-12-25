/*The configuration and execution of Private Placement Fulfillment arrangement within the Private Placement Fulfillment*/
package org.museframework.bian.privateplacement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PrivatePlacementOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility privatePlacementFinancialFacility;

    /**/
    @MetaField(0)
    private String privatePlacementWorkProduct;

    public void setPrivatePlacementFinancialFacility(org.museframework.bian.classes.FinancialFacility privatePlacementFinancialFacility) {
        this.privatePlacementFinancialFacility = privatePlacementFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getPrivatePlacementFinancialFacility() {
        return privatePlacementFinancialFacility;
    }

    public void setPrivatePlacementWorkProduct(String privatePlacementWorkProduct) {
        this.privatePlacementWorkProduct = privatePlacementWorkProduct;
    }

    public String getPrivatePlacementWorkProduct() {
        return privatePlacementWorkProduct;
    }
}