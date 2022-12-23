/*The configuration and execution of Cash Position Monitoring and Transfer Fulfillment arrangement within the Cash Position Monitoring and Transfer Fulfillment*/
package org.museframework.bian.cashconcentration.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CashConcentrationOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility cashConcentrationFinancialFacility;

    /**/
    @MetaField
    private String cashConcentrationWorkProduct;

    public void setCashConcentrationFinancialFacility(org.museframework.bian.classes.FinancialFacility cashConcentrationFinancialFacility) {
        this.cashConcentrationFinancialFacility = cashConcentrationFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getCashConcentrationFinancialFacility() {
        return cashConcentrationFinancialFacility;
    }

    public void setCashConcentrationWorkProduct(String cashConcentrationWorkProduct) {
        this.cashConcentrationWorkProduct = cashConcentrationWorkProduct;
    }

    public String getCashConcentrationWorkProduct() {
        return cashConcentrationWorkProduct;
    }
}