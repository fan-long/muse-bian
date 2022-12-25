/*The configuration and execution of Standing Order Fulfillment arrangement within the Standing Order Fulfillment*/
package org.museframework.bian.standingorder.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class StandingOrderOutcome {
    /**/
    @MetaField(0)
    private String standingOrderFinancialFacility;

    public void setStandingOrderFinancialFacility(String standingOrderFinancialFacility) {
        this.standingOrderFinancialFacility = standingOrderFinancialFacility;
    }

    public String getStandingOrderFinancialFacility() {
        return standingOrderFinancialFacility;
    }
}