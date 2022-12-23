/*The configuration and execution of Check Clearing and Settlement Fulfillment arrangement within the Check Clearing and Settlement Fulfillment*/
package org.museframework.bian.chelocbox.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ChequeLockBoxOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility chequeLockBoxFinancialFacility;

    /**/
    @MetaField
    private String chequeLockBoxWorkProduct;

    public void setChequeLockBoxFinancialFacility(org.museframework.bian.classes.FinancialFacility chequeLockBoxFinancialFacility) {
        this.chequeLockBoxFinancialFacility = chequeLockBoxFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getChequeLockBoxFinancialFacility() {
        return chequeLockBoxFinancialFacility;
    }

    public void setChequeLockBoxWorkProduct(String chequeLockBoxWorkProduct) {
        this.chequeLockBoxWorkProduct = chequeLockBoxWorkProduct;
    }

    public String getChequeLockBoxWorkProduct() {
        return chequeLockBoxWorkProduct;
    }
}